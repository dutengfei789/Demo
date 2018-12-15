<%--
  Created by IntelliJ IDEA.
  User: du
  Date: 2018/12/12
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testTree</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min1.3.5.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min1.3.5.js"></script>
    <script  src="js/easyui-lang-zh_CN1.3.5.js" type="text/javascript"></script>

    <link href="${pageContext.request.contextPath}/themes1.3.5/icon.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/themes1.3.5/default/easyui.css" rel="stylesheet" type="text/css"/>
    <script>
        $(function () {
            $("#myTree").tree({
                // checkbox:"true",
                dnd:true,
                animate:true,
                url:"getTree.do",


            });

        });
    </script>

</head>
<body>
    <div id="myTree"></div>
</body>
</html>
