<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>XuptStaUEditor</title>
<metahttp-equiv ="pragma"content="no-cache"> <metahttp-equiv
	="cache-control"content="no-cache"> <metahttp-equiv
	="expires"content="0"> <metahttp-equiv
	="keywords"content="keyword1,keyword2,keyword3"> <metahttp-equiv
	="description"content="This is my page"> <script
	type="text/javascript" charset="utf-8" src="UEditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="UEditor/ueditor.all.min.js"></script> <script
	type="text/javascript" charset="utf-8"
	src="UEditor/lang/zh-cn/zh-cn.js"></script> <LINKrel
	=stylesheethref="ueditor/themes/default/css/ueditor.css">
</head>
<body>
	<h1>My UEditor</h1>
	<form action="/demo/publish.action" method="post">
		类别:<input type="text" name="category" /><br /> 标题:<input type="text"
			name="title" /><br />
		<script type="text/plain" id="myEditor"></script>
		<textarea name="content" id="myEditor">请输入文本文档</textarea>
		<script type="text/javascript">
			var editor = new UE.ui.Editor();
			editor.render("myEditor");
			// UE.getEditor('myEditor',{
			//    toolbars:[['FullScreen','simpleupload','Source','justifycenter', 'justifyright', 'Undo', 'Redo','Bold','test']],
			// autoClearinitialContent:true,
			//  wordCount:false,
			//  elementPathEnabled:false,
			//  initialFrameHeight:300
			// })
		</script>
		<input type="submit" value="提交" />
	</form>

</body>
</html>