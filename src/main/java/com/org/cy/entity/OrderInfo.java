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
@Table(name = "orderinfo")
@DataTransferObject
public class OrderInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "orderno",length=20,updatable=true)
	private String orderno;

	@RemoteProperty
	@Column(name = "ordertime",length=0,updatable=true)
	private Date ordertime;

	@RemoteProperty
	@Column(name = "itemcount",length=10,updatable=true)
	private Integer itemcount;

	@RemoteProperty
	@Column(name = "goodssum",length=10,updatable=true)
	private String goodssum;

	@RemoteProperty
	@Column(name = "servicesum",length=10,updatable=true)
	private String servicesum;

	@RemoteProperty
	@Column(name = "othersum",length=10,updatable=true)
	private String othersum;

	@RemoteProperty
	@Column(name = "totalsum",length=10,updatable=true)
	private String totalsum;

	@RemoteProperty
	@Column(name = "score",length=10,updatable=true)
	private Integer score;

	@RemoteProperty
	@Column(name = "receivername",length=255,updatable=true)
	private String receivername;

	@RemoteProperty
	@Column(name = "receivertel",length=32,nullable=true,updatable=true)
	private String receivertel;

	@RemoteProperty
	@Column(name = "receivermobile",length=20,nullable=true,updatable=true)
	private String receivermobile;

	@RemoteProperty
	@Column(name = "receiveremail",length=255,nullable=true,updatable=true)
	private String receiveremail;

	@RemoteProperty
	@Column(name = "receiveraddr",length=255,updatable=true)
	private String receiveraddr;

	@RemoteProperty
	@Column(name = "receiverzip",length=10,nullable=true,updatable=true)
	private String receiverzip;

	@RemoteProperty
	@Column(name = "user_id",length=10,nullable=true,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "username",length=255,nullable=true,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "userremark",length=255,nullable=true,updatable=true)
	private String userremark;

	@RemoteProperty
	@Column(name = "delivertype_id",length=10,nullable=true,updatable=true)
	private Integer delivertypeId;

	@RemoteProperty
	@Column(name = "deliverremark",length=255,nullable=true,updatable=true)
	private String deliverremark;

	@RemoteProperty
	@Column(name = "paymenttype_id",length=10,nullable=true,updatable=true)
	private Integer paymenttypeId;

	@RemoteProperty
	@Column(name = "paymenttime",length=0,nullable=true,updatable=true)
	private Date paymenttime;

	@RemoteProperty
	@Column(name = "paymentremark",length=255,nullable=true,updatable=true)
	private String paymentremark;

	@RemoteProperty
	@Column(name = "requireinvoice",length=3,updatable=true)
	private Integer requireinvoice;

	@RemoteProperty
	@Column(name = "invoicetitle",length=255,nullable=true,updatable=true)
	private String invoicetitle;

	@RemoteProperty
	@Column(name = "status",length=10,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=true)
	private String openid;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setOrderno(String orderno){
		this.orderno = orderno;
	}
	public String getOrderno(){
		return this.orderno;
	}
	public void setOrdertime(Date ordertime){
		this.ordertime = ordertime;
	}
	public Date getOrdertime(){
		return this.ordertime;
	}
	public void setItemcount(Integer itemcount){
		this.itemcount = itemcount;
	}
	public Integer getItemcount(){
		return this.itemcount;
	}
	public void setGoodssum(String goodssum){
		this.goodssum = goodssum;
	}
	public String getGoodssum(){
		return this.goodssum;
	}
	public void setServicesum(String servicesum){
		this.servicesum = servicesum;
	}
	public String getServicesum(){
		return this.servicesum;
	}
	public void setOthersum(String othersum){
		this.othersum = othersum;
	}
	public String getOthersum(){
		return this.othersum;
	}
	public void setTotalsum(String totalsum){
		this.totalsum = totalsum;
	}
	public String getTotalsum(){
		return this.totalsum;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	public Integer getScore(){
		return this.score;
	}
	public void setReceivername(String receivername){
		this.receivername = receivername;
	}
	public String getReceivername(){
		return this.receivername;
	}
	public void setReceivertel(String receivertel){
		this.receivertel = receivertel;
	}
	public String getReceivertel(){
		return this.receivertel;
	}
	public void setReceivermobile(String receivermobile){
		this.receivermobile = receivermobile;
	}
	public String getReceivermobile(){
		return this.receivermobile;
	}
	public void setReceiveremail(String receiveremail){
		this.receiveremail = receiveremail;
	}
	public String getReceiveremail(){
		return this.receiveremail;
	}
	public void setReceiveraddr(String receiveraddr){
		this.receiveraddr = receiveraddr;
	}
	public String getReceiveraddr(){
		return this.receiveraddr;
	}
	public void setReceiverzip(String receiverzip){
		this.receiverzip = receiverzip;
	}
	public String getReceiverzip(){
		return this.receiverzip;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public Integer getUserId(){
		return this.userId;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUserremark(String userremark){
		this.userremark = userremark;
	}
	public String getUserremark(){
		return this.userremark;
	}
	public void setDelivertypeId(Integer delivertypeId){
		this.delivertypeId = delivertypeId;
	}
	public Integer getDelivertypeId(){
		return this.delivertypeId;
	}
	public void setDeliverremark(String deliverremark){
		this.deliverremark = deliverremark;
	}
	public String getDeliverremark(){
		return this.deliverremark;
	}
	public void setPaymenttypeId(Integer paymenttypeId){
		this.paymenttypeId = paymenttypeId;
	}
	public Integer getPaymenttypeId(){
		return this.paymenttypeId;
	}
	public void setPaymenttime(Date paymenttime){
		this.paymenttime = paymenttime;
	}
	public Date getPaymenttime(){
		return this.paymenttime;
	}
	public void setPaymentremark(String paymentremark){
		this.paymentremark = paymentremark;
	}
	public String getPaymentremark(){
		return this.paymentremark;
	}
	public void setRequireinvoice(Integer requireinvoice){
		this.requireinvoice = requireinvoice;
	}
	public Integer getRequireinvoice(){
		return this.requireinvoice;
	}
	public void setInvoicetitle(String invoicetitle){
		this.invoicetitle = invoicetitle;
	}
	public String getInvoicetitle(){
		return this.invoicetitle;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setOpenid(String openid){
		this.openid = openid;
	}
	public String getOpenid(){
		return this.openid;
	}
}