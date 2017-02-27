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
@Table(name = "goods_snapshot")
@DataTransferObject
public class GoodsSnapshot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "snapshot_id",length=19,updatable=true)
	private Integer snapshotId;

	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "aliasname",length=255,nullable=true,updatable=true)
	private String aliasname;

	@RemoteProperty
	@Column(name = "detail_intro",length=2147483647,nullable=true,updatable=true)
	private String detailIntro;

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
	@Column(name = "unit",length=10,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "member_id",length=19,nullable=true,updatable=true)
	private Integer memberId;

	@RemoteProperty
	@Column(name = "member_name",length=255,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "reference_price",length=19,nullable=true,updatable=true)
	private Integer referencePrice;

	@RemoteProperty
	@Column(name = "price",length=19,nullable=true,updatable=true)
	private Integer price;

	@RemoteProperty
	@Column(name = "score",length=255,nullable=true,updatable=true)
	private String score;

	@RemoteProperty
	@Column(name = "view_num",length=10,nullable=true,updatable=true)
	private Integer viewNum;

	@RemoteProperty
	@Column(name = "order_num",length=10,nullable=true,updatable=true)
	private Integer orderNum;

	@RemoteProperty
	@Column(name = "sale_num",length=10,nullable=true,updatable=true)
	private Integer saleNum;

	@RemoteProperty
	@Column(name = "stock_num",length=10,nullable=true,updatable=true)
	private Integer stockNum;

	@RemoteProperty
	@Column(name = "comment_num",length=10,nullable=true,updatable=true)
	private Integer commentNum;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "status",length=2,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "type",length=32,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "score_add",length=10,nullable=true,updatable=true)
	private Integer scoreAdd;

	@RemoteProperty
	@Column(name = "supply_date",length=0,nullable=true,updatable=true)
	private Date supplyDate;

	@RemoteProperty
	@Column(name = "creator",length=10,nullable=true,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;


	public void setSnapshotId(Integer snapshotId){
		this.snapshotId = snapshotId;
	}
	public Integer getSnapshotId(){
		return this.snapshotId;
	}
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
	public void setAliasname(String aliasname){
		this.aliasname = aliasname;
	}
	public String getAliasname(){
		return this.aliasname;
	}
	public void setDetailIntro(String detailIntro){
		this.detailIntro = detailIntro;
	}
	public String getDetailIntro(){
		return this.detailIntro;
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
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	public Integer getMemberId(){
		return this.memberId;
	}
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	public String getMemberName(){
		return this.memberName;
	}
	public void setReferencePrice(Integer referencePrice){
		this.referencePrice = referencePrice;
	}
	public Integer getReferencePrice(){
		return this.referencePrice;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	public Integer getPrice(){
		return this.price;
	}
	public void setScore(String score){
		this.score = score;
	}
	public String getScore(){
		return this.score;
	}
	public void setViewNum(Integer viewNum){
		this.viewNum = viewNum;
	}
	public Integer getViewNum(){
		return this.viewNum;
	}
	public void setOrderNum(Integer orderNum){
		this.orderNum = orderNum;
	}
	public Integer getOrderNum(){
		return this.orderNum;
	}
	public void setSaleNum(Integer saleNum){
		this.saleNum = saleNum;
	}
	public Integer getSaleNum(){
		return this.saleNum;
	}
	public void setStockNum(Integer stockNum){
		this.stockNum = stockNum;
	}
	public Integer getStockNum(){
		return this.stockNum;
	}
	public void setCommentNum(Integer commentNum){
		this.commentNum = commentNum;
	}
	public Integer getCommentNum(){
		return this.commentNum;
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
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setScoreAdd(Integer scoreAdd){
		this.scoreAdd = scoreAdd;
	}
	public Integer getScoreAdd(){
		return this.scoreAdd;
	}
	public void setSupplyDate(Date supplyDate){
		this.supplyDate = supplyDate;
	}
	public Date getSupplyDate(){
		return this.supplyDate;
	}
	public void setCreator(Integer creator){
		this.creator = creator;
	}
	public Integer getCreator(){
		return this.creator;
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
}