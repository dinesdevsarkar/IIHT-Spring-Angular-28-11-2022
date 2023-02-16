package com.patient.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommonRestApiUrl {

	@Value("${rest.api.url.uploadfile}")
	private String uploadFileUrl;

	@Value("${rest.api.url.getpatientbyid}")
	private String getPatientByIdUrl;
	
	@Value("${rest.api.url.getpatientbyname}")
	private String getPatientByNameUrl;

	@Value("${rest.api.url.updatepatient}")
	private String updatePatientUrl;

	@Value("${rest.api.url.updatestatus}")
	private String updateStatusUrl;
	
	@Value("${rest.api.url.getallpatient}")
	private String getAllPatientUrl;
	
	@Value("${rest.api.url.deletepatient}")
	private String deletePatient;

	public String getUploadFileUrl() {
		return uploadFileUrl;
	}

	public void setUploadFileUrl(String uploadFileUrl) {
		this.uploadFileUrl = uploadFileUrl;
	}

	public String getGetPatientByIdUrl() {
		return getPatientByIdUrl;
	}

	public void setGetPatientByIdUrl(String getPatientByIdUrl) {
		this.getPatientByIdUrl = getPatientByIdUrl;
	}

	public String getGetPatientByNameUrl() {
		return getPatientByNameUrl;
	}

	public void setGetPatientByNameUrl(String getPatientByNameUrl) {
		this.getPatientByNameUrl = getPatientByNameUrl;
	}

	public String getUpdatePatientUrl() {
		return updatePatientUrl;
	}

	public void setUpdatePatientUrl(String updatePatientUrl) {
		this.updatePatientUrl = updatePatientUrl;
	}

	public String getUpdateStatusUrl() {
		return updateStatusUrl;
	}

	public void setUpdateStatusUrl(String updateStatusUrl) {
		this.updateStatusUrl = updateStatusUrl;
	}

	public String getGetAllPatientUrl() {
		return getAllPatientUrl;
	}

	public void setGetAllPatientUrl(String getAllPatientUrl) {
		this.getAllPatientUrl = getAllPatientUrl;
	}

	public String getDeletePatient() {
		return deletePatient;
	}

	public void setDeletePatient(String deletePatient) {
		this.deletePatient = deletePatient;
	}	
	
}
