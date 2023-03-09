<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 09.03.2023
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <form:form action="process-form" modelAttribute="student">
      First name: <form:input path="firstName" />
      <br>
      Last Name: <form:input path="lastName" />

      <input type="submit" value="Submit">
    </form:form>
</body>
</html>
