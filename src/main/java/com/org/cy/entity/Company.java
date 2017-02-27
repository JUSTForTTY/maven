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
@Table(name = "company")
@DataTransferObject
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "companytitle",length=255,updatable=true)
	private String companytitle;

	@RemoteProperty
	@Column(name = "englishtitle",length=255,nullable=true,updatable=true)
	private String englishtitle;

	@RemoteProperty
	@Column(name = "briefname",length=96,nullable=true,updatable=true)
	private String briefname;

	@RemoteProperty
	@Column(name = "industry_id",length=10,nullable=true,updatable=true)
	private Integer industryId;

	@RemoteProperty
	@Column(name = "scale_id",length=10,nullable=true,updatable=true)
	private Integer scaleId;

	@RemoteProperty
	@Column(name = "companyownership",length=96,nullable=true,updatable=true)
	private String companyownership;

	@RemoteProperty
	@Column(name = "representative",length=255,nullable=true,updatable=true)
	private String representative;

	@RemoteProperty
	@Column(name = "regcapital",length=10,nullable=true,updatable=true)
	private Integer regcapital;

	@RemoteProperty
	@Column(name = "province_id",length=10,nullable=true,updatable=true)
	private Integer provinceId;

	@RemoteProperty
	@Column(name = "city_id",length=10,nullable=true,updatable=true)
	private Integer cityId;

	@RemoteProperty
	@Column(name = "county_id",length=10,nullable=true,updatable=true)
	private Integer countyId;

	@RemoteProperty
	@Column(name = "companyaddr",length=255,nullable=true,updatable=true)
	private String companyaddr;

	@RemoteProperty
	@Column(name = "postcode",length=30,nullable=true,updatable=true)
	private String postcode;

	@RemoteProperty
	@Column(name = "tel",length=96,nullable=true,updatable=true)
	private String tel;

	@RemoteProperty
	@Column(name = "fax",length=96,nullable=true,updatable=true)
	private String fax;

	@RemoteProperty
	@Column(name = "introduction",length=65535,nullable=true,updatable=true)
	private String introduction;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "siteurl",length=255,nullable=true,updatable=true)
	private String siteurl;

	@RemoteProperty
	@Column(name = "relationtype_id",length=10,updatable=true)
	private Integer relationtypeId;

	@RemoteProperty
	@Column(name = "taxno",length=50,nullable=true,updatable=true)
	private String taxno;

	@RemoteProperty
	@Column(name = "accountbank",length=255,nullable=true,updatable=true)
	private String accountbank;

	@RemoteProperty
	@Column(name = "bankaccount",length=255,nullable=true,updatable=true)
	private String bankaccount;

	@RemoteProperty
	@Column(name = "regaddr",length=255,nullable=true,updatable=true)
	private String regaddr;

	@RemoteProperty
	@Column(name = "invoiceaddr",length=255,nullable=true,updatable=true)
	private String invoiceaddr;

	@RemoteProperty
	@Column(name = "contactor1",length=255,nullable=true,updatable=true)
	private String contactor1;

	@RemoteProperty
	@Column(name = "title1",length=96,nullable=true,updatable=true)
	private String title1;

	@RemoteProperty
	@Column(name = "gender1",length=3,nullable=true,updatable=true)
	private String gender1;

	@RemoteProperty
	@Column(name = "mobile1",length=60,nullable=true,updatable=true)
	private String mobile1;

	@RemoteProperty
	@Column(name = "tel1",length=96,nullable=true,updatable=true)
	private String tel1;

	@RemoteProperty
	@Column(name = "msn1",length=255,nullable=true,updatable=true)
	private String msn1;

	@RemoteProperty
	@Column(name = "email1",length=255,nullable=true,updatable=true)
	private String email1;

	@RemoteProperty
	@Column(name = "contactor2",length=255,nullable=true,updatable=true)
	private String contactor2;

	@RemoteProperty
	@Column(name = "title2",length=96,nullable=true,updatable=true)
	private String title2;

	@RemoteProperty
	@Column(name = "gender2",length=3,nullable=true,updatable=true)
	private String gender2;

	@RemoteProperty
	@Column(name = "mobile2",length=60,nullable=true,updatable=true)
	private String mobile2;

	@RemoteProperty
	@Column(name = "tel2",length=96,nullable=true,updatable=true)
	private String tel2;

	@RemoteProperty
	@Column(name = "msn2",length=255,nullable=true,updatable=true)
	private String msn2;

	@RemoteProperty
	@Column(name = "email2",length=255,nullable=true,updatable=true)
	private String email2;

	@RemoteProperty
	@Column(name = "isopen",length=3,updatable=true)
	private Integer isopen;

	@RemoteProperty
	@Column(name = "type",length=16,nullable=true,updatable=true)
	private String type;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setCompanytitle(String companytitle){
		this.companytitle = companytitle;
	}
	public String getCompanytitle(){
		return this.companytitle;
	}
	public void setEnglishtitle(String englishtitle){
		this.englishtitle = englishtitle;
	}
	public String getEnglishtitle(){
		return this.englishtitle;
	}
	public void setBriefname(String briefname){
		this.briefname = briefname;
	}
	public String getBriefname(){
		return this.briefname;
	}
	public void setIndustryId(Integer industryId){
		this.industryId = industryId;
	}
	public Integer getIndustryId(){
		return this.industryId;
	}
	public void setScaleId(Integer scaleId){
		this.scaleId = scaleId;
	}
	public Integer getScaleId(){
		return this.scaleId;
	}
	public void setCompanyownership(String companyownership){
		this.companyownership = companyownership;
	}
	public String getCompanyownership(){
		return this.companyownership;
	}
	public void setRepresentative(String representative){
		this.representative = representative;
	}
	public String getRepresentative(){
		return this.representative;
	}
	public void setRegcapital(Integer regcapital){
		this.regcapital = regcapital;
	}
	public Integer getRegcapital(){
		return this.regcapital;
	}
	public void setProvinceId(Integer provinceId){
		this.provinceId = provinceId;
	}
	public Integer getProvinceId(){
		return this.provinceId;
	}
	public void setCityId(Integer cityId){
		this.cityId = cityId;
	}
	public Integer getCityId(){
		return this.cityId;
	}
	public void setCountyId(Integer countyId){
		this.countyId = countyId;
	}
	public Integer getCountyId(){
		return this.countyId;
	}
	public void setCompanyaddr(String companyaddr){
		this.companyaddr = companyaddr;
	}
	public String getCompanyaddr(){
		return this.companyaddr;
	}
	public void setPostcode(String postcode){
		this.postcode = postcode;
	}
	public String getPostcode(){
		return this.postcode;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getTel(){
		return this.tel;
	}
	public void setFax(String fax){
		this.fax = fax;
	}
	public String getFax(){
		return this.fax;
	}
	public void setIntroduction(String introduction){
		this.introduction = introduction;
	}
	public String getIntroduction(){
		return this.introduction;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return this.image;
	}
	public void setSiteurl(String siteurl){
		this.siteurl = siteurl;
	}
	public String getSiteurl(){
		return this.siteurl;
	}
	public void setRelationtypeId(Integer relationtypeId){
		this.relationtypeId = relationtypeId;
	}
	public Integer getRelationtypeId(){
		return this.relationtypeId;
	}
	public void setTaxno(String taxno){
		this.taxno = taxno;
	}
	public String getTaxno(){
		return this.taxno;
	}
	public void setAccountbank(String accountbank){
		this.accountbank = accountbank;
	}
	public String getAccountbank(){
		return this.accountbank;
	}
	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}
	public String getBankaccount(){
		return this.bankaccount;
	}
	public void setRegaddr(String regaddr){
		this.regaddr = regaddr;
	}
	public String getRegaddr(){
		return this.regaddr;
	}
	public void setInvoiceaddr(String invoiceaddr){
		this.invoiceaddr = invoiceaddr;
	}
	public String getInvoiceaddr(){
		return this.invoiceaddr;
	}
	public void setContactor1(String contactor1){
		this.contactor1 = contactor1;
	}
	public String getContactor1(){
		return this.contactor1;
	}
	public void setTitle1(String title1){
		this.title1 = title1;
	}
	public String getTitle1(){
		return this.title1;
	}
	public void setGender1(String gender1){
		this.gender1 = gender1;
	}
	public String getGender1(){
		return this.gender1;
	}
	public void setMobile1(String mobile1){
		this.mobile1 = mobile1;
	}
	public String getMobile1(){
		return this.mobile1;
	}
	public void setTel1(String tel1){
		this.tel1 = tel1;
	}
	public String getTel1(){
		return this.tel1;
	}
	public void setMsn1(String msn1){
		this.msn1 = msn1;
	}
	public String getMsn1(){
		return this.msn1;
	}
	public void setEmail1(String email1){
		this.email1 = email1;
	}
	public String getEmail1(){
		return this.email1;
	}
	public void setContactor2(String contactor2){
		this.contactor2 = contactor2;
	}
	public String getContactor2(){
		return this.contactor2;
	}
	public void setTitle2(String title2){
		this.title2 = title2;
	}
	public String getTitle2(){
		return this.title2;
	}
	public void setGender2(String gender2){
		this.gender2 = gender2;
	}
	public String getGender2(){
		return this.gender2;
	}
	public void setMobile2(String mobile2){
		this.mobile2 = mobile2;
	}
	public String getMobile2(){
		return this.mobile2;
	}
	public void setTel2(String tel2){
		this.tel2 = tel2;
	}
	public String getTel2(){
		return this.tel2;
	}
	public void setMsn2(String msn2){
		this.msn2 = msn2;
	}
	public String getMsn2(){
		return this.msn2;
	}
	public void setEmail2(String email2){
		this.email2 = email2;
	}
	public String getEmail2(){
		return this.email2;
	}
	public void setIsopen(Integer isopen){
		this.isopen = isopen;
	}
	public Integer getIsopen(){
		return this.isopen;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
}