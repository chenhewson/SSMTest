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
function watch(id,username) {
	var id = id;
	var username=username;
	$.ajax({
		type : "post",
		url : "watch.do",
		data : {
			"id" : id,
			"username":username
		},
		dataType : "json",
		success : function(result) {
			if (result == "Success") {
				layer.msg(result), setTimeout(function() {
					window.location = "showlist.do";
				}, 150);
			} else {
				layer.msg(result), setTimeout(function() {
					window.location = "showlist.do";
				}, 150);
			}
		}
	});
}

	function deletebyid(id) {
		var id = id;
		$.ajax({
			type : "post",
			url : "delete.do",
			data : {
				"id" : id
			},
			dataType : "json",
			success : function(result) {
				if (result == "Success") {
					layer.msg(result), setTimeout(function() {
						window.location = "showlist.do";
					}, 150);
				} else {
					layer.msg(result), setTimeout(function() {
						window.location = "showlist.do";
					}, 150);
				}
			}
		});
	}
	

	function adduser() {
		$.ajax({
			type : "post",
			url : "add.do",
			data:$("#addForm").serialize(),
			success : function(result) {
				if (result == "Success") {
					layer.msg(result), setTimeout(function() {
						window.location = "showlist.do";
					}, 150);
				} else {
					layer.msg(result), setTimeout(function() {
						window.location = "showlist.do";
					}, 150);
				}
			}
		});
	}
</script>
</head>
<body>
	<form id="searchForm" action="search.do" method="post">
		<input type="text" name="infomation" placeholder="输入用户名或id" /> <input
			type="submit" value="搜索" />
	</form>
	<form id="searchForm"  method="post">
		<input type="submit" onclick="" value="我的关注" />
	</form>
	<table border="2" align="center" text-align="center">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>PassWord</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${list}" var="item" varStatus="st">
			<c:if test="${st.count%2 eq 1}">
				<tr bgcolor="#F2F2F2" border-color="#666666">
					<td>${item.id}</td>
					<td>${item.username}</td>
					<td>${item.password}</td>
					<td><a href="javascript:void(0);"
						onclick="deletebyid('${item.id}')">删除</a></td>
					<td><a href="javascript:void(0);"
						onclick="watch('${item.id}','${item.username}')">关注</a></td>
					<td><a href="javascript:void(0);"
						onclick="updata('${item.id}')">修改</a></td>
				</tr>
			</c:if>

			<c:choose>
				<c:when test="${st.count%2 eq 0}">
					<tr>
						<td>${item.id}</td>
						<td>${item.username}</td>
						<td>${item.password}</td>
						<td><a href="javascript:void(0);"
							onclick="deletebyid('${item.id}')">删除</a></td>
						<td><a href="javascript:void(0);"
							onclick="watch('${item.id}','${item.username}')">关注</a></td>
						<td><a href="javascript:void(0);"
							onclick="updata('${item.id}')">修改</a></td>
					</tr>
				</c:when>
			</c:choose>
		</c:forEach>
	</table>
	<form id="addForm" method="post">
		<input type="text" name="username" placeholder="用户名" /> <input
			type="password" name="password" placeholder="密码" /> <input
			type="submit" onclick="adduser()" value="新增" />
	</form>
</body>
</html>