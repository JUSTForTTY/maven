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
@Table(name = "building")
@DataTransferObject
public class Building implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "building_name",length=100,updatable=true)
	private String buildingName;

	@RemoteProperty
	@Column(name = "city_code",length=10,nullable=true,updatable=true)
	private String cityCode;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "remark",length=255,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "remark2",length=255,nullable=true,updatable=true)
	private String remark2;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "logo",length=255,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "sublogo",length=255,nullable=true,updatable=true)
	private String sublogo;

	@RemoteProperty
	@Column(name = "property_note",length=20,nullable=true,updatable=true)
	private String propertyNote;

	@RemoteProperty
	@Column(name = "property_note_bg",length=256,nullable=true,updatable=true)
	private String propertyNoteBg;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setBuildingName(String buildingName){
		this.buildingName = buildingName;
	}
	public String getBuildingName(){
		return this.buildingName;
	}
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}
	public String getCityCode(){
		return this.cityCode;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime(){
		return this.modifyTime;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark2(String remark2){
		this.remark2 = remark2;
	}
	public String getRemark2(){
		return this.remark2;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setLogo(String logo){
		this.logo = logo;
	}
	public String getLogo(){
		return this.logo;
	}
	public void setSublogo(String sublogo){
		this.sublogo = sublogo;
	}
	public String getSublogo(){
		return this.sublogo;
	}
	public void setPropertyNote(String propertyNote){
		this.propertyNote = propertyNote;
	}
	public String getPropertyNote(){
		return this.propertyNote;
	}
	public void setPropertyNoteBg(String propertyNoteBg){
		this.propertyNoteBg = propertyNoteBg;
	}
	public String getPropertyNoteBg(){
		return this.propertyNoteBg;
	}
}