package com.aquash.platform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
	
	@Id
	private String idUser;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String alternateMobileNumber;
	private String emailId;
	private Long userAreaId;
	private Long userCityId;
	private Long userStateId;
	private Long userCountryId;
	private String pinCode;
	private Integer userStatus;
	
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getUserAreaId() {
		return userAreaId;
	}
	public void setUserAreaId(Long userAreaId) {
		this.userAreaId = userAreaId;
	}
	public Long getUserCityId() {
		return userCityId;
	}
	public void setUserCityId(Long userCityId) {
		this.userCityId = userCityId;
	}
	public Long getUserStateId() {
		return userStateId;
	}
	public void setUserStateId(Long userStateId) {
		this.userStateId = userStateId;
	}
	public Long getUserCountryId() {
		return userCountryId;
	}
	public void setUserCountryId(Long userCountryId) {
		this.userCountryId = userCountryId;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	
}
