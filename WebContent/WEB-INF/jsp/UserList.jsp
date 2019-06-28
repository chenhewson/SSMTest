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
	<title>Insert title here</title>
	<script type="text/javascript">
    function add(){
    	//查看是否取到用户名称
     /*  alert(tf);
      console.log(tf); */
      $.ajax({
			type:"post",
			url:"add.do",
			data:$("#addForm").serialize(),	
			success:function(result){
				layer.msg(result),setTimeout(3000);	     
			}
		}); 
    }
    	
    </script>
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

   <form id="DeleteForm" action="delete.do" method="post">
		<input type="text" name="id" placeholder="要删除的ID"/>
		<input type="submit" value="删除"/>
    </form>



   <form id="addForm" method="post" >
		<input type="text" name="username" placeholder="用户名"/>
		<input type="password" name="password" placeholder="密码"/>
		<input type="submit" Onclick="add()" value="新增"/>
    </form>

</body>
</html>