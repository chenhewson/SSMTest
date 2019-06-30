<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./common/js/jquery-2.1.4/jquery-1.8.0.min.js"></script>
<script src="./common/js/jquery-2.1.4/layer/layer.js"></script>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
function nowatchbyid(id) {
	$.ajax({
		type : "post",
		url : "nowatch.do",
		data:{"nowatchid":id},
		dataType:"json",
		success : function(result) {
			if (result == "Success") {
				layer.msg(result), setTimeout(function() {
					window.location = "Mywatch.do";
				}, 150);
			} else {
				layer.msg(result), setTimeout(function() {
					window.location = "Mywatch.do";
				}, 150);
			}
		}
	});
}
</script>
</head>
<body>
<div align="center">
<strong>我的关注列表</strong>
	<table border="2" align="center" text-align="center">
		<tr>
			<td>ID</td>
			<td>UserName</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${MyWatchList}" var="item" varStatus="st">
			<c:if test="${st.count%2 eq 1}">
				<tr bgcolor="#F2F2F2" border-color="#666666">
					<td>${item.id}</td>
					<td>${item.username}</td>
					<td><input type="button" onclick="nowatchbyid('${item.id}')" value="取消关注"></td>
				</tr>
			</c:if>

			<c:choose>
				<c:when test="${st.count%2 eq 0}">
					<tr>
						<td>${item.id}</td>
						<td>${item.username}</td>
						<td><input type="button" onclick="nowatchbyid('${item.id}')" value="取消关注"></td>
					</tr>
				</c:when>
			</c:choose>
		</c:forEach>
	</table>
</div>
</body>
</html>

