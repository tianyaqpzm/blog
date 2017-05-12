<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="${g.description}" />
<%--让移动设备 响应式的显示网页，而不是以桌面尺寸显示--%>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<title>${g.title} Admin</title>
<%--<link rel="icon" href="${g.domain}/resource/img/favicon.ico" type="image/x-icon" />--%>
<link rel="stylesheet" href="../../../plugins/bootstrap-3.3.7/css/bootstrap.css">
<%--<link rel="stylesheet" href="${g.domain}/resource/Font-Awesome-3.2.1/css/font-awesome.min.css">--%>
<link rel="stylesheet" href="../../../public/css/backend.css">

<script src="../../../public/js/jquery-3.2.1.js"></script>
<script src="../../../plugins/bootstrap-3.3.7/js/bootstrap.js"></script>
<%--<script src="${g.domain}/resource/js/jquery.cookie.js"></script>--%>
<script src="../../../public/js/backend/zblog.admin.js"></script>