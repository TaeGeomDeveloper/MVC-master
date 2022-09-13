<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-09-13
  Time: 오후 2:21
  To change this template use File | Settings | File Templates.
--%>

<%--<Context docBase="E:\\DEV\\Image" path="/Image" reloadable="true"/>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Output</title>

    <style type="text/css">

        table, th, td {
            border: 5px solid black;
        }
    </style>

</head>
<body>
<h1>Output</h1>

    <table>
        <tr>
            <td rowspan="4"><img src="/Image/abc.jpg" alt="책" width="300" height="300"></td>
        </tr>
        <tr>
            <th>제목 : <%="아무것도 없는 책"%></th>
        </tr>
        <tr>
            <th>저자 : <%="홍길동"%></th>
        </tr>
        <tr>
            <th>가격 : <%="40000"%></th>
        </tr>
        <tr>
            <th colspan="2">확인</th>
        </tr>
    </table>

</body>
</html>
