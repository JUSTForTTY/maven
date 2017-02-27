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
@Table(name = "order_detail")
@DataTransferObject
public class OrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "order_id",length=19,nullable=true,updatable=true)
	private Integer orderId;

	@RemoteProperty
	@Column(name = "sub_order_id",length=19,nullable=true,updatable=true)
	private Integer subOrderId;

	@RemoteProperty
	@Column(name = "goods_id",length=19,nullable=true,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=255,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "miniature",length=255,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "member_name",length=255,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "unit_price",length=19,nullable=true,updatable=true)
	private Integer unitPrice;

	@RemoteProperty
	@Column(name = "unit_score",length=19,nullable=true,updatable=true)
	private Integer unitScore;

	@RemoteProperty
	@Column(name = "goods_count",length=10,nullable=true,updatable=true)
	private Integer goodsCount;

	@RemoteProperty
	@Column(name = "single_price",length=19,nullable=true,updatable=true)
	private Integer singlePrice;

	@RemoteProperty
	@Column(name = "single_score",length=19,nullable=true,updatable=true)
	private Integer singleScore;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;

	@RemoteProperty
	@Column(name = "goods_state",length=20,nullable=true,updatable=true)
	private String goodsState;

	@RemoteProperty
	@Column(name = "member_id",length=10,nullable=true,updatable=true)
	private Integer memberId;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	public Integer getOrderId(){
		return this.orderId;
	}
	public void setSubOrderId(Integer subOrderId){
		this.subOrderId = subOrderId;
	}
	public Integer getSubOrderId(){
		return this.subOrderId;
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
	public void setMiniature(String miniature){
		this.miniature = miniature;
	}
	public String getMiniature(){
		return this.miniature;
	}
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	public String getMemberName(){
		return this.memberName;
	}
	public void setUnitPrice(Integer unitPrice){
		this.unitPrice = unitPrice;
	}
	public Integer getUnitPrice(){
		return this.unitPrice;
	}
	public void setUnitScore(Integer unitScore){
		this.unitScore = unitScore;
	}
	public Integer getUnitScore(){
		return this.unitScore;
	}
	public void setGoodsCount(Integer goodsCount){
		this.goodsCount = goodsCount;
	}
	public Integer getGoodsCount(){
		return this.goodsCount;
	}
	public void setSinglePrice(Integer singlePrice){
		this.singlePrice = singlePrice;
	}
	public Integer getSinglePrice(){
		return this.singlePrice;
	}
	public void setSingleScore(Integer singleScore){
		this.singleScore = singleScore;
	}
	public Integer getSingleScore(){
		return this.singleScore;
	}
	public void setGmtCreate(Date gmtCreate){
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate(){
		return this.gmtCreate;
	}
	public void setGmtModify(Date gmtModify){
		this.gmtModify = gmtModify;
	}
	public Date getGmtModify(){
		return this.gmtModify;
	}
	public void setGoodsState(String goodsState){
		this.goodsState = goodsState;
	}
	public String getGoodsState(){
		return this.goodsState;
	}
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	public Integer getMemberId(){
		return this.memberId;
	}
}