<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


	<!-- General meta information -->
	<title>注册页面</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta name="robots" content="index, follow" />
	<meta charset="utf-8" />
	<!-- // General meta information -->
	
	
	<!-- Load Javascript -->
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/jquery.query-2.1.7.js"></script>
	<script type="text/javascript" src="./js/rainbows.js"></script>
	<!-- // Load Javascipt -->

	<!-- Load stylesheets -->
	<link type="text/css" rel="stylesheet" href="css/style.css" media="screen" />
	<!-- // Load stylesheets -->
	
<script>


	$(document).ready(function(){
 
	$("#submit1").hover(
	function() {
	$(this).animate({"opacity": "0"}, "slow");
	},
	function() {
	$(this).animate({"opacity": "1"}, "slow");
	});
 	});


</script>
	
</head>
<body>

	<div id="wrapper">
		<div id="wrappertop"></div>

		<div id="wrappermiddle">

			<h2>用户注册</h2>
			<form action="reg">
			<div id="username_input">

				<div id="username_inputleft"></div>

				<div id="username_inputmiddle">
				
					<input type="text" name="username" id="url" value="请输入用户名" onclick="this.value = ''">
					<img id="url_user" src="./images/mailicon.png" alt="">
				
				</div>

				<div id="username_inputright"></div>

			</div>

			<div id="password_input">

				<div id="password_inputleft"></div>

				<div id="password_inputmiddle">
				
					<input type="text" name="password" id="url" value="请输入密码" onclick="this.value = ''">
					<img id="url_password" src="./images/passicon.png" alt="">
				
				</div>

				<div id="password_inputright"></div>

			</div>

			<div id="submit">
				
				<input type="image" src="./images/submit_hover_zc.png" id="submit1" value="Sign Up">
				<input type="image" src="./images/submit_zc.png" id="submit2" value="Sign Up">
				</form>
			</div>
			

		

			<div id="links_right"><a href="./login.jsp">返回登录</a></div>

		</div>

		<div id="wrapperbottom"></div>
		
		<div id="powered">
	
		</div>
	</div>

</body>
</html>