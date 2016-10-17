<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.mycompany.myapp.general.FactoryDao"%>
<%@ page import="com.mycompany.myapp.dao.DeveloperDao"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mycompany.myapp.models.Developer"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/css/style.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello page</title>
</head>
<body>
	<div class="cssDivHello">
		Hello ${user.name}<br/>
		Your password: ${user.password}
	</div>
	
	<%-- <% 
		FactoryDao factory = FactoryDao.getInstance();
		DeveloperDao developerDao = factory.getDeveloperDao();
		
		List<Developer> developers = developerDao.getDevelopers();
		
		for (Developer developer : developers) {
			%>
		<%=	developer.getId() %>
		<%=	developer.getName() %>
		<%=	developer.getSpecialty() %>
		<%=	developer.getSalary() %>
	<% 	} %> --%>
	
	 <% 
		FactoryDao factory = FactoryDao.getInstance();
		DeveloperDao developerDao = factory.getDeveloperDao();
		
		Developer developer = developerDao.getDeveloper(1);
		
		
			%>
		<%=	developer.getId() %>
		<%=	developer.getName() %>
		<%=	developer.getSpecialty() %>
		<%=	developer.getSalary() %>
	
	
	
</body>
</html>