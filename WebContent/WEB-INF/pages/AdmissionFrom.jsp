<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
 <h1>*${headerMsg}*</h1>
 <h2>Student Admission form for Engineering Course</h2>


	<form:errors path="student1.*"/>
	<form action="/FirstSpringMvcProject/submitAdmissionFormNew.html" method="post">
	<table>
	<tr><td>Student's Name : </td> <td> <input type ="text" name="studentName" /></td></tr>
		<tr><td>Student's Hobby : </td> <td> <input type ="text" name="studentHobby" /></td></tr>
		<tr><td>Student's Mobile :  </td> <td> <input type="text" name = "studentMobile" /></td></tr>
		<tr><td>Student's DOB : </td> <td>  <input type="text" name = "studentDOB" /></td></tr>

				<td>Student skills</td>
				<td>
					<select name="studentSkills" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
					</select>
				</td>
			
		
		</table>
		
		<table>
			<tr><td>Student skills</td>	</tr>
			<tr>
			<td>Country: <input type ="text" name="studentAddress.country" /> </td>
			<td>City: <input type ="text" name="studentAddress.city" /> </td>
			<td>Street: <input type ="text" name="studentAddress.street" /> </td>
			<td>PinCode: <input type ="text" name="studentAddress.pincode" /> </td>
			
			</tr>
		
		</table>
		
		
		</p>
		
		
		
		<input type="submit" value="Submit this form by clicking here" />
	
	</form>
</body>
</html>


