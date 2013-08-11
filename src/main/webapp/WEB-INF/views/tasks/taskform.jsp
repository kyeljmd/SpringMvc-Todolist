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
        <form:form commandName = "task" method = "POST" action = "save">
          <legend>Add A New Task</legend>
            <fieldset>
                <label>Task Name</label>
                <form:input name ="name" path="name" /> <br>
                <form:errors path="name" cssclass="error">xD </form:errors>
                
                <label>Task Goal</label>
                <form:textarea path = "description" /> <br>
                <form:errors path="description" cssclass="error"></form:errors>
                
                <label>Start Date</label>
                <form:input path ="startDate" cssClass = "datepicker" /> <br/>

                <label>End Date</label>
                <form:input path = "endDate" cssClass = "datepicker"  /> <br/>
                
                <input type = "submit" value = "Create Task">
            </fieldset>
        </form:form>
        <script>
	        $(function() {
	            $( ".datepicker" ).datepicker({
	              changeMonth: true,
	              changeYear: true
	            });
	          });
        </script>
     </body>
</html>