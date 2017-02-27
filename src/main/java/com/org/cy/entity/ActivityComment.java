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
@Table(name = "activity_comment")
@DataTransferObject
public class ActivityComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "acid",length=20,updatable=true)
	private String acid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "aid",length=20,nullable=true,updatable=true)
	private String aid;

	@RemoteProperty
	@Column(name = "amid",length=20,nullable=true,updatable=true)
	private String amid;

	@RemoteProperty
	@Column(name = "cmid",length=20,nullable=true,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "parent_id",length=20,nullable=true,updatable=true)
	private String parentId;

	@RemoteProperty
	@Column(name = "content",length=255,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "reply",length=25,nullable=true,updatable=true)
	private String reply;

	@RemoteProperty
	@Column(name = "stick",length=10,nullable=true,updatable=true)
	private Integer stick;

	@RemoteProperty
	@Column(name = "status",length=10,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "Thumb",length=10,nullable=true,updatable=true)
	private Integer thumb;

	@RemoteProperty
	@Column(name = "miniature",length=55,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "image1",length=255,nullable=true,updatable=true)
	private String image1;

	@RemoteProperty
	@Column(name = "image2",length=255,nullable=true,updatable=true)
	private String image2;

	@RemoteProperty
	@Column(name = "image3",length=255,nullable=true,updatable=true)
	private String image3;

	@RemoteProperty
	@Column(name = "image4",length=255,nullable=true,updatable=true)
	private String image4;

	@RemoteProperty
	@Column(name = "image5",length=255,nullable=true,updatable=true)
	private String image5;

	@RemoteProperty
	@Column(name = "image_id",length=255,nullable=true,updatable=true)
	private String imageId;

	@RemoteProperty
	@Column(name = "nickname",length=55,nullable=true,updatable=true)
	private String nickname;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "click_num",length=10,nullable=true,updatable=true)
	private Integer clickNum;

	@RemoteProperty
	@Column(name = "agree_num",length=10,nullable=true,updatable=true)
	private Integer agreeNum;

	@RemoteProperty
	@Column(name = "disagree_num",length=10,nullable=true,updatable=true)
	private Integer disagreeNum;

	@RemoteProperty
	@Column(name = "agree_num_time",length=0,nullable=true,updatable=true)
	private Date agreeNumTime;


	public void setAcid(String acid){
		this.acid = acid;
	}
	public String getAcid(){
		return this.acid;
	}
	public void setBid(Integer bid){
		this.bid = bid;
	}
	public Integer getBid(){
		return this.bid;
	}
	public void setAid(String aid){
		this.aid = aid;
	}
	public String getAid(){
		return this.aid;
	}
	public void setAmid(String amid){
		this.amid = amid;
	}
	public String getAmid(){
		return this.amid;
	}
	public void setCmid(String cmid){
		this.cmid = cmid;
	}
	public String getCmid(){
		return this.cmid;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}
	public String getParentId(){
		return this.parentId;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public void setReply(String reply){
		this.reply = reply;
	}
	public String getReply(){
		return this.reply;
	}
	public void setStick(Integer stick){
		this.stick = stick;
	}
	public Integer getStick(){
		return this.stick;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setThumb(Integer thumb){
		this.thumb = thumb;
	}
	public Integer getThumb(){
		return this.thumb;
	}
	public void setMiniature(String miniature){
		this.miniature = miniature;
	}
	public String getMiniature(){
		return this.miniature;
	}
	public void setImage1(String image1){
		this.image1 = image1;
	}
	public String getImage1(){
		return this.image1;
	}
	public void setImage2(String image2){
		this.image2 = image2;
	}
	public String getImage2(){
		return this.image2;
	}
	public void setImage3(String image3){
		this.image3 = image3;
	}
	public String getImage3(){
		return this.image3;
	}
	public void setImage4(String image4){
		this.image4 = image4;
	}
	public String getImage4(){
		return this.image4;
	}
	public void setImage5(String image5){
		this.image5 = image5;
	}
	public String getImage5(){
		return this.image5;
	}
	public void setImageId(String imageId){
		this.imageId = imageId;
	}
	public String getImageId(){
		return this.imageId;
	}
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	public String getNickname(){
		return this.nickname;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setModifyUser(String modifyUser){
		this.modifyUser = modifyUser;
	}
	public String getModifyUser(){
		return this.modifyUser;
	}
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime(){
		return this.modifyTime;
	}
	public void setClickNum(Integer clickNum){
		this.clickNum = clickNum;
	}
	public Integer getClickNum(){
		return this.clickNum;
	}
	public void setAgreeNum(Integer agreeNum){
		this.agreeNum = agreeNum;
	}
	public Integer getAgreeNum(){
		return this.agreeNum;
	}
	public void setDisagreeNum(Integer disagreeNum){
		this.disagreeNum = disagreeNum;
	}
	public Integer getDisagreeNum(){
		return this.disagreeNum;
	}
	public void setAgreeNumTime(Date agreeNumTime){
		this.agreeNumTime = agreeNumTime;
	}
	public Date getAgreeNumTime(){
		return this.agreeNumTime;
	}
}