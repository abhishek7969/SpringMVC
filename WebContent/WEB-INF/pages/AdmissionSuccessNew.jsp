<html>
 <body>
 <h1>*${headerMsg}*</h1>
 <h2>Congratulations College has approved you application successfully !!</h2>
 <h2> Details submitted by you are :</h2>
 
 	<table>
 		<tr>
 			<td>Student name : </td>
 			<td>${student1.studentName}</td>
 		</tr>
 		
 		<tr>
 			<td>Student hobby : </td>
 			<td>${student1.studentHobby}</td>
 		</tr>
 		
 		<tr>
 			<td>Student mobile : </td>
 			<td>${student1.studentMobile}</td>
 		</tr>
 		
 		<tr>
 			<td>Student DOB : </td>
 			<td>${student1.studentDOB}</td>
 		</tr>
 		
 		<tr>
 			<td>Student skills : </td>
 			<td>${student1.studentSkills}</td>
 		</tr>
 		
 		<tr>
 			<td>Student Address : </td>
 			<td>Country :${student1.studentAddress.country}
				City :${student1.studentAddress.city}
				Street :${student1.studentAddress.street}
				pin :${student1.studentAddress.pincode}			
 			</td>
 		</tr>
 	
 	</table>
 
 </body>
</html>