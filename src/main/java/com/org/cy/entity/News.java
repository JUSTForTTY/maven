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
@Table(name = "news")
@DataTransferObject
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "channel_id",length=19,nullable=true,updatable=true)
	private Integer channelId;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "briefintro",length=255,nullable=true,updatable=true)
	private String briefintro;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "is_scroll",length=255,nullable=true,updatable=true)
	private String isScroll;

	@RemoteProperty
	@Column(name = "content",length=2147483647,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "status",length=255,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "onHome",length=10,nullable=true,updatable=true)
	private Integer onhome;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "gmt_publish",length=0,nullable=true,updatable=true)
	private Date gmtPublish;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;

	@RemoteProperty
	@Column(name = "nid",length=32,nullable=true,updatable=true)
	private String nid;

	@RemoteProperty
	@Column(name = "agree_num",length=10,nullable=true,updatable=true)
	private Integer agreeNum;

	@RemoteProperty
	@Column(name = "mobilecontent",length=2147483647,nullable=true,updatable=true)
	private String mobilecontent;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setChannelId(Integer channelId){
		this.channelId = channelId;
	}
	public Integer getChannelId(){
		return this.channelId;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setBriefintro(String briefintro){
		this.briefintro = briefintro;
	}
	public String getBriefintro(){
		return this.briefintro;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return this.image;
	}
	public void setIsScroll(String isScroll){
		this.isScroll = isScroll;
	}
	public String getIsScroll(){
		return this.isScroll;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setOnhome(Integer onhome){
		this.onhome = onhome;
	}
	public Integer getOnhome(){
		return this.onhome;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setGmtPublish(Date gmtPublish){
		this.gmtPublish = gmtPublish;
	}
	public Date getGmtPublish(){
		return this.gmtPublish;
	}
	public void setGmtCreate(Date gmtCreate){
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate(){
		return this.gmtCreate;
	}
	public void setGmtModify(Date gmtModify){
		this.gmtModify = gmtModify;
	}
	public Date getGmtModify(){
		return this.gmtModify;
	}
	public void setNid(String nid){
		this.nid = nid;
	}
	public String getNid(){
		return this.nid;
	}
	public void setAgreeNum(Integer agreeNum){
		this.agreeNum = agreeNum;
	}
	public Integer getAgreeNum(){
		return this.agreeNum;
	}
	public void setMobilecontent(String mobilecontent){
		this.mobilecontent = mobilecontent;
	}
	public String getMobilecontent(){
		return this.mobilecontent;
	}
}