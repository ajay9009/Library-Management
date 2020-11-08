

function mail()
{
	uid = document.getElementById('uid');
	fname = document.getElementById('fname');
	lname = document.getElementById('lname');
	depart = document.getElementById('depart');
	em = document.getElementById('em');
	mobile = document.getElementById('mobile');
	im = document.getElementById('im');
	
	if (uid.value!='' && fname.value!='' && lname.value!='' && depart.value!='' &&  em.value!='' && mobile.value!='' && im.value!='') 
	{
		alert("<h1>An OTP is sended to your Email Address.<h1>");
	}
	else{

		alert("Please fill the required fields.");
	}
    
}