
function validation(){	

	
	
	var uname  = document.forms["form1"]["name"].value;
	var umail = document.forms["form1"]["email"].value;
	var usubject = document.forms["form1"]["choose"].value;
	var umsg= document.forms["form1"]["msg"].value;
	

	
	
	if(uname =="")
	{
		alert("Please enter your name");
		return false;
	}
	
	if(umail =="")
	{
		alert("Please enter your email");
		
		return false;
	}
	
	if(usubject=="")
	{
		alert("Select a subject")
		return false;
	}
	
	if(umsg=="")
	{
		alert("Please enter your message");
		return false;
	}
	
}	



//function sendemail(){
	
	
		Email.send({
			Host : "smtp.gmail.com",
			Username : "",
			Password : "",
			To : "",
			From :  document.forms["form1"]["email"].value,
			Subject : "Query form",
			Body : "aaaaraRE"
		}).then(
		message => alert("you successfuly  completed form!")
		);
		


