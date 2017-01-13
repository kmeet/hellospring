<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Hello Search</title>
	</head>
	<body>
		<spring:url value="/search" var="userActionUrl" />
		<form:form class="form-horizontal" method="post" modelAttribute="searchForm" action="${userActionUrl}">
			Search for:	<input type="text" name="searchText" value="${searchText}"/>
			<br/>
			<input type="submit" value="Search" />
			<br/> <br/>
			You searched for: <input type="text" value="${searchCommand.searchText}" readonly="readonly"/>
		</form:form>
	</body>
</html>