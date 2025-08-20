<%@page import="com.dcl.sdb.entity.StudentEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body{
        display: flex;
        flex-direction: column;
        align-items: center;
        gap: 40px;
        padding: 30px;
        background-color: #ffddeb;
    }
    .container {
        width: 25%;
        height: 150px;
        border: 2px solid black;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        gap: 20px;
        background: linear-gradient(145deg, #d39cb3, #98eae5);

        #inn {
            font-size: 20px;
            padding: 10px 5px;
            text-align: center;
            border-radius: 15px
        }

        #btn {
            font-size: 20px;
            padding: 5px 15px;
            border-radius: 50px;
            background-color: brown;
            color: azure;
            cursor: pointer;
            margin-left: 70px;
        }
    }
    .table{
        background: linear-gradient(145deg, #e5bbcc, #bdf1ee);
        th{
            padding: 10px;
            font-size: 25px;
            text-transform: capitalize;
            font-weight: bolder;
        }
        td{
            padding: 10px;
            font-size: 20px;
            font-weight: bold;
        }
    }
</style>
</head>
<body>

	<%
	List<StudentEntity> list = (List)request.getAttribute("key");
	%>
	
	<div class ="container">
		<form action="Student-info" method="get">
		<input id="inn" type="text" placeholder="Enter student id" name="id" required="required"><br><br>
		<button id="btn" type="submit">Submit</button>
	</form>
	</div>
	
	<div class="table">
	<table border="1px solid black">
		<tr>
			<th style="padding: 5px">Student id</th>
			<th style="padding: 5px">First name</th>
			<th style="padding: 5px">Last name</th>
			<th style="padding: 5px">Email</th>
			<th style="padding: 5px">Phone num</th>
			<th style="padding: 5px">City</th>
			<th style="padding: 5px">View</th>
			<th style="padding: 5px">Update</th>
			<th style="padding: 5px">Delete</th>
		</tr>
	
		<% for(StudentEntity st : list){ %>
			<tr>
				<td><%= st.getId()%></td>		
				<td><%= st.getFirstName()%></td>		
				<td><%= st.getLastName()%></td>		
				<td><%= st.getEmail()%></td>		
				<td><%= st.getPhoneNo()%></td>		
				<td><%= st.getCity()%></td>		
				<td><a href="find-all-profiles?studentId=<%= st.getId()%>">VIEW</a></td>		
				<td><a href="find-by-id?studentId=<%= st.getId()%>">UPDATE</a></td>		
				<td><a href="delete-by-id?studentId=<%= st.getId()%>">DELETE</a></td>		
			</tr>
		<%} %>

	</table>
	</div>
<a id="btn" href="index.jsp">Go Back</a>

</body>
</html>