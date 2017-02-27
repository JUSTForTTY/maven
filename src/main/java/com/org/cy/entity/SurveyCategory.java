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
@Table(name = "survey_category")
@DataTransferObject
public class SurveyCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "picLoc1",length=255,nullable=true,updatable=true)
	private String picloc1;

	@RemoteProperty
	@Column(name = "picLoc2",length=255,nullable=true,updatable=true)
	private String picloc2;

	@RemoteProperty
	@Column(name = "picLoc3",length=255,nullable=true,updatable=true)
	private String picloc3;

	@RemoteProperty
	@Column(name = "picLoc4",length=255,nullable=true,updatable=true)
	private String picloc4;

	@RemoteProperty
	@Column(name = "picLoc5",length=255,nullable=true,updatable=true)
	private String picloc5;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "index_id",length=255,nullable=true,updatable=true)
	private String indexId;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPicloc1(String picloc1){
		this.picloc1 = picloc1;
	}
	public String getPicloc1(){
		return this.picloc1;
	}
	public void setPicloc2(String picloc2){
		this.picloc2 = picloc2;
	}
	public String getPicloc2(){
		return this.picloc2;
	}
	public void setPicloc3(String picloc3){
		this.picloc3 = picloc3;
	}
	public String getPicloc3(){
		return this.picloc3;
	}
	public void setPicloc4(String picloc4){
		this.picloc4 = picloc4;
	}
	public String getPicloc4(){
		return this.picloc4;
	}
	public void setPicloc5(String picloc5){
		this.picloc5 = picloc5;
	}
	public String getPicloc5(){
		return this.picloc5;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public void setIndexId(String indexId){
		this.indexId = indexId;
	}
	public String getIndexId(){
		return this.indexId;
	}
}