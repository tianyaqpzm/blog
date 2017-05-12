<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="z" uri="/WEB-INF/tld/function.tld" %>
<!DOCTYPE Html>
<html>
 <head>
  <jsp:include page="../../common/bootstrap.jsp" flush="false" />
  <script type="text/javascript" src="../../../../plugins/ueditor-1.4.3/ueditor.config.js"></script>
  <script type="text/javascript" src="../../../../plugins/ueditor-1.4.3/ueditor.all.js"></script>
     <%--
     EpicEditor 是一款可以嵌入到网页中的 JavaScript Markdown 编辑器，
     支持全屏编辑、在线预览、自动保存草稿，离线支持等等。
     对于开发人员，它提供了一个健壮的API，可以很容易定制主题并允许你灵活使用绑定的 Markdown 解析器。
     https://github.com/OscarGodson/EpicEditor/
     --%>
  <script type="text/javascript" src="../../../../plugins/epiceditor-0.2.3/js/epiceditor.min.js"></script>
 </head>
 <body style="margin-top: 50px;">
  <jsp:include page="../common/navbar.jsp" flush="false" />
  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-3 col-md-2" id="sidebar" style="padding: 0;">
        <jsp:include page="../common/sidebar.jsp" flush="false" />
      </div>
      <div class="col-sm-9 col-md-10">
        <ol class="breadcrumb header">
          <li><span class="icon glyphicon glyphicon-home"></span>主菜单</li>
          <li>文章</li>
          <li class="active">编辑文章</li>
        </ol>
       <div class="row">
         <div class="col-sm-9 col-md-9">
          <div class="panel panel-default">
            <div class="panel-heading"><span class="icon glyphicon glyphicon-edit"></span>标题/内容</div>
            <div class="panel-body">
              <input type="hidden" id="postid" value="${post.id}" />
              <input type="text" id="title" class="form-control input-md" placeholder="输入标题" value="${post.title}"><br/>
              <ul class="nav nav-tabs nav-justified" id="editor-nav">
                <li class="active"><a href="#editor-mk">Markdown</a></li>
                <li><a href="#editor-txt">纯文本</a></li>
                <li><a href="#editor-ue">UEditor</a></li>
              </ul>
              <div class="tab-content">
                <!-- EpicEditor初始化时必须为显示状态 -->
                <div class="tab-pane active" id="editor-mk"><div id="epiceditor"></div></div>

                <div class="tab-pane" id="editor-txt">
                  <textarea id="editor-txt-tt" style="width: 100%; height: 400px">${post.content}</textarea>
                </div>

                <div class="tab-pane" id="editor-ue">
                  <!-- 必须要添加width:100% -->
                  <script id="ueditor" style="width: 100%; height: 350px;" type="text/plain">${post.content}</script></div>

              </div>
            </div>
            <div class="panel-footer text-success">注:此三种编辑模式相互独立,最终以当前选中标签页内容提交</div>
           </div>
         </div>
         <div class="col-sm-3 .col-md-3">
           <div class="panel panel-default">
             <div class="panel-heading">发布</div>
             <div class="panel-body">
               <div class="form-group">
                 <label for="category">分类</label>
                 <select class="form-control" id="category">
                   <c:forEach items="${categorys}" var="category" begin="0">
                     <option value="${category.id}" ${post.category.id==category.id?'selected':''}>
                        <%--├─<c:if test="${category.parentId!=null}">└─</c:if>${category.name}--%>
                        <c:if test="${category.parentId==null}">${category.name}</c:if>
                      </option>
                   </c:forEach>
                 </select>
               </div>
               <div class="form-group">
                   <%--<lable for="控件id名">--%>
                 <label for="pstatus">公开度</label><br/>
                 <label class="radio-inline">
                    <input type="radio" name="pstatus" value="publish" ${post.pstatus=='publish'?'checked':''}>公开
                 </label>
                 <label class="radio-inline">
                    <input type="radio" name="pstatus" value="secret" ${post.pstatus=='secret'?'checked':''}>隐藏
                 </label>
               </div>
               <div class="form-group">
                 <label for="tags">标签</label>
                 <input type="text" class="form-control" id="tags" value="${z:join(post.tags,',')}" />
                 <span class="help-block">多个标签请用英文逗号（,）分开</span>
               </div>
               <div class="form-group">
                 <label for="cstatus">是否允许评论</label><br>
                 <label class="radio-inline">
                    <input type="radio" name="cstatus" value="open" ${post.cstatus=='open'?'checked':''}>是
                 </label>
                 <label class="radio-inline">
                    <input type="radio" name="cstatus" value="close" ${post.cstatus=='close'?'checked':''}>否
                 </label>
               </div>
             </div>
             <div class="panel-footer">
               <button type="button" class="btn btn-info btn-block" onclick="zblog.post.insert();">发布</button>
             </div>
           </div>
         </div>
       </div>

      </div>
    </div>
  </div>
  <script type="text/javascript" src="../../../../public/js/backend/admin.post.js"></script></body>
</html>
