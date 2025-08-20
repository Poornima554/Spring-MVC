<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
     body {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        text-align: center;
        background-color: #ffddeb;
    }
    #head{
            color: brown;
            font-size: 50px;
            text-transform: uppercase;
        }
    .container{
        width: 30%;
        /* height: 300px; */
        border: 2px solid black;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        gap: 20px;
        padding: 50px 0px;
        background: linear-gradient(145deg, #d39cb3, #98eae5);
        backdrop-filter: blur(8px);

        #inn {
            font-size: 25px;
            padding: 10px 5px;
            text-align: center;
            border-radius: 15px;
            margin-left: 20px;
            width: 280px;
        }

        #btn {
            font-size: 20px;
            padding: 15px 15px;
            border-radius: 50px;
            background-color: brown;
            color: azure;
            cursor: pointer;
            margin-top: 20px;
            width: 150px;
        }
    }
</style>
<body>
	<h1 id="head">Add Student Information</h1>
	
	<div class="container">
	<form action="addStudent" method="post">
		<input id="inn" type="text" placeholder="Enter first name" name="firstName" required="required"><br><br>
		<input id="inn" type="text" placeholder="Enter last name" name="lastName" required="required"><br><br>
		<input id="inn" type="email" placeholder="Enter email" name="email" required="required"><br><br>
		<input id="inn" type="tel" placeholder="Enter phone number" name="phoneNo" required="required"><br><br>
		<input id="inn" type="text" placeholder="Enter city" name="city" required="required"><br><br>
		<input id="btn" type="submit">	
		
	</form>
	<a href="index.jsp">Go Back</a>
	</div>


</body>
</html>