package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _mapimage = null;
public agraham.b4a.scaleimageview.ScaleImageViewWrapper _imageviewer = null;
public anywheresoftware.b4a.objects.collections.Map _nodes = null;
public anywheresoftware.b4a.objects.collections.List _edges = null;
public anywheresoftware.b4a.objects.collections.Map _graph = null;
public anywheresoftware.b4a.objects.collections.List _routeedges = null;
public static String _startnode = "";
public static String _endnode = "";
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="RouteEdges.Initialize";
mostCurrent._routeedges.Initialize();
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="StartNode = \"\"";
mostCurrent._startnode = "";
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="EndNode   = \"\"";
mostCurrent._endnode = "";
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="MapImage = LoadBitmap(File.DirAssets, \"map.png\")";
mostCurrent._mapimage = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"map.png");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="ImageViewer.Initialize(\"ImageViewer\")";
mostCurrent._imageviewer.Initialize(mostCurrent.activityBA,"ImageViewer");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Activity.AddView(ImageViewer, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._imageviewer.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="ImageViewer.Image = MapImage";
mostCurrent._imageviewer.setImage((android.graphics.Bitmap)(mostCurrent._mapimage.getObject()));
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="LoadAllMapData";
_loadallmapdata();
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="End Sub";
return "";
}
public static String  _loadallmapdata() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadallmapdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadallmapdata", null));}
String _raw = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub LoadAllMapData";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Nodes.Initialize";
mostCurrent._nodes.Initialize();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Edges.Initialize";
mostCurrent._edges.Initialize();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Graph.Initialize";
mostCurrent._graph.Initialize();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim raw As String";
_raw = "";
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="raw = File.ReadString(File.DirAssets, \"mapdata.js";
_raw = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mapdata.json");
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Log(\"RAW JSON: \" & raw)";
anywheresoftware.b4a.keywords.Common.LogImpl("4327688","RAW JSON: "+_raw,0);
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="parser.Initialize(raw)";
_parser.Initialize(_raw);
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="root = parser.NextObject";
_root = _parser.NextObject();
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="Log(\"ROOT KEYS: \" & root.Keys)";
anywheresoftware.b4a.keywords.Common.LogImpl("4327695","ROOT KEYS: "+BA.ObjectToString(_root.Keys()),0);
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="ParseNodes(root)";
_parsenodes(_root);
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="ParseEdges(root)";
_parseedges(_root);
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="BuildGraph";
_buildgraph();
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="Log(\"Map data loaded. Nodes: \" & Nodes.Size & \" E";
anywheresoftware.b4a.keywords.Common.LogImpl("4327701","Map data loaded. Nodes: "+BA.NumberToString(mostCurrent._nodes.getSize())+" Edges: "+BA.NumberToString(mostCurrent._edges.getSize()),0);
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="ImageViewer.Invalidate";
mostCurrent._imageviewer.Invalidate();
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause(UserClosed As Boolean)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="End Sub";
return "";
}
public static String  _buildgraph() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildgraph", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buildgraph", null));}
anywheresoftware.b4a.objects.collections.Map _edge = null;
String _fromid = "";
String _toid = "";
int _weight = 0;
String _edgeid = "";
anywheresoftware.b4a.objects.collections.List _l1 = null;
anywheresoftware.b4a.objects.collections.List _n1 = null;
anywheresoftware.b4a.objects.collections.Map _c1 = null;
anywheresoftware.b4a.objects.collections.List _l2 = null;
anywheresoftware.b4a.objects.collections.List _n2 = null;
anywheresoftware.b4a.objects.collections.Map _c2 = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub BuildGraph";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Graph.Initialize";
mostCurrent._graph.Initialize();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="For Each edge As Map In Edges";
_edge = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = mostCurrent._edges;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_edge = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group2.Get(index2)));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim fromId As String = edge.Get(\"from\")";
_fromid = BA.ObjectToString(_edge.Get((Object)("from")));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Dim toId   As String = edge.Get(\"to\")";
_toid = BA.ObjectToString(_edge.Get((Object)("to")));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Dim weight As Int    = edge.Get(\"weight\")";
_weight = (int)(BA.ObjectToNumber(_edge.Get((Object)("weight"))));
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Dim edgeId As String = edge.Get(\"id\")";
_edgeid = BA.ObjectToString(_edge.Get((Object)("id")));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="If Graph.ContainsKey(fromId) = False Then";
if (mostCurrent._graph.ContainsKey((Object)(_fromid))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim l1 As List : l1.Initialize";
_l1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim l1 As List : l1.Initialize";
_l1.Initialize();
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Graph.Put(fromId, l1)";
mostCurrent._graph.Put((Object)(_fromid),(Object)(_l1.getObject()));
 };
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim n1 As List = Graph.Get(fromId)";
_n1 = new anywheresoftware.b4a.objects.collections.List();
_n1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._graph.Get((Object)(_fromid))));
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Dim c1 As Map  : c1.Initialize";
_c1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Dim c1 As Map  : c1.Initialize";
_c1.Initialize();
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="c1.Put(\"neighbor\", toId)";
_c1.Put((Object)("neighbor"),(Object)(_toid));
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="c1.Put(\"weight\",   weight)";
_c1.Put((Object)("weight"),(Object)(_weight));
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="c1.Put(\"edgeId\",   edgeId)";
_c1.Put((Object)("edgeId"),(Object)(_edgeid));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="n1.Add(c1)";
_n1.Add((Object)(_c1.getObject()));
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="If Graph.ContainsKey(toId) = False Then";
if (mostCurrent._graph.ContainsKey((Object)(_toid))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="Dim l2 As List : l2.Initialize";
_l2 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="Dim l2 As List : l2.Initialize";
_l2.Initialize();
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="Graph.Put(toId, l2)";
mostCurrent._graph.Put((Object)(_toid),(Object)(_l2.getObject()));
 };
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="Dim n2 As List = Graph.Get(toId)";
_n2 = new anywheresoftware.b4a.objects.collections.List();
_n2 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._graph.Get((Object)(_toid))));
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="Dim c2 As Map  : c2.Initialize";
_c2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="Dim c2 As Map  : c2.Initialize";
_c2.Initialize();
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="c2.Put(\"neighbor\", fromId)";
_c2.Put((Object)("neighbor"),(Object)(_fromid));
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="c2.Put(\"weight\",   weight)";
_c2.Put((Object)("weight"),(Object)(_weight));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="c2.Put(\"edgeId\",   edgeId)";
_c2.Put((Object)("edgeId"),(Object)(_edgeid));
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="n2.Add(c2)";
_n2.Add((Object)(_c2.getObject()));
 }
};
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="Log(\"Graph built. Nodes in graph: \" & Graph.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("4524320","Graph built. Nodes in graph: "+BA.NumberToString(mostCurrent._graph.getSize()),0);
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="End Sub";
return "";
}
public static Object  _findedge(String _fromid,String _toid) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "findedge", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "findedge", new Object[] {_fromid,_toid}));}
anywheresoftware.b4a.objects.collections.Map _edge = null;
String _a = "";
String _b = "";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub FindEdge(fromId As String, toId As String) As";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="For Each edge As Map In Edges";
_edge = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = mostCurrent._edges;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_edge = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim a As String = edge.Get(\"from\")";
_a = BA.ObjectToString(_edge.Get((Object)("from")));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim b As String = edge.Get(\"to\")";
_b = BA.ObjectToString(_edge.Get((Object)("to")));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="If a = fromId And b = toId Then";
if ((_a).equals(_fromid) && (_b).equals(_toid)) { 
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="edge.Put(\"flipped\", False)";
_edge.Put((Object)("flipped"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Return edge";
if (true) return (Object)(_edge.getObject());
 }else 
{RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="Else If a = toId And b = fromId Then";
if ((_a).equals(_toid) && (_b).equals(_fromid)) { 
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="edge.Put(\"flipped\", True)";
_edge.Put((Object)("flipped"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Return edge";
if (true) return (Object)(_edge.getObject());
 }}
;
 }
};
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="Return Null";
if (true) return anywheresoftware.b4a.keywords.Common.Null;
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="End Sub";
return null;
}
public static String  _getnodeatposition(float _tapx,float _tapy,int _radius) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getnodeatposition", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getnodeatposition", new Object[] {_tapx,_tapy,_radius}));}
String _nodeid = "";
anywheresoftware.b4a.objects.collections.Map _node = null;
float _nx = 0f;
float _ny = 0f;
float _dx = 0f;
float _dy = 0f;
double _dist = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub GetNodeAtPosition(tapX As Float, tapY As Float";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="For Each nodeId As String In Nodes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = mostCurrent._nodes.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_nodeid = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim node As Map = Nodes.Get(nodeId)";
_node = new anywheresoftware.b4a.objects.collections.Map();
_node = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(mostCurrent._nodes.Get((Object)(_nodeid))));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim nx As Float = node.Get(\"x\")";
_nx = (float)(BA.ObjectToNumber(_node.Get((Object)("x"))));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim ny As Float = node.Get(\"y\")";
_ny = (float)(BA.ObjectToNumber(_node.Get((Object)("y"))));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim dx As Float = tapX - nx";
_dx = (float) (_tapx-_nx);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Dim dy As Float = tapY - ny";
_dy = (float) (_tapy-_ny);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Dim dist As Double = Sqrt(dx * dx + dy * dy)";
_dist = anywheresoftware.b4a.keywords.Common.Sqrt(_dx*_dx+_dy*_dy);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="If dist <= radius Then";
if (_dist<=_radius) { 
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Return nodeId";
if (true) return _nodeid;
 };
 }
};
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="End Sub";
return "";
}
public static String  _imageviewer_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageviewer_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imageviewer_click", null));}
float _tapx = 0f;
float _tapy = 0f;
String _tappedid = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub ImageViewer_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim tapX As Float = ImageViewer.ClickImageX";
_tapx = mostCurrent._imageviewer.getClickImageX();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Dim tapY As Float = ImageViewer.ClickImageY";
_tapy = mostCurrent._imageviewer.getClickImageY();
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Log(\"Tapped image coords: \" & tapX & \",\" & tapY)";
anywheresoftware.b4a.keywords.Common.LogImpl("41572868","Tapped image coords: "+BA.NumberToString(_tapx)+","+BA.NumberToString(_tapy),0);
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Dim tappedId As String = GetNodeAtPosition(tapX,";
_tappedid = _getnodeatposition(_tapx,_tapy,(int) (50));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="Log(\"Tapped node: \" & tappedId)";
anywheresoftware.b4a.keywords.Common.LogImpl("41572871","Tapped node: "+_tappedid,0);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="If tappedId = \"\" Then Return";
if ((_tappedid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="If StartNode <> \"\" And EndNode <> \"\" Then";
if ((mostCurrent._startnode).equals("") == false && (mostCurrent._endnode).equals("") == false) { 
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="StartNode = \"\"";
mostCurrent._startnode = "";
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="EndNode   = \"\"";
mostCurrent._endnode = "";
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="RouteEdges.Initialize";
mostCurrent._routeedges.Initialize();
 };
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="If StartNode = \"\" Then";
if ((mostCurrent._startnode).equals("")) { 
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="StartNode = tappedId";
mostCurrent._startnode = _tappedid;
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="Log(\"Start set: \" & StartNode)";
anywheresoftware.b4a.keywords.Common.LogImpl("41572882","Start set: "+mostCurrent._startnode,0);
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="ImageViewer.Invalidate";
mostCurrent._imageviewer.Invalidate();
 }else 
{RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="Else If tappedId <> StartNode Then";
if ((_tappedid).equals(mostCurrent._startnode) == false) { 
RDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="EndNode = tappedId";
mostCurrent._endnode = _tappedid;
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="Log(\"End set: \" & EndNode)";
anywheresoftware.b4a.keywords.Common.LogImpl("41572887","End set: "+mostCurrent._endnode,0);
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="RunDijkstra(StartNode, EndNode)";
_rundijkstra(mostCurrent._startnode,mostCurrent._endnode);
 }}
;
RDebugUtils.currentLine=1572890;
 //BA.debugLineNum = 1572890;BA.debugLine="End Sub";
return "";
}
public static String  _rundijkstra(String _startid,String _endid) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rundijkstra", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rundijkstra", new Object[] {_startid,_endid}));}
anywheresoftware.b4a.objects.collections.Map _dist = null;
anywheresoftware.b4a.objects.collections.Map _prev = null;
anywheresoftware.b4a.objects.collections.Map _visited = null;
String _nodeid = "";
String _current = "";
int _mindist = 0;
int _d = 0;
anywheresoftware.b4a.objects.collections.List _neighbors = null;
anywheresoftware.b4a.objects.collections.Map _conn = null;
String _neighbor = "";
int _currdist = 0;
int _neighbordist = 0;
int _edgeweight = 0;
int _newdist = 0;
anywheresoftware.b4a.objects.collections.List _path = null;
String _steps = "";
String _prevval = "";
anywheresoftware.b4a.objects.collections.List _reversed = null;
int _i = 0;
String _n = "";
String _fromid = "";
String _toid = "";
Object _found = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub RunDijkstra(startId As String, endId As String";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Log(\"Dijkstra running from: \" & startId & \" to: \"";
anywheresoftware.b4a.keywords.Common.LogImpl("4589825","Dijkstra running from: "+_startid+" to: "+_endid,0);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim dist    As Map : dist.Initialize";
_dist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim dist    As Map : dist.Initialize";
_dist.Initialize();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim prev    As Map : prev.Initialize";
_prev = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim prev    As Map : prev.Initialize";
_prev.Initialize();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim visited As Map : visited.Initialize";
_visited = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim visited As Map : visited.Initialize";
_visited.Initialize();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="For Each nodeId As String In Nodes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = mostCurrent._nodes.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_nodeid = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="dist.Put(nodeId, 999999)";
_dist.Put((Object)(_nodeid),(Object)(999999));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="prev.Put(nodeId, \"\")";
_prev.Put((Object)(_nodeid),(Object)(""));
 }
};
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="dist.Put(startId, 0)";
_dist.Put((Object)(_startid),(Object)(0));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Do While True";
while (anywheresoftware.b4a.keywords.Common.True) {
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Dim current As String = \"\"";
_current = "";
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Dim minDist As Int = 999999";
_mindist = (int) (999999);
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="For Each nodeId As String In Nodes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = mostCurrent._nodes.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_nodeid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="If visited.ContainsKey(nodeId) = False Then";
if (_visited.ContainsKey((Object)(_nodeid))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="Dim d As Int = dist.Get(nodeId)";
_d = (int)(BA.ObjectToNumber(_dist.Get((Object)(_nodeid))));
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="If d < minDist Then";
if (_d<_mindist) { 
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="minDist = d";
_mindist = _d;
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="current = nodeId";
_current = _nodeid;
 };
 };
 }
};
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="If current = \"\" Or current = endId Then Exit";
if ((_current).equals("") || (_current).equals(_endid)) { 
if (true) break;};
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="visited.Put(current, True)";
_visited.Put((Object)(_current),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="If Graph.ContainsKey(current) Then";
if (mostCurrent._graph.ContainsKey((Object)(_current))) { 
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="Dim neighbors As List = Graph.Get(current)";
_neighbors = new anywheresoftware.b4a.objects.collections.List();
_neighbors = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._graph.Get((Object)(_current))));
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="For Each conn As Map In neighbors";
_conn = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group29 = _neighbors;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_conn = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group29.Get(index29)));
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="Dim neighbor     As String = conn.Get(\"neighbo";
_neighbor = BA.ObjectToString(_conn.Get((Object)("neighbor")));
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="Dim currDist     As Int    = dist.Get(current)";
_currdist = (int)(BA.ObjectToNumber(_dist.Get((Object)(_current))));
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="Dim neighborDist As Int    = dist.Get(neighbor";
_neighbordist = (int)(BA.ObjectToNumber(_dist.Get((Object)(_neighbor))));
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="Dim edgeWeight   As Int    = conn.Get(\"weight\"";
_edgeweight = (int)(BA.ObjectToNumber(_conn.Get((Object)("weight"))));
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="Dim newDist      As Int    = currDist + edgeWe";
_newdist = (int) (_currdist+_edgeweight);
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="If newDist < neighborDist Then";
if (_newdist<_neighbordist) { 
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="dist.Put(neighbor, newDist)";
_dist.Put((Object)(_neighbor),(Object)(_newdist));
RDebugUtils.currentLine=589865;
 //BA.debugLineNum = 589865;BA.debugLine="prev.Put(neighbor, current)";
_prev.Put((Object)(_neighbor),(Object)(_current));
 };
 }
};
 };
 }
;
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="Dim path As List : path.Initialize";
_path = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="Dim path As List : path.Initialize";
_path.Initialize();
RDebugUtils.currentLine=589872;
 //BA.debugLineNum = 589872;BA.debugLine="Dim steps As String";
_steps = "";
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="steps = endId";
_steps = _endid;
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="Do While steps <> \"\"";
while ((_steps).equals("") == false) {
RDebugUtils.currentLine=589875;
 //BA.debugLineNum = 589875;BA.debugLine="path.Add(steps)";
_path.Add((Object)(_steps));
RDebugUtils.currentLine=589876;
 //BA.debugLineNum = 589876;BA.debugLine="If prev.ContainsKey(steps) = False Then";
if (_prev.ContainsKey((Object)(_steps))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="steps = \"\"";
_steps = "";
 }else {
RDebugUtils.currentLine=589879;
 //BA.debugLineNum = 589879;BA.debugLine="Dim prevVal As String = prev.Get(steps)";
_prevval = BA.ObjectToString(_prev.Get((Object)(_steps)));
RDebugUtils.currentLine=589880;
 //BA.debugLineNum = 589880;BA.debugLine="If prevVal = Null Or prevVal = \"\" Then";
if (_prevval== null || (_prevval).equals("")) { 
RDebugUtils.currentLine=589881;
 //BA.debugLineNum = 589881;BA.debugLine="steps = \"\"";
_steps = "";
 }else {
RDebugUtils.currentLine=589883;
 //BA.debugLineNum = 589883;BA.debugLine="steps = prevVal";
_steps = _prevval;
 };
 };
 }
;
RDebugUtils.currentLine=589888;
 //BA.debugLineNum = 589888;BA.debugLine="Dim reversed As List : reversed.Initialize";
_reversed = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589888;
 //BA.debugLineNum = 589888;BA.debugLine="Dim reversed As List : reversed.Initialize";
_reversed.Initialize();
RDebugUtils.currentLine=589889;
 //BA.debugLineNum = 589889;BA.debugLine="For i = path.Size - 1 To 0 Step -1";
{
final int step61 = -1;
final int limit61 = (int) (0);
_i = (int) (_path.getSize()-1) ;
for (;_i >= limit61 ;_i = _i + step61 ) {
RDebugUtils.currentLine=589890;
 //BA.debugLineNum = 589890;BA.debugLine="reversed.Add(path.Get(i))";
_reversed.Add(_path.Get(_i));
 }
};
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="Log(\"Path size: \" & reversed.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("4589893","Path size: "+BA.NumberToString(_reversed.getSize()),0);
RDebugUtils.currentLine=589894;
 //BA.debugLineNum = 589894;BA.debugLine="For Each n As String In reversed";
{
final anywheresoftware.b4a.BA.IterableList group65 = _reversed;
final int groupLen65 = group65.getSize()
;int index65 = 0;
;
for (; index65 < groupLen65;index65++){
_n = BA.ObjectToString(group65.Get(index65));
RDebugUtils.currentLine=589895;
 //BA.debugLineNum = 589895;BA.debugLine="Log(\"Path node: \" & n)";
anywheresoftware.b4a.keywords.Common.LogImpl("4589895","Path node: "+_n,0);
 }
};
RDebugUtils.currentLine=589898;
 //BA.debugLineNum = 589898;BA.debugLine="RouteEdges.Initialize";
mostCurrent._routeedges.Initialize();
RDebugUtils.currentLine=589899;
 //BA.debugLineNum = 589899;BA.debugLine="For i = 0 To reversed.Size - 2";
{
final int step69 = 1;
final int limit69 = (int) (_reversed.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit69 ;_i = _i + step69 ) {
RDebugUtils.currentLine=589900;
 //BA.debugLineNum = 589900;BA.debugLine="Dim fromId As String = reversed.Get(i)";
_fromid = BA.ObjectToString(_reversed.Get(_i));
RDebugUtils.currentLine=589901;
 //BA.debugLineNum = 589901;BA.debugLine="Dim toId   As String = reversed.Get(i + 1)";
_toid = BA.ObjectToString(_reversed.Get((int) (_i+1)));
RDebugUtils.currentLine=589902;
 //BA.debugLineNum = 589902;BA.debugLine="Dim found  As Object = FindEdge(fromId, toId)";
_found = _findedge(_fromid,_toid);
RDebugUtils.currentLine=589903;
 //BA.debugLineNum = 589903;BA.debugLine="If found <> Null Then";
if (_found!= null) { 
RDebugUtils.currentLine=589904;
 //BA.debugLineNum = 589904;BA.debugLine="RouteEdges.Add(found)";
mostCurrent._routeedges.Add(_found);
 };
 }
};
RDebugUtils.currentLine=589908;
 //BA.debugLineNum = 589908;BA.debugLine="Log(\"RouteEdges size: \" & RouteEdges.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("4589908","RouteEdges size: "+BA.NumberToString(mostCurrent._routeedges.getSize()),0);
RDebugUtils.currentLine=589909;
 //BA.debugLineNum = 589909;BA.debugLine="ImageViewer.Invalidate";
mostCurrent._imageviewer.Invalidate();
RDebugUtils.currentLine=589910;
 //BA.debugLineNum = 589910;BA.debugLine="End Sub";
return "";
}
public static String  _imageviewer_ondraw(anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageviewer_ondraw", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imageviewer_ondraw", new Object[] {_canvas}));}
float _scale = 0f;
float _cx = 0f;
float _cy = 0f;
float _halfw = 0f;
float _halfh = 0f;
anywheresoftware.b4a.objects.collections.Map _edge = null;
anywheresoftware.b4a.objects.collections.List _shape = null;
boolean _flipped = false;
anywheresoftware.b4a.objects.collections.List _drawshape = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _p1 = null;
anywheresoftware.b4a.objects.collections.Map _p2 = null;
float _ix1 = 0f;
float _iy1 = 0f;
float _ix2 = 0f;
float _iy2 = 0f;
float _x1 = 0f;
float _y1 = 0f;
float _x2 = 0f;
float _y2 = 0f;
String _nodeid = "";
anywheresoftware.b4a.objects.collections.Map _node = null;
float _x = 0f;
float _y = 0f;
String _label = "";
int _fillcolor = 0;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub ImageViewer_OnDraw(Canvas As Canvas)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If Nodes.IsInitialized = False Then Return";
if (mostCurrent._nodes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If Nodes.Size = 0 Then Return";
if (mostCurrent._nodes.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim scale  As Float = ImageViewer.Scale";
_scale = mostCurrent._imageviewer.getScale();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim cx     As Float = ImageViewer.CenterX";
_cx = mostCurrent._imageviewer.getCenterX();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Dim cy     As Float = ImageViewer.CenterY";
_cy = mostCurrent._imageviewer.getCenterY();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Dim halfW  As Float = ImageViewer.Width  / 2";
_halfw = (float) (mostCurrent._imageviewer.getWidth()/(double)2);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Dim halfH  As Float = ImageViewer.Height / 2";
_halfh = (float) (mostCurrent._imageviewer.getHeight()/(double)2);
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Log(\"Scale: \" & scale & \" CenterX: \" & cx & \" Cen";
anywheresoftware.b4a.keywords.Common.LogImpl("41507338","Scale: "+BA.NumberToString(_scale)+" CenterX: "+BA.NumberToString(_cx)+" CenterY: "+BA.NumberToString(_cy),0);
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="If RouteEdges.Size > 0 Then";
if (mostCurrent._routeedges.getSize()>0) { 
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="For Each edge As Map In RouteEdges";
_edge = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = mostCurrent._routeedges;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_edge = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="Dim shape As List = edge.Get(\"shape\")";
_shape = new anywheresoftware.b4a.objects.collections.List();
_shape = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_edge.Get((Object)("shape"))));
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="Dim flipped As Boolean = edge.Get(\"flipped\")";
_flipped = BA.ObjectToBoolean(_edge.Get((Object)("flipped")));
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="Dim drawShape As List";
_drawshape = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="drawShape.Initialize";
_drawshape.Initialize();
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="If flipped Then";
if (_flipped) { 
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="For i = shape.Size - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_i = (int) (_shape.getSize()-1) ;
for (;_i >= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="drawShape.Add(shape.Get(i))";
_drawshape.Add(_shape.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="For i = 0 To shape.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_shape.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=1507354;
 //BA.debugLineNum = 1507354;BA.debugLine="drawShape.Add(shape.Get(i))";
_drawshape.Add(_shape.Get(_i));
 }
};
 };
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="For i = 0 To drawShape.Size - 2";
{
final int step24 = 1;
final int limit24 = (int) (_drawshape.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=1507359;
 //BA.debugLineNum = 1507359;BA.debugLine="Dim p1 As Map = drawShape.Get(i)";
_p1 = new anywheresoftware.b4a.objects.collections.Map();
_p1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_drawshape.Get(_i)));
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="Dim p2 As Map = drawShape.Get(i + 1)";
_p2 = new anywheresoftware.b4a.objects.collections.Map();
_p2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_drawshape.Get((int) (_i+1))));
RDebugUtils.currentLine=1507362;
 //BA.debugLineNum = 1507362;BA.debugLine="Dim ix1 As Float = p1.Get(\"x\")";
_ix1 = (float)(BA.ObjectToNumber(_p1.Get((Object)("x"))));
RDebugUtils.currentLine=1507363;
 //BA.debugLineNum = 1507363;BA.debugLine="Dim iy1 As Float = p1.Get(\"y\")";
_iy1 = (float)(BA.ObjectToNumber(_p1.Get((Object)("y"))));
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="Dim ix2 As Float = p2.Get(\"x\")";
_ix2 = (float)(BA.ObjectToNumber(_p2.Get((Object)("x"))));
RDebugUtils.currentLine=1507365;
 //BA.debugLineNum = 1507365;BA.debugLine="Dim iy2 As Float = p2.Get(\"y\")";
_iy2 = (float)(BA.ObjectToNumber(_p2.Get((Object)("y"))));
RDebugUtils.currentLine=1507367;
 //BA.debugLineNum = 1507367;BA.debugLine="Dim x1 As Float = (ix1 - cx) * scale + halfW";
_x1 = (float) ((_ix1-_cx)*_scale+_halfw);
RDebugUtils.currentLine=1507368;
 //BA.debugLineNum = 1507368;BA.debugLine="Dim y1 As Float = (iy1 - cy) * scale + halfH";
_y1 = (float) ((_iy1-_cy)*_scale+_halfh);
RDebugUtils.currentLine=1507369;
 //BA.debugLineNum = 1507369;BA.debugLine="Dim x2 As Float = (ix2 - cx) * scale + halfW";
_x2 = (float) ((_ix2-_cx)*_scale+_halfw);
RDebugUtils.currentLine=1507370;
 //BA.debugLineNum = 1507370;BA.debugLine="Dim y2 As Float = (iy2 - cy) * scale + halfH";
_y2 = (float) ((_iy2-_cy)*_scale+_halfh);
RDebugUtils.currentLine=1507372;
 //BA.debugLineNum = 1507372;BA.debugLine="Canvas.DrawLine(x1, y1, x2, y2, Colors.ARGB(80";
_canvas.DrawLine(_x1,_y1,_x2,_y2,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (80),(int) (0),(int) (120),(int) (255)),(float) (16));
RDebugUtils.currentLine=1507373;
 //BA.debugLineNum = 1507373;BA.debugLine="Canvas.DrawLine(x1, y1, x2, y2, Colors.ARGB(22";
_canvas.DrawLine(_x1,_y1,_x2,_y2,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (220),(int) (0),(int) (120),(int) (255)),(float) (8));
 }
};
 }
};
 };
RDebugUtils.currentLine=1507379;
 //BA.debugLineNum = 1507379;BA.debugLine="For Each nodeId As String In Nodes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group40 = mostCurrent._nodes.Keys();
final int groupLen40 = group40.getSize()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_nodeid = BA.ObjectToString(group40.Get(index40));
RDebugUtils.currentLine=1507380;
 //BA.debugLineNum = 1507380;BA.debugLine="Dim node As Map = Nodes.Get(nodeId)";
_node = new anywheresoftware.b4a.objects.collections.Map();
_node = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(mostCurrent._nodes.Get((Object)(_nodeid))));
RDebugUtils.currentLine=1507381;
 //BA.debugLineNum = 1507381;BA.debugLine="Dim x As Float = (node.Get(\"x\") - cx) * scale +";
_x = (float) (((double)(BA.ObjectToNumber(_node.Get((Object)("x"))))-_cx)*_scale+_halfw);
RDebugUtils.currentLine=1507382;
 //BA.debugLineNum = 1507382;BA.debugLine="Dim y As Float = (node.Get(\"y\") - cy) * scale +";
_y = (float) (((double)(BA.ObjectToNumber(_node.Get((Object)("y"))))-_cy)*_scale+_halfh);
RDebugUtils.currentLine=1507385;
 //BA.debugLineNum = 1507385;BA.debugLine="Dim label As String = node.Get(\"label\")";
_label = BA.ObjectToString(_node.Get((Object)("label")));
RDebugUtils.currentLine=1507386;
 //BA.debugLineNum = 1507386;BA.debugLine="If label = \"\" Then Continue";
if ((_label).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=1507389;
 //BA.debugLineNum = 1507389;BA.debugLine="If RouteEdges.Size > 0 Then";
if (mostCurrent._routeedges.getSize()>0) { 
RDebugUtils.currentLine=1507390;
 //BA.debugLineNum = 1507390;BA.debugLine="If nodeId <> StartNode And nodeId <> EndNode Th";
if ((_nodeid).equals(mostCurrent._startnode) == false && (_nodeid).equals(mostCurrent._endnode) == false) { 
if (true) continue;};
 };
RDebugUtils.currentLine=1507393;
 //BA.debugLineNum = 1507393;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=1507394;
 //BA.debugLineNum = 1507394;BA.debugLine="If nodeId = StartNode Then";
if ((_nodeid).equals(mostCurrent._startnode)) { 
RDebugUtils.currentLine=1507395;
 //BA.debugLineNum = 1507395;BA.debugLine="fillColor = Colors.Green";
_fillcolor = anywheresoftware.b4a.keywords.Common.Colors.Green;
 }else 
{RDebugUtils.currentLine=1507396;
 //BA.debugLineNum = 1507396;BA.debugLine="Else If nodeId = EndNode Then";
if ((_nodeid).equals(mostCurrent._endnode)) { 
RDebugUtils.currentLine=1507397;
 //BA.debugLineNum = 1507397;BA.debugLine="fillColor = Colors.Red";
_fillcolor = anywheresoftware.b4a.keywords.Common.Colors.Red;
 }else {
RDebugUtils.currentLine=1507399;
 //BA.debugLineNum = 1507399;BA.debugLine="fillColor = Colors.ARGB(200, 30, 100, 255)";
_fillcolor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (200),(int) (30),(int) (100),(int) (255));
 }}
;
RDebugUtils.currentLine=1507402;
 //BA.debugLineNum = 1507402;BA.debugLine="Canvas.DrawCircle(x, y, 8, Colors.White, True, 0";
_canvas.DrawCircle(_x,_y,(float) (8),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=1507403;
 //BA.debugLineNum = 1507403;BA.debugLine="Canvas.DrawCircle(x, y, 8, fillColor, True, 0)";
_canvas.DrawCircle(_x,_y,(float) (8),_fillcolor,anywheresoftware.b4a.keywords.Common.True,(float) (0));
 }
};
RDebugUtils.currentLine=1507405;
 //BA.debugLineNum = 1507405;BA.debugLine="End Sub";
return "";
}
public static String  _parsenodes(anywheresoftware.b4a.objects.collections.Map _root) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parsenodes", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "parsenodes", new Object[] {_root}));}
anywheresoftware.b4a.objects.collections.List _nodearray = null;
anywheresoftware.b4a.objects.collections.Map _nodeobj = null;
anywheresoftware.b4a.objects.collections.Map _n = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub ParseNodes(root As Map)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If root.ContainsKey(\"nodes\") = False Then";
if (_root.ContainsKey((Object)("nodes"))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Log(\"ERROR: no nodes key found in JSON\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4393218","ERROR: no nodes key found in JSON",0);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Dim nodeArray As List";
_nodearray = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="nodeArray = root.Get(\"nodes\")";
_nodearray = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("nodes"))));
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="If nodeArray = Null Then";
if (_nodearray== null) { 
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="Log(\"ERROR: nodes array is null\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4393226","ERROR: nodes array is null",0);
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="For Each nodeObj As Map In nodeArray";
_nodeobj = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _nodearray;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_nodeobj = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="Dim n As Map";
_n = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="n.Put(\"id\",    nodeObj.Get(\"id\"))";
_n.Put((Object)("id"),_nodeobj.Get((Object)("id")));
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="n.Put(\"x\",     nodeObj.Get(\"x\"))";
_n.Put((Object)("x"),_nodeobj.Get((Object)("x")));
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="n.Put(\"y\",     nodeObj.Get(\"y\"))";
_n.Put((Object)("y"),_nodeobj.Get((Object)("y")));
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="n.Put(\"label\", nodeObj.Get(\"label\"))";
_n.Put((Object)("label"),_nodeobj.Get((Object)("label")));
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="Nodes.Put(nodeObj.Get(\"id\"), n)";
mostCurrent._nodes.Put(_nodeobj.Get((Object)("id")),(Object)(_n.getObject()));
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="Log(\"Node: \" & nodeObj.Get(\"id\") & \" at (\" & nod";
anywheresoftware.b4a.keywords.Common.LogImpl("4393238","Node: "+BA.ObjectToString(_nodeobj.Get((Object)("id")))+" at ("+BA.ObjectToString(_nodeobj.Get((Object)("x")))+","+BA.ObjectToString(_nodeobj.Get((Object)("y")))+")",0);
 }
};
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="End Sub";
return "";
}
public static String  _parseedges(anywheresoftware.b4a.objects.collections.Map _root) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parseedges", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "parseedges", new Object[] {_root}));}
anywheresoftware.b4a.objects.collections.List _edgearray = null;
anywheresoftware.b4a.objects.collections.Map _edgeobj = null;
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.List _emptyshape = null;
anywheresoftware.b4a.objects.collections.List _shapearray = null;
anywheresoftware.b4a.objects.collections.List _emptyshape2 = null;
anywheresoftware.b4a.objects.collections.List _shape = null;
anywheresoftware.b4a.objects.collections.Map _pointobj = null;
anywheresoftware.b4a.objects.collections.Map _p = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub ParseEdges(root As Map)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If root.ContainsKey(\"edges\") = False Then";
if (_root.ContainsKey((Object)("edges"))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Log(\"ERROR: no edges key found in JSON\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4458754","ERROR: no edges key found in JSON",0);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Dim edgeArray As List";
_edgearray = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="edgeArray = root.Get(\"edges\")";
_edgearray = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("edges"))));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="If edgeArray = Null Then";
if (_edgearray== null) { 
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Log(\"ERROR: edges array is null\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4458762","ERROR: edges array is null",0);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="For Each edgeObj As Map In edgeArray";
_edgeobj = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _edgearray;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_edgeobj = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Dim e As Map";
_e = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="e.Initialize";
_e.Initialize();
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="e.Put(\"id\",     edgeObj.Get(\"id\"))";
_e.Put((Object)("id"),_edgeobj.Get((Object)("id")));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="e.Put(\"from\",   edgeObj.Get(\"from\"))";
_e.Put((Object)("from"),_edgeobj.Get((Object)("from")));
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="e.Put(\"to\",     edgeObj.Get(\"to\"))";
_e.Put((Object)("to"),_edgeobj.Get((Object)("to")));
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="e.Put(\"weight\", edgeObj.Get(\"weight\"))";
_e.Put((Object)("weight"),_edgeobj.Get((Object)("weight")));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="If edgeObj.ContainsKey(\"shape\") = False Then";
if (_edgeobj.ContainsKey((Object)("shape"))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="Log(\"WARNING: edge \" & edgeObj.Get(\"id\") & \" ha";
anywheresoftware.b4a.keywords.Common.LogImpl("4458775","WARNING: edge "+BA.ObjectToString(_edgeobj.Get((Object)("id")))+" has no shape points",0);
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="Dim emptyShape As List : emptyShape.Initialize";
_emptyshape = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="Dim emptyShape As List : emptyShape.Initialize";
_emptyshape.Initialize();
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="e.Put(\"shape\", emptyShape)";
_e.Put((Object)("shape"),(Object)(_emptyshape.getObject()));
 }else {
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="Dim shapeArray As List";
_shapearray = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="shapeArray = edgeObj.Get(\"shape\")";
_shapearray = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_edgeobj.Get((Object)("shape"))));
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="If shapeArray = Null Then";
if (_shapearray== null) { 
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="Log(\"WARNING: shape is null for edge \" & edgeO";
anywheresoftware.b4a.keywords.Common.LogImpl("4458783","WARNING: shape is null for edge "+BA.ObjectToString(_edgeobj.Get((Object)("id"))),0);
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="Dim emptyShape2 As List : emptyShape2.Initiali";
_emptyshape2 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="Dim emptyShape2 As List : emptyShape2.Initiali";
_emptyshape2.Initialize();
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="e.Put(\"shape\", emptyShape2)";
_e.Put((Object)("shape"),(Object)(_emptyshape2.getObject()));
 }else {
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="Dim shape As List";
_shape = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="shape.Initialize";
_shape.Initialize();
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="For Each pointObj As Map In shapeArray";
_pointobj = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group34 = _shapearray;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_pointobj = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group34.Get(index34)));
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="Dim p As Map";
_p = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="p.Put(\"x\", pointObj.Get(\"x\"))";
_p.Put((Object)("x"),_pointobj.Get((Object)("x")));
RDebugUtils.currentLine=458793;
 //BA.debugLineNum = 458793;BA.debugLine="p.Put(\"y\", pointObj.Get(\"y\"))";
_p.Put((Object)("y"),_pointobj.Get((Object)("y")));
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="shape.Add(p)";
_shape.Add((Object)(_p.getObject()));
 }
};
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="e.Put(\"shape\", shape)";
_e.Put((Object)("shape"),(Object)(_shape.getObject()));
 };
 };
RDebugUtils.currentLine=458800;
 //BA.debugLineNum = 458800;BA.debugLine="Edges.Add(e)";
mostCurrent._edges.Add((Object)(_e.getObject()));
RDebugUtils.currentLine=458801;
 //BA.debugLineNum = 458801;BA.debugLine="Log(\"Edge: \" & edgeObj.Get(\"id\") & \" (\" & edgeOb";
anywheresoftware.b4a.keywords.Common.LogImpl("4458801","Edge: "+BA.ObjectToString(_edgeobj.Get((Object)("id")))+" ("+BA.ObjectToString(_edgeobj.Get((Object)("from")))+" -> "+BA.ObjectToString(_edgeobj.Get((Object)("to")))+")",0);
 }
};
RDebugUtils.currentLine=458803;
 //BA.debugLineNum = 458803;BA.debugLine="End Sub";
return "";
}
}