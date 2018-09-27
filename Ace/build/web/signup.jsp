<%-- 
    Document   : Aboutus
    Created on : 30-Mar-2017, 07:05:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./jsp.css">
        <title>JSP Page</title>
        <style>
            
            </style>
    </head>
    <body>
       
        <nav>
            <ul>
                <li><a href="Aboutus.jsp">About Us</a></li>
                <li><a href="contactus.jsp">Contact Us</a></li>
                <li><a href="signup.jsp">Sign Up</a></li>
                </ul>
            </nav>
        <header id="header">
            </header>
        
        <div id="main">
            <h1>Registration form</h1>
            <form name="form" method="POST" enctype="multipart/form-data">
                <p>First name</p>
                <input/>
                 <p>Other name</p>
                <input/>
                
                 <p>Last name</p>
                <input/>
                
                 <p>Gender</p>
                <select>
                    
                    </select>
                
                 <p>Date Of Birth</p>
                <input/>
                
                 <p>Place Of Birth</p>
                <input/>
               
                  <p>Programming skills</p>
                <select>
                    <option>C#</option>
                    <option>C++</option>
                    <option>Objective C</option>
                    <option>Java</option>
                    <option>Pearl</option>
                    <option>PHP</option>
                    <option>Node.js</option>
                    <option>Javascript</option>
                    
                    </select>
               
            </form>
        </div>
    </body>
</html>
