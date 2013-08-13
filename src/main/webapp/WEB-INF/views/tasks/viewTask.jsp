<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
      <title>New Task</title>
      <script src = "<c:url value="/resources/js/jquery-2.0.3.min.js"/>"></script>
      <script src = "<c:url value="/resources/js/jquery-ui.js"/>"></script>
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery-ui.css"/>">
   </head>
     <body>
     ${taskObj.taskName}
     
     ${taskObj.description}
     </body>
</html>