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
@Table(name = "message")
@DataTransferObject
public class Message implements Serializable {
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
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "messagetype_id",length=10,updatable=true)
	private Integer messagetypeId;

	@RemoteProperty
	@Column(name = "recipient_userid",length=10,nullable=true,updatable=true)
	private Integer recipientUserid;

	@RemoteProperty
	@Column(name = "notice_mail",length=3,nullable=true,updatable=true)
	private Integer noticeMail;

	@RemoteProperty
	@Column(name = "notice_msn",length=3,nullable=true,updatable=true)
	private Integer noticeMsn;

	@RemoteProperty
	@Column(name = "notice_mobile",length=3,nullable=true,updatable=true)
	private Integer noticeMobile;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "creator",length=10,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "isopen",length=3,updatable=true)
	private Integer isopen;


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
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public void setMessagetypeId(Integer messagetypeId){
		this.messagetypeId = messagetypeId;
	}
	public Integer getMessagetypeId(){
		return this.messagetypeId;
	}
	public void setRecipientUserid(Integer recipientUserid){
		this.recipientUserid = recipientUserid;
	}
	public Integer getRecipientUserid(){
		return this.recipientUserid;
	}
	public void setNoticeMail(Integer noticeMail){
		this.noticeMail = noticeMail;
	}
	public Integer getNoticeMail(){
		return this.noticeMail;
	}
	public void setNoticeMsn(Integer noticeMsn){
		this.noticeMsn = noticeMsn;
	}
	public Integer getNoticeMsn(){
		return this.noticeMsn;
	}
	public void setNoticeMobile(Integer noticeMobile){
		this.noticeMobile = noticeMobile;
	}
	public Integer getNoticeMobile(){
		return this.noticeMobile;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
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
	public void setIsopen(Integer isopen){
		this.isopen = isopen;
	}
	public Integer getIsopen(){
		return this.isopen;
	}
}