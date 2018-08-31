<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>acknowledgement form</title>
</head>
<body bgcolor="lightblue">
<center>
<h1 style="color: blue;">UNCHARTED4</h1>
<h4 style="color: red;"> ${headervalue} </h4>
<h3 style="color: navy;">Hello!!! ${student.uname} </h3>
<h3 style="color: navy;">Email  : ${student.uemail} </h3>
<h3 style="color: navy;">Mobile : ${student.umob} </h3>
<h3 style="color: navy;">DOB    : ${student.dob} </h3>
<%-- <h3 style="color: navy;">Skills : ${std.skills} </h3> --%>
<hr>
<h2 style="color: maroon;">Address Details</h2>

<h3 style="color: green;">Country : ${student.addr.country} </h3>
<h3 style="color: green;">City    : ${student.addr.city} </h3>
<h3 style="color: green;">State   : ${student.addr.state} </h3>
<h3 style="color: green;">PIN     : ${student.addr.pincode} </h3>
<h3 style="color: green;">Registration success</h3>
</center>
</body>
</html>