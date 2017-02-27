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
@Table(name = "orderprocessentity")
@DataTransferObject
public class OrderProcessEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "GID",length=10,updatable=true)
	private Integer gid;

	@RemoteProperty
	@Column(name = "cid",length=10,nullable=true,updatable=true)
	private Integer cid;

	@RemoteProperty
	@Column(name = "cname",length=255,nullable=true,updatable=true)
	private String cname;

	@RemoteProperty
	@Column(name = "ctime",length=255,nullable=true,updatable=true)
	private String ctime;

	@RemoteProperty
	@Column(name = "gname",length=255,nullable=true,updatable=true)
	private String gname;

	@RemoteProperty
	@Column(name = "pack",length=10,nullable=true,updatable=true)
	private Integer pack;

	@RemoteProperty
	@Column(name = "quantity",length=12,nullable=true,updatable=true)
	private Float quantity;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "uid",length=10,nullable=true,updatable=true)
	private Integer uid;

	@RemoteProperty
	@Column(name = "uname",length=255,nullable=true,updatable=true)
	private String uname;

	@RemoteProperty
	@Column(name = "unit",length=255,nullable=true,updatable=true)
	private String unit;


	public void setGid(Integer gid){
		this.gid = gid;
	}
	public Integer getGid(){
		return this.gid;
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
	public void setCtime(String ctime){
		this.ctime = ctime;
	}
	public String getCtime(){
		return this.ctime;
	}
	public void setGname(String gname){
		this.gname = gname;
	}
	public String getGname(){
		return this.gname;
	}
	public void setPack(Integer pack){
		this.pack = pack;
	}
	public Integer getPack(){
		return this.pack;
	}
	public void setQuantity(Float quantity){
		this.quantity = quantity;
	}
	public Float getQuantity(){
		return this.quantity;
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
	public void setUname(String uname){
		this.uname = uname;
	}
	public String getUname(){
		return this.uname;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
}