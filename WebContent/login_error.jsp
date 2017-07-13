<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
<%@ taglib uri="/struts-tags"  prefix="s"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style type="text/css">

body{
	height: 100%;
	position: relative;
	font-family: Arial, Helvetica, sans-serif;
	color: #888;
	font-size: 13px;
	line-height: 20px;
	min-width: 998px;

	background:url(../images/BG.jpg) ;
}

</style>

<title>登录失败</title>



</head>
<body>

<center>
<h1>登录失败</h1>  <br/>

<h3> <s:fielderror fieldName="loginError"></s:fielderror> </h3>

<form action="login">
<input type="submit" value="重新登录">

</form>


</center>

</body>

</html>