<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<script src="./common/js/jquery-2.1.4/jquery-1.8.0.min.js"></script>
<script src="./common/js/jquery-2.1.4/layer/layer.js"></script>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
function find() {
	$.ajax({
		type : "post",
		url : "find.do",
		data:$("#findForm").serialize(),
		dataType: "json",
		success : function(result) {
			if (result == "successed") {
				layer.msg(result), setTimeout(function() {
					window.location = "showlist.do";
				}, 150);
			} else {
				layer.msg(result), setTimeout(function() {
					window.location = "index.jsp";
				}, 1500);
			}
		}
	});
}
</script>
</head>
<body>
<div id="content">
   <form id="findForm" method="post">
		<input type="text" name="username" placeholder="用户名"/>
		<input type="password" name="password" placeholder="密码"/>
		<input type="button" onclick="find()" value="login"/>
    </form>
</div>
</body>
</html>