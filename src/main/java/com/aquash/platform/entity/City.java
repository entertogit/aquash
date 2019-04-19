package com.aquash.platform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	
	@Id
	private Long cityId;
	private String cityName;
	private Integer cityStatus;
	
	
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Integer getCityStatus() {
		return cityStatus;
	}
	public void setCityStatus(Integer cityStatus) {
		this.cityStatus = cityStatus;
	}
	
	

}
