function validation()
{
	
	var c_mail = document.forms["f1"]["email"].value;
	
	if(c_mail =="")
	{
		alert("Please enter your email");
		
		return false;
	}

	document.writeln("Email: " + c_mail +"<br>");
	
	}