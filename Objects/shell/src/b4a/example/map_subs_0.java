package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class map_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.map.remoteMe.runUserSub(false, "map","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"MapMainPage\")";
Debug.ShouldStop(4194304);
map.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapMainPage")),map.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,91);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.map.remoteMe.runUserSub(false, "map","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 91;BA.debugLine="Sub Activity_KeyPress(KeyCode As Int) As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, map.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 93;BA.debugLine="GoBack";
Debug.ShouldStop(268435456);
_goback();
 BA.debugLineNum = 94;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return map.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 96;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return map.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.map.remoteMe.runUserSub(false, "map","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.map.remoteMe.runUserSub(false, "map","activity_resume");}
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _facilitiesb_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("FacilitiesB_Touch (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,69);
if (RapidSub.canDelegate("facilitiesb_touch")) { return b4a.example.map.remoteMe.runUserSub(false, "map","facilitiesb_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 69;BA.debugLine="Private Sub FacilitiesB_Touch (Action As Int, X As";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="If Action = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="FacilitiesB.Color = Colors.RGB(183, 43, 60)";
Debug.ShouldStop(64);
map.mostCurrent._facilitiesb.runVoidMethod ("setColor",map.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 183)),(Object)(BA.numberCast(int.class, 43)),(Object)(BA.numberCast(int.class, 60))));
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else If Action = 1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 73;BA.debugLine="FacilitiesB.Color = Colors.RGB(142, 30, 44)";
Debug.ShouldStop(256);
map.mostCurrent._facilitiesb.runVoidMethod ("setColor",map.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 44))));
 BA.debugLineNum = 74;BA.debugLine="GoToPage(Facilities)";
Debug.ShouldStop(512);
_gotopage((map.mostCurrent._facilities.getObject()));
 }}
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _foodb_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("FoodB_Touch (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,60);
if (RapidSub.canDelegate("foodb_touch")) { return b4a.example.map.remoteMe.runUserSub(false, "map","foodb_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 60;BA.debugLine="Private Sub FoodB_Touch (Action As Int, X As Float";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="If Action = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 62;BA.debugLine="FoodB.Color = Colors.RGB(183, 43, 60)";
Debug.ShouldStop(536870912);
map.mostCurrent._foodb.runVoidMethod ("setColor",map.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 183)),(Object)(BA.numberCast(int.class, 43)),(Object)(BA.numberCast(int.class, 60))));
 }else 
{ BA.debugLineNum = 63;BA.debugLine="Else if Action = 1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 64;BA.debugLine="FoodB.Color = Colors.RGB(142, 30, 44)";
Debug.ShouldStop(-2147483648);
map.mostCurrent._foodb.runVoidMethod ("setColor",map.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 44))));
 BA.debugLineNum = 65;BA.debugLine="GoToPage(Food)";
Debug.ShouldStop(1);
_gotopage((map.mostCurrent._food.getObject()));
 }}
;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MapB As Panel";
map.mostCurrent._mapb = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private searchT As EditText";
map.mostCurrent._searcht = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private FacilitiesB As Panel";
map.mostCurrent._facilitiesb = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private FoodB As Panel";
map.mostCurrent._foodb = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _goback() throws Exception{
try {
		Debug.PushSubsStack("GoBack (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,78);
if (RapidSub.canDelegate("goback")) { b4a.example.map.remoteMe.runUserSub(false, "map","goback"); return;}
ResumableSub_GoBack rsub = new ResumableSub_GoBack(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GoBack extends BA.ResumableSub {
public ResumableSub_GoBack(b4a.example.map parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.map parent;
RemoteObject _pnlslide = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GoBack (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,78);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 79;BA.debugLine="Dim pnlSlide As Panel";
Debug.ShouldStop(16384);
_pnlslide = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlSlide", _pnlslide);
 BA.debugLineNum = 80;BA.debugLine="pnlSlide.Initialize(\"\")";
Debug.ShouldStop(32768);
_pnlslide.runVoidMethod ("Initialize",map.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 82;BA.debugLine="Activity.AddView(pnlSlide, -Activity.Width, 0, Ac";
Debug.ShouldStop(131072);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnlslide.getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + parent.mostCurrent._activity.runMethod(true,"getWidth").<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._activity.runMethod(true,"getHeight")));
 BA.debugLineNum = 83;BA.debugLine="pnlSlide.Color = Colors.RGB(142, 30, 44)";
Debug.ShouldStop(262144);
_pnlslide.runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 44))));
 BA.debugLineNum = 85;BA.debugLine="pnlSlide.SetLayoutAnimated(300, 0, 0, Activity.Wi";
Debug.ShouldStop(1048576);
_pnlslide.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._activity.runMethod(true,"getHeight")));
 BA.debugLineNum = 87;BA.debugLine="Sleep(320)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",map.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "map", "goback"),BA.numberCast(int.class, 320));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 88;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static void  _gotopage(RemoteObject _nextactivity) throws Exception{
try {
		Debug.PushSubsStack("GoToPage (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,38);
if (RapidSub.canDelegate("gotopage")) { b4a.example.map.remoteMe.runUserSub(false, "map","gotopage", _nextactivity); return;}
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
public ResumableSub_GoToPage(b4a.example.map parent,RemoteObject _nextactivity) {
this.parent = parent;
this._nextactivity = _nextactivity;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.map parent;
RemoteObject _nextactivity;
RemoteObject _pnlslide = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GoToPage (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,38);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("NextActivity", _nextactivity);
 BA.debugLineNum = 39;BA.debugLine="Dim pnlSlide As Panel";
Debug.ShouldStop(64);
_pnlslide = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlSlide", _pnlslide);
 BA.debugLineNum = 40;BA.debugLine="pnlSlide.Initialize(\"\")";
Debug.ShouldStop(128);
_pnlslide.runVoidMethod ("Initialize",map.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView(pnlSlide, Activity.Width, 0, Act";
Debug.ShouldStop(512);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnlslide.getObject())),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._activity.runMethod(true,"getHeight")));
 BA.debugLineNum = 43;BA.debugLine="pnlSlide.Color = Colors.RGB(142, 30, 44)";
Debug.ShouldStop(1024);
_pnlslide.runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 44))));
 BA.debugLineNum = 45;BA.debugLine="pnlSlide.SetLayoutAnimated(300, 0, 0, Activity.Wi";
Debug.ShouldStop(4096);
_pnlslide.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._activity.runMethod(true,"getHeight")));
 BA.debugLineNum = 47;BA.debugLine="Sleep(320)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Sleep",map.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "map", "gotopage"),BA.numberCast(int.class, 320));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 48;BA.debugLine="StartActivity(NextActivity)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",map.processBA,(Object)(_nextactivity));
 BA.debugLineNum = 49;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static RemoteObject  _mapb_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("MapB_Touch (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,52);
if (RapidSub.canDelegate("mapb_touch")) { return b4a.example.map.remoteMe.runUserSub(false, "map","mapb_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 52;BA.debugLine="Private Sub MapB_Touch (Action As Int, X As Float,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If Action = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 54;BA.debugLine="MapB.Color = Colors.RGB(183, 43, 60)";
Debug.ShouldStop(2097152);
map.mostCurrent._mapb.runVoidMethod ("setColor",map.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 183)),(Object)(BA.numberCast(int.class, 43)),(Object)(BA.numberCast(int.class, 60))));
 }else 
{ BA.debugLineNum = 55;BA.debugLine="Else If Action = 1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 56;BA.debugLine="MapB.Color = Colors.RGB(142, 30, 44)";
Debug.ShouldStop(8388608);
map.mostCurrent._mapb.runVoidMethod ("setColor",map.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 44))));
 }}
;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _searchb_click() throws Exception{
try {
		Debug.PushSubsStack("searchB_Click (map) ","map",3,map.mostCurrent.activityBA,map.mostCurrent,34);
if (RapidSub.canDelegate("searchb_click")) { return b4a.example.map.remoteMe.runUserSub(false, "map","searchb_click");}
 BA.debugLineNum = 34;BA.debugLine="Private Sub searchB_Click";
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
}