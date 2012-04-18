package com.project.fms.admin.widgets;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ListGridEditEvent;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class FileDistributionListWidget extends Canvas {

	public FileDistributionListWidget() {
  
		final ListGrid fileDistributionGrid = new ListGrid();        //countryGrid.setDataSource(WorldXmlDS.getInstance());  
  
        //ListGridField countryCodeField = new ListGridField("countryCode", "Code", 50);  
        ListGridField fileNameField = new ListGridField("fileName", "FileName");  
        ListGridField transcriberField = new ListGridField("transcriber", "Transcriber");
        transcriberField.setValueMap("Cat", "Dog", "Tiger", "Lion");
        ListGridField editorField = new ListGridField("editor", "Editor");
        editorField.setValueMap("Cat", "Dog", "Tiger", "Lion");
        ListGridField prooferField = new ListGridField("proofer", "Proofer");
        prooferField.setValueMap("Cat", "Dog", "Tiger", "Lion");
        ListGridField qaField = new ListGridField("qa", "QA");
        qaField.setValueMap("Cat", "Dog", "Tiger", "Lion");
        //ListGridField continentField = new ListGridField("continent", "Continent"); 
  
        fileDistributionGrid.setCanEdit(true);  
        fileDistributionGrid.setEditEvent(ListGridEditEvent.CLICK);  
        fileDistributionGrid.setEditByCell(true);  
        fileDistributionGrid.setAutoFetchData(true);  
        fileDistributionGrid.setShowFilterEditor(true);  
        fileDistributionGrid.setFields(fileNameField, transcriberField, editorField, prooferField, qaField);  

		Label titleLabel = new Label(
				"Welcome to File Distribution List Screen");
		titleLabel.setWidth100();
		titleLabel.setBorder("1px solid #808080");
		titleLabel.setBackgroundColor("#C3D9FF");
		titleLabel.setAlign(Alignment.CENTER);
		titleLabel.setHeight(50);

		VLayout layout = new VLayout(10);
		layout.setWidth100();
		layout.setHeight100();
		layout.addMember(titleLabel);

		layout.addMember(fileDistributionGrid);

		HLayout buttonLayout = new HLayout();

		IButton addButton = new IButton("Add New");
		addButton.setTop(250);
		addButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				fileDistributionGrid.startEditingNew();
			}
		});

		addButton.setWidth(120);
		addButton.setAlign(Alignment.CENTER);

		IButton submitButton = new IButton("Submit");
		submitButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

			}
		});

		submitButton.setWidth(120);
		submitButton.setAlign(Alignment.CENTER);

		submitButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub

			}
		});

		buttonLayout.addMember(addButton);
		buttonLayout.addMember(submitButton);
		buttonLayout.setMembersMargin(10);
		layout.addMember(buttonLayout);

		addChild(layout);
	}
}