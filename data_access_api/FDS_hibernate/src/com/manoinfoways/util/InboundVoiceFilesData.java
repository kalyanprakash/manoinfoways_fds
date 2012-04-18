package com.manoinfoways.util;


public class InboundVoiceFilesData {
	
	String filePath;
	String clinicId;
	String docId;
	double fileLength;

	public InboundVoiceFilesData(String filePath, String clinicId,
			String docId, double fileLength) {
		super();
		this.filePath = filePath;
		this.clinicId = clinicId;
		this.docId = docId;
		this.fileLength = fileLength;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getClinicId() {
		return clinicId;
	}

	public void setClinicId(String clinicId) {
		this.clinicId = clinicId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public double getFileLength() {
		return fileLength;
	}

	public void setFileLength(double fileLength) {
		this.fileLength = fileLength;
	}
}
