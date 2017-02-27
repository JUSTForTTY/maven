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
@Table(name = "oaplan")
@DataTransferObject
public class OaPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "title",length=255,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "plancontent",length=65535,nullable=true,updatable=true)
	private String plancontent;

	@RemoteProperty
	@Column(name = "tododate",length=0,updatable=true)
	private Date tododate;

	@RemoteProperty
	@Column(name = "promptstartdate",length=0,nullable=true,updatable=true)
	private Date promptstartdate;

	@RemoteProperty
	@Column(name = "oaplantype_id",length=10,updatable=true)
	private Integer oaplantypeId;

	@RemoteProperty
	@Column(name = "user_id",length=10,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setPlancontent(String plancontent){
		this.plancontent = plancontent;
	}
	public String getPlancontent(){
		return this.plancontent;
	}
	public void setTododate(Date tododate){
		this.tododate = tododate;
	}
	public Date getTododate(){
		return this.tododate;
	}
	public void setPromptstartdate(Date promptstartdate){
		this.promptstartdate = promptstartdate;
	}
	public Date getPromptstartdate(){
		return this.promptstartdate;
	}
	public void setOaplantypeId(Integer oaplantypeId){
		this.oaplantypeId = oaplantypeId;
	}
	public Integer getOaplantypeId(){
		return this.oaplantypeId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public Integer getUserId(){
		return this.userId;
	}
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	public Date getCreatetime(){
		return this.createtime;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
}