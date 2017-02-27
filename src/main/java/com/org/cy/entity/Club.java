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
@Table(name = "club")
@DataTransferObject
public class Club implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "cid",length=20,updatable=true)
	private String cid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "name",length=55,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "logo",length=255,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "brief",length=255,nullable=true,updatable=true)
	private String brief;

	@RemoteProperty
	@Column(name = "type",length=15,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "club_member_sum",length=10,nullable=true,updatable=true)
	private Integer clubMemberSum;

	@RemoteProperty
	@Column(name = "fee_circle",length=255,nullable=true,updatable=true)
	private String feeCircle;

	@RemoteProperty
	@Column(name = "fee_start_date",length=0,nullable=true,updatable=true)
	private Date feeStartDate;

	@RemoteProperty
	@Column(name = "city",length=25,nullable=true,updatable=true)
	private String city;

	@RemoteProperty
	@Column(name = "administrator",length=255,nullable=true,updatable=true)
	private String administrator;

	@RemoteProperty
	@Column(name = "slogan",length=55,nullable=true,updatable=true)
	private String slogan;

	@RemoteProperty
	@Column(name = "operator",length=15,nullable=true,updatable=true)
	private String operator;

	@RemoteProperty
	@Column(name = "mobile",length=15,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "create_id",length=10,nullable=true,updatable=true)
	private Integer createId;

	@RemoteProperty
	@Column(name = "status",length=5,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private Integer isDelete;


	public void setCid(String cid){
		this.cid = cid;
	}
	public String getCid(){
		return this.cid;
	}
	public void setBid(Integer bid){
		this.bid = bid;
	}
	public Integer getBid(){
		return this.bid;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setLogo(String logo){
		this.logo = logo;
	}
	public String getLogo(){
		return this.logo;
	}
	public void setBrief(String brief){
		this.brief = brief;
	}
	public String getBrief(){
		return this.brief;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setClubMemberSum(Integer clubMemberSum){
		this.clubMemberSum = clubMemberSum;
	}
	public Integer getClubMemberSum(){
		return this.clubMemberSum;
	}
	public void setFeeCircle(String feeCircle){
		this.feeCircle = feeCircle;
	}
	public String getFeeCircle(){
		return this.feeCircle;
	}
	public void setFeeStartDate(Date feeStartDate){
		this.feeStartDate = feeStartDate;
	}
	public Date getFeeStartDate(){
		return this.feeStartDate;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	public void setAdministrator(String administrator){
		this.administrator = administrator;
	}
	public String getAdministrator(){
		return this.administrator;
	}
	public void setSlogan(String slogan){
		this.slogan = slogan;
	}
	public String getSlogan(){
		return this.slogan;
	}
	public void setOperator(String operator){
		this.operator = operator;
	}
	public String getOperator(){
		return this.operator;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setCreateId(Integer createId){
		this.createId = createId;
	}
	public Integer getCreateId(){
		return this.createId;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setModifyUser(String modifyUser){
		this.modifyUser = modifyUser;
	}
	public String getModifyUser(){
		return this.modifyUser;
	}
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime(){
		return this.modifyTime;
	}
	public void setIsDelete(Integer isDelete){
		this.isDelete = isDelete;
	}
	public Integer getIsDelete(){
		return this.isDelete;
	}
}