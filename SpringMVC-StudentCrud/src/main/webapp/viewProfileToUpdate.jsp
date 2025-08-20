<%@page import="com.dcl.sdb.entity.ProfileUrl"%>
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
<body>

	<%ProfileUrl pr = (ProfileUrl)request.getAttribute("profileInfo"); %>
	
	<%int studentId =  (Integer)request.getAttribute("stid");%>
	
	<div class="container">
		<form action="updateProfile?studentId=<%=studentId %>" method="post">
		
			<label for="id">Profile ID:</label>
			<input id="inn" type="number" value="<%=pr.getProfileId()%>" name="profileId" readonly="readonly"><br><br>
			
			<label for="id">Profile Name:</label>
			<input id="inn" type="text" value="<%=pr.getProfileName()%>" name="profileName"><br><br>
			
			<label for="id">Profile Url:</label>
			<input id="inn" type="text" value="<%=pr.getUrl()%>" name="url"><br><br>
			
			<input id="btn" type="submit">
			
		
		</form>
	</div>

</body>
</html>