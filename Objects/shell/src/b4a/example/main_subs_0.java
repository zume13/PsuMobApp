package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="RouteEdges.Initialize";
Debug.ShouldStop(128);
main.mostCurrent._routeedges.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="StartNode = \"\"";
Debug.ShouldStop(256);
main.mostCurrent._startnode = BA.ObjectToString("");
 BA.debugLineNum = 42;BA.debugLine="EndNode   = \"\"";
Debug.ShouldStop(512);
main.mostCurrent._endnode = BA.ObjectToString("");
 BA.debugLineNum = 44;BA.debugLine="MapImage = LoadBitmap(File.DirAssets, \"map.png\")";
Debug.ShouldStop(2048);
main.mostCurrent._mapimage = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("map.png")));
 BA.debugLineNum = 46;BA.debugLine="ImageViewer.Initialize(\"ImageViewer\")";
Debug.ShouldStop(8192);
main.mostCurrent._imageviewer.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ImageViewer")));
 BA.debugLineNum = 47;BA.debugLine="Activity.AddView(ImageViewer, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._imageviewer.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 48;BA.debugLine="ImageViewer.Image = MapImage";
Debug.ShouldStop(32768);
main.mostCurrent._imageviewer.runMethod(false,"setImage",(main.mostCurrent._mapimage.getObject()));
 BA.debugLineNum = 50;BA.debugLine="OverlayPanel.Initialize(\"OverlayPanel\")";
Debug.ShouldStop(131072);
main.mostCurrent._overlaypanel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("OverlayPanel")));
 BA.debugLineNum = 51;BA.debugLine="Activity.AddView(OverlayPanel, 0, 0, 100%x, 100%y";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._overlaypanel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 52;BA.debugLine="OverlayPanel.Color = Colors.Transparent";
Debug.ShouldStop(524288);
main.mostCurrent._overlaypanel.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 53;BA.debugLine="OverlayCanvas.Initialize(OverlayPanel)";
Debug.ShouldStop(1048576);
main.mostCurrent._overlaycanvas.runVoidMethod ("Initialize",(Object)((main.mostCurrent._overlaypanel.getObject())));
 BA.debugLineNum = 55;BA.debugLine="LoadAllMapData";
Debug.ShouldStop(4194304);
_loadallmapdata();
 BA.debugLineNum = 56;BA.debugLine="DrawOverlay";
Debug.ShouldStop(8388608);
_drawoverlay();
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,62);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Pause(UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildgraph() throws Exception{
try {
		Debug.PushSubsStack("BuildGraph (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,165);
if (RapidSub.canDelegate("buildgraph")) { return b4a.example.main.remoteMe.runUserSub(false, "main","buildgraph");}
RemoteObject _edge = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fromid = RemoteObject.createImmutable("");
RemoteObject _toid = RemoteObject.createImmutable("");
RemoteObject _weight = RemoteObject.createImmutable(0);
RemoteObject _edgeid = RemoteObject.createImmutable("");
RemoteObject _l1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _l2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 165;BA.debugLine="Sub BuildGraph";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Graph.Initialize";
Debug.ShouldStop(32);
main.mostCurrent._graph.runVoidMethod ("Initialize");
 BA.debugLineNum = 168;BA.debugLine="For Each edge As Map In Edges";
Debug.ShouldStop(128);
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = main.mostCurrent._edges;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));Debug.locals.put("edge", _edge);
Debug.locals.put("edge", _edge);
 BA.debugLineNum = 169;BA.debugLine="Dim fromId As String = edge.Get(\"from\")";
Debug.ShouldStop(256);
_fromid = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))));Debug.locals.put("fromId", _fromid);Debug.locals.put("fromId", _fromid);
 BA.debugLineNum = 170;BA.debugLine="Dim toId   As String = edge.Get(\"to\")";
Debug.ShouldStop(512);
_toid = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to")))));Debug.locals.put("toId", _toid);Debug.locals.put("toId", _toid);
 BA.debugLineNum = 171;BA.debugLine="Dim weight As Int    = edge.Get(\"weight\")";
Debug.ShouldStop(1024);
_weight = BA.numberCast(int.class, _edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 172;BA.debugLine="Dim edgeId As String = edge.Get(\"id\")";
Debug.ShouldStop(2048);
_edgeid = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("edgeId", _edgeid);Debug.locals.put("edgeId", _edgeid);
 BA.debugLineNum = 174;BA.debugLine="If Graph.ContainsKey(fromId) = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.mostCurrent._graph.runMethod(true,"ContainsKey",(Object)((_fromid))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 175;BA.debugLine="Dim l1 As List : l1.Initialize";
Debug.ShouldStop(16384);
_l1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l1", _l1);
 BA.debugLineNum = 175;BA.debugLine="Dim l1 As List : l1.Initialize";
Debug.ShouldStop(16384);
_l1.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="Graph.Put(fromId, l1)";
Debug.ShouldStop(32768);
main.mostCurrent._graph.runVoidMethod ("Put",(Object)((_fromid)),(Object)((_l1.getObject())));
 };
 BA.debugLineNum = 178;BA.debugLine="Dim n1 As List = Graph.Get(fromId)";
Debug.ShouldStop(131072);
_n1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_n1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._graph.runMethod(false,"Get",(Object)((_fromid))));Debug.locals.put("n1", _n1);Debug.locals.put("n1", _n1);
 BA.debugLineNum = 179;BA.debugLine="Dim c1 As Map  : c1.Initialize";
Debug.ShouldStop(262144);
_c1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("c1", _c1);
 BA.debugLineNum = 179;BA.debugLine="Dim c1 As Map  : c1.Initialize";
Debug.ShouldStop(262144);
_c1.runVoidMethod ("Initialize");
 BA.debugLineNum = 180;BA.debugLine="c1.Put(\"neighbor\", toId)";
Debug.ShouldStop(524288);
_c1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("neighbor"))),(Object)((_toid)));
 BA.debugLineNum = 181;BA.debugLine="c1.Put(\"weight\",   weight)";
Debug.ShouldStop(1048576);
_c1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("weight"))),(Object)((_weight)));
 BA.debugLineNum = 182;BA.debugLine="c1.Put(\"edgeId\",   edgeId)";
Debug.ShouldStop(2097152);
_c1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("edgeId"))),(Object)((_edgeid)));
 BA.debugLineNum = 183;BA.debugLine="n1.Add(c1)";
Debug.ShouldStop(4194304);
_n1.runVoidMethod ("Add",(Object)((_c1.getObject())));
 BA.debugLineNum = 185;BA.debugLine="If Graph.ContainsKey(toId) = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main.mostCurrent._graph.runMethod(true,"ContainsKey",(Object)((_toid))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 186;BA.debugLine="Dim l2 As List : l2.Initialize";
Debug.ShouldStop(33554432);
_l2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l2", _l2);
 BA.debugLineNum = 186;BA.debugLine="Dim l2 As List : l2.Initialize";
Debug.ShouldStop(33554432);
_l2.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="Graph.Put(toId, l2)";
Debug.ShouldStop(67108864);
main.mostCurrent._graph.runVoidMethod ("Put",(Object)((_toid)),(Object)((_l2.getObject())));
 };
 BA.debugLineNum = 189;BA.debugLine="Dim n2 As List = Graph.Get(toId)";
Debug.ShouldStop(268435456);
_n2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_n2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._graph.runMethod(false,"Get",(Object)((_toid))));Debug.locals.put("n2", _n2);Debug.locals.put("n2", _n2);
 BA.debugLineNum = 190;BA.debugLine="Dim c2 As Map  : c2.Initialize";
Debug.ShouldStop(536870912);
_c2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 190;BA.debugLine="Dim c2 As Map  : c2.Initialize";
Debug.ShouldStop(536870912);
_c2.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="c2.Put(\"neighbor\", fromId)";
Debug.ShouldStop(1073741824);
_c2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("neighbor"))),(Object)((_fromid)));
 BA.debugLineNum = 192;BA.debugLine="c2.Put(\"weight\",   weight)";
Debug.ShouldStop(-2147483648);
_c2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("weight"))),(Object)((_weight)));
 BA.debugLineNum = 193;BA.debugLine="c2.Put(\"edgeId\",   edgeId)";
Debug.ShouldStop(1);
_c2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("edgeId"))),(Object)((_edgeid)));
 BA.debugLineNum = 194;BA.debugLine="n2.Add(c2)";
Debug.ShouldStop(2);
_n2.runVoidMethod ("Add",(Object)((_c2.getObject())));
 }
}Debug.locals.put("edge", _edge);
;
 BA.debugLineNum = 197;BA.debugLine="Log(\"Graph built. Nodes in graph: \" & Graph.Size)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8524320",RemoteObject.concat(RemoteObject.createImmutable("Graph built. Nodes in graph: "),main.mostCurrent._graph.runMethod(true,"getSize")),0);
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawnodes() throws Exception{
try {
		Debug.PushSubsStack("DrawNodes (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,326);
if (RapidSub.canDelegate("drawnodes")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawnodes");}
RemoteObject _nodeid = RemoteObject.createImmutable("");
RemoteObject _node = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
 BA.debugLineNum = 326;BA.debugLine="Sub DrawNodes";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(64);
{
final RemoteObject group1 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_nodeid = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 328;BA.debugLine="Dim node As Map = Nodes.Get(nodeId)";
Debug.ShouldStop(128);
_node = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_node = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main.mostCurrent._nodes.runMethod(false,"Get",(Object)((_nodeid))));Debug.locals.put("node", _node);Debug.locals.put("node", _node);
 BA.debugLineNum = 329;BA.debugLine="Dim x As Float = node.Get(\"x\") * ScaleX";
Debug.ShouldStop(256);
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))),main._scalex}, "*",0, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 330;BA.debugLine="Dim y As Float = node.Get(\"y\") * ScaleY";
Debug.ShouldStop(512);
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))),main._scaley}, "*",0, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 332;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(2048);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 333;BA.debugLine="If nodeId = StartNode Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_nodeid,main.mostCurrent._startnode)) { 
 BA.debugLineNum = 334;BA.debugLine="fillColor = Colors.Green";
Debug.ShouldStop(8192);
_fillcolor = main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green");Debug.locals.put("fillColor", _fillcolor);
 }else 
{ BA.debugLineNum = 335;BA.debugLine="Else If nodeId = EndNode Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_nodeid,main.mostCurrent._endnode)) { 
 BA.debugLineNum = 336;BA.debugLine="fillColor = Colors.Red";
Debug.ShouldStop(32768);
_fillcolor = main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("fillColor", _fillcolor);
 }else {
 BA.debugLineNum = 338;BA.debugLine="fillColor = Colors.ARGB(200, 30, 100, 255)";
Debug.ShouldStop(131072);
_fillcolor = main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 255)));Debug.locals.put("fillColor", _fillcolor);
 }}
;
 BA.debugLineNum = 341;BA.debugLine="OverlayCanvas.DrawCircle(x, y, 14, Colors.White,";
Debug.ShouldStop(1048576);
main.mostCurrent._overlaycanvas.runVoidMethod ("DrawCircle",(Object)(_x),(Object)(_y),(Object)(BA.numberCast(float.class, 14)),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 342;BA.debugLine="OverlayCanvas.DrawCircle(x, y, 11, fillColor, Tr";
Debug.ShouldStop(2097152);
main.mostCurrent._overlaycanvas.runVoidMethod ("DrawCircle",(Object)(_x),(Object)(_y),(Object)(BA.numberCast(float.class, 11)),(Object)(_fillcolor),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawoverlay() throws Exception{
try {
		Debug.PushSubsStack("DrawOverlay (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,292);
if (RapidSub.canDelegate("drawoverlay")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawoverlay");}
 BA.debugLineNum = 292;BA.debugLine="Sub DrawOverlay";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="ScaleX = Activity.Width / MapImage.Width";
Debug.ShouldStop(16);
main._scalex = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getWidth"),main.mostCurrent._mapimage.runMethod(true,"getWidth")}, "/",0, 0));
 BA.debugLineNum = 294;BA.debugLine="ScaleY = Activity.Height / MapImage.Height";
Debug.ShouldStop(32);
main._scaley = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getHeight"),main.mostCurrent._mapimage.runMethod(true,"getHeight")}, "/",0, 0));
 BA.debugLineNum = 296;BA.debugLine="Log(\"Image size: \" & MapImage.Width & \" x \" & Map";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720900",RemoteObject.concat(RemoteObject.createImmutable("Image size: "),main.mostCurrent._mapimage.runMethod(true,"getWidth"),RemoteObject.createImmutable(" x "),main.mostCurrent._mapimage.runMethod(true,"getHeight")),0);
 BA.debugLineNum = 297;BA.debugLine="Log(\"Screen size: \" & Activity.Width & \" x \" & Ac";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720901",RemoteObject.concat(RemoteObject.createImmutable("Screen size: "),main.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(" x "),main.mostCurrent._activity.runMethod(true,"getHeight")),0);
 BA.debugLineNum = 298;BA.debugLine="Log(\"Scale: \" & ScaleX & \" x \" & ScaleY)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720902",RemoteObject.concat(RemoteObject.createImmutable("Scale: "),main._scalex,RemoteObject.createImmutable(" x "),main._scaley),0);
 BA.debugLineNum = 300;BA.debugLine="OverlayCanvas.Initialize(OverlayPanel)";
Debug.ShouldStop(2048);
main.mostCurrent._overlaycanvas.runVoidMethod ("Initialize",(Object)((main.mostCurrent._overlaypanel.getObject())));
 BA.debugLineNum = 301;BA.debugLine="DrawRoute";
Debug.ShouldStop(4096);
_drawroute();
 BA.debugLineNum = 302;BA.debugLine="DrawNodes";
Debug.ShouldStop(8192);
_drawnodes();
 BA.debugLineNum = 303;BA.debugLine="OverlayPanel.Invalidate";
Debug.ShouldStop(16384);
main.mostCurrent._overlaypanel.runVoidMethod ("Invalidate");
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawroute() throws Exception{
try {
		Debug.PushSubsStack("DrawRoute (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,306);
if (RapidSub.canDelegate("drawroute")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawroute");}
RemoteObject _edge = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shape = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _x1 = RemoteObject.createImmutable(0f);
RemoteObject _y1 = RemoteObject.createImmutable(0f);
RemoteObject _x2 = RemoteObject.createImmutable(0f);
RemoteObject _y2 = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 306;BA.debugLine="Sub DrawRoute";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="If RouteEdges.Size = 0 Then Return";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main.mostCurrent._routeedges.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 309;BA.debugLine="For Each edge As Map In RouteEdges";
Debug.ShouldStop(1048576);
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = main.mostCurrent._routeedges;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));Debug.locals.put("edge", _edge);
Debug.locals.put("edge", _edge);
 BA.debugLineNum = 310;BA.debugLine="Dim shape As List = edge.Get(\"shape\")";
Debug.ShouldStop(2097152);
_shape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shape = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shape")))));Debug.locals.put("shape", _shape);Debug.locals.put("shape", _shape);
 BA.debugLineNum = 311;BA.debugLine="For i = 0 To shape.Size - 2";
Debug.ShouldStop(4194304);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_shape.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 312;BA.debugLine="Dim p1 As Map = shape.Get(i)";
Debug.ShouldStop(8388608);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_p1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shape.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p1", _p1);Debug.locals.put("p1", _p1);
 BA.debugLineNum = 313;BA.debugLine="Dim p2 As Map = shape.Get(i + 1)";
Debug.ShouldStop(16777216);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_p2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shape.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("p2", _p2);Debug.locals.put("p2", _p2);
 BA.debugLineNum = 315;BA.debugLine="Dim x1 As Float = p1.Get(\"x\") * ScaleX";
Debug.ShouldStop(67108864);
_x1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _p1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))),main._scalex}, "*",0, 0));Debug.locals.put("x1", _x1);Debug.locals.put("x1", _x1);
 BA.debugLineNum = 316;BA.debugLine="Dim y1 As Float = p1.Get(\"y\") * ScaleY";
Debug.ShouldStop(134217728);
_y1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _p1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))),main._scaley}, "*",0, 0));Debug.locals.put("y1", _y1);Debug.locals.put("y1", _y1);
 BA.debugLineNum = 317;BA.debugLine="Dim x2 As Float = p2.Get(\"x\") * ScaleX";
Debug.ShouldStop(268435456);
_x2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _p2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))),main._scalex}, "*",0, 0));Debug.locals.put("x2", _x2);Debug.locals.put("x2", _x2);
 BA.debugLineNum = 318;BA.debugLine="Dim y2 As Float = p2.Get(\"y\") * ScaleY";
Debug.ShouldStop(536870912);
_y2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _p2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))),main._scaley}, "*",0, 0));Debug.locals.put("y2", _y2);Debug.locals.put("y2", _y2);
 BA.debugLineNum = 320;BA.debugLine="OverlayCanvas.DrawLine(x1, y1, x2, y2, Colors.A";
Debug.ShouldStop(-2147483648);
main.mostCurrent._overlaycanvas.runVoidMethod ("DrawLine",(Object)(_x1),(Object)(_y1),(Object)(_x2),(Object)(_y2),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 255)))),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 321;BA.debugLine="OverlayCanvas.DrawLine(x1, y1, x2, y2, Colors.A";
Debug.ShouldStop(1);
main.mostCurrent._overlaycanvas.runVoidMethod ("DrawLine",(Object)(_x1),(Object)(_y1),(Object)(_x2),(Object)(_y2),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 255)))),(Object)(BA.numberCast(float.class, 8)));
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("edge", _edge);
;
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findedge(RemoteObject _fromid,RemoteObject _toid) throws Exception{
try {
		Debug.PushSubsStack("FindEdge (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,281);
if (RapidSub.canDelegate("findedge")) { return b4a.example.main.remoteMe.runUserSub(false, "main","findedge", _fromid, _toid);}
RemoteObject _edge = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _a = RemoteObject.createImmutable("");
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("fromId", _fromid);
Debug.locals.put("toId", _toid);
 BA.debugLineNum = 281;BA.debugLine="Sub FindEdge(fromId As String, toId As String) As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 282;BA.debugLine="For Each edge As Map In Edges";
Debug.ShouldStop(33554432);
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = main.mostCurrent._edges;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("edge", _edge);
Debug.locals.put("edge", _edge);
 BA.debugLineNum = 283;BA.debugLine="Dim a As String = edge.Get(\"from\")";
Debug.ShouldStop(67108864);
_a = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 284;BA.debugLine="Dim b As String = edge.Get(\"to\")";
Debug.ShouldStop(134217728);
_b = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to")))));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 285;BA.debugLine="If (a = fromId And b = toId) Or (a = toId And b";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_a,_fromid) && RemoteObject.solveBoolean("=",_b,_toid)))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_a,_toid) && RemoteObject.solveBoolean("=",_b,_fromid))))) { 
 BA.debugLineNum = 286;BA.debugLine="Return edge";
Debug.ShouldStop(536870912);
if (true) return (_edge.getObject());
 };
 }
}Debug.locals.put("edge", _edge);
;
 BA.debugLineNum = 289;BA.debugLine="Return Null";
Debug.ShouldStop(1);
if (true) return main.mostCurrent.__c.getField(false,"Null");
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnodeatposition(RemoteObject _tapx,RemoteObject _tapy,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("GetNodeAtPosition (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,371);
if (RapidSub.canDelegate("getnodeatposition")) { return b4a.example.main.remoteMe.runUserSub(false, "main","getnodeatposition", _tapx, _tapy, _radius);}
RemoteObject _nodeid = RemoteObject.createImmutable("");
RemoteObject _node = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nx = RemoteObject.createImmutable(0f);
RemoteObject _ny = RemoteObject.createImmutable(0f);
RemoteObject _dx = RemoteObject.createImmutable(0f);
RemoteObject _dy = RemoteObject.createImmutable(0f);
RemoteObject _dist = RemoteObject.createImmutable(0);
Debug.locals.put("tapX", _tapx);
Debug.locals.put("tapY", _tapy);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 371;BA.debugLine="Sub GetNodeAtPosition(tapX As Float, tapY As Float";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(524288);
{
final RemoteObject group1 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_nodeid = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 373;BA.debugLine="Dim node As Map = Nodes.Get(nodeId)";
Debug.ShouldStop(1048576);
_node = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_node = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main.mostCurrent._nodes.runMethod(false,"Get",(Object)((_nodeid))));Debug.locals.put("node", _node);Debug.locals.put("node", _node);
 BA.debugLineNum = 374;BA.debugLine="Dim nx As Float = node.Get(\"x\") * ScaleX";
Debug.ShouldStop(2097152);
_nx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))),main._scalex}, "*",0, 0));Debug.locals.put("nx", _nx);Debug.locals.put("nx", _nx);
 BA.debugLineNum = 375;BA.debugLine="Dim ny As Float = node.Get(\"y\") * ScaleY";
Debug.ShouldStop(4194304);
_ny = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))),main._scaley}, "*",0, 0));Debug.locals.put("ny", _ny);Debug.locals.put("ny", _ny);
 BA.debugLineNum = 376;BA.debugLine="Dim dx As Float = tapX - nx";
Debug.ShouldStop(8388608);
_dx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tapx,_nx}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 377;BA.debugLine="Dim dy As Float = tapY - ny";
Debug.ShouldStop(16777216);
_dy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tapy,_ny}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 378;BA.debugLine="Dim dist As Double = Sqrt(dx * dx + dy * dy)";
Debug.ShouldStop(33554432);
_dist = main.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_dx,_dx,_dy,_dy}, "*+*",1, 0)));Debug.locals.put("dist", _dist);Debug.locals.put("dist", _dist);
 BA.debugLineNum = 379;BA.debugLine="If dist <= radius Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("k",_dist,BA.numberCast(double.class, _radius))) { 
 BA.debugLineNum = 380;BA.debugLine="Return nodeId";
Debug.ShouldStop(134217728);
if (true) return _nodeid;
 };
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 383;BA.debugLine="Return \"\"";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 384;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim MapImage As Bitmap";
main.mostCurrent._mapimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim ImageViewer  As ScaleImageView";
main.mostCurrent._imageviewer = RemoteObject.createNew ("agraham.b4a.scaleimageview.ScaleImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim OverlayPanel As Panel";
main.mostCurrent._overlaypanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim OverlayCanvas As Canvas";
main.mostCurrent._overlaycanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim Nodes As Map";
main.mostCurrent._nodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 26;BA.debugLine="Dim Edges As List";
main.mostCurrent._edges = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="Dim Graph As Map";
main.mostCurrent._graph = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 28;BA.debugLine="Dim RouteEdges As List";
main.mostCurrent._routeedges = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Dim StartNode As String";
main.mostCurrent._startnode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim EndNode As String";
main.mostCurrent._endnode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim ScaleX As Float";
main._scalex = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 34;BA.debugLine="Dim ScaleY As Float";
main._scaley = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loadallmapdata() throws Exception{
try {
		Debug.PushSubsStack("LoadAllMapData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("loadallmapdata")) { return b4a.example.main.remoteMe.runUserSub(false, "main","loadallmapdata");}
RemoteObject _raw = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 65;BA.debugLine="Sub LoadAllMapData";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Nodes.Initialize";
Debug.ShouldStop(2);
main.mostCurrent._nodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="Edges.Initialize";
Debug.ShouldStop(4);
main.mostCurrent._edges.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="Graph.Initialize";
Debug.ShouldStop(8);
main.mostCurrent._graph.runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="Dim raw As String";
Debug.ShouldStop(32);
_raw = RemoteObject.createImmutable("");Debug.locals.put("raw", _raw);
 BA.debugLineNum = 71;BA.debugLine="raw = File.ReadString(File.DirAssets, \"mapdata.js";
Debug.ShouldStop(64);
_raw = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("mapdata.json")));Debug.locals.put("raw", _raw);
 BA.debugLineNum = 73;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 74;BA.debugLine="parser.Initialize(raw)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_raw));
 BA.debugLineNum = 75;BA.debugLine="Dim root As Map";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 76;BA.debugLine="root = parser.NextObject";
Debug.ShouldStop(2048);
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);
 BA.debugLineNum = 78;BA.debugLine="ParseNodes(root)";
Debug.ShouldStop(8192);
_parsenodes(_root);
 BA.debugLineNum = 79;BA.debugLine="ParseEdges(root)";
Debug.ShouldStop(16384);
_parseedges(_root);
 BA.debugLineNum = 80;BA.debugLine="BuildGraph";
Debug.ShouldStop(32768);
_buildgraph();
 BA.debugLineNum = 82;BA.debugLine="Log(\"Map data loaded. Nodes: \" & Nodes.Size & \" E";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8327697",RemoteObject.concat(RemoteObject.createImmutable("Map data loaded. Nodes: "),main.mostCurrent._nodes.runMethod(true,"getSize"),RemoteObject.createImmutable(" Edges: "),main.mostCurrent._edges.runMethod(true,"getSize")),0);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _overlaypanel_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("OverlayPanel_Touch (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,346);
if (RapidSub.canDelegate("overlaypanel_touch")) { return b4a.example.main.remoteMe.runUserSub(false, "main","overlaypanel_touch", _action, _x, _y);}
RemoteObject _tappedid = RemoteObject.createImmutable("");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 346;BA.debugLine="Sub OverlayPanel_Touch(Action As Int, X As Float,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="If Action = 1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 348;BA.debugLine="Dim tappedId As String = GetNodeAtPosition(X, Y,";
Debug.ShouldStop(134217728);
_tappedid = _getnodeatposition(_x,_y,BA.numberCast(int.class, 30));Debug.locals.put("tappedId", _tappedid);Debug.locals.put("tappedId", _tappedid);
 BA.debugLineNum = 349;BA.debugLine="If tappedId = \"\" Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_tappedid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 351;BA.debugLine="If StartNode = \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main.mostCurrent._startnode,BA.ObjectToString(""))) { 
 BA.debugLineNum = 352;BA.debugLine="StartNode = tappedId";
Debug.ShouldStop(-2147483648);
main.mostCurrent._startnode = _tappedid;
 BA.debugLineNum = 353;BA.debugLine="Log(\"Start set: \" & StartNode)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8917511",RemoteObject.concat(RemoteObject.createImmutable("Start set: "),main.mostCurrent._startnode),0);
 BA.debugLineNum = 354;BA.debugLine="DrawOverlay";
Debug.ShouldStop(2);
_drawoverlay();
 }else 
{ BA.debugLineNum = 356;BA.debugLine="Else If EndNode = \"\" And tappedId <> StartNode T";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main.mostCurrent._endnode,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_tappedid,main.mostCurrent._startnode)) { 
 BA.debugLineNum = 357;BA.debugLine="EndNode = tappedId";
Debug.ShouldStop(16);
main.mostCurrent._endnode = _tappedid;
 BA.debugLineNum = 358;BA.debugLine="Log(\"End set: \" & EndNode)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8917516",RemoteObject.concat(RemoteObject.createImmutable("End set: "),main.mostCurrent._endnode),0);
 BA.debugLineNum = 359;BA.debugLine="RunDijkstra(StartNode, EndNode)";
Debug.ShouldStop(64);
_rundijkstra(main.mostCurrent._startnode,main.mostCurrent._endnode);
 }else {
 BA.debugLineNum = 362;BA.debugLine="StartNode  = tappedId";
Debug.ShouldStop(512);
main.mostCurrent._startnode = _tappedid;
 BA.debugLineNum = 363;BA.debugLine="EndNode    = \"\"";
Debug.ShouldStop(1024);
main.mostCurrent._endnode = BA.ObjectToString("");
 BA.debugLineNum = 364;BA.debugLine="RouteEdges.Initialize";
Debug.ShouldStop(2048);
main.mostCurrent._routeedges.runVoidMethod ("Initialize");
 BA.debugLineNum = 365;BA.debugLine="Log(\"Reset. New start: \" & StartNode)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8917523",RemoteObject.concat(RemoteObject.createImmutable("Reset. New start: "),main.mostCurrent._startnode),0);
 BA.debugLineNum = 366;BA.debugLine="DrawOverlay";
Debug.ShouldStop(8192);
_drawoverlay();
 }}
;
 };
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseedges(RemoteObject _root) throws Exception{
try {
		Debug.PushSubsStack("ParseEdges (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,111);
if (RapidSub.canDelegate("parseedges")) { return b4a.example.main.remoteMe.runUserSub(false, "main","parseedges", _root);}
RemoteObject _edgearray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _edgeobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _e = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _emptyshape = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _shapearray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _emptyshape2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _shape = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pointobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("root", _root);
 BA.debugLineNum = 111;BA.debugLine="Sub ParseEdges(root As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="If root.ContainsKey(\"edges\") = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_root.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("edges")))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 113;BA.debugLine="Log(\"ERROR: no edges key found in JSON\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8458754",RemoteObject.createImmutable("ERROR: no edges key found in JSON"),0);
 BA.debugLineNum = 114;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 117;BA.debugLine="Dim edgeArray As List";
Debug.ShouldStop(1048576);
_edgearray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("edgeArray", _edgearray);
 BA.debugLineNum = 118;BA.debugLine="edgeArray = root.Get(\"edges\")";
Debug.ShouldStop(2097152);
_edgearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("edges")))));Debug.locals.put("edgeArray", _edgearray);
 BA.debugLineNum = 120;BA.debugLine="If edgeArray = Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("n",_edgearray)) { 
 BA.debugLineNum = 121;BA.debugLine="Log(\"ERROR: edges array is null\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8458762",RemoteObject.createImmutable("ERROR: edges array is null"),0);
 BA.debugLineNum = 122;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 125;BA.debugLine="For Each edgeObj As Map In edgeArray";
Debug.ShouldStop(268435456);
_edgeobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _edgearray;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_edgeobj = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("edgeObj", _edgeobj);
Debug.locals.put("edgeObj", _edgeobj);
 BA.debugLineNum = 126;BA.debugLine="Dim e As Map";
Debug.ShouldStop(536870912);
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("e", _e);
 BA.debugLineNum = 127;BA.debugLine="e.Initialize";
Debug.ShouldStop(1073741824);
_e.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="e.Put(\"id\",     edgeObj.Get(\"id\"))";
Debug.ShouldStop(-2147483648);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 129;BA.debugLine="e.Put(\"from\",   edgeObj.Get(\"from\"))";
Debug.ShouldStop(1);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("from"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from"))))));
 BA.debugLineNum = 130;BA.debugLine="e.Put(\"to\",     edgeObj.Get(\"to\"))";
Debug.ShouldStop(2);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to"))))));
 BA.debugLineNum = 131;BA.debugLine="e.Put(\"weight\", edgeObj.Get(\"weight\"))";
Debug.ShouldStop(4);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight"))))));
 BA.debugLineNum = 134;BA.debugLine="If edgeObj.ContainsKey(\"shape\") = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_edgeobj.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("shape")))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 135;BA.debugLine="Log(\"WARNING: edge \" & edgeObj.Get(\"id\") & \" ha";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8458776",RemoteObject.concat(RemoteObject.createImmutable("WARNING: edge "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable(" has no shape points")),0);
 BA.debugLineNum = 136;BA.debugLine="Dim emptyShape As List : emptyShape.Initialize";
Debug.ShouldStop(128);
_emptyshape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("emptyShape", _emptyshape);
 BA.debugLineNum = 136;BA.debugLine="Dim emptyShape As List : emptyShape.Initialize";
Debug.ShouldStop(128);
_emptyshape.runVoidMethod ("Initialize");
 BA.debugLineNum = 137;BA.debugLine="e.Put(\"shape\", emptyShape)";
Debug.ShouldStop(256);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("shape"))),(Object)((_emptyshape.getObject())));
 }else {
 BA.debugLineNum = 139;BA.debugLine="Dim shapeArray As List";
Debug.ShouldStop(1024);
_shapearray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("shapeArray", _shapearray);
 BA.debugLineNum = 140;BA.debugLine="shapeArray = edgeObj.Get(\"shape\")";
Debug.ShouldStop(2048);
_shapearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shape")))));Debug.locals.put("shapeArray", _shapearray);
 BA.debugLineNum = 142;BA.debugLine="If shapeArray = Null Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",_shapearray)) { 
 BA.debugLineNum = 143;BA.debugLine="Log(\"WARNING: shape is null for edge \" & edgeO";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8458784",RemoteObject.concat(RemoteObject.createImmutable("WARNING: shape is null for edge "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 144;BA.debugLine="Dim emptyShape2 As List : emptyShape2.Initiali";
Debug.ShouldStop(32768);
_emptyshape2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("emptyShape2", _emptyshape2);
 BA.debugLineNum = 144;BA.debugLine="Dim emptyShape2 As List : emptyShape2.Initiali";
Debug.ShouldStop(32768);
_emptyshape2.runVoidMethod ("Initialize");
 BA.debugLineNum = 145;BA.debugLine="e.Put(\"shape\", emptyShape2)";
Debug.ShouldStop(65536);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("shape"))),(Object)((_emptyshape2.getObject())));
 }else {
 BA.debugLineNum = 147;BA.debugLine="Dim shape As List";
Debug.ShouldStop(262144);
_shape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("shape", _shape);
 BA.debugLineNum = 148;BA.debugLine="shape.Initialize";
Debug.ShouldStop(524288);
_shape.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="For Each pointObj As Map In shapeArray";
Debug.ShouldStop(1048576);
_pointobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group34 = _shapearray;
final int groupLen34 = group34.runMethod(true,"getSize").<Integer>get()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_pointobj = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group34.runMethod(false,"Get",index34));Debug.locals.put("pointObj", _pointobj);
Debug.locals.put("pointObj", _pointobj);
 BA.debugLineNum = 150;BA.debugLine="Dim p As Map";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("p", _p);
 BA.debugLineNum = 151;BA.debugLine="p.Initialize";
Debug.ShouldStop(4194304);
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="p.Put(\"x\", pointObj.Get(\"x\"))";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)(_pointobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))));
 BA.debugLineNum = 153;BA.debugLine="p.Put(\"y\", pointObj.Get(\"y\"))";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)(_pointobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))));
 BA.debugLineNum = 154;BA.debugLine="shape.Add(p)";
Debug.ShouldStop(33554432);
_shape.runVoidMethod ("Add",(Object)((_p.getObject())));
 }
}Debug.locals.put("pointObj", _pointobj);
;
 BA.debugLineNum = 156;BA.debugLine="e.Put(\"shape\", shape)";
Debug.ShouldStop(134217728);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("shape"))),(Object)((_shape.getObject())));
 };
 };
 BA.debugLineNum = 160;BA.debugLine="Edges.Add(e)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._edges.runVoidMethod ("Add",(Object)((_e.getObject())));
 BA.debugLineNum = 161;BA.debugLine="Log(\"Edge: \" & edgeObj.Get(\"id\") & \" (\" & edgeOb";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8458802",RemoteObject.concat(RemoteObject.createImmutable("Edge: "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable(" ("),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))),RemoteObject.createImmutable(" -> "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to")))),RemoteObject.createImmutable(") shape pts: "),_e.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shape"))))),0);
 }
}Debug.locals.put("edgeObj", _edgeobj);
;
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsenodes(RemoteObject _root) throws Exception{
try {
		Debug.PushSubsStack("ParseNodes (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("parsenodes")) { return b4a.example.main.remoteMe.runUserSub(false, "main","parsenodes", _root);}
RemoteObject _nodearray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nodeobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("root", _root);
 BA.debugLineNum = 85;BA.debugLine="Sub ParseNodes(root As Map)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="If root.ContainsKey(\"nodes\") = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_root.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("nodes")))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 87;BA.debugLine="Log(\"ERROR: no nodes key found in JSON\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8393218",RemoteObject.createImmutable("ERROR: no nodes key found in JSON"),0);
 BA.debugLineNum = 88;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 91;BA.debugLine="Dim nodeArray As List";
Debug.ShouldStop(67108864);
_nodearray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nodeArray", _nodearray);
 BA.debugLineNum = 92;BA.debugLine="nodeArray = root.Get(\"nodes\")";
Debug.ShouldStop(134217728);
_nodearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nodes")))));Debug.locals.put("nodeArray", _nodearray);
 BA.debugLineNum = 94;BA.debugLine="If nodeArray = Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("n",_nodearray)) { 
 BA.debugLineNum = 95;BA.debugLine="Log(\"ERROR: nodes array is null\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8393226",RemoteObject.createImmutable("ERROR: nodes array is null"),0);
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 99;BA.debugLine="For Each nodeObj As Map In nodeArray";
Debug.ShouldStop(4);
_nodeobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _nodearray;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_nodeobj = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("nodeObj", _nodeobj);
Debug.locals.put("nodeObj", _nodeobj);
 BA.debugLineNum = 100;BA.debugLine="Dim n As Map";
Debug.ShouldStop(8);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("n", _n);
 BA.debugLineNum = 101;BA.debugLine="n.Initialize";
Debug.ShouldStop(16);
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 102;BA.debugLine="n.Put(\"id\", nodeObj.Get(\"id\"))";
Debug.ShouldStop(32);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 103;BA.debugLine="n.Put(\"x\",  nodeObj.Get(\"x\"))";
Debug.ShouldStop(64);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))));
 BA.debugLineNum = 104;BA.debugLine="n.Put(\"y\",  nodeObj.Get(\"y\"))";
Debug.ShouldStop(128);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))));
 BA.debugLineNum = 105;BA.debugLine="n.Put(\"label\", nodeObj.Get(\"label\"))";
Debug.ShouldStop(256);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("label"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("label"))))));
 BA.debugLineNum = 106;BA.debugLine="Nodes.Put(nodeObj.Get(\"id\"), n)";
Debug.ShouldStop(512);
main.mostCurrent._nodes.runVoidMethod ("Put",(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),(Object)((_n.getObject())));
 BA.debugLineNum = 107;BA.debugLine="Log(\"Node: \" & nodeObj.Get(\"id\"))";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8393238",RemoteObject.concat(RemoteObject.createImmutable("Node: "),_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 }
}Debug.locals.put("nodeObj", _nodeobj);
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rundijkstra(RemoteObject _startid,RemoteObject _endid) throws Exception{
try {
		Debug.PushSubsStack("RunDijkstra (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,200);
if (RapidSub.canDelegate("rundijkstra")) { return b4a.example.main.remoteMe.runUserSub(false, "main","rundijkstra", _startid, _endid);}
RemoteObject _dist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _prev = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _visited = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nodeid = RemoteObject.createImmutable("");
RemoteObject _current = RemoteObject.createImmutable("");
RemoteObject _mindist = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _neighbors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _conn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _neighbor = RemoteObject.createImmutable("");
RemoteObject _currdist = RemoteObject.createImmutable(0);
RemoteObject _neighbordist = RemoteObject.createImmutable(0);
RemoteObject _edgeweight = RemoteObject.createImmutable(0);
RemoteObject _newdist = RemoteObject.createImmutable(0);
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _steps = RemoteObject.createImmutable("");
RemoteObject _prevval = RemoteObject.createImmutable("");
RemoteObject _reversed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _fromid = RemoteObject.createImmutable("");
RemoteObject _toid = RemoteObject.createImmutable("");
RemoteObject _found = RemoteObject.declareNull("Object");
Debug.locals.put("startId", _startid);
Debug.locals.put("endId", _endid);
 BA.debugLineNum = 200;BA.debugLine="Sub RunDijkstra(startId As String, endId As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim dist    As Map : dist.Initialize";
Debug.ShouldStop(256);
_dist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("dist", _dist);
 BA.debugLineNum = 201;BA.debugLine="Dim dist    As Map : dist.Initialize";
Debug.ShouldStop(256);
_dist.runVoidMethod ("Initialize");
 BA.debugLineNum = 202;BA.debugLine="Dim prev    As Map : prev.Initialize";
Debug.ShouldStop(512);
_prev = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("prev", _prev);
 BA.debugLineNum = 202;BA.debugLine="Dim prev    As Map : prev.Initialize";
Debug.ShouldStop(512);
_prev.runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="Dim visited As Map : visited.Initialize";
Debug.ShouldStop(1024);
_visited = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("visited", _visited);
 BA.debugLineNum = 203;BA.debugLine="Dim visited As Map : visited.Initialize";
Debug.ShouldStop(1024);
_visited.runVoidMethod ("Initialize");
 BA.debugLineNum = 205;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(4096);
{
final RemoteObject group7 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_nodeid = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 206;BA.debugLine="dist.Put(nodeId, 999999)";
Debug.ShouldStop(8192);
_dist.runVoidMethod ("Put",(Object)((_nodeid)),(Object)(RemoteObject.createImmutable((999999))));
 BA.debugLineNum = 207;BA.debugLine="prev.Put(nodeId, \"\")";
Debug.ShouldStop(16384);
_prev.runVoidMethod ("Put",(Object)((_nodeid)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 209;BA.debugLine="dist.Put(startId, 0)";
Debug.ShouldStop(65536);
_dist.runVoidMethod ("Put",(Object)((_startid)),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 211;BA.debugLine="Do While True";
Debug.ShouldStop(262144);
while (main.mostCurrent.__c.getField(true,"True").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 212;BA.debugLine="Dim current As String = \"\"";
Debug.ShouldStop(524288);
_current = BA.ObjectToString("");Debug.locals.put("current", _current);Debug.locals.put("current", _current);
 BA.debugLineNum = 213;BA.debugLine="Dim minDist As Int = 999999";
Debug.ShouldStop(1048576);
_mindist = BA.numberCast(int.class, 999999);Debug.locals.put("minDist", _mindist);Debug.locals.put("minDist", _mindist);
 BA.debugLineNum = 215;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(4194304);
{
final RemoteObject group15 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_nodeid = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 216;BA.debugLine="If visited.ContainsKey(nodeId) = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_visited.runMethod(true,"ContainsKey",(Object)((_nodeid))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 217;BA.debugLine="Dim d As Int = dist.Get(nodeId)";
Debug.ShouldStop(16777216);
_d = BA.numberCast(int.class, _dist.runMethod(false,"Get",(Object)((_nodeid))));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 218;BA.debugLine="If d < minDist Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",_d,BA.numberCast(double.class, _mindist))) { 
 BA.debugLineNum = 219;BA.debugLine="minDist = d";
Debug.ShouldStop(67108864);
_mindist = _d;Debug.locals.put("minDist", _mindist);
 BA.debugLineNum = 220;BA.debugLine="current = nodeId";
Debug.ShouldStop(134217728);
_current = _nodeid;Debug.locals.put("current", _current);
 };
 };
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 225;BA.debugLine="If current = \"\" Or current = endId Then Exit";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_current,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_current,_endid)) { 
if (true) break;};
 BA.debugLineNum = 227;BA.debugLine="visited.Put(current, True)";
Debug.ShouldStop(4);
_visited.runVoidMethod ("Put",(Object)((_current)),(Object)((main.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 229;BA.debugLine="If Graph.ContainsKey(current) Then";
Debug.ShouldStop(16);
if (main.mostCurrent._graph.runMethod(true,"ContainsKey",(Object)((_current))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 230;BA.debugLine="Dim neighbors As List = Graph.Get(current)";
Debug.ShouldStop(32);
_neighbors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_neighbors = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._graph.runMethod(false,"Get",(Object)((_current))));Debug.locals.put("neighbors", _neighbors);Debug.locals.put("neighbors", _neighbors);
 BA.debugLineNum = 231;BA.debugLine="For Each conn As Map In neighbors";
Debug.ShouldStop(64);
_conn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group28 = _neighbors;
final int groupLen28 = group28.runMethod(true,"getSize").<Integer>get()
;int index28 = 0;
;
for (; index28 < groupLen28;index28++){
_conn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group28.runMethod(false,"Get",index28));Debug.locals.put("conn", _conn);
Debug.locals.put("conn", _conn);
 BA.debugLineNum = 232;BA.debugLine="Dim neighbor     As String = conn.Get(\"neighbo";
Debug.ShouldStop(128);
_neighbor = BA.ObjectToString(_conn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("neighbor")))));Debug.locals.put("neighbor", _neighbor);Debug.locals.put("neighbor", _neighbor);
 BA.debugLineNum = 233;BA.debugLine="Dim currDist     As Int    = dist.Get(current)";
Debug.ShouldStop(256);
_currdist = BA.numberCast(int.class, _dist.runMethod(false,"Get",(Object)((_current))));Debug.locals.put("currDist", _currdist);Debug.locals.put("currDist", _currdist);
 BA.debugLineNum = 234;BA.debugLine="Dim neighborDist As Int    = dist.Get(neighbor";
Debug.ShouldStop(512);
_neighbordist = BA.numberCast(int.class, _dist.runMethod(false,"Get",(Object)((_neighbor))));Debug.locals.put("neighborDist", _neighbordist);Debug.locals.put("neighborDist", _neighbordist);
 BA.debugLineNum = 235;BA.debugLine="Dim edgeWeight   As Int    = conn.Get(\"weight\"";
Debug.ShouldStop(1024);
_edgeweight = BA.numberCast(int.class, _conn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("edgeWeight", _edgeweight);Debug.locals.put("edgeWeight", _edgeweight);
 BA.debugLineNum = 236;BA.debugLine="Dim newDist      As Int    = currDist + edgeWe";
Debug.ShouldStop(2048);
_newdist = RemoteObject.solve(new RemoteObject[] {_currdist,_edgeweight}, "+",1, 1);Debug.locals.put("newDist", _newdist);Debug.locals.put("newDist", _newdist);
 BA.debugLineNum = 237;BA.debugLine="If newDist < neighborDist Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_newdist,BA.numberCast(double.class, _neighbordist))) { 
 BA.debugLineNum = 238;BA.debugLine="dist.Put(neighbor, newDist)";
Debug.ShouldStop(8192);
_dist.runVoidMethod ("Put",(Object)((_neighbor)),(Object)((_newdist)));
 BA.debugLineNum = 239;BA.debugLine="prev.Put(neighbor, current)";
Debug.ShouldStop(16384);
_prev.runVoidMethod ("Put",(Object)((_neighbor)),(Object)((_current)));
 };
 }
}Debug.locals.put("conn", _conn);
;
 };
 }
;
 BA.debugLineNum = 245;BA.debugLine="Dim path As List : path.Initialize";
Debug.ShouldStop(1048576);
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("path", _path);
 BA.debugLineNum = 245;BA.debugLine="Dim path As List : path.Initialize";
Debug.ShouldStop(1048576);
_path.runVoidMethod ("Initialize");
 BA.debugLineNum = 246;BA.debugLine="Dim steps As String";
Debug.ShouldStop(2097152);
_steps = RemoteObject.createImmutable("");Debug.locals.put("steps", _steps);
 BA.debugLineNum = 247;BA.debugLine="steps = endId";
Debug.ShouldStop(4194304);
_steps = _endid;Debug.locals.put("steps", _steps);
 BA.debugLineNum = 248;BA.debugLine="Do While steps <> \"\"";
Debug.ShouldStop(8388608);
while (RemoteObject.solveBoolean("!",_steps,BA.ObjectToString(""))) {
 BA.debugLineNum = 249;BA.debugLine="path.Add(steps)";
Debug.ShouldStop(16777216);
_path.runVoidMethod ("Add",(Object)((_steps)));
 BA.debugLineNum = 250;BA.debugLine="If prev.ContainsKey(steps) = False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_prev.runMethod(true,"ContainsKey",(Object)((_steps))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 251;BA.debugLine="steps = \"\"";
Debug.ShouldStop(67108864);
_steps = BA.ObjectToString("");Debug.locals.put("steps", _steps);
 }else {
 BA.debugLineNum = 253;BA.debugLine="Dim prevVal As String = prev.Get(steps)";
Debug.ShouldStop(268435456);
_prevval = BA.ObjectToString(_prev.runMethod(false,"Get",(Object)((_steps))));Debug.locals.put("prevVal", _prevval);Debug.locals.put("prevVal", _prevval);
 BA.debugLineNum = 254;BA.debugLine="If prevVal = Null Or prevVal = \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("n",_prevval) || RemoteObject.solveBoolean("=",_prevval,BA.ObjectToString(""))) { 
 BA.debugLineNum = 255;BA.debugLine="steps = \"\"";
Debug.ShouldStop(1073741824);
_steps = BA.ObjectToString("");Debug.locals.put("steps", _steps);
 }else {
 BA.debugLineNum = 257;BA.debugLine="steps = prevVal";
Debug.ShouldStop(1);
_steps = _prevval;Debug.locals.put("steps", _steps);
 };
 };
 }
;
 BA.debugLineNum = 262;BA.debugLine="Dim reversed As List : reversed.Initialize";
Debug.ShouldStop(32);
_reversed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("reversed", _reversed);
 BA.debugLineNum = 262;BA.debugLine="Dim reversed As List : reversed.Initialize";
Debug.ShouldStop(32);
_reversed.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="For i = path.Size - 1 To 0 Step -1";
Debug.ShouldStop(64);
{
final int step60 = -1;
final int limit60 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_path.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60) ;_i = ((int)(0 + _i + step60))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 264;BA.debugLine="reversed.Add(path.Get(i))";
Debug.ShouldStop(128);
_reversed.runVoidMethod ("Add",(Object)(_path.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 267;BA.debugLine="RouteEdges.Initialize";
Debug.ShouldStop(1024);
main.mostCurrent._routeedges.runVoidMethod ("Initialize");
 BA.debugLineNum = 268;BA.debugLine="For i = 0 To reversed.Size - 2";
Debug.ShouldStop(2048);
{
final int step64 = 1;
final int limit64 = RemoteObject.solve(new RemoteObject[] {_reversed.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step64 > 0 && _i <= limit64) || (step64 < 0 && _i >= limit64) ;_i = ((int)(0 + _i + step64))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="Dim fromId As String = reversed.Get(i)";
Debug.ShouldStop(4096);
_fromid = BA.ObjectToString(_reversed.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fromId", _fromid);Debug.locals.put("fromId", _fromid);
 BA.debugLineNum = 270;BA.debugLine="Dim toId   As String = reversed.Get(i + 1)";
Debug.ShouldStop(8192);
_toid = BA.ObjectToString(_reversed.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("toId", _toid);Debug.locals.put("toId", _toid);
 BA.debugLineNum = 271;BA.debugLine="Dim found  As Object = FindEdge(fromId, toId)";
Debug.ShouldStop(16384);
_found = _findedge(_fromid,_toid);Debug.locals.put("found", _found);Debug.locals.put("found", _found);
 BA.debugLineNum = 272;BA.debugLine="If found <> Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",_found)) { 
 BA.debugLineNum = 273;BA.debugLine="RouteEdges.Add(found)";
Debug.ShouldStop(65536);
main.mostCurrent._routeedges.runVoidMethod ("Add",(Object)(_found));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 277;BA.debugLine="Log(\"Route found: \" & reversed.Size & \" stops, \"";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8589901",RemoteObject.concat(RemoteObject.createImmutable("Route found: "),_reversed.runMethod(true,"getSize"),RemoteObject.createImmutable(" stops, "),main.mostCurrent._routeedges.runMethod(true,"getSize"),RemoteObject.createImmutable(" edges")),0);
 BA.debugLineNum = 278;BA.debugLine="DrawOverlay";
Debug.ShouldStop(2097152);
_drawoverlay();
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}