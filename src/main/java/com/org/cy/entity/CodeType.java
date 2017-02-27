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
@Table(name = "codetype")
@DataTransferObject
public class CodeType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "codeDescription",length=255,nullable=true,updatable=true)
	private String codedescription;

	@RemoteProperty
	@Column(name = "codetype",length=255,nullable=true,updatable=true)
	private String codetype;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setCodedescription(String codedescription){
		this.codedescription = codedescription;
	}
	public String getCodedescription(){
		return this.codedescription;
	}
	public void setCodetype(String codetype){
		this.codetype = codetype;
	}
	public String getCodetype(){
		return this.codetype;
	}
}