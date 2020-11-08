function s(){
	
	document.getElementById("myBtn").disabled = true;
	document.getElementById("myDIV").style.visibility = "hidden";
}
function vr(ot)
{	
	otp = document.getElementById('otp');
	here = document.getElementById('here');

	if (otp.value==ot) 
		{
			here.innerHTML='<img src="/Library_Manage/images/ri.png">';
			document.getElementById("myBtn").disabled = false;
			

		} 
		else {

			here.innerHTML='<img src="/Library_Manage/images/x.png">';
			document.getElementById("myBtn").disabled = true;
		}
}
function myFunction() {
	if(document.getElementById("myDIV").style.visibility == "hidden"){
	document.getElementById("myDIV").style.visibility = "visible";
	}
	else{
	document.getElementById("myDIV").style.visibility = "hidden";
	}
	   }

