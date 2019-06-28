<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<tr>用户列表</tr>
<c:forEach items="${list}" var="item" varStatus="status">


<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>PassWord</th>
</tr>
<tr>
<td>${item.id}</td>
<td>${item.username}</td>
<td>${item.password}</td>

</tr>
</table>
</c:forEach>
<div id="delete">
   <form action="delete.do" method="post">
		<input type="text" name="id" placeholder="要删除的ID"/>
		<input type="submit" value="删除"/>
    </form>
</div>

<div id="add">
   <form action="" method="post">
		<input type="text" name="username" placeholder="用户名"/>
		<input type="password" name="password" placeholder="密码"/>
		<input type="submit" onclick="" value="新增"/>
    </form>
</div>
</body>
</html>