<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>  Update </title>

<style>



.container1 { 
        box-shadow: 10px 10px 5px #1ab2ff;
        border-radius: 25px;
        background-color: #FFFFFF;
        border: 3px solid #1ab2ff;
        margin-left: auto;
        margin-right: auto;
        margin-top: 30;
        
        padding: 25px;
        max-width: 400px;
        min-width: 400px;
        opacity: 1.0;

        
    } 



hh{
    margin-left:10;}
 
hf{font-size:20;
    }

hg{font-size:20;
    font-weight: bold;
    margin-left:10;}
 



.ali { 
         font-style: bold;
         font-family: Times New Roman;
         
       }


h4{
   text-shadow: 2px 2px silver;
    margin: 40px 0px 0px 0px;
     font-size:30;
    font-style: bold;
    text-align: center;
  font-family: "Times New Roman", Times, serif;

}
 
button { 
        
        align-items: center;
        background-color: #1ab2ff; 
        width: 60%;
        color: white; 
        padding: 15px; 
        margin: 20px 50px 20px 90px;
        border: none; 
        cursor: pointer; 
        align= center; font-size:100%;
         } 


input[type=text], input[type=password],  input[type=email],  input[type=date], input[type=number] { 
        width: 80%; 
        margin: 8px 30px;
        border: 2px ; 
        height: 40px;
        padding: 12px 20px; 
        display: inline-block; 
         
        box-sizing: border-box; 
    }
 
button:hover { 
        opacity: 0.7; 
    } 

body{
background-size: 100% 100%;
background-color: #e6fff7}



</style>

</head>

<body >
  
 <h1 align="center"; style="font-family:Arial;color:#ff1a1a;text-shadow: 2px 2px 5px red;">Employee Management System</h1>

     <form action="ser" method="POST">
        
     <div class="ali" >
         
        <div class="container1" >
 
             <h1 align="center"; style="font-family:Arial;color:#ff1a1a;text-shadow: 2px 2px 5px red;"> Employee Details</h1>
            <label ><hg>ID NO.  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${eid}  <br>

            

            <br><label ><hg>First Name  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${fn}  <br>

            <br><label ><hg>Last Name  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${ln}  <br>

            
    
                         
            <br><label ><hg>Qualification  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${quali}	<br>

            
            
            <br><label ><hg>Designation  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${desig}	<br>

            
            
            <br><label ><hg>Salary Package  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;  </hg></label> ${sal}	<br>

            
            
            <br> <label ><hg>Blood Group  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${bg} 	<br>

            
            
            <br><label ><hg>D.O.B  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${dob}	<br>

            
            
            <br><label ><hg>Age  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${age}	<br>

            
            <br><label ><hg>Gender  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; </hg></label> ${gen}	<br>

           
            
            
            <br><label ><hg>Mobile Number  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</hg></label>${mn}	<br>

            
            <br> <label ><hg>E-mail  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;  </hg></label> ${em}	<br>

           
            
           <br> <label ><hg>Address  :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</hg></label> ${add}	

           

             
            <br><button type="submit" align="center">Return Search</button> <br>
            <center style="color:#ff0000;"> <a href='hh'>go to home ! </a> </center>

            
       </div>
   
      
</div> 

</form>
</body>
</body>
</html>