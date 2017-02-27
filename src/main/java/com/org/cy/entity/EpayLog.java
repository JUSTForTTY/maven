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
@Table(name = "epaylog")
@DataTransferObject
public class EpayLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "orderNo",length=45,nullable=true,updatable=true)
	private String orderno;

	@RemoteProperty
	@Column(name = "transAmt",length=45,nullable=true,updatable=true)
	private String transamt;

	@RemoteProperty
	@Column(name = "customerName",length=45,nullable=true,updatable=true)
	private String customername;

	@RemoteProperty
	@Column(name = "customerEMail",length=45,nullable=true,updatable=true)
	private String customeremail;

	@RemoteProperty
	@Column(name = "bank",length=45,nullable=true,updatable=true)
	private String bank;

	@RemoteProperty
	@Column(name = "plain",length=512,nullable=true,updatable=true)
	private String plain;

	@RemoteProperty
	@Column(name = "signature",length=512,nullable=true,updatable=true)
	private String signature;

	@RemoteProperty
	@Column(name = "transId",length=45,nullable=true,updatable=true)
	private String transid;

	@RemoteProperty
	@Column(name = "merchantId",length=45,nullable=true,updatable=true)
	private String merchantid;

	@RemoteProperty
	@Column(name = "transDateTime",length=45,nullable=true,updatable=true)
	private String transdatetime;

	@RemoteProperty
	@Column(name = "status",length=3,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "gmtCreate",length=0,nullable=true,updatable=true)
	private Date gmtcreate;


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
	public void setTransamt(String transamt){
		this.transamt = transamt;
	}
	public String getTransamt(){
		return this.transamt;
	}
	public void setCustomername(String customername){
		this.customername = customername;
	}
	public String getCustomername(){
		return this.customername;
	}
	public void setCustomeremail(String customeremail){
		this.customeremail = customeremail;
	}
	public String getCustomeremail(){
		return this.customeremail;
	}
	public void setBank(String bank){
		this.bank = bank;
	}
	public String getBank(){
		return this.bank;
	}
	public void setPlain(String plain){
		this.plain = plain;
	}
	public String getPlain(){
		return this.plain;
	}
	public void setSignature(String signature){
		this.signature = signature;
	}
	public String getSignature(){
		return this.signature;
	}
	public void setTransid(String transid){
		this.transid = transid;
	}
	public String getTransid(){
		return this.transid;
	}
	public void setMerchantid(String merchantid){
		this.merchantid = merchantid;
	}
	public String getMerchantid(){
		return this.merchantid;
	}
	public void setTransdatetime(String transdatetime){
		this.transdatetime = transdatetime;
	}
	public String getTransdatetime(){
		return this.transdatetime;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setGmtcreate(Date gmtcreate){
		this.gmtcreate = gmtcreate;
	}
	public Date getGmtcreate(){
		return this.gmtcreate;
	}
}