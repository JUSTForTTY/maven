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
@Table(name = "orderitem")
@DataTransferObject
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "orderinfo_id",length=10,updatable=true)
	private Integer orderinfoId;

	@RemoteProperty
	@Column(name = "itemno",length=3,updatable=true)
	private Integer itemno;

	@RemoteProperty
	@Column(name = "goods_id",length=10,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=255,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "privatecode",length=255,nullable=true,updatable=true)
	private String privatecode;

	@RemoteProperty
	@Column(name = "unitprice",length=10,updatable=true)
	private String unitprice;

	@RemoteProperty
	@Column(name = "itemnum",length=10,updatable=true)
	private Integer itemnum;

	@RemoteProperty
	@Column(name = "unit",length=32,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "itemsum",length=10,updatable=true)
	private String itemsum;

	@RemoteProperty
	@Column(name = "user_id",length=10,nullable=true,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "goods_state",length=20,nullable=true,updatable=true)
	private String goodsState;

	@RemoteProperty
	@Column(name = "comment_id",length=10,nullable=true,updatable=true)
	private Integer commentId;

	@RemoteProperty
	@Column(name = "status",length=32,nullable=true,updatable=true)
	private String status;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setOrderinfoId(Integer orderinfoId){
		this.orderinfoId = orderinfoId;
	}
	public Integer getOrderinfoId(){
		return this.orderinfoId;
	}
	public void setItemno(Integer itemno){
		this.itemno = itemno;
	}
	public Integer getItemno(){
		return this.itemno;
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
	public void setPrivatecode(String privatecode){
		this.privatecode = privatecode;
	}
	public String getPrivatecode(){
		return this.privatecode;
	}
	public void setUnitprice(String unitprice){
		this.unitprice = unitprice;
	}
	public String getUnitprice(){
		return this.unitprice;
	}
	public void setItemnum(Integer itemnum){
		this.itemnum = itemnum;
	}
	public Integer getItemnum(){
		return this.itemnum;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
	public void setItemsum(String itemsum){
		this.itemsum = itemsum;
	}
	public String getItemsum(){
		return this.itemsum;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public Integer getUserId(){
		return this.userId;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setGoodsState(String goodsState){
		this.goodsState = goodsState;
	}
	public String getGoodsState(){
		return this.goodsState;
	}
	public void setCommentId(Integer commentId){
		this.commentId = commentId;
	}
	public Integer getCommentId(){
		return this.commentId;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
}