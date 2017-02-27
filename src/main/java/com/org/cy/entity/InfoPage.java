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
@Table(name = "infopage")
@DataTransferObject
public class InfoPage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "infotrunk_id",length=10,updatable=true)
	private Integer infotrunkId;

	@RemoteProperty
	@Column(name = "pageno",length=10,updatable=true)
	private Integer pageno;

	@RemoteProperty
	@Column(name = "content",length=65535,updatable=true)
	private String content;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setInfotrunkId(Integer infotrunkId){
		this.infotrunkId = infotrunkId;
	}
	public Integer getInfotrunkId(){
		return this.infotrunkId;
	}
	public void setPageno(Integer pageno){
		this.pageno = pageno;
	}
	public Integer getPageno(){
		return this.pageno;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
}