<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country} 


<br><br>

Favourite Language is :${student.favouriteLanguage} 


<br><br>

Operating system:

<ul>
 <c:forEach var="temp" items="${student.opertingSystems}" >
 <li>${temp}</li>
 </c:forEach>
</ul>

</body>

</html>







