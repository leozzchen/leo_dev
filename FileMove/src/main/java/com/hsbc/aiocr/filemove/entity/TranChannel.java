package com.hsbc.aiocr.filemove.entity;

import java.util.ArrayList;
import java.util.List;

public class TranChannel {
	private List<CountryEntity> countryEntities = new ArrayList<CountryEntity>();
	private List<Country> countries = new ArrayList<Country>();
	private String region;
	private String targetPath;
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	public List<CountryEntity> getCountryEntities() {
		return countryEntities;
	}
	public void setCountryEntities(List<CountryEntity> countryEntities) {
		this.countryEntities = countryEntities;
	}
	public List<Country> getCountries() {
		return countries;
	}
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
}
