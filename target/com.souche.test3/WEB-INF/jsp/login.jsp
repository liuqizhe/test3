<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head></head>
	<body>
		<!-- '/'表示http://localhost:8088/ -->
		 <form:form action="/test3/login/login3.from" method="post" commandName="user">

			 <form:errors path="*"/><br/>

			用户名：<input type="text" name="username"/><br/>
			密码：<input type="password" name="password"/><br/>
			<input type="submit" value="提交"/>
		</form:form>
	</body>
</html>