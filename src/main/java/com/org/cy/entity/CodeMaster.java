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
@Table(name = "codemaster")
@DataTransferObject
public class CodeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "codeno",length=10,updatable=true)
	private Integer codeno;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "codetype",length=11,updatable=true)
	private String codetype;

	@RemoteProperty
	@Column(name = "codename",length=255,nullable=true,updatable=true)
	private String codename;

	@RemoteProperty
	@Column(name = "codeDescription",length=255,nullable=true,updatable=true)
	private String codedescription;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "building_id",length=25,nullable=true,updatable=true)
	private String buildingId;

	@RemoteProperty
	@Column(name = "is_delete",length=10,nullable=true,updatable=true)
	private Integer isDelete;

	@RemoteProperty
	@Column(name = "id",length=25,nullable=true,updatable=true)
	private String id;


	public void setCodeno(Integer codeno){
		this.codeno = codeno;
	}
	public Integer getCodeno(){
		return this.codeno;
	}
	public void setCodetype(String codetype){
		this.codetype = codetype;
	}
	public String getCodetype(){
		return this.codetype;
	}
	public void setCodename(String codename){
		this.codename = codename;
	}
	public String getCodename(){
		return this.codename;
	}
	public void setCodedescription(String codedescription){
		this.codedescription = codedescription;
	}
	public String getCodedescription(){
		return this.codedescription;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public void setBuildingId(String buildingId){
		this.buildingId = buildingId;
	}
	public String getBuildingId(){
		return this.buildingId;
	}
	public void setIsDelete(Integer isDelete){
		this.isDelete = isDelete;
	}
	public Integer getIsDelete(){
		return this.isDelete;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
}