package com.hsbc.aiocr.filemove.entity;

public class Country {
	private String filePrefix;
	private String countryCode;
	private String processTypeIDs;
	public String getFilePrefix() {
		return filePrefix;
	}
	public void setFilePrefix(String filePrefix) {
		this.filePrefix = filePrefix;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getProcessTypeIDs() {
		return processTypeIDs;
	}
	public void setProcessTypeIDs(String processTypeIDs) {
		this.processTypeIDs = processTypeIDs;
	}
	
}
