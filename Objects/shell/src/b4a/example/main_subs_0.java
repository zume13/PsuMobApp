package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"MainPage\")";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),main.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _gotopage(RemoteObject _nextactivity) throws Exception{
try {
		Debug.PushSubsStack("GoToPage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("gotopage")) { b4a.example.main.remoteMe.runUserSub(false, "main","gotopage", _nextactivity); return;}
ResumableSub_GoToPage rsub = new ResumableSub_GoToPage(null,_nextactivity);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GoToPage extends BA.ResumableSub {
public ResumableSub_GoToPage(b4a.example.main parent,RemoteObject _nextactivity) {
this.parent = parent;
this._nextactivity = _nextactivity;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _nextactivity;
RemoteObject _pnlslide = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GoToPage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("NextActivity", _nextactivity);
 BA.debugLineNum = 44;BA.debugLine="Dim pnlSlide As Panel";
Debug.ShouldStop(2048);
_pnlslide = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlSlide", _pnlslide);
 BA.debugLineNum = 45;BA.debugLine="pnlSlide.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnlslide.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 47;BA.debugLine="Activity.AddView(pnlSlide, Activity.Width, 0, Act";
Debug.ShouldStop(16384);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnlslide.getObject())),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._activity.runMethod(true,"getHeight")));
 BA.debugLineNum = 48;BA.debugLine="pnlSlide.Color = Colors.RGB(142, 30, 44)";
Debug.ShouldStop(32768);
_pnlslide.runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 44))));
 BA.debugLineNum = 50;BA.debugLine="pnlSlide.SetLayoutAnimated(300, 0, 0, Activity.Wi";
Debug.ShouldStop(131072);
_pnlslide.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._activity.runMethod(true,"getHeight")));
 BA.debugLineNum = 52;BA.debugLine="Sleep(320)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "gotopage"),BA.numberCast(int.class, 320));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="StartActivity(NextActivity)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)(_nextactivity));
 BA.debugLineNum = 55;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _nextb_click() throws Exception{
try {
		Debug.PushSubsStack("NextB_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("nextb_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","nextb_click");}
 BA.debugLineNum = 39;BA.debugLine="Private Sub NextB_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="GoToPage(Map)";
Debug.ShouldStop(128);
_gotopage((main.mostCurrent._map.getObject()));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
facilities_subs_0._process_globals();
map_subs_0._process_globals();
food_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
facilities.myClass = BA.getDeviceClass ("b4a.example.facilities");
map.myClass = BA.getDeviceClass ("b4a.example.map");
food.myClass = BA.getDeviceClass ("b4a.example.food");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}