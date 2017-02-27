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
@Table(name = "club_member")
@DataTransferObject
public class ClubMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "cmid",length=20,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "cid",length=20,nullable=true,updatable=true)
	private String cid;

	@RemoteProperty
	@Column(name = "uid",length=20,nullable=true,updatable=true)
	private String uid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "name",length=20,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "status",length=5,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "nickname",length=55,nullable=true,updatable=true)
	private String nickname;

	@RemoteProperty
	@Column(name = "mobile",length=15,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "gender",length=5,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "grade",length=55,nullable=true,updatable=true)
	private String grade;

	@RemoteProperty
	@Column(name = "flag",length=15,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "administrator",length=15,nullable=true,updatable=true)
	private String administrator;

	@RemoteProperty
	@Column(name = "cue_time",length=0,nullable=true,updatable=true)
	private Date cueTime;

	@RemoteProperty
	@Column(name = "accomplish",length=55,nullable=true,updatable=true)
	private String accomplish;

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


	public void setCmid(String cmid){
		this.cmid = cmid;
	}
	public String getCmid(){
		return this.cmid;
	}
	public void setCid(String cid){
		this.cid = cid;
	}
	public String getCid(){
		return this.cid;
	}
	public void setUid(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return this.uid;
	}
	public void setBid(Integer bid){
		this.bid = bid;
	}
	public Integer getBid(){
		return this.bid;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	public String getNickname(){
		return this.nickname;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return this.gender;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public String getGrade(){
		return this.grade;
	}
	public void setFlag(String flag){
		this.flag = flag;
	}
	public String getFlag(){
		return this.flag;
	}
	public void setAdministrator(String administrator){
		this.administrator = administrator;
	}
	public String getAdministrator(){
		return this.administrator;
	}
	public void setCueTime(Date cueTime){
		this.cueTime = cueTime;
	}
	public Date getCueTime(){
		return this.cueTime;
	}
	public void setAccomplish(String accomplish){
		this.accomplish = accomplish;
	}
	public String getAccomplish(){
		return this.accomplish;
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
}