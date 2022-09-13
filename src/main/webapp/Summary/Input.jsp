<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-09-13
  Time: 오후 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input</title>
</head>
<body>
<h1>Input</h1>
<a href="output.do"> 결과 페이지로</a>

<from action="output.do" method="post" enctype="multipart/form-data">

    <table>
        <tr>
            <td>
                도서제목
            </td>
            <td><input type="text" name="bookTitle"></td><td></td>
        </tr>
        <tr>
            <td>
                저자
            </td>
            <td><input type="text" name="bookAuthor"></td><td></td>
        </tr>
        <tr>
            <td>
                가격
            </td>
            <td><input type="text" name="bookPrice"></td><td></td>
        </tr>
        <tr>
            <td>
                이미지
            </td>
            <td><input type="file" name="bookImage"></td><td></td>
        </tr>
<%--        <tr>--%>
<%--            <td>--%>
<%--                첨부파일--%>
<%--            </td>--%>
<%--            <td><input type="file" name="bookAttachments"></td><td></td>--%>
<%--        </tr>--%>
        <tr>
            <td>
                <input type="submit" value="도서 등록">
            </td>
            </td><td></td>
        </tr>
    </table>

</from>


</body>
</html>
