package com.project.fms.admin.widgets;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class AdminUI extends Canvas {
	public AdminUI() {
		setWidth("80%");

		final TabSet tabSet = new TabSet();
		tabSet.setTabBarPosition(Side.TOP);
		tabSet.setHeight(475);
		
		Tab tTab0 = new Tab("Add Clinic");
		AddClinicUI addClinicWidget = new AddClinicUI();
		tTab0.setPane(addClinicWidget);

		Tab tTab1 = new Tab("Add new Doctor");
		AddDoctorUI docUI = new AddDoctorUI();
		tTab1.setPane(docUI);
		
		Tab tTab2 = new Tab("Edit Doctor Info");
		EditDoctorUI editDoc = new EditDoctorUI();
		tTab2.setPane(editDoc);
		
		Tab tTab3 = new Tab("Add new Transcriber");
		AddTranscriberUI addTranscriber = new AddTranscriberUI();
		tTab3.setPane(addTranscriber);
		
		Tab tTab4 = new Tab("Edit Transcriber Info");
		EditTranscriberUI editTranscriber = new EditTranscriberUI();
		tTab4.setPane(editTranscriber);
		
		Tab tTab5 = new Tab("Edit Clinic Info");
		EditClinic editClinicObj = new EditClinic();
		tTab5.setPane(editClinicObj);
		
		Tab tTabEditDoctor = new Tab("Edit Doctor Info");
		EditDoctor editDocObj = new EditDoctor();
		tTabEditDoctor.setPane(editDocObj);
		
		Tab tTabGenerateList = new Tab("Generate Priority File List");
		GeneratePriorityList generateList = new GeneratePriorityList();
		tTabGenerateList.setPane(generateList);
		
		tabSet.addTab(tTab0);
		tabSet.addTab(tTab1);
		tabSet.addTab(tTab2);
		tabSet.addTab(tTab3);
		tabSet.addTab(tTab4);
		tabSet.addTab(tTab5);
		tabSet.addTab(tTabEditDoctor);
		tabSet.addTab(tTabGenerateList);
		
		VLayout vLayout = new VLayout();
		vLayout.setWidth100();  
		vLayout.setDefaultLayoutAlign(Alignment.CENTER);
		vLayout.setMembersMargin(15);
		vLayout.addMember(tabSet);
		addChild(vLayout);
	}

}
