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
@Table(name = "praise")
@DataTransferObject
public class Praise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=11,updatable=true)
	private String id;

	@RemoteProperty
	@Column(name = "uid",length=11,nullable=true,updatable=true)
	private String uid;

	@RemoteProperty
	@Column(name = "sid",length=255,nullable=true,updatable=true)
	private String sid;

	@RemoteProperty
	@Column(name = "flag",length=11,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "status",length=20,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;


	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setUid(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return this.uid;
	}
	public void setSid(String sid){
		this.sid = sid;
	}
	public String getSid(){
		return this.sid;
	}
	public void setFlag(String flag){
		this.flag = flag;
	}
	public String getFlag(){
		return this.flag;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
}