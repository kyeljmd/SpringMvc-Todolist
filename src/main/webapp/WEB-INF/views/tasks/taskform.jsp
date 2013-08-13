<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
      <title>New Task</title>
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css"/>">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery-ui.css"/>">
      <style>
       .cock-block{ margin-bottom:5.5%;}
      </style>
   </head>
     <body class = "container">
     <div class = "cock-block"></div>
     
     <div class = "span9">
	       <div class = "span9">
		        <form:form commandName = "task" method = "POST" class = "form-horizontal" action = "save">
		         
		          <legend>Add A New Task</legend>
							<div class="control-group">
								<label class="control-label" for="taskName">Task Name</label>
								<div class="controls">
									<form:input name="name" path="name" />
									<b><form:errors path="name" class="text-error"></form:errors></b>
								</div>
							</div>
					
							<div class="control-group">
								<label class="control-label" for="taskDescription">Task Description</label>
								<div class="controls">
		               <form:textarea path = "description" />
									 <b><form:errors path="description" class="text-error"></form:errors></b>
								</div>
							</div>
		
		          <div class="control-group">
		            <label class="control-label" for="Start Date">Start Date</label>
		            <div class="controls">
		                <form:input path ="startDate" cssClass = "datepicker" /> <br/>
		            </div>
		          </div>
		
							<div class="control-group">
								<label class="control-label" for="Start Date">End Date</label>
								<div class="controls"> 
								  <form:input path = "endDate" cssClass = "datepicker"  />
		    				</div>
							</div>        
		          
		          <div class="control-group">
		            <div class="controls">  
		              <input type = "submit" value = "Create Task" class = "btn-primary">
		            </div>
		          </div>     
					
			       </form:form>
		       </div>
	     </div>
        
      <script src = "<c:url value="/resources/js/jquery-2.0.3.min.js"/>"></script>
      <script src = "<c:url value="/resources/js/jquery-ui.js"/>"></script>
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