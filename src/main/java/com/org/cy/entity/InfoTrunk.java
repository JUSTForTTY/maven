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
@Table(name = "infotrunk")
@DataTransferObject
public class InfoTrunk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "title",length=255,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "brieftitle",length=100,nullable=true,updatable=true)
	private String brieftitle;

	@RemoteProperty
	@Column(name = "summary",length=255,nullable=true,updatable=true)
	private String summary;

	@RemoteProperty
	@Column(name = "titlecolor",length=255,nullable=true,updatable=true)
	private String titlecolor;

	@RemoteProperty
	@Column(name = "titlefont",length=255,nullable=true,updatable=true)
	private String titlefont;

	@RemoteProperty
	@Column(name = "titlefontsize",length=3,nullable=true,updatable=true)
	private Integer titlefontsize;

	@RemoteProperty
	@Column(name = "column_id",length=10,updatable=true)
	private Integer columnId;

	@RemoteProperty
	@Column(name = "subcolumn_id",length=10,nullable=true,updatable=true)
	private Integer subcolumnId;

	@RemoteProperty
	@Column(name = "author",length=255,nullable=true,updatable=true)
	private String author;

	@RemoteProperty
	@Column(name = "editor",length=255,nullable=true,updatable=true)
	private String editor;

	@RemoteProperty
	@Column(name = "source",length=255,nullable=true,updatable=true)
	private String source;

	@RemoteProperty
	@Column(name = "viewlevel",length=10,nullable=true,updatable=true)
	private Integer viewlevel;

	@RemoteProperty
	@Column(name = "istop",length=3,nullable=true,updatable=true)
	private Integer istop;

	@RemoteProperty
	@Column(name = "isrecommend",length=3,nullable=true,updatable=true)
	private Integer isrecommend;

	@RemoteProperty
	@Column(name = "ishot",length=3,nullable=true,updatable=true)
	private Integer ishot;

	@RemoteProperty
	@Column(name = "openreview",length=3,nullable=true,updatable=true)
	private Integer openreview;

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
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "creator",length=10,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "auditor",length=10,nullable=true,updatable=true)
	private Integer auditor;

	@RemoteProperty
	@Column(name = "audittime",length=0,nullable=true,updatable=true)
	private Date audittime;

	@RemoteProperty
	@Column(name = "modifier",length=10,nullable=true,updatable=true)
	private Integer modifier;

	@RemoteProperty
	@Column(name = "modifiedtime",length=0,nullable=true,updatable=true)
	private Date modifiedtime;

	@RemoteProperty
	@Column(name = "viewnum",length=10,updatable=true)
	private Integer viewnum;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setBrieftitle(String brieftitle){
		this.brieftitle = brieftitle;
	}
	public String getBrieftitle(){
		return this.brieftitle;
	}
	public void setSummary(String summary){
		this.summary = summary;
	}
	public String getSummary(){
		return this.summary;
	}
	public void setTitlecolor(String titlecolor){
		this.titlecolor = titlecolor;
	}
	public String getTitlecolor(){
		return this.titlecolor;
	}
	public void setTitlefont(String titlefont){
		this.titlefont = titlefont;
	}
	public String getTitlefont(){
		return this.titlefont;
	}
	public void setTitlefontsize(Integer titlefontsize){
		this.titlefontsize = titlefontsize;
	}
	public Integer getTitlefontsize(){
		return this.titlefontsize;
	}
	public void setColumnId(Integer columnId){
		this.columnId = columnId;
	}
	public Integer getColumnId(){
		return this.columnId;
	}
	public void setSubcolumnId(Integer subcolumnId){
		this.subcolumnId = subcolumnId;
	}
	public Integer getSubcolumnId(){
		return this.subcolumnId;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setEditor(String editor){
		this.editor = editor;
	}
	public String getEditor(){
		return this.editor;
	}
	public void setSource(String source){
		this.source = source;
	}
	public String getSource(){
		return this.source;
	}
	public void setViewlevel(Integer viewlevel){
		this.viewlevel = viewlevel;
	}
	public Integer getViewlevel(){
		return this.viewlevel;
	}
	public void setIstop(Integer istop){
		this.istop = istop;
	}
	public Integer getIstop(){
		return this.istop;
	}
	public void setIsrecommend(Integer isrecommend){
		this.isrecommend = isrecommend;
	}
	public Integer getIsrecommend(){
		return this.isrecommend;
	}
	public void setIshot(Integer ishot){
		this.ishot = ishot;
	}
	public Integer getIshot(){
		return this.ishot;
	}
	public void setOpenreview(Integer openreview){
		this.openreview = openreview;
	}
	public Integer getOpenreview(){
		return this.openreview;
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
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
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
	public void setAuditor(Integer auditor){
		this.auditor = auditor;
	}
	public Integer getAuditor(){
		return this.auditor;
	}
	public void setAudittime(Date audittime){
		this.audittime = audittime;
	}
	public Date getAudittime(){
		return this.audittime;
	}
	public void setModifier(Integer modifier){
		this.modifier = modifier;
	}
	public Integer getModifier(){
		return this.modifier;
	}
	public void setModifiedtime(Date modifiedtime){
		this.modifiedtime = modifiedtime;
	}
	public Date getModifiedtime(){
		return this.modifiedtime;
	}
	public void setViewnum(Integer viewnum){
		this.viewnum = viewnum;
	}
	public Integer getViewnum(){
		return this.viewnum;
	}
}