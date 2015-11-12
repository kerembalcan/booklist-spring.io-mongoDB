<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="java.util.List"%>
<%@ page import="com.assignments.assignment2.*"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Kerem Balcan - Book List</title>

<spring:url value="/resources/css/style.css" var="styleCss" />
<spring:url value="/resources/css/normalize.css" var="normalizeCss" />
<spring:url value="/resources/js/index.js" var="indexJS" />



<link href="${styleCss}" rel="stylesheet" />
<link href="${normalizeCss}" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600' rel='stylesheet' type='text/css'>

<script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  <script src="${indexJS}"></script>

</head>

<body>

<div class="header">
		<div class="wrap">
		      <header id="topnav">
			        <nav>
			        		 <ul>
			        		 	<li><a href="/assignment2/" class="scroll">Book List</a></li>
								<li class="active"><a href="addBook.html" class="scroll">Add Book</a></li>								
								<div class="clear"> </div>
							</ul>
		        	</nav>
					
			         
			        	<a href="#" id="navbtn">Nav Menu</a>
			        <div class="clear"> </div>
		        </header>
		    </div>
		</div>
		
		
		
		 <div  class="contact" id="contact">
		 	<div class="contact">
		 		<h3>Add New Books</h3>
		 		<p> Fill the required fields to add a new book.</p>
		 		<div class="wrap">
		 			<div class="con">
				  			<form method="post" action="/assignment2/">
				  					<input type="text"  placeholder="Book Name" name="bookName"/> 
							    	<input type="text"   placeholder="Author" name="author"/>
							    	<input type="text"   placeholder="ISBN" name="ISBN"/>
							    	<input type="text"   placeholder="Price" name="price"/>
										<div class="clear"> </div>
								   
									 <div class="con-button">
											<input type="submit" value="Save" >
									</div>
							</form>
						</div>
						 <div class="clear"> </div>
					 
				</div>
		 	</div>
		 </div>

</body>
</html>