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
@Table(name = "orderentity")
@DataTransferObject
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "OID",length=10,updatable=true)
	private Integer oid;

	@RemoteProperty
	@Column(name = "cid",length=10,nullable=true,updatable=true)
	private Integer cid;

	@RemoteProperty
	@Column(name = "cname",length=255,nullable=true,updatable=true)
	private String cname;

	@RemoteProperty
	@Column(name = "create_time",length=255,nullable=true,updatable=true)
	private String createTime;

	@RemoteProperty
	@Column(name = "gname",length=255,nullable=true,updatable=true)
	private String gname;

	@RemoteProperty
	@Column(name = "mname",length=255,nullable=true,updatable=true)
	private String mname;

	@RemoteProperty
	@Column(name = "price",length=12,nullable=true,updatable=true)
	private Float price;

	@RemoteProperty
	@Column(name = "ptotal",length=12,nullable=true,updatable=true)
	private Float ptotal;

	@RemoteProperty
	@Column(name = "quantity",length=10,nullable=true,updatable=true)
	private Integer quantity;

	@RemoteProperty
	@Column(name = "sid",length=10,nullable=true,updatable=true)
	private Integer sid;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "uid",length=10,nullable=true,updatable=true)
	private Integer uid;


	public void setOid(Integer oid){
		this.oid = oid;
	}
	public Integer getOid(){
		return this.oid;
	}
	public void setCid(Integer cid){
		this.cid = cid;
	}
	public Integer getCid(){
		return this.cid;
	}
	public void setCname(String cname){
		this.cname = cname;
	}
	public String getCname(){
		return this.cname;
	}
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	public String getCreateTime(){
		return this.createTime;
	}
	public void setGname(String gname){
		this.gname = gname;
	}
	public String getGname(){
		return this.gname;
	}
	public void setMname(String mname){
		this.mname = mname;
	}
	public String getMname(){
		return this.mname;
	}
	public void setPrice(Float price){
		this.price = price;
	}
	public Float getPrice(){
		return this.price;
	}
	public void setPtotal(Float ptotal){
		this.ptotal = ptotal;
	}
	public Float getPtotal(){
		return this.ptotal;
	}
	public void setQuantity(Integer quantity){
		this.quantity = quantity;
	}
	public Integer getQuantity(){
		return this.quantity;
	}
	public void setSid(Integer sid){
		this.sid = sid;
	}
	public Integer getSid(){
		return this.sid;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setUid(Integer uid){
		this.uid = uid;
	}
	public Integer getUid(){
		return this.uid;
	}
}