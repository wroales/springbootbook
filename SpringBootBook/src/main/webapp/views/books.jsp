<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
<style>
	form:errors {
		color: red;
	}
</style>
</head>
<body>
	<h1>Books</h1>
	<form:form action="createBook" method="POST" modelAttribute="book">
		<div>
			<label>Title: </label>
			<form:input path="title" />
			<form:errors path="title"/>
		</div>
		<div>
			<label>Author: </label>
			<form:input path="author" />
			<form:errors path="author" />
		</div>
		<div>
			<input type="submit" value="Submit">
		</div>
	</form:form>
	
	
	
	<table>
		<tr>
			<td>ID</td>
			<td>Title</td>
			<td>Author</td>
		</tr>
		<c:forEach items="${allBooks}" var="book">
			<tr>
				<td>${book.bookId}</td>
				<td>${book.title}</td>
				<td>${book.author}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>