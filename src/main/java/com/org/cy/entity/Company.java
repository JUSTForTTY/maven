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

		return this.id;
	}

		this.companytitle = companytitle;
	}

		return this.companytitle;
	}

		this.englishtitle = englishtitle;
	}

		return this.englishtitle;
	}

		this.briefname = briefname;
	}

		return this.briefname;
	}

		this.industryId = industryId;
	}

		return this.industryId;
	}

		this.scaleId = scaleId;
	}

		return this.scaleId;
	}

		this.companyownership = companyownership;
	}

		return this.companyownership;
	}

		this.representative = representative;
	}

		return this.representative;
	}

		this.regcapital = regcapital;
	}

		return this.regcapital;
	}

		this.provinceId = provinceId;
	}

		return this.provinceId;
	}

		this.cityId = cityId;
	}

		return this.cityId;
	}

		this.countyId = countyId;
	}

		return this.countyId;
	}

		this.companyaddr = companyaddr;
	}

		return this.companyaddr;
	}

		this.postcode = postcode;
	}

		return this.postcode;
	}

		this.tel = tel;
	}

		return this.tel;
	}

		this.fax = fax;
	}

		return this.fax;
	}

		this.introduction = introduction;
	}

		return this.introduction;
	}

		this.image = image;
	}

		return this.image;
	}

		this.siteurl = siteurl;
	}

		return this.siteurl;
	}

		this.relationtypeId = relationtypeId;
	}

		return this.relationtypeId;
	}

		this.taxno = taxno;
	}

		return this.taxno;
	}

		this.accountbank = accountbank;
	}

		return this.accountbank;
	}

		this.bankaccount = bankaccount;
	}

		return this.bankaccount;
	}

		this.regaddr = regaddr;
	}

		return this.regaddr;
	}

		this.invoiceaddr = invoiceaddr;
	}

		return this.invoiceaddr;
	}

		this.contactor1 = contactor1;
	}

		return this.contactor1;
	}

		this.title1 = title1;
	}

		return this.title1;
	}

		this.gender1 = gender1;
	}

		return this.gender1;
	}

		this.mobile1 = mobile1;
	}

		return this.mobile1;
	}

		this.tel1 = tel1;
	}

		return this.tel1;
	}

		this.msn1 = msn1;
	}

		return this.msn1;
	}

		this.email1 = email1;
	}

		return this.email1;
	}

		this.contactor2 = contactor2;
	}

		return this.contactor2;
	}

		this.title2 = title2;
	}

		return this.title2;
	}

		this.gender2 = gender2;
	}

		return this.gender2;
	}

		this.mobile2 = mobile2;
	}

		return this.mobile2;
	}

		this.tel2 = tel2;
	}

		return this.tel2;
	}

		this.msn2 = msn2;
	}

		return this.msn2;
	}

		this.email2 = email2;
	}

		return this.email2;
	}

		this.isopen = isopen;
	}

		return this.isopen;
	}

		this.type = type;
	}

		return this.type;
	}
