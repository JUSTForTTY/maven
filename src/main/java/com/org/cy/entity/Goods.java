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
@Table(name = "goods")
@DataTransferObject
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "aliasname",length=255,nullable=true,updatable=true)
	private String aliasname;

	@RemoteProperty
	@Column(name = "barcode",length=255,nullable=true,updatable=true)
	private String barcode;

	@RemoteProperty
	@Column(name = "privatecode",length=255,nullable=true,updatable=true)
	private String privatecode;

	@RemoteProperty
	@Column(name = "publiccode",length=255,nullable=true,updatable=true)
	private String publiccode;

	@RemoteProperty
	@Column(name = "tradecode",length=255,nullable=true,updatable=true)
	private String tradecode;

	@RemoteProperty
	@Column(name = "briefintro",length=255,nullable=true,updatable=true)
	private String briefintro;

	@RemoteProperty
	@Column(name = "detailintro",length=65535,nullable=true,updatable=true)
	private String detailintro;

	@RemoteProperty
	@Column(name = "mobileDetailintro",length=65535,nullable=true,updatable=true)
	private String mobiledetailintro;

	@RemoteProperty
	@Column(name = "miniature",length=255,nullable=true,updatable=true)
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
	@Column(name = "size",length=255,nullable=true,updatable=true)
	private String size;

	@RemoteProperty
	@Column(name = "weight",length=255,nullable=true,updatable=true)
	private String weight;

	@RemoteProperty
	@Column(name = "model",length=255,nullable=true,updatable=true)
	private String model;

	@RemoteProperty
	@Column(name = "spec",length=255,nullable=true,updatable=true)
	private String spec;

	@RemoteProperty
	@Column(name = "brand_id",length=10,nullable=true,updatable=true)
	private Integer brandId;

	@RemoteProperty
	@Column(name = "material",length=255,nullable=true,updatable=true)
	private String material;

	@RemoteProperty
	@Column(name = "color",length=255,nullable=true,updatable=true)
	private String color;

	@RemoteProperty
	@Column(name = "serialno",length=255,nullable=true,updatable=true)
	private String serialno;

	@RemoteProperty
	@Column(name = "producearea",length=255,nullable=true,updatable=true)
	private String producearea;

	@RemoteProperty
	@Column(name = "productdate",length=32,nullable=true,updatable=true)
	private String productdate;

	@RemoteProperty
	@Column(name = "refprice",length=10,nullable=true,updatable=true)
	private String refprice;

	@RemoteProperty
	@Column(name = "costprice",length=10,nullable=true,updatable=true)
	private String costprice;

	@RemoteProperty
	@Column(name = "price",length=10,nullable=true,updatable=true)
	private String price;

	@RemoteProperty
	@Column(name = "vipprice",length=10,nullable=true,updatable=true)
	private String vipprice;

	@RemoteProperty
	@Column(name = "discount",length=10,nullable=true,updatable=true)
	private Integer discount;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "recommendlevel",length=10,nullable=true,updatable=true)
	private Integer recommendlevel;

	@RemoteProperty
	@Column(name = "recommendremark",length=65535,nullable=true,updatable=true)
	private String recommendremark;

	@RemoteProperty
	@Column(name = "viewnum",length=10,nullable=true,updatable=true)
	private Integer viewnum;

	@RemoteProperty
	@Column(name = "ordernum",length=10,nullable=true,updatable=true)
	private Integer ordernum;

	@RemoteProperty
	@Column(name = "salenum",length=10,nullable=true,updatable=true)
	private Integer salenum;

	@RemoteProperty
	@Column(name = "stocknum",length=10,nullable=true,updatable=true)
	private Integer stocknum;

	@RemoteProperty
	@Column(name = "isfreshgoods",length=3,nullable=true,updatable=true)
	private Integer isfreshgoods;

	@RemoteProperty
	@Column(name = "ishotgoods",length=3,nullable=true,updatable=true)
	private Integer ishotgoods;

	@RemoteProperty
	@Column(name = "isoutofstock",length=3,nullable=true,updatable=true)
	private Integer isoutofstock;

	@RemoteProperty
	@Column(name = "creator",length=10,nullable=true,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "classification",length=16,nullable=true,updatable=true)
	private String classification;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "supplydate",length=0,nullable=true,updatable=true)
	private Date supplydate;

	@RemoteProperty
	@Column(name = "status",length=2,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "type",length=32,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "last_modified",length=0,nullable=true,updatable=true)
	private Date lastModified;

	@RemoteProperty
	@Column(name = "score_add",length=10,nullable=true,updatable=true)
	private Integer scoreAdd;

	@RemoteProperty
	@Column(name = "unit",length=10,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "indexId",length=255,nullable=true,updatable=true)
	private String indexid;

	@RemoteProperty
	@Column(name = "provinceId",length=255,nullable=true,updatable=true)
	private String provinceid;

	@RemoteProperty
	@Column(name = "city",length=255,nullable=true,updatable=true)
	private String city;

	@RemoteProperty
	@Column(name = "area",length=255,nullable=true,updatable=true)
	private String area;


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
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setAliasname(String aliasname){
		this.aliasname = aliasname;
	}
	public String getAliasname(){
		return this.aliasname;
	}
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}
	public String getBarcode(){
		return this.barcode;
	}
	public void setPrivatecode(String privatecode){
		this.privatecode = privatecode;
	}
	public String getPrivatecode(){
		return this.privatecode;
	}
	public void setPubliccode(String publiccode){
		this.publiccode = publiccode;
	}
	public String getPubliccode(){
		return this.publiccode;
	}
	public void setTradecode(String tradecode){
		this.tradecode = tradecode;
	}
	public String getTradecode(){
		return this.tradecode;
	}
	public void setBriefintro(String briefintro){
		this.briefintro = briefintro;
	}
	public String getBriefintro(){
		return this.briefintro;
	}
	public void setDetailintro(String detailintro){
		this.detailintro = detailintro;
	}
	public String getDetailintro(){
		return this.detailintro;
	}
	public void setMobiledetailintro(String mobiledetailintro){
		this.mobiledetailintro = mobiledetailintro;
	}
	public String getMobiledetailintro(){
		return this.mobiledetailintro;
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
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return this.size;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getWeight(){
		return this.weight;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return this.model;
	}
	public void setSpec(String spec){
		this.spec = spec;
	}
	public String getSpec(){
		return this.spec;
	}
	public void setBrandId(Integer brandId){
		this.brandId = brandId;
	}
	public Integer getBrandId(){
		return this.brandId;
	}
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return this.material;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setSerialno(String serialno){
		this.serialno = serialno;
	}
	public String getSerialno(){
		return this.serialno;
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
	public void setRefprice(String refprice){
		this.refprice = refprice;
	}
	public String getRefprice(){
		return this.refprice;
	}
	public void setCostprice(String costprice){
		this.costprice = costprice;
	}
	public String getCostprice(){
		return this.costprice;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return this.price;
	}
	public void setVipprice(String vipprice){
		this.vipprice = vipprice;
	}
	public String getVipprice(){
		return this.vipprice;
	}
	public void setDiscount(Integer discount){
		this.discount = discount;
	}
	public Integer getDiscount(){
		return this.discount;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
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
	public void setViewnum(Integer viewnum){
		this.viewnum = viewnum;
	}
	public Integer getViewnum(){
		return this.viewnum;
	}
	public void setOrdernum(Integer ordernum){
		this.ordernum = ordernum;
	}
	public Integer getOrdernum(){
		return this.ordernum;
	}
	public void setSalenum(Integer salenum){
		this.salenum = salenum;
	}
	public Integer getSalenum(){
		return this.salenum;
	}
	public void setStocknum(Integer stocknum){
		this.stocknum = stocknum;
	}
	public Integer getStocknum(){
		return this.stocknum;
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
	public void setClassification(String classification){
		this.classification = classification;
	}
	public String getClassification(){
		return this.classification;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSupplydate(Date supplydate){
		this.supplydate = supplydate;
	}
	public Date getSupplydate(){
		return this.supplydate;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setLastModified(Date lastModified){
		this.lastModified = lastModified;
	}
	public Date getLastModified(){
		return this.lastModified;
	}
	public void setScoreAdd(Integer scoreAdd){
		this.scoreAdd = scoreAdd;
	}
	public Integer getScoreAdd(){
		return this.scoreAdd;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
	public void setIndexid(String indexid){
		this.indexid = indexid;
	}
	public String getIndexid(){
		return this.indexid;
	}
	public void setProvinceid(String provinceid){
		this.provinceid = provinceid;
	}
	public String getProvinceid(){
		return this.provinceid;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
}