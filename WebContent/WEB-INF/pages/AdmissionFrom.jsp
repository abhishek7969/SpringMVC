<html>
<body>
 <h1>*${headerMsg}*</h1>
 <h2>Student Admission form for Engineering Course</h2>

	<form action="/FirstSpringMvcProject/submitAdmissionFormNew.html" method="post">
	
		<p>Student's Name :<input type ="text" name="studentName" /></p>
		<p>Student's Hobby :<input type ="text" name="studentHobby" /></p>
		<p>Student's Mobile :<input type="text" name = "studentMobile" /></p>
		<p>Student's DOB :<input type="text" name = "studentDOB" /></p>
		
		<p>
		<table>
			<tr>
				<td>Student skills</td>
				<td>
					<select name="studentSkills" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
					</select>
				</td>
			</tr>
		
		</table>
		
		
		</p>
		
		
		
		<input type="submit" value="Submit this form by clicking here" />
	
	</form>
</body>
</html>


