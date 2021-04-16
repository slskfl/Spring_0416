<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
	<table border="1"> 
		<tr> 
			<th>아이디</th> 
			<th>비밀번호</th> 
			<th>이름</th> 
			<th>성별</th>
			<th>이메일</th> 
			<th>가입일</th> 
			<th>삭제</th> 
		</tr>
		<tr> 
			<td></td> 
			<td></td> 
			<td></td>
			<td></td> 
			<td></td> 
			<td></td>
			<td></td> 
		</tr>
		<tr>
			<td colspan="7" style="text-align:right"> 
				<form method="post" action="/member/memberForm.do"> 
					<input type="hidden" name="method" value="addMember.do"/>
					<input type="submit" value="가입 완료"/>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>