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
@Table(name = "index_custom")
@DataTransferObject
public class IndexCustom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "building_id",length=19,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "floor",length=10,nullable=true,updatable=true)
	private Integer floor;

	@RemoteProperty
	@Column(name = "codeno",length=10,nullable=true,updatable=true)
	private Integer codeno;

	@RemoteProperty
	@Column(name = "codetype",length=255,nullable=true,updatable=true)
	private String codetype;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "custom_detail",length=65535,nullable=true,updatable=true)
	private String customDetail;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "description",length=255,nullable=true,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "enable",length=255,nullable=true,updatable=true)
	private String enable;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "modify_user",length=255,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "more",length=255,nullable=true,updatable=true)
	private String more;

	@RemoteProperty
	@Column(name = "bgpic",length=255,nullable=true,updatable=true)
	private String bgpic;


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
	public void setFloor(Integer floor){
		this.floor = floor;
	}
	public Integer getFloor(){
		return this.floor;
	}
	public void setCodeno(Integer codeno){
		this.codeno = codeno;
	}
	public Integer getCodeno(){
		return this.codeno;
	}
	public void setCodetype(String codetype){
		this.codetype = codetype;
	}
	public String getCodetype(){
		return this.codetype;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setCustomDetail(String customDetail){
		this.customDetail = customDetail;
	}
	public String getCustomDetail(){
		return this.customDetail;
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
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}
	public void setEnable(String enable){
		this.enable = enable;
	}
	public String getEnable(){
		return this.enable;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setModifyUser(String modifyUser){
		this.modifyUser = modifyUser;
	}
	public String getModifyUser(){
		return this.modifyUser;
	}
	public void setMore(String more){
		this.more = more;
	}
	public String getMore(){
		return this.more;
	}
	public void setBgpic(String bgpic){
		this.bgpic = bgpic;
	}
	public String getBgpic(){
		return this.bgpic;
	}
}