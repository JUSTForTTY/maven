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
@Table(name = "member")
@DataTransferObject
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "address",length=255,nullable=true,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "brand_id",length=10,nullable=true,updatable=true)
	private Integer brandId;

	@RemoteProperty
	@Column(name = "classification",length=16,nullable=true,updatable=true)
	private String classification;

	@RemoteProperty
	@Column(name = "color",length=255,nullable=true,updatable=true)
	private String color;

	@RemoteProperty
	@Column(name = "costprice",length=10,nullable=true,updatable=true)
	private String costprice;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "creator",length=10,nullable=true,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "detailintro",length=2147483647,nullable=true,updatable=true)
	private String detailintro;

	@RemoteProperty
	@Column(name = "discount",length=10,nullable=true,updatable=true)
	private Integer discount;

	@RemoteProperty
	@Column(name = "image1",length=255,nullable=true,updatable=true)
	private String image1;

	@RemoteProperty
	@Column(name = "image4",length=255,nullable=true,updatable=true)
	private String image4;

	@RemoteProperty
	@Column(name = "image5",length=255,nullable=true,updatable=true)
	private String image5;

	@RemoteProperty
	@Column(name = "indexId",length=255,nullable=true,updatable=true)
	private String indexid;

	@RemoteProperty
	@Column(name = "isfreshgoods",length=10,nullable=true,updatable=true)
	private Integer isfreshgoods;

	@RemoteProperty
	@Column(name = "ishotgoods",length=10,nullable=true,updatable=true)
	private Integer ishotgoods;

	@RemoteProperty
	@Column(name = "isoutofstock",length=10,nullable=true,updatable=true)
	private Integer isoutofstock;

	@RemoteProperty
	@Column(name = "last_modified",length=0,nullable=true,updatable=true)
	private Date lastModified;

	@RemoteProperty
	@Column(name = "latitude",length=255,nullable=true,updatable=true)
	private String latitude;

	@RemoteProperty
	@Column(name = "longitude",length=255,nullable=true,updatable=true)
	private String longitude;

	@RemoteProperty
	@Column(name = "material",length=255,nullable=true,updatable=true)
	private String material;

	@RemoteProperty
	@Column(name = "memberUrl",length=255,nullable=true,updatable=true)
	private String memberurl;

	@RemoteProperty
	@Column(name = "miniature",length=255,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "model",length=255,nullable=true,updatable=true)
	private String model;

	@RemoteProperty
	@Column(name = "name",length=255,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "ordernum",length=10,nullable=true,updatable=true)
	private Integer ordernum;

	@RemoteProperty
	@Column(name = "price",length=10,nullable=true,updatable=true)
	private String price;

	@RemoteProperty
	@Column(name = "producearea",length=255,nullable=true,updatable=true)
	private String producearea;

	@RemoteProperty
	@Column(name = "productdate",length=32,nullable=true,updatable=true)
	private String productdate;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "recommendlevel",length=10,nullable=true,updatable=true)
	private Integer recommendlevel;

	@RemoteProperty
	@Column(name = "recommendremark",length=2147483647,nullable=true,updatable=true)
	private String recommendremark;

	@RemoteProperty
	@Column(name = "refprice",length=10,nullable=true,updatable=true)
	private String refprice;

	@RemoteProperty
	@Column(name = "salenum",length=10,nullable=true,updatable=true)
	private Integer salenum;

	@RemoteProperty
	@Column(name = "score_add",length=10,nullable=true,updatable=true)
	private Integer scoreAdd;

	@RemoteProperty
	@Column(name = "serialno",length=255,nullable=true,updatable=true)
	private String serialno;

	@RemoteProperty
	@Column(name = "size",length=255,nullable=true,updatable=true)
	private String size;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "spec",length=255,nullable=true,updatable=true)
	private String spec;

	@RemoteProperty
	@Column(name = "status",length=2,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "stocknum",length=10,nullable=true,updatable=true)
	private Integer stocknum;

	@RemoteProperty
	@Column(name = "supplydate",length=0,nullable=true,updatable=true)
	private Date supplydate;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "type",length=32,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "unit",length=10,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "viewnum",length=10,nullable=true,updatable=true)
	private Integer viewnum;

	@RemoteProperty
	@Column(name = "vipprice",length=10,nullable=true,updatable=true)
	private String vipprice;

	@RemoteProperty
	@Column(name = "weight",length=255,nullable=true,updatable=true)
	private String weight;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setBrandId(Integer brandId){
		this.brandId = brandId;
	}
	public Integer getBrandId(){
		return this.brandId;
	}
	public void setClassification(String classification){
		this.classification = classification;
	}
	public String getClassification(){
		return this.classification;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setCostprice(String costprice){
		this.costprice = costprice;
	}
	public String getCostprice(){
		return this.costprice;
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
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	public Date getCreatetime(){
		return this.createtime;
	}
	public void setCreator(Integer creator){
		this.creator = creator;
	}
	public Integer getCreator(){
		return this.creator;
	}
	public void setDetailintro(String detailintro){
		this.detailintro = detailintro;
	}
	public String getDetailintro(){
		return this.detailintro;
	}
	public void setDiscount(Integer discount){
		this.discount = discount;
	}
	public Integer getDiscount(){
		return this.discount;
	}
	public void setImage1(String image1){
		this.image1 = image1;
	}
	public String getImage1(){
		return this.image1;
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
	public void setIndexid(String indexid){
		this.indexid = indexid;
	}
	public String getIndexid(){
		return this.indexid;
	}
	public void setIsfreshgoods(Integer isfreshgoods){
		this.isfreshgoods = isfreshgoods;
	}
	public Integer getIsfreshgoods(){
		return this.isfreshgoods;
	}
	public void setIshotgoods(Integer ishotgoods){
		this.ishotgoods = ishotgoods;
	}
	public Integer getIshotgoods(){
		return this.ishotgoods;
	}
	public void setIsoutofstock(Integer isoutofstock){
		this.isoutofstock = isoutofstock;
	}
	public Integer getIsoutofstock(){
		return this.isoutofstock;
	}
	public void setLastModified(Date lastModified){
		this.lastModified = lastModified;
	}
	public Date getLastModified(){
		return this.lastModified;
	}
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}
	public String getLatitude(){
		return this.latitude;
	}
	public void setLongitude(String longitude){
		this.longitude = longitude;
	}
	public String getLongitude(){
		return this.longitude;
	}
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return this.material;
	}
	public void setMemberurl(String memberurl){
		this.memberurl = memberurl;
	}
	public String getMemberurl(){
		return this.memberurl;
	}
	public void setMiniature(String miniature){
		this.miniature = miniature;
	}
	public String getMiniature(){
		return this.miniature;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return this.model;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setOrdernum(Integer ordernum){
		this.ordernum = ordernum;
	}
	public Integer getOrdernum(){
		return this.ordernum;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return this.price;
	}
	public void setProducearea(String producearea){
		this.producearea = producearea;
	}
	public String getProducearea(){
		return this.producearea;
	}
	public void setProductdate(String productdate){
		this.productdate = productdate;
	}
	public String getProductdate(){
		return this.productdate;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setRecommendlevel(Integer recommendlevel){
		this.recommendlevel = recommendlevel;
	}
	public Integer getRecommendlevel(){
		return this.recommendlevel;
	}
	public void setRecommendremark(String recommendremark){
		this.recommendremark = recommendremark;
	}
	public String getRecommendremark(){
		return this.recommendremark;
	}
	public void setRefprice(String refprice){
		this.refprice = refprice;
	}
	public String getRefprice(){
		return this.refprice;
	}
	public void setSalenum(Integer salenum){
		this.salenum = salenum;
	}
	public Integer getSalenum(){
		return this.salenum;
	}
	public void setScoreAdd(Integer scoreAdd){
		this.scoreAdd = scoreAdd;
	}
	public Integer getScoreAdd(){
		return this.scoreAdd;
	}
	public void setSerialno(String serialno){
		this.serialno = serialno;
	}
	public String getSerialno(){
		return this.serialno;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return this.size;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSpec(String spec){
		this.spec = spec;
	}
	public String getSpec(){
		return this.spec;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setStocknum(Integer stocknum){
		this.stocknum = stocknum;
	}
	public Integer getStocknum(){
		return this.stocknum;
	}
	public void setSupplydate(Date supplydate){
		this.supplydate = supplydate;
	}
	public Date getSupplydate(){
		return this.supplydate;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	public String getUpdateUser(){
		return this.updateUser;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setViewnum(Integer viewnum){
		this.viewnum = viewnum;
	}
	public Integer getViewnum(){
		return this.viewnum;
	}
	public void setVipprice(String vipprice){
		this.vipprice = vipprice;
	}
	public String getVipprice(){
		return this.vipprice;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getWeight(){
		return this.weight;
	}
}