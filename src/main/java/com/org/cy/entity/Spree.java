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
@Table(name = "spree")
@DataTransferObject
public class Spree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "sid",length=255,nullable=true,updatable=true)
	private String sid;

	@RemoteProperty
	@Column(name = "goods_id",length=255,nullable=true,updatable=true)
	private String goodsId;

	@RemoteProperty
	@Column(name = "quantity",length=255,nullable=true,updatable=true)
	private String quantity;

	@RemoteProperty
	@Column(name = "unit",length=255,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setSid(String sid){
		this.sid = sid;
	}
	public String getSid(){
		return this.sid;
	}
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
	}
	public String getGoodsId(){
		return this.goodsId;
	}
	public void setQuantity(String quantity){
		this.quantity = quantity;
	}
	public String getQuantity(){
		return this.quantity;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
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
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	public String getUpdateUser(){
		return this.updateUser;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
}