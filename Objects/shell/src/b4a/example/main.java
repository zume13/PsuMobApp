
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mapimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _imageviewer = RemoteObject.declareNull("agraham.b4a.scaleimageview.ScaleImageViewWrapper");
public static RemoteObject _overlaypanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _overlaycanvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _nodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _edges = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _graph = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _routeedges = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _startnode = RemoteObject.createImmutable("");
public static RemoteObject _endnode = RemoteObject.createImmutable("");
public static RemoteObject _scalex = RemoteObject.createImmutable(0f);
public static RemoteObject _scaley = RemoteObject.createImmutable(0f);
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"Edges",main.mostCurrent._edges,"EndNode",main.mostCurrent._endnode,"Graph",main.mostCurrent._graph,"ImageViewer",main.mostCurrent._imageviewer,"MapImage",main.mostCurrent._mapimage,"Nodes",main.mostCurrent._nodes,"OverlayCanvas",main.mostCurrent._overlaycanvas,"OverlayPanel",main.mostCurrent._overlaypanel,"RouteEdges",main.mostCurrent._routeedges,"ScaleX",main._scalex,"ScaleY",main._scaley,"Starter",Debug.moduleToString(b4a.example.starter.class),"StartNode",main.mostCurrent._startnode,"xui",main._xui};
}
}