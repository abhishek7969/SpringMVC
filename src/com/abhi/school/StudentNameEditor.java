package com.abhi.school;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	public void setAsText(String studentName) {
		if (studentName.contains("Mrs") || studentName.contains("Mr")) {
			setValue(studentName);
		} else {
			studentName = "Mrs " + studentName;
			setValue(studentName);
		}

	}

}
