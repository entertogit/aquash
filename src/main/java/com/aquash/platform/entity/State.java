package com.aquash.platform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	
	@Id
	private Long stateId;
	private String stateName;
	private Integer stateStatus;
	
	
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public Integer getStateStatus() {
		return stateStatus;
	}
	public void setStateStatus(Integer stateStatus) {
		this.stateStatus = stateStatus;
	}
	
	

}
