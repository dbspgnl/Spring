<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JOIN</h1>
	<form action="joinres.do" method="post">
	<table>
		<tr>
			<th>이름</th>
			<td><input type="text" name="membername"></td>
		</tr>
		<tr>
			<th>ID</th>
			<td><input type="text" name="memberid"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="password" name="memberpw"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="join">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>