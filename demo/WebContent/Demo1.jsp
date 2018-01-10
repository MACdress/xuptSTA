<%@page import="java.util.Scanner"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
Scanner sc=new Scanner(System.in);
int begin=sc.nextInt();
int end=sc.nextInt();
int sum=0;
for(int i=begin;i<=end;i++){
	if(i%4==0 || i%400==0&&i%100!=0){
		sum++;
	}
}
%>
</head>
<body>
	<a>从<%=begin %>年到<%=end %>年一共有<%=sum %>个润年</a>

</body>
</html>