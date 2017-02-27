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
@Table(name = "survey_result")
@DataTransferObject
public class SurveyResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "vip_id",length=255,nullable=true,updatable=true)
	private String vipId;

	@RemoteProperty
	@Column(name = "category",length=255,nullable=true,updatable=true)
	private String category;

	@RemoteProperty
	@Column(name = "addTime",length=255,nullable=true,updatable=true)
	private String addtime;

	@RemoteProperty
	@Column(name = "problem_id",length=255,nullable=true,updatable=true)
	private String problemId;

	@RemoteProperty
	@Column(name = "result",length=255,nullable=true,updatable=true)
	private String result;

	@RemoteProperty
	@Column(name = "surveyCategory_id",length=255,nullable=true,updatable=true)
	private String surveycategoryId;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setVipId(String vipId){
		this.vipId = vipId;
	}
	public String getVipId(){
		return this.vipId;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return this.category;
	}
	public void setAddtime(String addtime){
		this.addtime = addtime;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setProblemId(String problemId){
		this.problemId = problemId;
	}
	public String getProblemId(){
		return this.problemId;
	}
	public void setResult(String result){
		this.result = result;
	}
	public String getResult(){
		return this.result;
	}
	public void setSurveycategoryId(String surveycategoryId){
		this.surveycategoryId = surveycategoryId;
	}
	public String getSurveycategoryId(){
		return this.surveycategoryId;
	}
}