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
@Table(name = "user_tdc")
@DataTransferObject
public class UserTdc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "tid",length=10,updatable=true)
	private Integer tid;

	@RemoteProperty
	@Column(name = "id",length=10,nullable=true,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "ewcode",length=255,nullable=true,updatable=true)
	private String ewcode;

	@RemoteProperty
	@Column(name = "state",length=10,updatable=true)
	private Integer state;

	@RemoteProperty
	@Column(name = "ewcodebd",length=255,nullable=true,updatable=true)
	private String ewcodebd;

	@RemoteProperty
	@Column(name = "bunid",length=255,updatable=true)
	private String bunid;


	public void setTid(Integer tid){
		this.tid = tid;
	}
	public Integer getTid(){
		return this.tid;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setEwcode(String ewcode){
		this.ewcode = ewcode;
	}
	public String getEwcode(){
		return this.ewcode;
	}
	public void setState(Integer state){
		this.state = state;
	}
	public Integer getState(){
		return this.state;
	}
	public void setEwcodebd(String ewcodebd){
		this.ewcodebd = ewcodebd;
	}
	public String getEwcodebd(){
		return this.ewcodebd;
	}
	public void setBunid(String bunid){
		this.bunid = bunid;
	}
	public String getBunid(){
		return this.bunid;
	}
}