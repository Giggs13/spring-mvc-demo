<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation Form</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName}
<br>
Country: ${student.country}
<br>
Favorite Language: ${student.favoriteLanguage}
<br>
Operating Systems:
<ul>
    <c:forEach var="item" items="${student.operatingSystems}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>
