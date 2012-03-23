package com.project.fms.admin.widgets;

import com.smartgwt.client.docs.Buttons;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.events.ClickEvent;  
import com.smartgwt.client.widgets.events.ClickHandler; 
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class EditDoctor extends Canvas {
	
	public EditDoctor()
	{
		setMargin(50);    
	    
		final ListGrid doctorGrid = new ListGrid();
		
		doctorGrid.setWidth(1000);
		doctorGrid.setHeight(300);
		doctorGrid.setShowFilterEditor(true);
		doctorGrid.setFilterOnKeypress(true);
	    //countryGrid.setDataSource(WorldXmlDS.getInstance());
		doctorGrid.setAutoFetchData(true);
		doctorGrid.setShowRecordComponents(true);          
		doctorGrid.setShowRecordComponentsByCell(true);  
		doctorGrid.setCanRemoveRecords(true); 
	    
		ListGridField docIdField = new ListGridField("docId", "DoctorId", 50);
	    ListGridField docNameField = new ListGridField("docName", "DoctorName");
	    ListGridField clinicNameField = new ListGridField("clinicName", "ClinicName");
	    clinicNameField.setValueMap("Europe", "Asia", "North America", "Australia/Oceania", "South America", "Africa");  

	    ListGridField doctorTollFreeIdField = new ListGridField("doctorTollFreeId", "DoctorTollFreeId");
	    ListGridField doctorResourceIdField = new ListGridField("doctorResourceId", "DoctorResourceId");
	    ListGridField doctorTagAndIPField = new ListGridField("doctorComputerTagAndIP", "DoctorComputerTag & IP");
	    doctorGrid.setFields(docIdField, docNameField, clinicNameField, doctorTollFreeIdField, doctorResourceIdField, doctorTagAndIPField);
	    
	    Label title = new Label("Test Title");
        title.setWidth(70);
        title.setHeight(20);
        
	    VLayout layout = new VLayout(15); 
	    layout.addMember(title);
	    layout.addMember(doctorGrid);
        
	    
	    HLayout buttonLayout = new HLayout();
	    
	    
	    IButton submitButton = new IButton("Submit");  
	    submitButton.addClickHandler(new ClickHandler() {  
            public void onClick(ClickEvent event) {  
                                
            }             
        });
	    //submitButton.setLeft(200); 
	    //submitButton.setTop(140);  
	    submitButton.setWidth(120);
	    submitButton.setAlign(Alignment.CENTER);
          
        IButton saveButton = new IButton("Save");  
        saveButton.addClickHandler(new ClickHandler() {  
            public void onClick(ClickEvent event) {  
                                  
            }  
              
        });
        //submitButton.setLeft(200);
        //saveButton.setTop(240);  
        saveButton.setWidth(120);
        saveButton.setAlign(Alignment.CENTER);
        
        buttonLayout.addMember(submitButton);
        buttonLayout.addMember(saveButton);
        buttonLayout.setMembersMargin(10);
        layout.addMember(buttonLayout);
	    
	    addChild(layout);
	}
}
