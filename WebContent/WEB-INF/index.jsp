<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="java.util.List"%>
<%@ page import="com.assignments.assignment2.*"%>

<!DOCTYPE HTML>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Kerem Balcan - Book List</title>

<spring:url value="/resources/css/style.css" var="styleCss" />
<spring:url value="/resources/css/normalize.css" var="normalizeCss" />
<spring:url value="/resources/js/index.js" var="indexJS" />



<link href="${styleCss}" rel="stylesheet" />
<link href="${normalizeCss}" rel="stylesheet" />


<script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
 <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  <script src="${indexJS}"></script>

</head>




<body class="content">

<div class="header">
		<div class="wrap">
		      <header id="topnav">
			        <nav>
			        		 <ul>
			        		 	<li class="active"><a href="/assignment2/" class="scroll">Book List</a></li>
								<li><a href="addBook.html" class="scroll">Add Book</a></li>								
								<div class="clear"> </div>
							</ul>
		        	</nav>
					
			         
			        	<a href="#" id="navbtn">Nav Menu</a>
			        <div class="clear"> </div>
		        </header>
		    </div>
		</div>

    <h1>Book Lists</h1>
<table class="rwd-table">
  <tr>
    <th>Book Name</th>
    <th>Author</th>
    <th>ISBN</th>
    <th>Price</th>
  </tr>
  <%
  List<Book> booklist =  (List<Book>) request.getAttribute("booklist");
  for(Book book: booklist)
  {
	  
  
  %>
  
 <tr><td>
				
				<%=book.getBookName()
				
				%>
				</td>
				<td>
				
				<%=book.getAuthor()
				
				%>
				</td>
				<td>
				
				<%=book.getISBN()
				
				%>
				</td>
				<td>
				
				<%=book.getPrice() + "₺"
				
				%>
				</td>
  </tr>
  
  <%
  }
  %>
</table>



</body>
</html>