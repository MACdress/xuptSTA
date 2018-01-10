<%@page import="com.sun.tools.jdi.IntegerTypeImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
int begin;
int end;
try{
 begin=Integer.parseInt(request.getParameter("begin"));
 end=Integer.parseInt(request.getParameter("end"));
}catch(Exception e){
	e.printStackTrace();
}finally{
	System.out.println(begin+" "+end);
}
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>