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
@Table(name = "category")
@DataTransferObject
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=32,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "parent_id",length=10,nullable=true,updatable=true)
	private Integer parentId;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "goodsnum",length=10,nullable=true,updatable=true)
	private Integer goodsnum;

	@RemoteProperty
	@Column(name = "isopen",length=3,updatable=true)
	private Integer isopen;

	@RemoteProperty
	@Column(name = "tag1",length=32,nullable=true,updatable=true)
	private String tag1;

	@RemoteProperty
	@Column(name = "tag2",length=32,nullable=true,updatable=true)
	private String tag2;

	@RemoteProperty
	@Column(name = "tag3",length=32,nullable=true,updatable=true)
	private String tag3;

	@RemoteProperty
	@Column(name = "tag4",length=32,nullable=true,updatable=true)
	private String tag4;

	@RemoteProperty
	@Column(name = "tag5",length=32,nullable=true,updatable=true)
	private String tag5;

	@RemoteProperty
	@Column(name = "caid",length=20,nullable=true,updatable=true)
	private String caid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "codeNo",length=32,nullable=true,updatable=true)
	private String codeno;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "description",length=100,nullable=true,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "grade",length=10,nullable=true,updatable=true)
	private Integer grade;

	@RemoteProperty
	@Column(name = "icon",length=45,nullable=true,updatable=true)
	private String icon;

	@RemoteProperty
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private String isDelete;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "onHome",length=10,nullable=true,updatable=true)
	private Integer onhome;

	@RemoteProperty
	@Column(name = "onHomeType",length=10,nullable=true,updatable=true)
	private Integer onhometype;


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
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	public Integer getParentId(){
		return this.parentId;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return this.image;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setGoodsnum(Integer goodsnum){
		this.goodsnum = goodsnum;
	}
	public Integer getGoodsnum(){
		return this.goodsnum;
	}
	public void setIsopen(Integer isopen){
		this.isopen = isopen;
	}
	public Integer getIsopen(){
		return this.isopen;
	}
	public void setTag1(String tag1){
		this.tag1 = tag1;
	}
	public String getTag1(){
		return this.tag1;
	}
	public void setTag2(String tag2){
		this.tag2 = tag2;
	}
	public String getTag2(){
		return this.tag2;
	}
	public void setTag3(String tag3){
		this.tag3 = tag3;
	}
	public String getTag3(){
		return this.tag3;
	}
	public void setTag4(String tag4){
		this.tag4 = tag4;
	}
	public String getTag4(){
		return this.tag4;
	}
	public void setTag5(String tag5){
		this.tag5 = tag5;
	}
	public String getTag5(){
		return this.tag5;
	}
	public void setCaid(String caid){
		this.caid = caid;
	}
	public String getCaid(){
		return this.caid;
	}
	public void setBid(Integer bid){
		this.bid = bid;
	}
	public Integer getBid(){
		return this.bid;
	}
	public void setCodeno(String codeno){
		this.codeno = codeno;
	}
	public String getCodeno(){
		return this.codeno;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}
	public void setGrade(Integer grade){
		this.grade = grade;
	}
	public Integer getGrade(){
		return this.grade;
	}
	public void setIcon(String icon){
		this.icon = icon;
	}
	public String getIcon(){
		return this.icon;
	}
	public void setIsDelete(String isDelete){
		this.isDelete = isDelete;
	}
	public String getIsDelete(){
		return this.isDelete;
	}
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime(){
		return this.modifyTime;
	}
	public void setModifyUser(String modifyUser){
		this.modifyUser = modifyUser;
	}
	public String getModifyUser(){
		return this.modifyUser;
	}
	public void setOnhome(Integer onhome){
		this.onhome = onhome;
	}
	public Integer getOnhome(){
		return this.onhome;
	}
	public void setOnhometype(Integer onhometype){
		this.onhometype = onhometype;
	}
	public Integer getOnhometype(){
		return this.onhometype;
	}
}