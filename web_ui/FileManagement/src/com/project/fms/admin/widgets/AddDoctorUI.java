package com.project.fms.admin.widgets;

import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.HeaderItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;

public class AddDoctorUI extends DynamicForm{
	
	public AddDoctorUI(){
		
		setMargin(50);
		
		setNumCols(4); 
		HeaderItem header = new HeaderItem();  
        header.setDefaultValue("Add New Doctor");  
  
        MyTextItem docName = new MyTextItem("docName", "Name: ");
        MyTextItem docEmail = new MyTextItem("docEmail", "Email ID: ");
        MyTextItem docPhno = new MyTextItem("docPhno", "Phone Number: ");
        MyTextItem docClinic = new MyTextItem("docClinic", "Clinic: ");
        TextAreaItem docAddr1 = new TextAreaItem("docAddr1", "Address1: ");
        TextAreaItem docAddr2 = new TextAreaItem("docAddr2", "Address2: ");
        MyTextItem docLocation = new MyTextItem("docLocation", "Location: ");
        MyTextItem docCountry = new MyTextItem("docCountry", "Country: ");
        MyTextItem docPincode = new MyTextItem("docPincode", "Pincode: ");
        
        docName.setRequired(true);
        docEmail.setRequired(true);
        docPhno.setRequired(true);
        docClinic.setRequired(true);
        docAddr1.setRequired(true);
        docAddr2.setRequired(true);
        docLocation.setRequired(true);
        docCountry.setRequired(true);
        docPincode.setRequired(true);
        
        
        ButtonItem submitButton = new ButtonItem();  
        submitButton.setTitle("Submit"); 
        submitButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if(validate() == true)
					submit();
			}
		});
        setFields(header,docName, docEmail, docPhno, docClinic, docAddr1, docAddr2, docLocation, docCountry, docPincode, submitButton);
	}

}

