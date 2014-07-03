<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GameServer</title>
<%
	    String path = request.getContextPath();
	    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<script type="text/javascript" src="<%=basePath%>/content/js/jquery-1.7.1.js"></script>
</head>
<body>
	
    <select class="js_select" style="width:100px;">
    	<option value="0">请选择</option>
        <c:forEach items="${gameList}" var="game">
           	<option value="${game.code}">${game.game}</option>
        </c:forEach>
    </select>           	           	
    <div class="js_table"></div>
</body>
<script>
	$(function(){
		$(".js_select").change(function(){
			var jscode=$(this).val();
			$.ajax({				
				type:"post",
				url:"/app/gameServerController/serverlist",
				data:{code:jscode},
				success:function(d){
				    var data = eval(d);
					if(data != null || data.length != 0){
						 var str = "<table cellpadding='0' cellspacing='0' style='border-bottom:1px solid #DFDFDF;' width='100%'>"
                             + "<thead><tr>"
                             + "<td style='width:15%;'>服务器编号</td>"
                             + "<td>游戏编号</td>"
                             + "<td>服务器名称</td></tr></thead>";
						for(var i = 0;i<data.length;i++)
						{
							str += "<tr><td>" + data[i].id
							 	+ "</td><td>" + data[i].gameCode
							 	+ "</td><td>" + data[i].name
							    + "</td></tr>";
						}
						str += "</table>";
						$(".js_table").html(str);
					}
					else{
						alert("未知错误！");
					}
				}
			});
		});
		
	});
</script>


</html>




