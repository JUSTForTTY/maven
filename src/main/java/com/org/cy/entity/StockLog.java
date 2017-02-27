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
@Table(name = "stock_log")
@DataTransferObject
public class StockLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "importBillID",length=255,updatable=true)
	private String importbillid;

	@RemoteProperty
	@Column(name = "user_name",length=255,nullable=true,updatable=true)
	private String userName;

	@RemoteProperty
	@Column(name = "goodkinds",length=255,nullable=true,updatable=true)
	private String goodkinds;

	@RemoteProperty
	@Column(name = "totalPrice",length=10,nullable=true,updatable=true)
	private Integer totalprice;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;


	public void setImportbillid(String importbillid){
		this.importbillid = importbillid;
	}
	public String getImportbillid(){
		return this.importbillid;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setGoodkinds(String goodkinds){
		this.goodkinds = goodkinds;
	}
	public String getGoodkinds(){
		return this.goodkinds;
	}
	public void setTotalprice(Integer totalprice){
		this.totalprice = totalprice;
	}
	public Integer getTotalprice(){
		return this.totalprice;
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
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	public String getUpdateUser(){
		return this.updateUser;
	}
}