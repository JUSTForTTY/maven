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
@Table(name = "activity")
@DataTransferObject
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "aid",length=20,updatable=true)
	private String aid;

	@RemoteProperty
	@Column(name = "cid",length=20,updatable=true)
	private String cid;

	@RemoteProperty
	@Column(name = "bid",length=11,updatable=true)
	private String bid;

	@RemoteProperty
	@Column(name = "name",length=120,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "subtitle",length=120,nullable=true,updatable=true)
	private String subtitle;

	@RemoteProperty
	@Column(name = "logo",length=120,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "official_url",length=120,nullable=true,updatable=true)
	private String officialUrl;

	@RemoteProperty
	@Column(name = "area_id",length=6,nullable=true,updatable=true)
	private String areaId;

	@RemoteProperty
	@Column(name = "province_id",length=6,nullable=true,updatable=true)
	private String provinceId;

	@RemoteProperty
	@Column(name = "city_id",length=6,nullable=true,updatable=true)
	private String cityId;

	@RemoteProperty
	@Column(name = "site",length=120,nullable=true,updatable=true)
	private String site;

	@RemoteProperty
	@Column(name = "address",length=120,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "lat",length=22,nullable=true,updatable=true)
	private String lat;

	@RemoteProperty
	@Column(name = "lng",length=22,nullable=true,updatable=true)
	private String lng;

	@RemoteProperty
	@Column(name = "type",length=0,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "day",length=10,nullable=true,updatable=true)
	private Integer day;

	@RemoteProperty
	@Column(name = "register_start",length=0,nullable=true,updatable=true)
	private Date registerStart;

	@RemoteProperty
	@Column(name = "register_end",length=0,nullable=true,updatable=true)
	private Date registerEnd;

	@RemoteProperty
	@Column(name = "start_time",length=0,nullable=true,updatable=true)
	private Date startTime;

	@RemoteProperty
	@Column(name = "end_time",length=0,nullable=true,updatable=true)
	private Date endTime;

	@RemoteProperty
	@Column(name = "status",length=0,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "briefintro",length=4096,nullable=true,updatable=true)
	private String briefintro;

	@RemoteProperty
	@Column(name = "act_detail",length=65535,nullable=true,updatable=true)
	private String actDetail;

	@RemoteProperty
	@Column(name = "act_detail_url",length=120,nullable=true,updatable=true)
	private String actDetailUrl;

	@RemoteProperty
	@Column(name = "stick",length=10,nullable=true,updatable=true)
	private Integer stick;

	@RemoteProperty
	@Column(name = "follow_sum",length=7,nullable=true,updatable=true)
	private Integer followSum;

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

	@RemoteProperty
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private Integer isDelete;

	@RemoteProperty
	@Column(name = "age",length=255,nullable=true,updatable=true)
	private String age;

	@RemoteProperty
	@Column(name = "mobile_content",length=65535,nullable=true,updatable=true)
	private String mobileContent;

	@RemoteProperty
	@Column(name = "mobileLogo",length=255,nullable=true,updatable=true)
	private String mobilelogo;


	public void setAid(String aid){
		this.aid = aid;
	}
	public String getAid(){
		return this.aid;
	}
	public void setCid(String cid){
		this.cid = cid;
	}
	public String getCid(){
		return this.cid;
	}
	public void setBid(String bid){
		this.bid = bid;
	}
	public String getBid(){
		return this.bid;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}
	public String getSubtitle(){
		return this.subtitle;
	}
	public void setLogo(String logo){
		this.logo = logo;
	}
	public String getLogo(){
		return this.logo;
	}
	public void setOfficialUrl(String officialUrl){
		this.officialUrl = officialUrl;
	}
	public String getOfficialUrl(){
		return this.officialUrl;
	}
	public void setAreaId(String areaId){
		this.areaId = areaId;
	}
	public String getAreaId(){
		return this.areaId;
	}
	public void setProvinceId(String provinceId){
		this.provinceId = provinceId;
	}
	public String getProvinceId(){
		return this.provinceId;
	}
	public void setCityId(String cityId){
		this.cityId = cityId;
	}
	public String getCityId(){
		return this.cityId;
	}
	public void setSite(String site){
		this.site = site;
	}
	public String getSite(){
		return this.site;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setLat(String lat){
		this.lat = lat;
	}
	public String getLat(){
		return this.lat;
	}
	public void setLng(String lng){
		this.lng = lng;
	}
	public String getLng(){
		return this.lng;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setDay(Integer day){
		this.day = day;
	}
	public Integer getDay(){
		return this.day;
	}
	public void setRegisterStart(Date registerStart){
		this.registerStart = registerStart;
	}
	public Date getRegisterStart(){
		return this.registerStart;
	}
	public void setRegisterEnd(Date registerEnd){
		this.registerEnd = registerEnd;
	}
	public Date getRegisterEnd(){
		return this.registerEnd;
	}
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	public Date getStartTime(){
		return this.startTime;
	}
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	public Date getEndTime(){
		return this.endTime;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setBriefintro(String briefintro){
		this.briefintro = briefintro;
	}
	public String getBriefintro(){
		return this.briefintro;
	}
	public void setActDetail(String actDetail){
		this.actDetail = actDetail;
	}
	public String getActDetail(){
		return this.actDetail;
	}
	public void setActDetailUrl(String actDetailUrl){
		this.actDetailUrl = actDetailUrl;
	}
	public String getActDetailUrl(){
		return this.actDetailUrl;
	}
	public void setStick(Integer stick){
		this.stick = stick;
	}
	public Integer getStick(){
		return this.stick;
	}
	public void setFollowSum(Integer followSum){
		this.followSum = followSum;
	}
	public Integer getFollowSum(){
		return this.followSum;
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
	public void setIsDelete(Integer isDelete){
		this.isDelete = isDelete;
	}
	public Integer getIsDelete(){
		return this.isDelete;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getAge(){
		return this.age;
	}
	public void setMobileContent(String mobileContent){
		this.mobileContent = mobileContent;
	}
	public String getMobileContent(){
		return this.mobileContent;
	}
	public void setMobilelogo(String mobilelogo){
		this.mobilelogo = mobilelogo;
	}
	public String getMobilelogo(){
		return this.mobilelogo;
	}
}