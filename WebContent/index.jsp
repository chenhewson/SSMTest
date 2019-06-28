<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="./common/js/jquery-2.1.4/jquery-1.8.0.min.js"></script>
    <script src="./common/js/jquery-2.1.4/layer/layer.js"></script>
    <title>登录</title>
    <!-- 注意开始的首页不能在WEB-INF下面的文件夹中,除非经过特殊处理这是默认的方式，但是不安全不建议采用 -->
    <script type="text/javascript">
    function login(){
    	//查看是否取到用户名称
    console.log("fuck");
     /*  alert(tf);
      console.log(tf); */
      $.ajax({
			type:"post",
			url:"find.do",
			data:$("#myForm").serialize(),	
			success:function(result){  					
				//追加默认还原
				
				layer.msg(result),setTimeout(
	    				3000		
	    			);	     
			}
		}); 
    }
    	
    </script>
</head>
<body >
<div id="content">
   <form action="find.do" method="post">
		<input type="text" name="username" placeholder="用户名"/>
		<input type="password" name="password" placeholder="密码"/>
		<input type="submit" onclick="" value="login"/>
    </form>
</div>
</body>
</html>