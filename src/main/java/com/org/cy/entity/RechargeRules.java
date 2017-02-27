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
@Table(name = "recharge_rules")
@DataTransferObject
public class RechargeRules implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "reid",length=20,updatable=true)
	private String reid;

	@RemoteProperty
	@Column(name = "act_pro_id",length=10,nullable=true,updatable=true)
	private Integer actProId;

	@RemoteProperty
	@Column(name = "activity_project_name",length=25,nullable=true,updatable=true)
	private String activityProjectName;

	@RemoteProperty
	@Column(name = "amount",length=10,nullable=true,updatable=true)
	private Integer amount;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "flag",length=255,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "reward",length=25,nullable=true,updatable=true)
	private String reward;


	public void setReid(String reid){
		this.reid = reid;
	}
	public String getReid(){
		return this.reid;
	}
	public void setActProId(Integer actProId){
		this.actProId = actProId;
	}
	public Integer getActProId(){
		return this.actProId;
	}
	public void setActivityProjectName(String activityProjectName){
		this.activityProjectName = activityProjectName;
	}
	public String getActivityProjectName(){
		return this.activityProjectName;
	}
	public void setAmount(Integer amount){
		this.amount = amount;
	}
	public Integer getAmount(){
		return this.amount;
	}
	public void setBid(Integer bid){
		this.bid = bid;
	}
	public Integer getBid(){
		return this.bid;
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
	public void setFlag(String flag){
		this.flag = flag;
	}
	public String getFlag(){
		return this.flag;
	}
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime(){
		return this.modifyTime;
	}
	public void setModifyUser(String modifyUser){
		this.modifyUser = modifyUser;
	}
	public String getModifyUser(){
		return this.modifyUser;
	}
	public void setReward(String reward){
		this.reward = reward;
	}
	public String getReward(){
		return this.reward;
	}
}