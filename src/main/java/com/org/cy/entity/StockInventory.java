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
@Table(name = "stock_inventory")
@DataTransferObject
public class StockInventory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "goods_id",length=10,nullable=true,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=100,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "user_name",length=50,nullable=true,updatable=true)
	private String userName;

	@RemoteProperty
	@Column(name = "miniature",length=200,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "member_id",length=10,nullable=true,updatable=true)
	private Integer memberId;

	@RemoteProperty
	@Column(name = "member_name",length=50,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "quantity",length=10,nullable=true,updatable=true)
	private Integer quantity;

	@RemoteProperty
	@Column(name = "unit",length=20,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "building_id",length=10,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setGoodsId(Integer goodsId){
		this.goodsId = goodsId;
	}
	public Integer getGoodsId(){
		return this.goodsId;
	}
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	public String getGoodsName(){
		return this.goodsName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setMiniature(String miniature){
		this.miniature = miniature;
	}
	public String getMiniature(){
		return this.miniature;
	}
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	public Integer getMemberId(){
		return this.memberId;
	}
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	public String getMemberName(){
		return this.memberName;
	}
	public void setQuantity(Integer quantity){
		this.quantity = quantity;
	}
	public Integer getQuantity(){
		return this.quantity;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
	public void setBuildingId(Integer buildingId){
		this.buildingId = buildingId;
	}
	public Integer getBuildingId(){
		return this.buildingId;
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
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	public String getUpdateUser(){
		return this.updateUser;
	}
}