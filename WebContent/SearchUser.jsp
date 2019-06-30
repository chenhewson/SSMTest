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
</head>
<body>
	<div align="center">
	<strong>搜索结果</strong><br>
	<table border="2" align="center" text-align="center">
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>PassWord</td>
			</tr>

			<c:forEach items="${searchlist}" var="item" varStatus="st">
				<c:if test="${st.count%2 eq 1}">
					<tr bgcolor="#d3d7d4" border-color="#666666">
						<td>${item.id}</td>
						<td>${item.username}</td>
						<td>${item.password}</td>
					</tr>
				</c:if>

				<c:choose>
					<c:when test="${st.count%2 eq 0}">
						<tr>
							<td>${item.id}</td>
							<td>${item.username}</td>
							<td>${item.password}</td>
						</tr>
					</c:when>
				</c:choose>
			</c:forEach>
		</table>
		</div>
</body>
</html>