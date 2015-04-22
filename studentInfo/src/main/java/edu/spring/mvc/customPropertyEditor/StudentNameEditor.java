package edu.spring.mvc.customPropertyEditor;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String firstName) throws IllegalArgumentException {

		if (firstName.contains("Mr") || firstName.contains("Ms")) {
			setValue(firstName);
		} else {
			firstName = "Mr " + firstName;
			setValue(firstName);
		}
	}
}
