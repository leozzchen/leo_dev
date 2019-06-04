package com.hsbc.aiocr.filemove.entity;

import java.util.ArrayList;
import java.util.List;

public class CountryEntity {
	private String filePrefix;
	private String countryCode;
	private String entityName;
	private String processTypeIDs;
	public List<ProcessType> processTypes = new ArrayList<ProcessType>();
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
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getProcessTypeIDs() {
		return processTypeIDs;
	}
	public void setProcessTypeIDs(String processTypeIDs) {
		this.processTypeIDs = processTypeIDs;
	}
}
