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
@Table(name = "reservation")
@DataTransferObject
public class Reservation implements Serializable {
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
	@Column(name = "order_time",length=0,nullable=true,updatable=true)
	private Date orderTime;

	@RemoteProperty
	@Column(name = "total_price",length=19,nullable=true,updatable=true)
	private Integer totalPrice;

	@RemoteProperty
	@Column(name = "total_score",length=19,nullable=true,updatable=true)
	private Integer totalScore;

	@RemoteProperty
	@Column(name = "goods_type_count",length=10,nullable=true,updatable=true)
	private Integer goodsTypeCount;

	@RemoteProperty
	@Column(name = "goods_count",length=10,nullable=true,updatable=true)
	private Integer goodsCount;

	@RemoteProperty
	@Column(name = "receiver_name",length=255,nullable=true,updatable=true)
	private String receiverName;

	@RemoteProperty
	@Column(name = "receiver_address",length=255,nullable=true,updatable=true)
	private String receiverAddress;

	@RemoteProperty
	@Column(name = "receiver_mobile",length=255,nullable=true,updatable=true)
	private String receiverMobile;

	@RemoteProperty
	@Column(name = "user_remarks",length=255,nullable=true,updatable=true)
	private String userRemarks;

	@RemoteProperty
	@Column(name = "user_name",length=255,nullable=true,updatable=true)
	private String userName;

	@RemoteProperty
	@Column(name = "referee",length=255,nullable=true,updatable=true)
	private String referee;

	@RemoteProperty
	@Column(name = "pay_type",length=255,nullable=true,updatable=true)
	private String payType;

	@RemoteProperty
	@Column(name = "is_split",length=255,nullable=true,updatable=true)
	private String isSplit;

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
	@Column(name = "start_time",length=0,nullable=true,updatable=true)
	private Date startTime;

	@RemoteProperty
	@Column(name = "end_time",length=0,nullable=true,updatable=true)
	private Date endTime;

	@RemoteProperty
	@Column(name = "F1",length=255,nullable=true,updatable=true)
	private String f1;

	@RemoteProperty
	@Column(name = "F2",length=255,nullable=true,updatable=true)
	private String f2;

	@RemoteProperty
	@Column(name = "F3",length=255,nullable=true,updatable=true)
	private String f3;

	@RemoteProperty
	@Column(name = "F4",length=255,nullable=true,updatable=true)
	private String f4;

	@RemoteProperty
	@Column(name = "extraction",length=255,nullable=true,updatable=true)
	private String extraction;

	@RemoteProperty
	@Column(name = "provinceId",length=255,nullable=true,updatable=true)
	private String provinceid;

	@RemoteProperty
	@Column(name = "cityId",length=255,nullable=true,updatable=true)
	private String cityid;

	@RemoteProperty
	@Column(name = "areaId",length=255,nullable=true,updatable=true)
	private String areaid;


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
	public void setOrderTime(Date orderTime){
		this.orderTime = orderTime;
	}
	public Date getOrderTime(){
		return this.orderTime;
	}
	public void setTotalPrice(Integer totalPrice){
		this.totalPrice = totalPrice;
	}
	public Integer getTotalPrice(){
		return this.totalPrice;
	}
	public void setTotalScore(Integer totalScore){
		this.totalScore = totalScore;
	}
	public Integer getTotalScore(){
		return this.totalScore;
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
	public void setReceiverName(String receiverName){
		this.receiverName = receiverName;
	}
	public String getReceiverName(){
		return this.receiverName;
	}
	public void setReceiverAddress(String receiverAddress){
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverAddress(){
		return this.receiverAddress;
	}
	public void setReceiverMobile(String receiverMobile){
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile(){
		return this.receiverMobile;
	}
	public void setUserRemarks(String userRemarks){
		this.userRemarks = userRemarks;
	}
	public String getUserRemarks(){
		return this.userRemarks;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setReferee(String referee){
		this.referee = referee;
	}
	public String getReferee(){
		return this.referee;
	}
	public void setPayType(String payType){
		this.payType = payType;
	}
	public String getPayType(){
		return this.payType;
	}
	public void setIsSplit(String isSplit){
		this.isSplit = isSplit;
	}
	public String getIsSplit(){
		return this.isSplit;
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
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	public Date getStartTime(){
		return this.startTime;
	}
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	public Date getEndTime(){
		return this.endTime;
	}
	public void setF1(String f1){
		this.f1 = f1;
	}
	public String getF1(){
		return this.f1;
	}
	public void setF2(String f2){
		this.f2 = f2;
	}
	public String getF2(){
		return this.f2;
	}
	public void setF3(String f3){
		this.f3 = f3;
	}
	public String getF3(){
		return this.f3;
	}
	public void setF4(String f4){
		this.f4 = f4;
	}
	public String getF4(){
		return this.f4;
	}
	public void setExtraction(String extraction){
		this.extraction = extraction;
	}
	public String getExtraction(){
		return this.extraction;
	}
	public void setProvinceid(String provinceid){
		this.provinceid = provinceid;
	}
	public String getProvinceid(){
		return this.provinceid;
	}
	public void setCityid(String cityid){
		this.cityid = cityid;
	}
	public String getCityid(){
		return this.cityid;
	}
	public void setAreaid(String areaid){
		this.areaid = areaid;
	}
	public String getAreaid(){
		return this.areaid;
	}
}