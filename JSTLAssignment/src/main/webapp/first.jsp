<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521/orcl" user="system" password="Oracle_1" var="ds"></sql:setDataSource>
<sql:query dataSource="${ds}" var="rs">select * from employeeNew</sql:query>
<div>
 <h2>List of Employees</h2>
  <table border="1" cellspacing="0">
      <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Salary</th>
      </tr>
      <c:forEach items="${rs.rows}" var="row">
          <tr>
              <td><c:out value="${row.id}" /></td>
              <td><c:out value="${row.name}" /></td>
              <td><c:out value="${row.esal}" /></td>
          </tr>
      </c:forEach>
  </table>
</div>
</body>
</html>