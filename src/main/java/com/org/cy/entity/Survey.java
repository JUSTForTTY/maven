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
@Table(name = "survey")
@DataTransferObject
public class Survey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "ip",length=10,updatable=true)
	private Integer ip;

	@RemoteProperty
	@Column(name = "problem",length=255,nullable=true,updatable=true)
	private String problem;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "category",length=255,nullable=true,updatable=true)
	private String category;

	@RemoteProperty
	@Column(name = "onHome",length=255,nullable=true,updatable=true)
	private String onhome;


	public void setIp(Integer ip){
		this.ip = ip;
	}
	public Integer getIp(){
		return this.ip;
	}
	public void setProblem(String problem){
		this.problem = problem;
	}
	public String getProblem(){
		return this.problem;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return this.category;
	}
	public void setOnhome(String onhome){
		this.onhome = onhome;
	}
	public String getOnhome(){
		return this.onhome;
	}
}