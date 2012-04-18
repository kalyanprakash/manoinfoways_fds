package com.project.fms.admin.widgets;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.GroupStartOpen;
import com.smartgwt.client.types.SummaryFunctionType;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class TranscriberDoctorPrirityWidget extends Canvas {

	public TranscriberDoctorPrirityWidget() {

		final ListGridField transcriberTypeField = new ListGridField("TranscriberType");
		SelectItem transcriberAbbrSelect = new SelectItem("transcriberAbbr",
				"Select Transcriber");
		transcriberAbbrSelect.setValueMap("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13", "14", "15");
		transcriberAbbrSelect.setDisplayField("transcriberAbbr");

		transcriberAbbrSelect.addChangeHandler(new ChangeHandler() {

			@Override
			public void onChange(ChangeEvent event) {
				
				if (event.getValue().toString().equalsIgnoreCase("1"))
					transcriberTypeField.setValueMap("Transcriber");
				if (event.getValue().toString().equalsIgnoreCase("2"))
					transcriberTypeField.setValueMap("Editor");
				if (event.getValue().toString().equalsIgnoreCase("3"))
					transcriberTypeField.setValueMap("Transcriber", "Editor");
				if (event.getValue().toString().equalsIgnoreCase("4"))
					transcriberTypeField.setValueMap("Proofer");
				if (event.getValue().toString().equalsIgnoreCase("5"))
					transcriberTypeField.setValueMap("Transcriber", "Proofer");
				if (event.getValue().toString().equalsIgnoreCase("6"))
					transcriberTypeField.setValueMap("Editor", "Proofer");
				if (event.getValue().toString().equalsIgnoreCase("7"))
					transcriberTypeField.setValueMap("Transcriber", "Editor", "Proofer");
				if (event.getValue().toString().equalsIgnoreCase("8"))
					transcriberTypeField.setValueMap("QA");
				if (event.getValue().toString().equalsIgnoreCase("9"))
					transcriberTypeField.setValueMap("Transcriber", "QA");
				if (event.getValue().toString().equalsIgnoreCase("10"))
					transcriberTypeField.setValueMap("Editor", "QA");
				if (event.getValue().toString().equalsIgnoreCase("11"))
					transcriberTypeField.setValueMap("Transcriber", "Editor", "QA");
				if (event.getValue().toString().equalsIgnoreCase("12"))
					transcriberTypeField.setValueMap("Proofer", "QA");
				if (event.getValue().toString().equalsIgnoreCase("13"))
					transcriberTypeField.setValueMap("Transcriber", "Proofer", "QA");
				if (event.getValue().toString().equalsIgnoreCase("14"))
					transcriberTypeField.setValueMap("Editor", "Proofer", "QA");
				if (event.getValue().toString().equalsIgnoreCase("15"))
					transcriberTypeField.setValueMap("Transcriber", "Editor", "Proofer", "QA");
			}
		});

		ListGridField doctorIdField = new ListGridField("DoctorId");
		doctorIdField.setIncludeInRecordSummary(false);
		doctorIdField.setSummaryFunction(SummaryFunctionType.COUNT);

		transcriberTypeField.setShowGridSummary(true);
/*		transcriberTypeField.setSummaryFunction(new SummaryFunction() {
			public Object getSummaryValue(Record[] records, ListGridField field) {
				Set<String> uniqueCategories = new HashSet<String>();

				return uniqueCategories.size() + " TranscriberTypes";
			}
		});*/

		ListGridField priorityField = new ListGridField("Priority");
		priorityField.setShowGroupSummary(true);
		priorityField.setShowGridSummary(false);
		priorityField.setSummaryFunction(SummaryFunctionType.MAX);
		
		final ListGrid transcriberGrid = new ListGrid();

		transcriberGrid.setWidth100();
		transcriberGrid.setHeight(520);
		transcriberGrid.setAutoFetchData(true);

		transcriberGrid.setShowAllRecords(true);
		// listGrid.setDataSource(dataSource);
		transcriberGrid.setCanEdit(true);
		transcriberGrid.setGroupByField("TranscriberType");
		transcriberGrid.setGroupStartOpen(GroupStartOpen.ALL);
		transcriberGrid.setShowGridSummary(true);
		transcriberGrid.setShowGroupSummary(true);

		transcriberGrid.setFields(doctorIdField, transcriberTypeField,
				priorityField);

		Label titleLabel = new Label(
				"Welcome to Transcribers Doctor Priority Screen");
		titleLabel.setWidth100();
		titleLabel.setBorder("1px solid #808080");
		titleLabel.setBackgroundColor("#C3D9FF");
		titleLabel.setAlign(Alignment.CENTER);
		titleLabel.setHeight(50);

		VLayout layout = new VLayout(10);
		layout.setWidth100();
		layout.setHeight100();
		layout.addMember(titleLabel);

		DynamicForm selectForm = new DynamicForm();
		selectForm.setItems(transcriberAbbrSelect);

		layout.addMember(selectForm);
		layout.addMember(transcriberGrid);

		HLayout buttonLayout = new HLayout();

		IButton addButton = new IButton("Add New");
		addButton.setTop(250);
		addButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				transcriberGrid.startEditingNew();
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