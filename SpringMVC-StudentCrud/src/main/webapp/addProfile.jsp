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
<h1 id="head">Add Profile Information</h1>
<% int id = Integer.parseInt(request.getParameter("id")); %>

	<div class="container">
		<form action="addProfile" method="post">
			<input id="inn" type="number" value="<%= id %>" name="id"><br><br>
			<input id="inn" type="text" placeholder="Profile name" name="profileName"> <br><br>
			<input id="inn" type="text" placeholder="Profile url" name="url"> <br><br>
			<input id="btn" type="submit"> <br><br>
		</form>
	</div>

</body>
</html>