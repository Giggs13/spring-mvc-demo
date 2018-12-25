<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="process-form" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br>
    Last name: <form:input path="lastName"/>
    <br>
    Country:
    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>
    <br>
    Favorite Language:
    <form:radiobuttons path="favoriteLanguage" items="${languages}"/>
    <br>
    Operating Systems:
    <form:checkboxes path="operatingSystems" items="${operatingSystems}"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
