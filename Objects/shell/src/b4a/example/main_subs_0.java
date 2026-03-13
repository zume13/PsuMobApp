package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="RouteEdges.Initialize";
Debug.ShouldStop(4);
main.mostCurrent._routeedges.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="StartNode = \"\"";
Debug.ShouldStop(8);
main.mostCurrent._startnode = BA.ObjectToString("");
 BA.debugLineNum = 37;BA.debugLine="EndNode   = \"\"";
Debug.ShouldStop(16);
main.mostCurrent._endnode = BA.ObjectToString("");
 BA.debugLineNum = 39;BA.debugLine="MapImage = LoadBitmap(File.DirAssets, \"map.png\")";
Debug.ShouldStop(64);
main.mostCurrent._mapimage = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("map.png")));
 BA.debugLineNum = 41;BA.debugLine="ImageViewer.Initialize(\"ImageViewer\")";
Debug.ShouldStop(256);
main.mostCurrent._imageviewer.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ImageViewer")));
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView(ImageViewer, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(512);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._imageviewer.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 43;BA.debugLine="ImageViewer.Image = MapImage";
Debug.ShouldStop(1024);
main.mostCurrent._imageviewer.runMethod(false,"setImage",(main.mostCurrent._mapimage.getObject()));
 BA.debugLineNum = 45;BA.debugLine="LoadAllMapData";
Debug.ShouldStop(4096);
_loadallmapdata();
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Pause(UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("BuildGraph (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,159);
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
 BA.debugLineNum = 159;BA.debugLine="Sub BuildGraph";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="Graph.Initialize";
Debug.ShouldStop(-2147483648);
main.mostCurrent._graph.runVoidMethod ("Initialize");
 BA.debugLineNum = 162;BA.debugLine="For Each edge As Map In Edges";
Debug.ShouldStop(2);
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = main.mostCurrent._edges;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));Debug.locals.put("edge", _edge);
Debug.locals.put("edge", _edge);
 BA.debugLineNum = 163;BA.debugLine="Dim fromId As String = edge.Get(\"from\")";
Debug.ShouldStop(4);
_fromid = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))));Debug.locals.put("fromId", _fromid);Debug.locals.put("fromId", _fromid);
 BA.debugLineNum = 164;BA.debugLine="Dim toId   As String = edge.Get(\"to\")";
Debug.ShouldStop(8);
_toid = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to")))));Debug.locals.put("toId", _toid);Debug.locals.put("toId", _toid);
 BA.debugLineNum = 165;BA.debugLine="Dim weight As Int    = edge.Get(\"weight\")";
Debug.ShouldStop(16);
_weight = BA.numberCast(int.class, _edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 166;BA.debugLine="Dim edgeId As String = edge.Get(\"id\")";
Debug.ShouldStop(32);
_edgeid = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("edgeId", _edgeid);Debug.locals.put("edgeId", _edgeid);
 BA.debugLineNum = 168;BA.debugLine="If Graph.ContainsKey(fromId) = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",main.mostCurrent._graph.runMethod(true,"ContainsKey",(Object)((_fromid))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 169;BA.debugLine="Dim l1 As List : l1.Initialize";
Debug.ShouldStop(256);
_l1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l1", _l1);
 BA.debugLineNum = 169;BA.debugLine="Dim l1 As List : l1.Initialize";
Debug.ShouldStop(256);
_l1.runVoidMethod ("Initialize");
 BA.debugLineNum = 170;BA.debugLine="Graph.Put(fromId, l1)";
Debug.ShouldStop(512);
main.mostCurrent._graph.runVoidMethod ("Put",(Object)((_fromid)),(Object)((_l1.getObject())));
 };
 BA.debugLineNum = 172;BA.debugLine="Dim n1 As List = Graph.Get(fromId)";
Debug.ShouldStop(2048);
_n1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_n1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._graph.runMethod(false,"Get",(Object)((_fromid))));Debug.locals.put("n1", _n1);Debug.locals.put("n1", _n1);
 BA.debugLineNum = 173;BA.debugLine="Dim c1 As Map  : c1.Initialize";
Debug.ShouldStop(4096);
_c1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("c1", _c1);
 BA.debugLineNum = 173;BA.debugLine="Dim c1 As Map  : c1.Initialize";
Debug.ShouldStop(4096);
_c1.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="c1.Put(\"neighbor\", toId)";
Debug.ShouldStop(8192);
_c1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("neighbor"))),(Object)((_toid)));
 BA.debugLineNum = 175;BA.debugLine="c1.Put(\"weight\",   weight)";
Debug.ShouldStop(16384);
_c1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("weight"))),(Object)((_weight)));
 BA.debugLineNum = 176;BA.debugLine="c1.Put(\"edgeId\",   edgeId)";
Debug.ShouldStop(32768);
_c1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("edgeId"))),(Object)((_edgeid)));
 BA.debugLineNum = 177;BA.debugLine="n1.Add(c1)";
Debug.ShouldStop(65536);
_n1.runVoidMethod ("Add",(Object)((_c1.getObject())));
 BA.debugLineNum = 179;BA.debugLine="If Graph.ContainsKey(toId) = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main.mostCurrent._graph.runMethod(true,"ContainsKey",(Object)((_toid))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 180;BA.debugLine="Dim l2 As List : l2.Initialize";
Debug.ShouldStop(524288);
_l2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l2", _l2);
 BA.debugLineNum = 180;BA.debugLine="Dim l2 As List : l2.Initialize";
Debug.ShouldStop(524288);
_l2.runVoidMethod ("Initialize");
 BA.debugLineNum = 181;BA.debugLine="Graph.Put(toId, l2)";
Debug.ShouldStop(1048576);
main.mostCurrent._graph.runVoidMethod ("Put",(Object)((_toid)),(Object)((_l2.getObject())));
 };
 BA.debugLineNum = 183;BA.debugLine="Dim n2 As List = Graph.Get(toId)";
Debug.ShouldStop(4194304);
_n2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_n2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._graph.runMethod(false,"Get",(Object)((_toid))));Debug.locals.put("n2", _n2);Debug.locals.put("n2", _n2);
 BA.debugLineNum = 184;BA.debugLine="Dim c2 As Map  : c2.Initialize";
Debug.ShouldStop(8388608);
_c2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 184;BA.debugLine="Dim c2 As Map  : c2.Initialize";
Debug.ShouldStop(8388608);
_c2.runVoidMethod ("Initialize");
 BA.debugLineNum = 185;BA.debugLine="c2.Put(\"neighbor\", fromId)";
Debug.ShouldStop(16777216);
_c2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("neighbor"))),(Object)((_fromid)));
 BA.debugLineNum = 186;BA.debugLine="c2.Put(\"weight\",   weight)";
Debug.ShouldStop(33554432);
_c2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("weight"))),(Object)((_weight)));
 BA.debugLineNum = 187;BA.debugLine="c2.Put(\"edgeId\",   edgeId)";
Debug.ShouldStop(67108864);
_c2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("edgeId"))),(Object)((_edgeid)));
 BA.debugLineNum = 188;BA.debugLine="n2.Add(c2)";
Debug.ShouldStop(134217728);
_n2.runVoidMethod ("Add",(Object)((_c2.getObject())));
 }
}Debug.locals.put("edge", _edge);
;
 BA.debugLineNum = 191;BA.debugLine="Log(\"Graph built. Nodes in graph: \" & Graph.Size)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4524320",RemoteObject.concat(RemoteObject.createImmutable("Graph built. Nodes in graph: "),main.mostCurrent._graph.runMethod(true,"getSize")),0);
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("FindEdge (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,282);
if (RapidSub.canDelegate("findedge")) { return b4a.example.main.remoteMe.runUserSub(false, "main","findedge", _fromid, _toid);}
RemoteObject _edge = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _a = RemoteObject.createImmutable("");
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("fromId", _fromid);
Debug.locals.put("toId", _toid);
 BA.debugLineNum = 282;BA.debugLine="Sub FindEdge(fromId As String, toId As String) As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="For Each edge As Map In Edges";
Debug.ShouldStop(67108864);
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = main.mostCurrent._edges;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("edge", _edge);
Debug.locals.put("edge", _edge);
 BA.debugLineNum = 284;BA.debugLine="Dim a As String = edge.Get(\"from\")";
Debug.ShouldStop(134217728);
_a = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 285;BA.debugLine="Dim b As String = edge.Get(\"to\")";
Debug.ShouldStop(268435456);
_b = BA.ObjectToString(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to")))));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 286;BA.debugLine="If a = fromId And b = toId Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_a,_fromid) && RemoteObject.solveBoolean("=",_b,_toid)) { 
 BA.debugLineNum = 287;BA.debugLine="edge.Put(\"flipped\", False)";
Debug.ShouldStop(1073741824);
_edge.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("flipped"))),(Object)((main.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 288;BA.debugLine="Return edge";
Debug.ShouldStop(-2147483648);
if (true) return (_edge.getObject());
 }else 
{ BA.debugLineNum = 289;BA.debugLine="Else If a = toId And b = fromId Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_a,_toid) && RemoteObject.solveBoolean("=",_b,_fromid)) { 
 BA.debugLineNum = 290;BA.debugLine="edge.Put(\"flipped\", True)";
Debug.ShouldStop(2);
_edge.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("flipped"))),(Object)((main.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 291;BA.debugLine="Return edge";
Debug.ShouldStop(4);
if (true) return (_edge.getObject());
 }}
;
 }
}Debug.locals.put("edge", _edge);
;
 BA.debugLineNum = 294;BA.debugLine="Return Null";
Debug.ShouldStop(32);
if (true) return main.mostCurrent.__c.getField(false,"Null");
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("GetNodeAtPosition (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,404);
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
 BA.debugLineNum = 404;BA.debugLine="Sub GetNodeAtPosition(tapX As Float, tapY As Float";
Debug.ShouldStop(524288);
 BA.debugLineNum = 405;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(1048576);
{
final RemoteObject group1 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_nodeid = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 406;BA.debugLine="Dim node As Map = Nodes.Get(nodeId)";
Debug.ShouldStop(2097152);
_node = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_node = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main.mostCurrent._nodes.runMethod(false,"Get",(Object)((_nodeid))));Debug.locals.put("node", _node);Debug.locals.put("node", _node);
 BA.debugLineNum = 407;BA.debugLine="Dim nx As Float = node.Get(\"x\")";
Debug.ShouldStop(4194304);
_nx = BA.numberCast(float.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))));Debug.locals.put("nx", _nx);Debug.locals.put("nx", _nx);
 BA.debugLineNum = 408;BA.debugLine="Dim ny As Float = node.Get(\"y\")";
Debug.ShouldStop(8388608);
_ny = BA.numberCast(float.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))));Debug.locals.put("ny", _ny);Debug.locals.put("ny", _ny);
 BA.debugLineNum = 409;BA.debugLine="Dim dx As Float = tapX - nx";
Debug.ShouldStop(16777216);
_dx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tapx,_nx}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 410;BA.debugLine="Dim dy As Float = tapY - ny";
Debug.ShouldStop(33554432);
_dy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tapy,_ny}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 411;BA.debugLine="Dim dist As Double = Sqrt(dx * dx + dy * dy)";
Debug.ShouldStop(67108864);
_dist = main.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_dx,_dx,_dy,_dy}, "*+*",1, 0)));Debug.locals.put("dist", _dist);Debug.locals.put("dist", _dist);
 BA.debugLineNum = 412;BA.debugLine="If dist <= radius Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("k",_dist,BA.numberCast(double.class, _radius))) { 
 BA.debugLineNum = 413;BA.debugLine="Return nodeId";
Debug.ShouldStop(268435456);
if (true) return _nodeid;
 };
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 416;BA.debugLine="Return \"\"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 20;BA.debugLine="Dim MapImage    As Bitmap";
main.mostCurrent._mapimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim ImageViewer As ScaleImageView";
main.mostCurrent._imageviewer = RemoteObject.createNew ("agraham.b4a.scaleimageview.ScaleImageViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim Nodes      As Map";
main.mostCurrent._nodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 24;BA.debugLine="Dim Edges      As List";
main.mostCurrent._edges = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 25;BA.debugLine="Dim Graph      As Map";
main.mostCurrent._graph = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 26;BA.debugLine="Dim RouteEdges As List";
main.mostCurrent._routeedges = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 28;BA.debugLine="Dim StartNode As String";
main.mostCurrent._startnode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim EndNode   As String";
main.mostCurrent._endnode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageviewer_click() throws Exception{
try {
		Debug.PushSubsStack("ImageViewer_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,376);
if (RapidSub.canDelegate("imageviewer_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","imageviewer_click");}
RemoteObject _tapx = RemoteObject.createImmutable(0f);
RemoteObject _tapy = RemoteObject.createImmutable(0f);
RemoteObject _tappedid = RemoteObject.createImmutable("");
 BA.debugLineNum = 376;BA.debugLine="Sub ImageViewer_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="Dim tapX As Float = ImageViewer.ClickImageX";
Debug.ShouldStop(16777216);
_tapx = main.mostCurrent._imageviewer.runMethod(true,"getClickImageX");Debug.locals.put("tapX", _tapx);Debug.locals.put("tapX", _tapx);
 BA.debugLineNum = 378;BA.debugLine="Dim tapY As Float = ImageViewer.ClickImageY";
Debug.ShouldStop(33554432);
_tapy = main.mostCurrent._imageviewer.runMethod(true,"getClickImageY");Debug.locals.put("tapY", _tapy);Debug.locals.put("tapY", _tapy);
 BA.debugLineNum = 380;BA.debugLine="Log(\"Tapped image coords: \" & tapX & \",\" & tapY)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("LogImpl","41572868",RemoteObject.concat(RemoteObject.createImmutable("Tapped image coords: "),_tapx,RemoteObject.createImmutable(","),_tapy),0);
 BA.debugLineNum = 382;BA.debugLine="Dim tappedId As String = GetNodeAtPosition(tapX,";
Debug.ShouldStop(536870912);
_tappedid = _getnodeatposition(_tapx,_tapy,BA.numberCast(int.class, 50));Debug.locals.put("tappedId", _tappedid);Debug.locals.put("tappedId", _tappedid);
 BA.debugLineNum = 383;BA.debugLine="Log(\"Tapped node: \" & tappedId)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","41572871",RemoteObject.concat(RemoteObject.createImmutable("Tapped node: "),_tappedid),0);
 BA.debugLineNum = 384;BA.debugLine="If tappedId = \"\" Then Return";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_tappedid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 386;BA.debugLine="If StartNode <> \"\" And EndNode <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",main.mostCurrent._startnode,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._endnode,BA.ObjectToString(""))) { 
 BA.debugLineNum = 387;BA.debugLine="StartNode = \"\"";
Debug.ShouldStop(4);
main.mostCurrent._startnode = BA.ObjectToString("");
 BA.debugLineNum = 388;BA.debugLine="EndNode   = \"\"";
Debug.ShouldStop(8);
main.mostCurrent._endnode = BA.ObjectToString("");
 BA.debugLineNum = 389;BA.debugLine="RouteEdges.Initialize";
Debug.ShouldStop(16);
main.mostCurrent._routeedges.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 392;BA.debugLine="If StartNode = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",main.mostCurrent._startnode,BA.ObjectToString(""))) { 
 BA.debugLineNum = 393;BA.debugLine="StartNode = tappedId";
Debug.ShouldStop(256);
main.mostCurrent._startnode = _tappedid;
 BA.debugLineNum = 394;BA.debugLine="Log(\"Start set: \" & StartNode)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","41572882",RemoteObject.concat(RemoteObject.createImmutable("Start set: "),main.mostCurrent._startnode),0);
 BA.debugLineNum = 395;BA.debugLine="ImageViewer.Invalidate";
Debug.ShouldStop(1024);
main.mostCurrent._imageviewer.runVoidMethod ("Invalidate");
 }else 
{ BA.debugLineNum = 397;BA.debugLine="Else If tappedId <> StartNode Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_tappedid,main.mostCurrent._startnode)) { 
 BA.debugLineNum = 398;BA.debugLine="EndNode = tappedId";
Debug.ShouldStop(8192);
main.mostCurrent._endnode = _tappedid;
 BA.debugLineNum = 399;BA.debugLine="Log(\"End set: \" & EndNode)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("LogImpl","41572887",RemoteObject.concat(RemoteObject.createImmutable("End set: "),main.mostCurrent._endnode),0);
 BA.debugLineNum = 400;BA.debugLine="RunDijkstra(StartNode, EndNode)";
Debug.ShouldStop(32768);
_rundijkstra(main.mostCurrent._startnode,main.mostCurrent._endnode);
 }}
;
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageviewer_ondraw(RemoteObject _canvas) throws Exception{
try {
		Debug.PushSubsStack("ImageViewer_OnDraw (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,297);
if (RapidSub.canDelegate("imageviewer_ondraw")) { return b4a.example.main.remoteMe.runUserSub(false, "main","imageviewer_ondraw", _canvas);}
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _cx = RemoteObject.createImmutable(0f);
RemoteObject _cy = RemoteObject.createImmutable(0f);
RemoteObject _halfw = RemoteObject.createImmutable(0f);
RemoteObject _halfh = RemoteObject.createImmutable(0f);
RemoteObject _edge = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shape = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flipped = RemoteObject.createImmutable(false);
RemoteObject _drawshape = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ix1 = RemoteObject.createImmutable(0f);
RemoteObject _iy1 = RemoteObject.createImmutable(0f);
RemoteObject _ix2 = RemoteObject.createImmutable(0f);
RemoteObject _iy2 = RemoteObject.createImmutable(0f);
RemoteObject _x1 = RemoteObject.createImmutable(0f);
RemoteObject _y1 = RemoteObject.createImmutable(0f);
RemoteObject _x2 = RemoteObject.createImmutable(0f);
RemoteObject _y2 = RemoteObject.createImmutable(0f);
RemoteObject _nodeid = RemoteObject.createImmutable("");
RemoteObject _node = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
Debug.locals.put("Canvas", _canvas);
 BA.debugLineNum = 297;BA.debugLine="Sub ImageViewer_OnDraw(Canvas As Canvas)";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="If Nodes.IsInitialized = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main.mostCurrent._nodes.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 299;BA.debugLine="If Nodes.Size = 0 Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main.mostCurrent._nodes.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 301;BA.debugLine="Dim scale  As Float = ImageViewer.Scale";
Debug.ShouldStop(4096);
_scale = main.mostCurrent._imageviewer.runMethod(true,"getScale");Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 302;BA.debugLine="Dim cx     As Float = ImageViewer.CenterX";
Debug.ShouldStop(8192);
_cx = main.mostCurrent._imageviewer.runMethod(true,"getCenterX");Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 303;BA.debugLine="Dim cy     As Float = ImageViewer.CenterY";
Debug.ShouldStop(16384);
_cy = main.mostCurrent._imageviewer.runMethod(true,"getCenterY");Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 304;BA.debugLine="Dim halfW  As Float = ImageViewer.Width  / 2";
Debug.ShouldStop(32768);
_halfw = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._imageviewer.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("halfW", _halfw);Debug.locals.put("halfW", _halfw);
 BA.debugLineNum = 305;BA.debugLine="Dim halfH  As Float = ImageViewer.Height / 2";
Debug.ShouldStop(65536);
_halfh = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._imageviewer.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("halfH", _halfh);Debug.locals.put("halfH", _halfh);
 BA.debugLineNum = 307;BA.debugLine="Log(\"Scale: \" & scale & \" CenterX: \" & cx & \" Cen";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("LogImpl","41507338",RemoteObject.concat(RemoteObject.createImmutable("Scale: "),_scale,RemoteObject.createImmutable(" CenterX: "),_cx,RemoteObject.createImmutable(" CenterY: "),_cy),0);
 BA.debugLineNum = 310;BA.debugLine="If RouteEdges.Size > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",main.mostCurrent._routeedges.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 311;BA.debugLine="For Each edge As Map In RouteEdges";
Debug.ShouldStop(4194304);
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = main.mostCurrent._routeedges;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group10.runMethod(false,"Get",index10));Debug.locals.put("edge", _edge);
Debug.locals.put("edge", _edge);
 BA.debugLineNum = 312;BA.debugLine="Dim shape As List = edge.Get(\"shape\")";
Debug.ShouldStop(8388608);
_shape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shape = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shape")))));Debug.locals.put("shape", _shape);Debug.locals.put("shape", _shape);
 BA.debugLineNum = 313;BA.debugLine="Dim flipped As Boolean = edge.Get(\"flipped\")";
Debug.ShouldStop(16777216);
_flipped = BA.ObjectToBoolean(_edge.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("flipped")))));Debug.locals.put("flipped", _flipped);Debug.locals.put("flipped", _flipped);
 BA.debugLineNum = 315;BA.debugLine="Dim drawShape As List";
Debug.ShouldStop(67108864);
_drawshape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("drawShape", _drawshape);
 BA.debugLineNum = 316;BA.debugLine="drawShape.Initialize";
Debug.ShouldStop(134217728);
_drawshape.runVoidMethod ("Initialize");
 BA.debugLineNum = 317;BA.debugLine="If flipped Then";
Debug.ShouldStop(268435456);
if (_flipped.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 318;BA.debugLine="For i = shape.Size - 1 To 0 Step -1";
Debug.ShouldStop(536870912);
{
final int step16 = -1;
final int limit16 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_shape.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 319;BA.debugLine="drawShape.Add(shape.Get(i))";
Debug.ShouldStop(1073741824);
_drawshape.runVoidMethod ("Add",(Object)(_shape.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 322;BA.debugLine="For i = 0 To shape.Size - 1";
Debug.ShouldStop(2);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_shape.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 323;BA.debugLine="drawShape.Add(shape.Get(i))";
Debug.ShouldStop(4);
_drawshape.runVoidMethod ("Add",(Object)(_shape.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 327;BA.debugLine="For i = 0 To drawShape.Size - 2";
Debug.ShouldStop(64);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_drawshape.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 328;BA.debugLine="Dim p1 As Map = drawShape.Get(i)";
Debug.ShouldStop(128);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_p1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _drawshape.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p1", _p1);Debug.locals.put("p1", _p1);
 BA.debugLineNum = 329;BA.debugLine="Dim p2 As Map = drawShape.Get(i + 1)";
Debug.ShouldStop(256);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_p2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _drawshape.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("p2", _p2);Debug.locals.put("p2", _p2);
 BA.debugLineNum = 331;BA.debugLine="Dim ix1 As Float = p1.Get(\"x\")";
Debug.ShouldStop(1024);
_ix1 = BA.numberCast(float.class, _p1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))));Debug.locals.put("ix1", _ix1);Debug.locals.put("ix1", _ix1);
 BA.debugLineNum = 332;BA.debugLine="Dim iy1 As Float = p1.Get(\"y\")";
Debug.ShouldStop(2048);
_iy1 = BA.numberCast(float.class, _p1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))));Debug.locals.put("iy1", _iy1);Debug.locals.put("iy1", _iy1);
 BA.debugLineNum = 333;BA.debugLine="Dim ix2 As Float = p2.Get(\"x\")";
Debug.ShouldStop(4096);
_ix2 = BA.numberCast(float.class, _p2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))));Debug.locals.put("ix2", _ix2);Debug.locals.put("ix2", _ix2);
 BA.debugLineNum = 334;BA.debugLine="Dim iy2 As Float = p2.Get(\"y\")";
Debug.ShouldStop(8192);
_iy2 = BA.numberCast(float.class, _p2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))));Debug.locals.put("iy2", _iy2);Debug.locals.put("iy2", _iy2);
 BA.debugLineNum = 336;BA.debugLine="Dim x1 As Float = (ix1 - cx) * scale + halfW";
Debug.ShouldStop(32768);
_x1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_ix1,_cx}, "-",1, 0)),_scale,_halfw}, "*+",1, 0));Debug.locals.put("x1", _x1);Debug.locals.put("x1", _x1);
 BA.debugLineNum = 337;BA.debugLine="Dim y1 As Float = (iy1 - cy) * scale + halfH";
Debug.ShouldStop(65536);
_y1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iy1,_cy}, "-",1, 0)),_scale,_halfh}, "*+",1, 0));Debug.locals.put("y1", _y1);Debug.locals.put("y1", _y1);
 BA.debugLineNum = 338;BA.debugLine="Dim x2 As Float = (ix2 - cx) * scale + halfW";
Debug.ShouldStop(131072);
_x2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_ix2,_cx}, "-",1, 0)),_scale,_halfw}, "*+",1, 0));Debug.locals.put("x2", _x2);Debug.locals.put("x2", _x2);
 BA.debugLineNum = 339;BA.debugLine="Dim y2 As Float = (iy2 - cy) * scale + halfH";
Debug.ShouldStop(262144);
_y2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_iy2,_cy}, "-",1, 0)),_scale,_halfh}, "*+",1, 0));Debug.locals.put("y2", _y2);Debug.locals.put("y2", _y2);
 BA.debugLineNum = 341;BA.debugLine="Canvas.DrawLine(x1, y1, x2, y2, Colors.ARGB(80";
Debug.ShouldStop(1048576);
_canvas.runVoidMethod ("DrawLine",(Object)(_x1),(Object)(_y1),(Object)(_x2),(Object)(_y2),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 255)))),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 342;BA.debugLine="Canvas.DrawLine(x1, y1, x2, y2, Colors.ARGB(22";
Debug.ShouldStop(2097152);
_canvas.runVoidMethod ("DrawLine",(Object)(_x1),(Object)(_y1),(Object)(_x2),(Object)(_y2),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 255)))),(Object)(BA.numberCast(float.class, 8)));
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("edge", _edge);
;
 };
 BA.debugLineNum = 348;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group40 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen40 = group40.runMethod(true,"getSize").<Integer>get()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_nodeid = BA.ObjectToString(group40.runMethod(false,"Get",index40));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 349;BA.debugLine="Dim node As Map = Nodes.Get(nodeId)";
Debug.ShouldStop(268435456);
_node = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_node = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main.mostCurrent._nodes.runMethod(false,"Get",(Object)((_nodeid))));Debug.locals.put("node", _node);Debug.locals.put("node", _node);
 BA.debugLineNum = 350;BA.debugLine="Dim x As Float = (node.Get(\"x\") - cx) * scale +";
Debug.ShouldStop(536870912);
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))),_cx}, "-",1, 0)),_scale,_halfw}, "*+",1, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 351;BA.debugLine="Dim y As Float = (node.Get(\"y\") - cy) * scale +";
Debug.ShouldStop(1073741824);
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))),_cy}, "-",1, 0)),_scale,_halfh}, "*+",1, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 354;BA.debugLine="Dim label As String = node.Get(\"label\")";
Debug.ShouldStop(2);
_label = BA.ObjectToString(_node.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("label")))));Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 355;BA.debugLine="If label = \"\" Then Continue";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_label,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 358;BA.debugLine="If RouteEdges.Size > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",main.mostCurrent._routeedges.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 359;BA.debugLine="If nodeId <> StartNode And nodeId <> EndNode Th";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_nodeid,main.mostCurrent._startnode) && RemoteObject.solveBoolean("!",_nodeid,main.mostCurrent._endnode)) { 
if (true) continue;};
 };
 BA.debugLineNum = 362;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(512);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 363;BA.debugLine="If nodeId = StartNode Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_nodeid,main.mostCurrent._startnode)) { 
 BA.debugLineNum = 364;BA.debugLine="fillColor = Colors.Green";
Debug.ShouldStop(2048);
_fillcolor = main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green");Debug.locals.put("fillColor", _fillcolor);
 }else 
{ BA.debugLineNum = 365;BA.debugLine="Else If nodeId = EndNode Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_nodeid,main.mostCurrent._endnode)) { 
 BA.debugLineNum = 366;BA.debugLine="fillColor = Colors.Red";
Debug.ShouldStop(8192);
_fillcolor = main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("fillColor", _fillcolor);
 }else {
 BA.debugLineNum = 368;BA.debugLine="fillColor = Colors.ARGB(200, 30, 100, 255)";
Debug.ShouldStop(32768);
_fillcolor = main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 255)));Debug.locals.put("fillColor", _fillcolor);
 }}
;
 BA.debugLineNum = 371;BA.debugLine="Canvas.DrawCircle(x, y, 8, Colors.White, True, 0";
Debug.ShouldStop(262144);
_canvas.runVoidMethod ("DrawCircle",(Object)(_x),(Object)(_y),(Object)(BA.numberCast(float.class, 8)),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 372;BA.debugLine="Canvas.DrawCircle(x, y, 8, fillColor, True, 0)";
Debug.ShouldStop(524288);
_canvas.runVoidMethod ("DrawCircle",(Object)(_x),(Object)(_y),(Object)(BA.numberCast(float.class, 8)),(Object)(_fillcolor),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadallmapdata() throws Exception{
try {
		Debug.PushSubsStack("LoadAllMapData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("loadallmapdata")) { return b4a.example.main.remoteMe.runUserSub(false, "main","loadallmapdata");}
RemoteObject _raw = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 54;BA.debugLine="Sub LoadAllMapData";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Nodes.Initialize";
Debug.ShouldStop(4194304);
main.mostCurrent._nodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="Edges.Initialize";
Debug.ShouldStop(8388608);
main.mostCurrent._edges.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="Graph.Initialize";
Debug.ShouldStop(16777216);
main.mostCurrent._graph.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="Dim raw As String";
Debug.ShouldStop(67108864);
_raw = RemoteObject.createImmutable("");Debug.locals.put("raw", _raw);
 BA.debugLineNum = 60;BA.debugLine="raw = File.ReadString(File.DirAssets, \"mapdata.js";
Debug.ShouldStop(134217728);
_raw = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("mapdata.json")));Debug.locals.put("raw", _raw);
 BA.debugLineNum = 62;BA.debugLine="Log(\"RAW JSON: \" & raw)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4327688",RemoteObject.concat(RemoteObject.createImmutable("RAW JSON: "),_raw),0);
 BA.debugLineNum = 64;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 65;BA.debugLine="parser.Initialize(raw)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_raw));
 BA.debugLineNum = 66;BA.debugLine="Dim root As Map";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 67;BA.debugLine="root = parser.NextObject";
Debug.ShouldStop(4);
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);
 BA.debugLineNum = 69;BA.debugLine="Log(\"ROOT KEYS: \" & root.Keys)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4327695",RemoteObject.concat(RemoteObject.createImmutable("ROOT KEYS: "),_root.runMethod(false,"Keys")),0);
 BA.debugLineNum = 71;BA.debugLine="ParseNodes(root)";
Debug.ShouldStop(64);
_parsenodes(_root);
 BA.debugLineNum = 72;BA.debugLine="ParseEdges(root)";
Debug.ShouldStop(128);
_parseedges(_root);
 BA.debugLineNum = 73;BA.debugLine="BuildGraph";
Debug.ShouldStop(256);
_buildgraph();
 BA.debugLineNum = 75;BA.debugLine="Log(\"Map data loaded. Nodes: \" & Nodes.Size & \" E";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4327701",RemoteObject.concat(RemoteObject.createImmutable("Map data loaded. Nodes: "),main.mostCurrent._nodes.runMethod(true,"getSize"),RemoteObject.createImmutable(" Edges: "),main.mostCurrent._edges.runMethod(true,"getSize")),0);
 BA.debugLineNum = 77;BA.debugLine="ImageViewer.Invalidate";
Debug.ShouldStop(4096);
main.mostCurrent._imageviewer.runVoidMethod ("Invalidate");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ParseEdges (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,106);
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
 BA.debugLineNum = 106;BA.debugLine="Sub ParseEdges(root As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="If root.ContainsKey(\"edges\") = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_root.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("edges")))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 108;BA.debugLine="Log(\"ERROR: no edges key found in JSON\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4458754",RemoteObject.createImmutable("ERROR: no edges key found in JSON"),0);
 BA.debugLineNum = 109;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 112;BA.debugLine="Dim edgeArray As List";
Debug.ShouldStop(32768);
_edgearray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("edgeArray", _edgearray);
 BA.debugLineNum = 113;BA.debugLine="edgeArray = root.Get(\"edges\")";
Debug.ShouldStop(65536);
_edgearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("edges")))));Debug.locals.put("edgeArray", _edgearray);
 BA.debugLineNum = 115;BA.debugLine="If edgeArray = Null Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("n",_edgearray)) { 
 BA.debugLineNum = 116;BA.debugLine="Log(\"ERROR: edges array is null\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4458762",RemoteObject.createImmutable("ERROR: edges array is null"),0);
 BA.debugLineNum = 117;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 120;BA.debugLine="For Each edgeObj As Map In edgeArray";
Debug.ShouldStop(8388608);
_edgeobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _edgearray;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_edgeobj = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("edgeObj", _edgeobj);
Debug.locals.put("edgeObj", _edgeobj);
 BA.debugLineNum = 121;BA.debugLine="Dim e As Map";
Debug.ShouldStop(16777216);
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("e", _e);
 BA.debugLineNum = 122;BA.debugLine="e.Initialize";
Debug.ShouldStop(33554432);
_e.runVoidMethod ("Initialize");
 BA.debugLineNum = 123;BA.debugLine="e.Put(\"id\",     edgeObj.Get(\"id\"))";
Debug.ShouldStop(67108864);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 124;BA.debugLine="e.Put(\"from\",   edgeObj.Get(\"from\"))";
Debug.ShouldStop(134217728);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("from"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from"))))));
 BA.debugLineNum = 125;BA.debugLine="e.Put(\"to\",     edgeObj.Get(\"to\"))";
Debug.ShouldStop(268435456);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to"))))));
 BA.debugLineNum = 126;BA.debugLine="e.Put(\"weight\", edgeObj.Get(\"weight\"))";
Debug.ShouldStop(536870912);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight"))))));
 BA.debugLineNum = 128;BA.debugLine="If edgeObj.ContainsKey(\"shape\") = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_edgeobj.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("shape")))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 129;BA.debugLine="Log(\"WARNING: edge \" & edgeObj.Get(\"id\") & \" ha";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4458775",RemoteObject.concat(RemoteObject.createImmutable("WARNING: edge "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable(" has no shape points")),0);
 BA.debugLineNum = 130;BA.debugLine="Dim emptyShape As List : emptyShape.Initialize";
Debug.ShouldStop(2);
_emptyshape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("emptyShape", _emptyshape);
 BA.debugLineNum = 130;BA.debugLine="Dim emptyShape As List : emptyShape.Initialize";
Debug.ShouldStop(2);
_emptyshape.runVoidMethod ("Initialize");
 BA.debugLineNum = 131;BA.debugLine="e.Put(\"shape\", emptyShape)";
Debug.ShouldStop(4);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("shape"))),(Object)((_emptyshape.getObject())));
 }else {
 BA.debugLineNum = 133;BA.debugLine="Dim shapeArray As List";
Debug.ShouldStop(16);
_shapearray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("shapeArray", _shapearray);
 BA.debugLineNum = 134;BA.debugLine="shapeArray = edgeObj.Get(\"shape\")";
Debug.ShouldStop(32);
_shapearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shape")))));Debug.locals.put("shapeArray", _shapearray);
 BA.debugLineNum = 136;BA.debugLine="If shapeArray = Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("n",_shapearray)) { 
 BA.debugLineNum = 137;BA.debugLine="Log(\"WARNING: shape is null for edge \" & edgeO";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4458783",RemoteObject.concat(RemoteObject.createImmutable("WARNING: shape is null for edge "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 138;BA.debugLine="Dim emptyShape2 As List : emptyShape2.Initiali";
Debug.ShouldStop(512);
_emptyshape2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("emptyShape2", _emptyshape2);
 BA.debugLineNum = 138;BA.debugLine="Dim emptyShape2 As List : emptyShape2.Initiali";
Debug.ShouldStop(512);
_emptyshape2.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="e.Put(\"shape\", emptyShape2)";
Debug.ShouldStop(1024);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("shape"))),(Object)((_emptyshape2.getObject())));
 }else {
 BA.debugLineNum = 141;BA.debugLine="Dim shape As List";
Debug.ShouldStop(4096);
_shape = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("shape", _shape);
 BA.debugLineNum = 142;BA.debugLine="shape.Initialize";
Debug.ShouldStop(8192);
_shape.runVoidMethod ("Initialize");
 BA.debugLineNum = 143;BA.debugLine="For Each pointObj As Map In shapeArray";
Debug.ShouldStop(16384);
_pointobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group34 = _shapearray;
final int groupLen34 = group34.runMethod(true,"getSize").<Integer>get()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_pointobj = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group34.runMethod(false,"Get",index34));Debug.locals.put("pointObj", _pointobj);
Debug.locals.put("pointObj", _pointobj);
 BA.debugLineNum = 144;BA.debugLine="Dim p As Map";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("p", _p);
 BA.debugLineNum = 145;BA.debugLine="p.Initialize";
Debug.ShouldStop(65536);
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 146;BA.debugLine="p.Put(\"x\", pointObj.Get(\"x\"))";
Debug.ShouldStop(131072);
_p.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)(_pointobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))));
 BA.debugLineNum = 147;BA.debugLine="p.Put(\"y\", pointObj.Get(\"y\"))";
Debug.ShouldStop(262144);
_p.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)(_pointobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))));
 BA.debugLineNum = 148;BA.debugLine="shape.Add(p)";
Debug.ShouldStop(524288);
_shape.runVoidMethod ("Add",(Object)((_p.getObject())));
 }
}Debug.locals.put("pointObj", _pointobj);
;
 BA.debugLineNum = 150;BA.debugLine="e.Put(\"shape\", shape)";
Debug.ShouldStop(2097152);
_e.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("shape"))),(Object)((_shape.getObject())));
 };
 };
 BA.debugLineNum = 154;BA.debugLine="Edges.Add(e)";
Debug.ShouldStop(33554432);
main.mostCurrent._edges.runVoidMethod ("Add",(Object)((_e.getObject())));
 BA.debugLineNum = 155;BA.debugLine="Log(\"Edge: \" & edgeObj.Get(\"id\") & \" (\" & edgeOb";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4458801",RemoteObject.concat(RemoteObject.createImmutable("Edge: "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable(" ("),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))),RemoteObject.createImmutable(" -> "),_edgeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to")))),RemoteObject.createImmutable(")")),0);
 }
}Debug.locals.put("edgeObj", _edgeobj);
;
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ParseNodes (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,80);
if (RapidSub.canDelegate("parsenodes")) { return b4a.example.main.remoteMe.runUserSub(false, "main","parsenodes", _root);}
RemoteObject _nodearray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nodeobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("root", _root);
 BA.debugLineNum = 80;BA.debugLine="Sub ParseNodes(root As Map)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="If root.ContainsKey(\"nodes\") = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_root.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("nodes")))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 82;BA.debugLine="Log(\"ERROR: no nodes key found in JSON\")";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4393218",RemoteObject.createImmutable("ERROR: no nodes key found in JSON"),0);
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 86;BA.debugLine="Dim nodeArray As List";
Debug.ShouldStop(2097152);
_nodearray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nodeArray", _nodearray);
 BA.debugLineNum = 87;BA.debugLine="nodeArray = root.Get(\"nodes\")";
Debug.ShouldStop(4194304);
_nodearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nodes")))));Debug.locals.put("nodeArray", _nodearray);
 BA.debugLineNum = 89;BA.debugLine="If nodeArray = Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_nodearray)) { 
 BA.debugLineNum = 90;BA.debugLine="Log(\"ERROR: nodes array is null\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4393226",RemoteObject.createImmutable("ERROR: nodes array is null"),0);
 BA.debugLineNum = 91;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 94;BA.debugLine="For Each nodeObj As Map In nodeArray";
Debug.ShouldStop(536870912);
_nodeobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _nodearray;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_nodeobj = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("nodeObj", _nodeobj);
Debug.locals.put("nodeObj", _nodeobj);
 BA.debugLineNum = 95;BA.debugLine="Dim n As Map";
Debug.ShouldStop(1073741824);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("n", _n);
 BA.debugLineNum = 96;BA.debugLine="n.Initialize";
Debug.ShouldStop(-2147483648);
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="n.Put(\"id\",    nodeObj.Get(\"id\"))";
Debug.ShouldStop(1);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 98;BA.debugLine="n.Put(\"x\",     nodeObj.Get(\"x\"))";
Debug.ShouldStop(2);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x"))))));
 BA.debugLineNum = 99;BA.debugLine="n.Put(\"y\",     nodeObj.Get(\"y\"))";
Debug.ShouldStop(4);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))));
 BA.debugLineNum = 100;BA.debugLine="n.Put(\"label\", nodeObj.Get(\"label\"))";
Debug.ShouldStop(8);
_n.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("label"))),(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("label"))))));
 BA.debugLineNum = 101;BA.debugLine="Nodes.Put(nodeObj.Get(\"id\"), n)";
Debug.ShouldStop(16);
main.mostCurrent._nodes.runVoidMethod ("Put",(Object)(_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),(Object)((_n.getObject())));
 BA.debugLineNum = 102;BA.debugLine="Log(\"Node: \" & nodeObj.Get(\"id\") & \" at (\" & nod";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4393238",RemoteObject.concat(RemoteObject.createImmutable("Node: "),_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable(" at ("),_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))),RemoteObject.createImmutable(","),_nodeobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))),RemoteObject.createImmutable(")")),0);
 }
}Debug.locals.put("nodeObj", _nodeobj);
;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("RunDijkstra (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,194);
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
RemoteObject _n = RemoteObject.createImmutable("");
RemoteObject _fromid = RemoteObject.createImmutable("");
RemoteObject _toid = RemoteObject.createImmutable("");
RemoteObject _found = RemoteObject.declareNull("Object");
Debug.locals.put("startId", _startid);
Debug.locals.put("endId", _endid);
 BA.debugLineNum = 194;BA.debugLine="Sub RunDijkstra(startId As String, endId As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Log(\"Dijkstra running from: \" & startId & \" to: \"";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4589825",RemoteObject.concat(RemoteObject.createImmutable("Dijkstra running from: "),_startid,RemoteObject.createImmutable(" to: "),_endid),0);
 BA.debugLineNum = 197;BA.debugLine="Dim dist    As Map : dist.Initialize";
Debug.ShouldStop(16);
_dist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("dist", _dist);
 BA.debugLineNum = 197;BA.debugLine="Dim dist    As Map : dist.Initialize";
Debug.ShouldStop(16);
_dist.runVoidMethod ("Initialize");
 BA.debugLineNum = 198;BA.debugLine="Dim prev    As Map : prev.Initialize";
Debug.ShouldStop(32);
_prev = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("prev", _prev);
 BA.debugLineNum = 198;BA.debugLine="Dim prev    As Map : prev.Initialize";
Debug.ShouldStop(32);
_prev.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="Dim visited As Map : visited.Initialize";
Debug.ShouldStop(64);
_visited = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("visited", _visited);
 BA.debugLineNum = 199;BA.debugLine="Dim visited As Map : visited.Initialize";
Debug.ShouldStop(64);
_visited.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(256);
{
final RemoteObject group8 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_nodeid = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 202;BA.debugLine="dist.Put(nodeId, 999999)";
Debug.ShouldStop(512);
_dist.runVoidMethod ("Put",(Object)((_nodeid)),(Object)(RemoteObject.createImmutable((999999))));
 BA.debugLineNum = 203;BA.debugLine="prev.Put(nodeId, \"\")";
Debug.ShouldStop(1024);
_prev.runVoidMethod ("Put",(Object)((_nodeid)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 205;BA.debugLine="dist.Put(startId, 0)";
Debug.ShouldStop(4096);
_dist.runVoidMethod ("Put",(Object)((_startid)),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 207;BA.debugLine="Do While True";
Debug.ShouldStop(16384);
while (main.mostCurrent.__c.getField(true,"True").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 208;BA.debugLine="Dim current As String = \"\"";
Debug.ShouldStop(32768);
_current = BA.ObjectToString("");Debug.locals.put("current", _current);Debug.locals.put("current", _current);
 BA.debugLineNum = 209;BA.debugLine="Dim minDist As Int = 999999";
Debug.ShouldStop(65536);
_mindist = BA.numberCast(int.class, 999999);Debug.locals.put("minDist", _mindist);Debug.locals.put("minDist", _mindist);
 BA.debugLineNum = 211;BA.debugLine="For Each nodeId As String In Nodes.Keys";
Debug.ShouldStop(262144);
{
final RemoteObject group16 = main.mostCurrent._nodes.runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_nodeid = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("nodeId", _nodeid);
Debug.locals.put("nodeId", _nodeid);
 BA.debugLineNum = 212;BA.debugLine="If visited.ContainsKey(nodeId) = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_visited.runMethod(true,"ContainsKey",(Object)((_nodeid))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 213;BA.debugLine="Dim d As Int = dist.Get(nodeId)";
Debug.ShouldStop(1048576);
_d = BA.numberCast(int.class, _dist.runMethod(false,"Get",(Object)((_nodeid))));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 214;BA.debugLine="If d < minDist Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_d,BA.numberCast(double.class, _mindist))) { 
 BA.debugLineNum = 215;BA.debugLine="minDist = d";
Debug.ShouldStop(4194304);
_mindist = _d;Debug.locals.put("minDist", _mindist);
 BA.debugLineNum = 216;BA.debugLine="current = nodeId";
Debug.ShouldStop(8388608);
_current = _nodeid;Debug.locals.put("current", _current);
 };
 };
 }
}Debug.locals.put("nodeId", _nodeid);
;
 BA.debugLineNum = 221;BA.debugLine="If current = \"\" Or current = endId Then Exit";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_current,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_current,_endid)) { 
if (true) break;};
 BA.debugLineNum = 223;BA.debugLine="visited.Put(current, True)";
Debug.ShouldStop(1073741824);
_visited.runVoidMethod ("Put",(Object)((_current)),(Object)((main.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 225;BA.debugLine="If Graph.ContainsKey(current) Then";
Debug.ShouldStop(1);
if (main.mostCurrent._graph.runMethod(true,"ContainsKey",(Object)((_current))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="Dim neighbors As List = Graph.Get(current)";
Debug.ShouldStop(2);
_neighbors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_neighbors = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._graph.runMethod(false,"Get",(Object)((_current))));Debug.locals.put("neighbors", _neighbors);Debug.locals.put("neighbors", _neighbors);
 BA.debugLineNum = 227;BA.debugLine="For Each conn As Map In neighbors";
Debug.ShouldStop(4);
_conn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group29 = _neighbors;
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_conn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group29.runMethod(false,"Get",index29));Debug.locals.put("conn", _conn);
Debug.locals.put("conn", _conn);
 BA.debugLineNum = 228;BA.debugLine="Dim neighbor     As String = conn.Get(\"neighbo";
Debug.ShouldStop(8);
_neighbor = BA.ObjectToString(_conn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("neighbor")))));Debug.locals.put("neighbor", _neighbor);Debug.locals.put("neighbor", _neighbor);
 BA.debugLineNum = 229;BA.debugLine="Dim currDist     As Int    = dist.Get(current)";
Debug.ShouldStop(16);
_currdist = BA.numberCast(int.class, _dist.runMethod(false,"Get",(Object)((_current))));Debug.locals.put("currDist", _currdist);Debug.locals.put("currDist", _currdist);
 BA.debugLineNum = 230;BA.debugLine="Dim neighborDist As Int    = dist.Get(neighbor";
Debug.ShouldStop(32);
_neighbordist = BA.numberCast(int.class, _dist.runMethod(false,"Get",(Object)((_neighbor))));Debug.locals.put("neighborDist", _neighbordist);Debug.locals.put("neighborDist", _neighbordist);
 BA.debugLineNum = 231;BA.debugLine="Dim edgeWeight   As Int    = conn.Get(\"weight\"";
Debug.ShouldStop(64);
_edgeweight = BA.numberCast(int.class, _conn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("edgeWeight", _edgeweight);Debug.locals.put("edgeWeight", _edgeweight);
 BA.debugLineNum = 232;BA.debugLine="Dim newDist      As Int    = currDist + edgeWe";
Debug.ShouldStop(128);
_newdist = RemoteObject.solve(new RemoteObject[] {_currdist,_edgeweight}, "+",1, 1);Debug.locals.put("newDist", _newdist);Debug.locals.put("newDist", _newdist);
 BA.debugLineNum = 233;BA.debugLine="If newDist < neighborDist Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_newdist,BA.numberCast(double.class, _neighbordist))) { 
 BA.debugLineNum = 234;BA.debugLine="dist.Put(neighbor, newDist)";
Debug.ShouldStop(512);
_dist.runVoidMethod ("Put",(Object)((_neighbor)),(Object)((_newdist)));
 BA.debugLineNum = 235;BA.debugLine="prev.Put(neighbor, current)";
Debug.ShouldStop(1024);
_prev.runVoidMethod ("Put",(Object)((_neighbor)),(Object)((_current)));
 };
 }
}Debug.locals.put("conn", _conn);
;
 };
 }
;
 BA.debugLineNum = 241;BA.debugLine="Dim path As List : path.Initialize";
Debug.ShouldStop(65536);
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("path", _path);
 BA.debugLineNum = 241;BA.debugLine="Dim path As List : path.Initialize";
Debug.ShouldStop(65536);
_path.runVoidMethod ("Initialize");
 BA.debugLineNum = 242;BA.debugLine="Dim steps As String";
Debug.ShouldStop(131072);
_steps = RemoteObject.createImmutable("");Debug.locals.put("steps", _steps);
 BA.debugLineNum = 243;BA.debugLine="steps = endId";
Debug.ShouldStop(262144);
_steps = _endid;Debug.locals.put("steps", _steps);
 BA.debugLineNum = 244;BA.debugLine="Do While steps <> \"\"";
Debug.ShouldStop(524288);
while (RemoteObject.solveBoolean("!",_steps,BA.ObjectToString(""))) {
 BA.debugLineNum = 245;BA.debugLine="path.Add(steps)";
Debug.ShouldStop(1048576);
_path.runVoidMethod ("Add",(Object)((_steps)));
 BA.debugLineNum = 246;BA.debugLine="If prev.ContainsKey(steps) = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_prev.runMethod(true,"ContainsKey",(Object)((_steps))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 247;BA.debugLine="steps = \"\"";
Debug.ShouldStop(4194304);
_steps = BA.ObjectToString("");Debug.locals.put("steps", _steps);
 }else {
 BA.debugLineNum = 249;BA.debugLine="Dim prevVal As String = prev.Get(steps)";
Debug.ShouldStop(16777216);
_prevval = BA.ObjectToString(_prev.runMethod(false,"Get",(Object)((_steps))));Debug.locals.put("prevVal", _prevval);Debug.locals.put("prevVal", _prevval);
 BA.debugLineNum = 250;BA.debugLine="If prevVal = Null Or prevVal = \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("n",_prevval) || RemoteObject.solveBoolean("=",_prevval,BA.ObjectToString(""))) { 
 BA.debugLineNum = 251;BA.debugLine="steps = \"\"";
Debug.ShouldStop(67108864);
_steps = BA.ObjectToString("");Debug.locals.put("steps", _steps);
 }else {
 BA.debugLineNum = 253;BA.debugLine="steps = prevVal";
Debug.ShouldStop(268435456);
_steps = _prevval;Debug.locals.put("steps", _steps);
 };
 };
 }
;
 BA.debugLineNum = 258;BA.debugLine="Dim reversed As List : reversed.Initialize";
Debug.ShouldStop(2);
_reversed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("reversed", _reversed);
 BA.debugLineNum = 258;BA.debugLine="Dim reversed As List : reversed.Initialize";
Debug.ShouldStop(2);
_reversed.runVoidMethod ("Initialize");
 BA.debugLineNum = 259;BA.debugLine="For i = path.Size - 1 To 0 Step -1";
Debug.ShouldStop(4);
{
final int step61 = -1;
final int limit61 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_path.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step61 > 0 && _i <= limit61) || (step61 < 0 && _i >= limit61) ;_i = ((int)(0 + _i + step61))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 260;BA.debugLine="reversed.Add(path.Get(i))";
Debug.ShouldStop(8);
_reversed.runVoidMethod ("Add",(Object)(_path.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 263;BA.debugLine="Log(\"Path size: \" & reversed.Size)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4589893",RemoteObject.concat(RemoteObject.createImmutable("Path size: "),_reversed.runMethod(true,"getSize")),0);
 BA.debugLineNum = 264;BA.debugLine="For Each n As String In reversed";
Debug.ShouldStop(128);
{
final RemoteObject group65 = _reversed;
final int groupLen65 = group65.runMethod(true,"getSize").<Integer>get()
;int index65 = 0;
;
for (; index65 < groupLen65;index65++){
_n = BA.ObjectToString(group65.runMethod(false,"Get",index65));Debug.locals.put("n", _n);
Debug.locals.put("n", _n);
 BA.debugLineNum = 265;BA.debugLine="Log(\"Path node: \" & n)";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4589895",RemoteObject.concat(RemoteObject.createImmutable("Path node: "),_n),0);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 268;BA.debugLine="RouteEdges.Initialize";
Debug.ShouldStop(2048);
main.mostCurrent._routeedges.runVoidMethod ("Initialize");
 BA.debugLineNum = 269;BA.debugLine="For i = 0 To reversed.Size - 2";
Debug.ShouldStop(4096);
{
final int step69 = 1;
final int limit69 = RemoteObject.solve(new RemoteObject[] {_reversed.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step69 > 0 && _i <= limit69) || (step69 < 0 && _i >= limit69) ;_i = ((int)(0 + _i + step69))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 270;BA.debugLine="Dim fromId As String = reversed.Get(i)";
Debug.ShouldStop(8192);
_fromid = BA.ObjectToString(_reversed.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fromId", _fromid);Debug.locals.put("fromId", _fromid);
 BA.debugLineNum = 271;BA.debugLine="Dim toId   As String = reversed.Get(i + 1)";
Debug.ShouldStop(16384);
_toid = BA.ObjectToString(_reversed.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("toId", _toid);Debug.locals.put("toId", _toid);
 BA.debugLineNum = 272;BA.debugLine="Dim found  As Object = FindEdge(fromId, toId)";
Debug.ShouldStop(32768);
_found = _findedge(_fromid,_toid);Debug.locals.put("found", _found);Debug.locals.put("found", _found);
 BA.debugLineNum = 273;BA.debugLine="If found <> Null Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_found)) { 
 BA.debugLineNum = 274;BA.debugLine="RouteEdges.Add(found)";
Debug.ShouldStop(131072);
main.mostCurrent._routeedges.runVoidMethod ("Add",(Object)(_found));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 278;BA.debugLine="Log(\"RouteEdges size: \" & RouteEdges.Size)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4589908",RemoteObject.concat(RemoteObject.createImmutable("RouteEdges size: "),main.mostCurrent._routeedges.runMethod(true,"getSize")),0);
 BA.debugLineNum = 279;BA.debugLine="ImageViewer.Invalidate";
Debug.ShouldStop(4194304);
main.mostCurrent._imageviewer.runVoidMethod ("Invalidate");
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}