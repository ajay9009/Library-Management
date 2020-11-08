
function mail()
{
	uid = document.getElementById('uid');
	fname = document.getElementById('fname');
	lname = document.getElementById('lname');
	branch = document.getElementById('branch');
	bd = document.getElementById('bd');
	em = document.getElementById('em');
	mobile = document.getElementById('mobile');
	uadd = document.getElementById('uadd');
	im = document.getElementById('epic');
	
	if (uid.value!='' && fname.value!='' && lname.value!='' && branch.value!='' && bd.value!='' && em.value!='' && mobile.value!='' && uadd.value!='' && im.value!='') 
	{
		alert("An OTP is sended to your Email Address.");
	}
	else{

		alert("Please fill the required fields.");
	}
    
}