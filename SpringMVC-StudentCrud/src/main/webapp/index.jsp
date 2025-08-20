<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    *{
        margin: 0px;
        padding: 0px;
    }
    body{
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: space-around;
        gap: 150px;
        background-color: #ffddeb;
    }
    .welcome{
        width: 100%;
        height: 70px;
        text-align: center;
        text-transform: uppercase;
        padding-top: 45px;
        font-size: 20px;
        background: linear-gradient(145deg, #c45784, #72d9d2);
        box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.6);

        span{
            color: #7f2c4f;
        }
    }
    .main{
        width: 55%;
        display: flex;
        flex-direction: column;
        gap: 50px;
        
    }
    .student {
        height: 100px;
        box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.6);
        display: flex;
        align-items: center;
        justify-content: space-around;
        background: linear-gradient(145deg, #d39cb3, #98eae5);

        a{
            font-size: 20px;
            font-weight: bolder;
            text-decoration: none;
            border: 2px solid black;
            padding: 10px;
            color: rgb(0, 0, 0);
            cursor: pointer;
            border-radius: 10px;
            
        }
        a:hover{
            background-color: white;
        }

    }
</style>

<body>
    <div class="welcome">
        <h1>welcome to student <span>management system</span></h1>
    </div>

    <div class="main">
        <div class="student">

            <a href="addStudent.jsp">Add Student</a>

            <a href="displayStudent">Display Student</a>

        </div>
    </div>


</body>
</html>