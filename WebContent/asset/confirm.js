
function pa()
{
	p = document.getElementById('p');
	cp = document.getElementById('cp');
	pp = document.getElementById('pp');
	
	if (p.value==cp.value) 
	{
		pp.innerHTML='<img src="/Library_Management/images/ri.png">';
	}
	else{

		pp.innerHTML='<font size="%"><img src="/Library_Management/images/x.png"></font>';
	}



}


function vr(ot)
{	
	otp = document.getElementById('otp');
	here = document.getElementById('here');

	if (otp.value==ot) 
		{
			here.innerHTML='<img src="/Library_Management/images/ri.png">';
			document.getElementById("p").readOnly = false;
			document.getElementById("cp").readOnly = false;
			

		} 
		else {

			here.innerHTML='<img src="/Library_Management/images/x.png">';
			document.getElementById("p").readOnly = true;
			document.getElementById("cp").readOnly = true;
		}
}

function s(){
	
	document.getElementById("p").readOnly = true;
	document.getElementById("cp").readOnly = true;
	
}





