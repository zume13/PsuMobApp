B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=13.4
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MapB As Panel
	Private searchT As EditText
	Private FacilitiesB As Panel
	Private FoodB As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MapMainPage")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub


Private Sub searchB_Click
	
End Sub

Sub GoToPage(NextActivity As Object)
	Dim pnlSlide As Panel
	pnlSlide.Initialize("")
    
	Activity.AddView(pnlSlide, Activity.Width, 0, Activity.Width, Activity.Height)
	pnlSlide.Color = Colors.RGB(142, 30, 44)
    
	pnlSlide.SetLayoutAnimated(300, 0, 0, Activity.Width, Activity.Height)
    
	Sleep(320)
	StartActivity(NextActivity)
	Activity.Finish
End Sub

Private Sub MapB_Touch (Action As Int, X As Float, Y As Float)
	If Action = 0 Then 
		MapB.Color = Colors.RGB(183, 43, 60)
	Else If Action = 1 Then
		MapB.Color = Colors.RGB(142, 30, 44)
	End If
End Sub

Private Sub FoodB_Touch (Action As Int, X As Float, Y As Float)
	If Action = 0 Then 
		FoodB.Color = Colors.RGB(183, 43, 60)
	Else if Action = 1 Then
		FoodB.Color = Colors.RGB(142, 30, 44)
		GoToPage(Food)
	End If
End Sub

Private Sub FacilitiesB_Touch (Action As Int, X As Float, Y As Float)
	If Action = 0 Then
		FacilitiesB.Color = Colors.RGB(183, 43, 60)
	Else If Action = 1 Then
		FacilitiesB.Color = Colors.RGB(142, 30, 44)
		GoToPage(Facilities)
	End If
End Sub

Sub GoBack
	Dim pnlSlide As Panel
	pnlSlide.Initialize("")
    
	Activity.AddView(pnlSlide, -Activity.Width, 0, Activity.Width, Activity.Height)
	pnlSlide.Color = Colors.RGB(142, 30, 44)
    
	pnlSlide.SetLayoutAnimated(300, 0, 0, Activity.Width, Activity.Height)
    
	Sleep(320)
	Activity.Finish
End Sub

Sub Activity_KeyPress(KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		GoBack
		Return True
	End If
	Return False
End Sub