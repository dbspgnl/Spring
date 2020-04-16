<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글내용</h1>
	<table border="1">
		<tr>
			<th>작성자</th>
			<td><input type="text" name="myname">${dto.myname }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="mytitle">${dto.mytitle }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>
				<textarea rows="10" cols="60" name="mycontent">${dto.mycontent }</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="제출">
			</td>
		</tr>
	</table>

</body>
</html>