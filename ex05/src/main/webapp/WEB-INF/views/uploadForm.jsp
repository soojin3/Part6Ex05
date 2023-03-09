<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>파일을 업로드 하는 방법</h3>
<form action="uploadFormAction" method="post" enctype="multipart/form-data">
하고싶은 말<input type="text" name="str"><br>
업로드할 파일<input type="file"  multiple name="file1"><br>
<input type="submit" value="전송">

</form>
</body>
</html>