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
@Table(name = "channel")
@DataTransferObject
public class Channel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "building_id",length=19,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "name",length=100,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "status",length=3,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "logo",length=255,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "is_display",length=3,nullable=true,updatable=true)
	private Integer isDisplay;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "create_time",length=255,nullable=true,updatable=true)
	private String createTime;

	@RemoteProperty
	@Column(name = "modify_time",length=255,nullable=true,updatable=true)
	private String modifyTime;

	@RemoteProperty
	@Column(name = "pic",length=50,nullable=true,updatable=true)
	private String pic;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setBuildingId(Integer buildingId){
		this.buildingId = buildingId;
	}
	public Integer getBuildingId(){
		return this.buildingId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setLogo(String logo){
		this.logo = logo;
	}
	public String getLogo(){
		return this.logo;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setIsDisplay(Integer isDisplay){
		this.isDisplay = isDisplay;
	}
	public Integer getIsDisplay(){
		return this.isDisplay;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	public String getCreateTime(){
		return this.createTime;
	}
	public void setModifyTime(String modifyTime){
		this.modifyTime = modifyTime;
	}
	public String getModifyTime(){
		return this.modifyTime;
	}
	public void setPic(String pic){
		this.pic = pic;
	}
	public String getPic(){
		return this.pic;
	}
}