package com.project.fms.admin.widgets;

import java.util.Calendar;
import java.util.Date;

import com.project.fms.admin.widgets.data.ClinicConnectionDetailsData;
import com.project.fms.admin.widgets.data.ClinicData;
import com.project.fms.admin.widgets.data.ClinicMetadataData;
import com.smartgwt.client.data.DSCallback;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.types.SelectionType;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.ValuesManager;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;
import com.smartgwt.client.widgets.toolbar.ToolStrip;

public class AddClinicUI extends VLayout {

	private ClinicConnectionDetailsForm clinicConnectionFormWidget;

	private ClinicManagersDataForm clinicManagersWidget;

	private ClinicDataForm clinicDataFormWidget;

	private Tab clinicDataTab;

	public AddClinicUI() {

		setMargin(10);
		setMembersMargin(10);

		ToolStrip toolStrip = new ToolStrip();

		IButton addButton = new IButton("Add");
		IButton editButton = new IButton("Edit");

		addButton.setActionType(SelectionType.RADIO);
		editButton.setActionType(SelectionType.RADIO);

		addButton.setRadioGroup("selectClinicOperation");
		editButton.setRadioGroup("selectClinicOperation");

		addButton.setShowRollOver(false);
		editButton.setShowRollOver(false);
		toolStrip.addMember(addButton);
		toolStrip.addMember(editButton);

		addMember(toolStrip);

		final ValuesManager formValuesManager = new ValuesManager();

		final TabSet clinicTabSet = new TabSet();
		clinicTabSet.setWidth100();
		clinicTabSet.setHeight("80%");

		clinicDataTab = new Tab("Clinic Data");
		clinicDataFormWidget = new ClinicDataForm("add");
		// clinicDataFormWidget.setValuesManager(formValuesManager);
		clinicDataTab.setPane(clinicDataFormWidget);

		Tab clinicConnectionTab = new Tab("Clinic Connection");
		clinicConnectionFormWidget = new ClinicConnectionDetailsForm();
		// clinicConnectionFormWidget.setValuesManager(formValuesManager);
		clinicConnectionTab.setPane(clinicConnectionFormWidget);

		Tab clinicManagersTab = new Tab("Clinic Managers Information");
		clinicManagersWidget = new ClinicManagersDataForm();
		// clinicManagersWidget.setValuesManager(formValuesManager);
		clinicManagersTab.setPane(clinicManagersWidget);

		// Commented Adding Requirements Tab

		// Tab clinicRequirementsTab = new
		// Tab("Clinic Requirements Information");

		// ClinicRequirementsForm clinicRequirementsWidget = new
		// ClinicRequirementsForm();
		// clinicRequirementsWidget.setValuesManager(formValuesManager);
		// clinicRequirementsTab.setPane(clinicRequirementsWidget);

		clinicTabSet.setTabs(clinicDataTab, clinicConnectionTab,
				clinicManagersTab);
		// clinicTabSet.setTabs(clinicDataTab, clinicConnectionTab,
		// clinicManagersTab, clinicRequirementsTab);

		addMember(clinicTabSet);

		IButton submitButton = new IButton("Submit");
		submitButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				// //Comment the below steps to skip Validations
				// formValuesManager.validate();
				// if(clinicDataFormWidget.hasErrors()){
				// SC.say("Errors in tab clinicDataFormWidget");
				// clinicTabSet.selectTab(0);
				// }else if(clinicConnectionFormWidget.hasErrors()){
				// SC.say("Errors in tab clinicConnectionFormWidget");
				// clinicTabSet.selectTab(1);
				// }else if(clinicManagersWidget.hasErrors()){
				// SC.say("Errors in tab clinicManagersWidget");
				// clinicTabSet.selectTab(2);
				// }
				// //Add your DS logic here
				// else{

				// Submitting Clinic Data values

				ClinicConnectionDetailsData connDetailsData = new ClinicConnectionDetailsData(
						((MyTextItem) clinicConnectionFormWidget
								.getItem("clinicConnectionType"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget.getItem("userName"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget.getItem("password"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("systemLoginUserName"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("systemLoginPassword"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("typeOfSoftware")).getValueAsString(),
						((SelectItem) clinicConnectionFormWidget
								.getItem("mailOrFtpforVoiceFiles"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("recorderUsed")).getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("typeOfVoiceFiles"))
								.getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("voiceFilesPath")).getValueAsString(),
						((MyTextItem) clinicConnectionFormWidget
								.getItem("transcriptsPath")).getValueAsString(),
						convertDateToString(((DateItem) clinicConnectionFormWidget
								.getItem("folderDate")).getValueAsDate()));

				ClinicMetadataData metadata = new ClinicMetadataData(
						((MyTextItem) clinicManagersWidget
								.getItem("transcriptionsInchargeName"))
								.getValueAsString(),
						((EmailTextItem) clinicManagersWidget
								.getItem("transcriptionsInchargeEmail"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("transcriptionInchargePhnNo"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("trancriptionInchargeFaxNo"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("transcriptionInchargeAddress"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("technicalPersonName"))
								.getValueAsString(),
						((EmailTextItem) clinicManagersWidget
								.getItem("technicalPersonEmail"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("technicalPersonPhnNo"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("technicalPersonFaxNo"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("technicalPersonAddress"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("softwarePersonName"))
								.getValueAsString(),
						((EmailTextItem) clinicManagersWidget
								.getItem("softwarePersonEmail"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("softwarePersonPhnNo"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("softwarePersonCellNo"))
								.getValueAsString(),
						((MyTextItem) clinicManagersWidget
								.getItem("softwarePersonAddress"))
								.getValueAsString(),
						((EmailTextItem) clinicManagersWidget
								.getItem("emailForPatientList"))
								.getValueAsString(),
						((EmailTextItem) clinicManagersWidget
								.getItem("emailForInvoices"))
								.getValueAsString());
				String clinicAbbr="";
				if(clinicDataFormWidget.getCurrentFormType().equalsIgnoreCase("add")){
					clinicAbbr = ((MyTextItem) clinicDataFormWidget.getItem("clinicAbbr")).getValueAsString().toUpperCase();
				}else{
					clinicAbbr = ((SelectItem) clinicDataFormWidget.getItem("clinicAbbr")).getSelectedRecord().getAttributeAsString("clinicAbbr");
				}
				ClinicData clinicData = new ClinicData(
						clinicAbbr,
						((MyTextItem) clinicDataFormWidget.getItem("clinicName"))
								.getValueAsString(),
						((TextAreaItem) clinicDataFormWidget
								.getItem("addressLine1")).getValueAsString(),
						((TextAreaItem) clinicDataFormWidget
								.getItem("addressLine2")).getValueAsString(),
						((MyTextItem) clinicDataFormWidget.getItem("location"))
								.getValueAsString(),
						((MyTextItem) clinicDataFormWidget.getItem("country"))
								.getValueAsString(),
						((MyTextItem) clinicDataFormWidget.getItem("zipcode"))
								.getValueAsString(), connDetailsData, metadata);

				clinicDataFormWidget.clinicDataDs.addData(clinicData,
						new DSCallback() {

							@Override
							public void execute(DSResponse response,
									Object rawData, DSRequest request) {
								if (response.getStatus() >= 0) {
									SC.say("Success");
								} else {
									SC.say("Error storing Clinic Data!");
								}
							}
						});
				// }
			}
		});
		addMember(submitButton);
		addButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				clinicDataFormWidget.clearValues();
				clinicConnectionFormWidget.clearValues();
				clinicManagersWidget.clearValues();
				clinicTabSet.removeTab(0);
				clinicDataFormWidget = new ClinicDataForm("add");
				clinicDataTab = new Tab("Clinic Data");
				clinicDataTab.setPane(clinicDataFormWidget);
				clinicTabSet.addTab(clinicDataTab, 0);
				clinicTabSet.selectTab(0);
			}
		});
		editButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				clinicDataFormWidget.clearValues();
				clinicConnectionFormWidget.clearValues();
				clinicManagersWidget.clearValues();

				clinicTabSet.removeTab(0);
				clinicDataFormWidget = new ClinicDataForm("edit");
				clinicDataTab = new Tab("Clinic Data");
				clinicDataTab.setPane(clinicDataFormWidget);
				clinicTabSet.addTab(clinicDataTab, 0);
				clinicTabSet.selectTab(0);
			}
		});
	}

	@SuppressWarnings("deprecation")
	/**
	 * Method to convert the Date value to String format supported by Xstream DateConverter at RESTlet side.
	 * Format is "yyyy-MM-dd 00:00:00.0 IST"
	 * @param date
	 * @return
	 */
	private String convertDateToString(Date date) {
		
		if (date == null)
		{
			date = new Date(0);
		}
		
		String dateString = new Integer(1900 + date.getYear()).toString() + "-";

		// Adding padding to make month and date as MM/dd
		if (date.getMonth() < 10)
			dateString += "0" + new Integer(date.getMonth()).toString() + "-";
		else
			dateString += new Integer(date.getMonth()).toString() + "-";

		if (date.getDate() < 10)
			dateString += "0" + new Integer(date.getDate()).toString();
		else
			dateString += new Integer(date.getDate()).toString();

		// Adding timezone as IST (for xml conversion to Sql)
		dateString += " 00:00:00.0 IST";

		return dateString;
	}

}
