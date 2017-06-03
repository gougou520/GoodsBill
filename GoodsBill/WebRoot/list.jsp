<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <form action="GoodsAction" method="post">
     <table align="center" width="" height="" border="0" cellpadding="0" cellspacing="0">
       <tr height="40px" align="center">
         <td>请选择区域：

           <select name="type">
          
 			 <option value="1">朝阳区订单</option>
             <option value="2">海淀区订单</option>
             <option value="3">丰台区订单</option>
             <option value="4">西城区订单</option>
             <option value="5">昌平区订单</option>
           </select>
           <input type="text" name="str" value=""/>
           <input type="submit" value="提交"/>
         </td>
       </tr>
     </table>
   </form>
   <table align="center" width="" height="" border="1" cellpadding="0" cellspacing="0">
     
      <tr height="40" align="center">
       <td width="100">商品编号</td>
       <td width="300">商品名称</td>
       <td width="300">商品价格</td>
       <td width="300">库存数量</td>
       <td width="300">订单状态</td>
       <td width="300">操作</td>
     </tr>
	 <s:iterator value="list" var="goods" status="status">
	      <tr height="40" align="center">
		       <td><s:property value="goods.id"/></td>
		       
		   </tr>
	  </s:iterator>
	  <tr align="center" >
         <td colspan="5"><strong><s:property value="#session.mess"/></strong></td>
       </tr>
     <s:if test="list.size==0">
       <tr align="center" >
         <td colspan="5"><strong>没有找到相关内容</strong></td>
       </tr>
     </s:if>
   </table>
  </body>
</html>
