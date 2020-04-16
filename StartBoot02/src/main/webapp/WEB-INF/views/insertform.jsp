<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글작성</h1>
	<form action="insert" method="post">
	<table border="1">
		<tr>
			<th>작성자</th>
			<td><input type="text" name="myname"></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="mytitle"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>
				<textarea rows="10" cols="60" name="mycontent"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="제출">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>