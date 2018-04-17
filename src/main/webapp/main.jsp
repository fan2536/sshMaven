<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>得到数据</title>
</head>
<body>
<table>
<tbody>
	<tr>
		<td>${customer.custId}</td>
		<td>${customer.custName}</td>
		<td>${customer.custUserId}</td>
		<td>${customer.custCreateId}</td>
		<td>${customer.custIndustry}</td>
		<td>${customer.custLevel}</td>
		<td>${customer.custLinkman}</td>
		<td>${customer.custPhone }</td>
		<td>${customer.custMobile }</td>
	</tr>
</tbody>

</table>

</body>
</html>