<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>用户注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link type="text/css" rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
<!--header-->
<jsp:include page="header.jsp"/>
<!--//header-->

<div class="page-header" align="center">
<h1>注册新用户</h1></div>
<form style="margin:0px 500px;">
    <div class="form-group" >
        <label for="exampleInputEmail1">用户名*</label>
        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="请输入用户名">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">邮箱*</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入邮箱">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">密码*</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入密码">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">收件人</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入收件人">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">收货电话</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入收货电话">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">收货地址</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入收货地址">
    </div>
</form>
<p align="center">
    <button type="button"  class="btn btn-primary btn-lg">提交</button>

</p>



<!--//account-->
<!--footer-->
<jsp:include page="footer.jsp"/>
<!--//footer-->
</body>
</html>