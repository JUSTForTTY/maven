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
@Table(name = "sub_order")
@DataTransferObject
public class SubOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "order_id",length=19,nullable=true,updatable=true)
	private Integer orderId;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "member_name",length=255,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "subtotal_price",length=19,nullable=true,updatable=true)
	private Integer subtotalPrice;

	@RemoteProperty
	@Column(name = "subtotal_score",length=19,nullable=true,updatable=true)
	private Integer subtotalScore;

	@RemoteProperty
	@Column(name = "goods_type_count",length=10,nullable=true,updatable=true)
	private Integer goodsTypeCount;

	@RemoteProperty
	@Column(name = "goods_count",length=10,nullable=true,updatable=true)
	private Integer goodsCount;

	@RemoteProperty
	@Column(name = "status",length=255,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;

	@RemoteProperty
	@Column(name = "member_id",length=10,nullable=true,updatable=true)
	private Integer memberId;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	public Integer getOrderId(){
		return this.orderId;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	public String getMemberName(){
		return this.memberName;
	}
	public void setSubtotalPrice(Integer subtotalPrice){
		this.subtotalPrice = subtotalPrice;
	}
	public Integer getSubtotalPrice(){
		return this.subtotalPrice;
	}
	public void setSubtotalScore(Integer subtotalScore){
		this.subtotalScore = subtotalScore;
	}
	public Integer getSubtotalScore(){
		return this.subtotalScore;
	}
	public void setGoodsTypeCount(Integer goodsTypeCount){
		this.goodsTypeCount = goodsTypeCount;
	}
	public Integer getGoodsTypeCount(){
		return this.goodsTypeCount;
	}
	public void setGoodsCount(Integer goodsCount){
		this.goodsCount = goodsCount;
	}
	public Integer getGoodsCount(){
		return this.goodsCount;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
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
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	public Integer getMemberId(){
		return this.memberId;
	}
}