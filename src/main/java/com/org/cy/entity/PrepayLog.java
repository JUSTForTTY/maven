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
@Table(name = "prepaylog")
@DataTransferObject
public class PrepayLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "user_id",length=10,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "orderinfo_id",length=19,nullable=true,updatable=true)
	private Integer orderinfoId;

	@RemoteProperty
	@Column(name = "paysum",length=10,updatable=true)
	private String paysum;

	@RemoteProperty
	@Column(name = "paytype",length=32,updatable=true)
	private String paytype;

	@RemoteProperty
	@Column(name = "paytime",length=0,updatable=true)
	private Date paytime;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "creator",length=10,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public Integer getUserId(){
		return this.userId;
	}
	public void setOrderinfoId(Integer orderinfoId){
		this.orderinfoId = orderinfoId;
	}
	public Integer getOrderinfoId(){
		return this.orderinfoId;
	}
	public void setPaysum(String paysum){
		this.paysum = paysum;
	}
	public String getPaysum(){
		return this.paysum;
	}
	public void setPaytype(String paytype){
		this.paytype = paytype;
	}
	public String getPaytype(){
		return this.paytype;
	}
	public void setPaytime(Date paytime){
		this.paytime = paytime;
	}
	public Date getPaytime(){
		return this.paytime;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setCreator(Integer creator){
		this.creator = creator;
	}
	public Integer getCreator(){
		return this.creator;
	}
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	public Date getCreatetime(){
		return this.createtime;
	}
}