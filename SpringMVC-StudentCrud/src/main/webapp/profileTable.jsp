<%@page import="com.dcl.sdb.entity.ProfileUrl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
        height: 100px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        gap: 20px;
        

        #btn {
            font-size: 20px;
            padding: 5px 15px;
            border-radius: 50px;
            background-color: brown;
            color: azure;
            cursor: pointer;
            margin-left: 70px;
            padding: 15px;
            text-decoration: none;
        }
        a:hover {
	background-color: linear-gradient(145deg, #e5bbcc, #bdf1ee);
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
<body>

	<%
	List<ProfileUrl> list = (List)request.getAttribute("profile");
	%>
	<% int id = (Integer)request.getAttribute("sid");%>
	
	<div class="table">
	<table border="1px solid black">
		<tr>
			<th style="padding: 5px">Profile id</th>
			<th style="padding: 5px">Profile name</th>
			<th style="padding: 5px">Url</th>
			<th style="padding: 5px">Update</th>
			<th style="padding: 5px">Delete</th>
		</tr>
	
		<% for(ProfileUrl p : list){ %>
			<tr>
				<td><%=p.getProfileId()%></td>		
				<td><%=p.getProfileName()%></td>		
				<td><%=p.getUrl()%></td>		
				<td><a href="findProfile?profileId=<%=p.getProfileId()%>">UPDATE</a></td>		
				<td><a href="deleteProfile?profileId=<%=p.getProfileId()%>">DELETE</a></td>		
			</tr>
		<%} %>

	</table>
	</div>
	
	
	<div class="container">
	 <a id="btn" href="addProfile.jsp?id=<%=id%>">Add Profile</a>
	 <a id="btn" href="index.jsp">Go Back</a>
	</div>
	

</body>
</html>