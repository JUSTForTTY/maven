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
@Table(name = "outpay")
@DataTransferObject
public class OutPay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "outPayId",length=10,updatable=true)
	private Integer outpayid;

	@RemoteProperty
	@Column(name = "requestId",length=19,updatable=true)
	private Integer requestid;

	@RemoteProperty
	@Column(name = "payType",length=3,updatable=true)
	private Integer paytype;

	@RemoteProperty
	@Column(name = "userId",length=10,nullable=true,updatable=true)
	private Integer userid;

	@RemoteProperty
	@Column(name = "amount",length=10,updatable=true)
	private Integer amount;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "outStatus",length=32,nullable=true,updatable=true)
	private String outstatus;

	@RemoteProperty
	@Column(name = "outId",length=32,nullable=true,updatable=true)
	private String outid;

	@RemoteProperty
	@Column(name = "created",length=10,nullable=true,updatable=true)
	private Integer created;

	@RemoteProperty
	@Column(name = "updated",length=10,nullable=true,updatable=true)
	private Integer updated;


	public void setOutpayid(Integer outpayid){
		this.outpayid = outpayid;
	}
	public Integer getOutpayid(){
		return this.outpayid;
	}
	public void setRequestid(Integer requestid){
		this.requestid = requestid;
	}
	public Integer getRequestid(){
		return this.requestid;
	}
	public void setPaytype(Integer paytype){
		this.paytype = paytype;
	}
	public Integer getPaytype(){
		return this.paytype;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setAmount(Integer amount){
		this.amount = amount;
	}
	public Integer getAmount(){
		return this.amount;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setOutstatus(String outstatus){
		this.outstatus = outstatus;
	}
	public String getOutstatus(){
		return this.outstatus;
	}
	public void setOutid(String outid){
		this.outid = outid;
	}
	public String getOutid(){
		return this.outid;
	}
	public void setCreated(Integer created){
		this.created = created;
	}
	public Integer getCreated(){
		return this.created;
	}
	public void setUpdated(Integer updated){
		this.updated = updated;
	}
	public Integer getUpdated(){
		return this.updated;
	}
}