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
@Table(name = "answer")
@DataTransferObject
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "ia",length=10,updatable=true)
	private Integer ia;

	@RemoteProperty
	@Column(name = "ip",length=10,nullable=true,updatable=true)
	private Integer ip;

	@RemoteProperty
	@Column(name = "answer",length=255,nullable=true,updatable=true)
	private String answer;

	@RemoteProperty
	@Column(name = "category",length=255,nullable=true,updatable=true)
	private String category;

	@RemoteProperty
	@Column(name = "count",length=10,nullable=true,updatable=true)
	private Integer count;


	public void setIa(Integer ia){
		this.ia = ia;
	}
	public Integer getIa(){
		return this.ia;
	}
	public void setIp(Integer ip){
		this.ip = ip;
	}
	public Integer getIp(){
		return this.ip;
	}
	public void setAnswer(String answer){
		this.answer = answer;
	}
	public String getAnswer(){
		return this.answer;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return this.category;
	}
	public void setCount(Integer count){
		this.count = count;
	}
	public Integer getCount(){
		return this.count;
	}
}