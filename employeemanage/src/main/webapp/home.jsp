<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
      Dash Board
   </title>

<style> 
  body{
background-size: 100% 100%;
background-color: #e6fff7}

 
button { 
        background-color: #1ab2ff; 

        width: 70%;
        color: white; 
        padding: 15px; 
        margin: 10px 55px; 
        border: none; 
        cursor: pointer; 
         align= center; font-size:200%;
         } 

 h2{font-size:20}
 form { 
    } 
 input[type=text], input[type=password] { 

        width: 100%; 
        margin: 8px 0;
        padding: 12px 20px; 
        display: inline-block; 
        border: 2px #002966; 
        box-sizing: border-box; 
    }
 button:hover { 
        opacity: 0.7; 
    } 
  .cancelbtn { 
        
        padding: 10px 18px;
        margin: 10px 5px;
    } 
      
   
 .container { 
        
        border: 3px solid  #66ffcc;
        margin-top: 40px;
        margin-bottom: 40px;
        margin-right: auto;
        margin-left: auto;
        padding: 25px;
        background-color: #FFFFFF;  
        max-width: 450px;
        opacity: 1.0;
         border-radius: 25px;
        
    } 
  
    
</style> 

</head>

<body>
   <h1 align="center"; style="font-family:Arial;color:#ff1a1a;text-shadow: 2px 2px 5px red;">Employee Management System</h1>
         
        <div class="container" >
 
            <form action="" >
              
            <button onclick="window.location.href='cre';return false;";>New Employee</button> 

           <button onclick="window.location.href='ser';return false;";>Search</button>
            <button onclick="window.location.href='upd';return false;";>Update</button>
             <button onclick="window.location.href='del';return false;";>Delete</button>
         
            </form>

           
        </div> 

       
 

</body>
</html>