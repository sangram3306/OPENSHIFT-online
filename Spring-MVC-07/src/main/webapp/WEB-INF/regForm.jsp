<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body bgcolor="lightblue">
	<center>
	<a href="regForm.htm?siteLanguage=en">English</a>
	<a href="regForm.htm?siteLanguage=fr">French</a>
		<h1 style="color: blue;"> ${headervalue}</h1>
		<h2> <spring:message code="label.head"/> </h2>
		<h3 style="color: red;"><spring:message code="label.2ndhead" /></h3>
		<form action="reg" method="post">
			<table>
				<tr>
					<th> <spring:message code="label.uname"/> </th>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<th><spring:message code="label.uemail"/></th>
					<td><input type="text" name="uemail"></td>
				</tr>
				<tr>
					<th><spring:message code="label.upwd"/></th>
					<td><input type="password" name="upwd"></td>
				</tr>
				<tr>
					<th><spring:message code="label.umob"/></th>
					<td><input type="text" name="umob"></td>
				</tr>
				<tr>
					<th><spring:message code="label.dob"/></th>
					<td><input type="text" name="dob"></td>
				</tr>
				<!-- <tr>
					<th>Skills</th>
					<td style="text-align: right;"><select name="skills" multiple>
							<option value="CoreJava" label="Core Java" />
							<option value="AdvJava" label="Adv.Java" />
							<option value="Spring" label="Spring" />
							<option value="Hibernate" label="Hibernate" />
							<option value="WebServices" label="WebServices" />
					</select></td>
				</tr> -->
				<tr>
				   <th></th>
					<th><spring:message code="label.address"/></th>
				</tr>
				<tr>
					<th><spring:message code="label.country"/></th>
					<td><input type="text" name="addr.country"></td>
				</tr>
				<tr>
					<th><spring:message code="label.city"/></th>
					<td><input type="text" name="addr.city"></td>
				</tr>
				<tr>
					<th><spring:message code="label.state"/></th>
					<td><input type="text" name="addr.state"></td>
				</tr>
				<tr>
					<th><spring:message code="label.pincode"/></th>
					<td><input type="text" name="addr.pincode"></td>
				</tr>
				<tr>
					<th></th>
					<td style="text-align: right;"><input type="submit"
						value="SUBMIT"></td>
				</tr>
			</table>

		</form>
		<h4 style="color: red;"><form:errors path="student.*" /></h4>
	</center>
</body>
</html>