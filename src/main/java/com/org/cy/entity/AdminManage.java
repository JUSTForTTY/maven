package com.org.cy.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.RemoteProperty;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "admin_manage")
@DataTransferObject
public class AdminManage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "IS_DELETED",length=10,updatable=true)
	private Integer isDeleted;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "F3",length=255,nullable=true,updatable=true)
	private String f3;

	@RemoteProperty
	@Column(name = "F4",length=255,nullable=true,updatable=true)
	private String f4;

	@RemoteProperty
	@Column(name = "F5",length=255,nullable=true,updatable=true)
	private String f5;

	@RemoteProperty
	@Column(name = "marine_id",length=19,nullable=true,updatable=true)
	private String marineId;

	@RemoteProperty
	@Column(name = "Maritime_address",length=255,nullable=true,updatable=true)
	private String maritimeAddress;

	@RemoteProperty
	@Column(name = "Maritime_contacts",length=255,nullable=true,updatable=true)
	private String maritimeContacts;

	@RemoteProperty
	@Column(name = "Maritime_mobile",length=255,nullable=true,updatable=true)
	private String maritimeMobile;

	@RemoteProperty
	@Column(name = "Maritime_name",length=255,nullable=true,updatable=true)
	private String maritimeName;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setIsDeleted(Integer isDeleted){
		this.isDeleted = isDeleted;
	}
	public Integer getIsDeleted(){
		return this.isDeleted;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setF3(String f3){
		this.f3 = f3;
	}
	public String getF3(){
		return this.f3;
	}
	public void setF4(String f4){
		this.f4 = f4;
	}
	public String getF4(){
		return this.f4;
	}
	public void setF5(String f5){
		this.f5 = f5;
	}
	public String getF5(){
		return this.f5;
	}
	public void setMarineId(String marineId){
		this.marineId = marineId;
	}
	public String getMarineId(){
		return this.marineId;
	}
	public void setMaritimeAddress(String maritimeAddress){
		this.maritimeAddress = maritimeAddress;
	}
	public String getMaritimeAddress(){
		return this.maritimeAddress;
	}
	public void setMaritimeContacts(String maritimeContacts){
		this.maritimeContacts = maritimeContacts;
	}
	public String getMaritimeContacts(){
		return this.maritimeContacts;
	}
	public void setMaritimeMobile(String maritimeMobile){
		this.maritimeMobile = maritimeMobile;
	}
	public String getMaritimeMobile(){
		return this.maritimeMobile;
	}
	public void setMaritimeName(String maritimeName){
		this.maritimeName = maritimeName;
	}
	public String getMaritimeName(){
		return this.maritimeName;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
}