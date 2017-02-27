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
@Table(name = "payment")
@DataTransferObject
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=20,updatable=true)
	private String id;

	@RemoteProperty
	@Column(name = "provider_id",length=20,nullable=true,updatable=true)
	private String providerId;

	@RemoteProperty
	@Column(name = "city_id",length=10,nullable=true,updatable=true)
	private Integer cityId;

	@RemoteProperty
	@Column(name = "bid",length=20,nullable=true,updatable=true)
	private String bid;

	@RemoteProperty
	@Column(name = "alipay_name",length=20,nullable=true,updatable=true)
	private String alipayName;

	@RemoteProperty
	@Column(name = "parent_id",length=20,nullable=true,updatable=true)
	private String parentId;

	@RemoteProperty
	@Column(name = "parent_key",length=30,nullable=true,updatable=true)
	private String parentKey;

	@RemoteProperty
	@Column(name = "unified_collection_account",length=20,nullable=true,updatable=true)
	private String unifiedCollectionAccount;

	@RemoteProperty
	@Column(name = "remark",length=30,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "Actual_collection_account",length=20,nullable=true,updatable=true)
	private String actualCollectionAccount;

	@RemoteProperty
	@Column(name = "weChat_wallet",length=255,nullable=true,updatable=true)
	private String wechatWallet;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;


	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setProviderId(String providerId){
		this.providerId = providerId;
	}
	public String getProviderId(){
		return this.providerId;
	}
	public void setCityId(Integer cityId){
		this.cityId = cityId;
	}
	public Integer getCityId(){
		return this.cityId;
	}
	public void setBid(String bid){
		this.bid = bid;
	}
	public String getBid(){
		return this.bid;
	}
	public void setAlipayName(String alipayName){
		this.alipayName = alipayName;
	}
	public String getAlipayName(){
		return this.alipayName;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}
	public String getParentId(){
		return this.parentId;
	}
	public void setParentKey(String parentKey){
		this.parentKey = parentKey;
	}
	public String getParentKey(){
		return this.parentKey;
	}
	public void setUnifiedCollectionAccount(String unifiedCollectionAccount){
		this.unifiedCollectionAccount = unifiedCollectionAccount;
	}
	public String getUnifiedCollectionAccount(){
		return this.unifiedCollectionAccount;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setActualCollectionAccount(String actualCollectionAccount){
		this.actualCollectionAccount = actualCollectionAccount;
	}
	public String getActualCollectionAccount(){
		return this.actualCollectionAccount;
	}
	public void setWechatWallet(String wechatWallet){
		this.wechatWallet = wechatWallet;
	}
	public String getWechatWallet(){
		return this.wechatWallet;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	public String getUpdateUser(){
		return this.updateUser;
	}
}