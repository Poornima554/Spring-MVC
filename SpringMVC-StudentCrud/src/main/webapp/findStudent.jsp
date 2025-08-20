<%@page import="com.dcl.sdb.entity.StudentEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        text-align: center;

        h1{
            color: brown;
        }
    }

    .container {
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
            padding: 5px 5px;
            text-align: center;
            border-radius: 15px;
            margin-left: 20px;
            width: 250px;
        }

        #btn {
            font-size: 20px;
            padding: 15px 15px;
            border-radius: 50px;
            background-color: brown;
            color: azure;
            cursor: pointer;
            margin-top: 20px;
        }

        label {
            font-size: 20px;
            font-weight: bolder;
        }
    }
</style>
</head>

<body>
	
	<% StudentEntity st = (StudentEntity)request.getAttribute("key"); %>
	<h1>UPDATING FORM</h1>
	<div class="container">
		<form action="updateStudent" method="post">
		<label for="id">Student ID:</label>
		<input id="inn" type="number" value="<%=st.getId()%>" name="id" readonly="readonly"><br><br> 
		
		<label for="firstName">First Name:</label>
		<input id="inn" type="text" id="firstName" value="<%=st.getFirstName()%>" name="firstName"><br><br> 
		
		<label for="lastName">Last Name:</label>
		<input id="inn" type="text" id="lastName" value="<%=st.getLastName()%>" name="lastName"><br><br> 
		
		<label for="email">Email:</label>
		<input id="inn" type="email" id="email" value="<%=st.getEmail()%>" name="email"><br><br> 
		
		<label for="phoneNo">Phone No:</label>
		<input id="inn" type="tel" id="phoneNo" value="<%=st.getPhoneNo()%>" name="phoneNo"><br><br>
		
		<label for="city">City:</label>
		<input id="inn" type="text" id="city" value="<%=st.getCity()%>" name="city"><br><br> 
		
		<input id="btn" type="submit" value="Okay">
	
	</form>
	
	</div>
	
</body>
</html>










