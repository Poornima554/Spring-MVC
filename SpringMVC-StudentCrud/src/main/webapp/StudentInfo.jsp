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
	background-color: #ffddeb;
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
        padding: 20px 0px;
        background: linear-gradient(145deg, #d39cb3, #98eae5);
        backdrop-filter: blur(8px);


        #inn {
            font-size: 20px;
            padding: 5px 5px;
            text-align: center;
            border-radius: 15px;
            margin-left: 20px;
            margin-top: 4px;
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
	<h1>STUDENT INFORMATION</h1>
	<div class="container">
		
		<label for="id">Student ID:</label>
		<input id="inn" type="number" value="<%=st.getId()%>" name="id" readonly="readonly"><br><br> 
		
		<label for="firstName">First Name:</label>
		<input id="inn" type="text" id="firstName" value="<%=st.getFirstName()%>" name="firstName" readonly="readonly"><br><br> 
		
		<label for="lastName">Last Name:</label>
		<input id="inn" type="text" id="lastName" value="<%=st.getLastName()%>" name="lastName" readonly="readonly"><br><br> 
		
		<label for="email">Email:</label>
		<input id="inn" type="email" id="email" value="<%=st.getEmail()%>" name="email" readonly="readonly"><br><br> 
		
		<label for="phoneNo">Phone No:</label>
		<input id="inn" type="tel" id="phoneNo" value="<%=st.getPhoneNo()%>" name="phoneNo" readonly="readonly"><br><br>
		
		<label for="city">City:</label>
		<input id="inn" type="text" id="city" value="<%=st.getCity()%>" name="city" readonly="readonly"><br><br> 
		
		<a id="btn" href="find-all-profiles?studentId=<%= st.getId()%>">Profile Urls</a>
		<a id="btn" href="index.jsp">Go Back</a>
	
	</div>
	
</body>
</html>










