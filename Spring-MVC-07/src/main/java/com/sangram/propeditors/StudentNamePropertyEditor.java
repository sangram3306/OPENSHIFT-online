package com.sangram.propeditors;

import java.beans.PropertyEditorSupport;

public class StudentNamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException {

		if(name.contains("Mr.")||name.contains("Ms."))
		{
			setValue(name);
		}
		else
		{
			String newname = "Mr. "+name;
			setValue(newname);
		}
		
	}
}
