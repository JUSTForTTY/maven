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
@Table(name = "activity")
@DataTransferObject
public class Activity implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "aid",length=20,updatable=true)
	private String aid;

	@RemoteProperty
	@Column(name = "cid",length=20,updatable=true)
	private String cid;

	@RemoteProperty
	@Column(name = "bid",length=11,updatable=true)
	private String bid;

	@RemoteProperty
	@Column(name = "name",length=120,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "subtitle",length=120,nullable=true,updatable=true)
	private String subtitle;

	@RemoteProperty
	@Column(name = "logo",length=120,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "official_url",length=120,nullable=true,updatable=true)
	private String officialUrl;

	@RemoteProperty
	@Column(name = "area_id",length=6,nullable=true,updatable=true)
	private String areaId;

	@RemoteProperty
	@Column(name = "province_id",length=6,nullable=true,updatable=true)
	private String provinceId;

	@RemoteProperty
	@Column(name = "city_id",length=6,nullable=true,updatable=true)
	private String cityId;

	@RemoteProperty
	@Column(name = "site",length=120,nullable=true,updatable=true)
	private String site;

	@RemoteProperty
	@Column(name = "address",length=120,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "lat",length=22,nullable=true,updatable=true)
	private String lat;

	@RemoteProperty
	@Column(name = "lng",length=22,nullable=true,updatable=true)
	private String lng;

	@RemoteProperty
	@Column(name = "type",length=0,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "day",length=10,nullable=true,updatable=true)
	private Integer day;

	@RemoteProperty
	@Column(name = "register_start",length=0,nullable=true,updatable=true)
	private Date registerStart;

	@RemoteProperty
	@Column(name = "register_end",length=0,nullable=true,updatable=true)
	private Date registerEnd;

	@RemoteProperty
	@Column(name = "start_time",length=0,nullable=true,updatable=true)
	private Date startTime;

	@RemoteProperty
	@Column(name = "end_time",length=0,nullable=true,updatable=true)
	private Date endTime;

	@RemoteProperty
	@Column(name = "status",length=0,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "briefintro",length=4096,nullable=true,updatable=true)
	private String briefintro;

	@RemoteProperty
	@Column(name = "act_detail",length=65535,nullable=true,updatable=true)
	private String actDetail;

	@RemoteProperty
	@Column(name = "act_detail_url",length=120,nullable=true,updatable=true)
	private String actDetailUrl;

	@RemoteProperty
	@Column(name = "stick",length=10,nullable=true,updatable=true)
	private Integer stick;

	@RemoteProperty
	@Column(name = "follow_sum",length=7,nullable=true,updatable=true)
	private Integer followSum;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "click_num",length=10,nullable=true,updatable=true)
	private Integer clickNum;

	@RemoteProperty
	@Column(name = "agree_num",length=10,nullable=true,updatable=true)
	private Integer agreeNum;

	@RemoteProperty
	@Column(name = "disagree_num",length=10,nullable=true,updatable=true)
	private Integer disagreeNum;

	@RemoteProperty
	@Column(name = "agree_num_time",length=0,nullable=true,updatable=true)
	private Date agreeNumTime;

	@RemoteProperty
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private Integer isDelete;

	@RemoteProperty
	@Column(name = "age",length=255,nullable=true,updatable=true)
	private String age;

	@RemoteProperty
	@Column(name = "mobile_content",length=65535,nullable=true,updatable=true)
	private String mobileContent;

	@RemoteProperty
	@Column(name = "mobileLogo",length=255,nullable=true,updatable=true)
	private String mobilelogo;


	public void setAid(String aid){
		this.aid = aid;
	}

		return this.aid;
	}

		this.cid = cid;
	}

		return this.cid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.name = name;
	}

		return this.name;
	}

		this.subtitle = subtitle;
	}

		return this.subtitle;
	}

		this.logo = logo;
	}

		return this.logo;
	}

		this.officialUrl = officialUrl;
	}

		return this.officialUrl;
	}

		this.areaId = areaId;
	}

		return this.areaId;
	}

		this.provinceId = provinceId;
	}

		return this.provinceId;
	}

		this.cityId = cityId;
	}

		return this.cityId;
	}

		this.site = site;
	}

		return this.site;
	}

		this.address = address;
	}

		return this.address;
	}

		this.lat = lat;
	}

		return this.lat;
	}

		this.lng = lng;
	}

		return this.lng;
	}

		this.type = type;
	}

		return this.type;
	}

		this.day = day;
	}

		return this.day;
	}

		this.registerStart = registerStart;
	}

		return this.registerStart;
	}

		this.registerEnd = registerEnd;
	}

		return this.registerEnd;
	}

		this.startTime = startTime;
	}

		return this.startTime;
	}

		this.endTime = endTime;
	}

		return this.endTime;
	}

		this.status = status;
	}

		return this.status;
	}

		this.briefintro = briefintro;
	}

		return this.briefintro;
	}

		this.actDetail = actDetail;
	}

		return this.actDetail;
	}

		this.actDetailUrl = actDetailUrl;
	}

		return this.actDetailUrl;
	}

		this.stick = stick;
	}

		return this.stick;
	}

		this.followSum = followSum;
	}

		return this.followSum;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.clickNum = clickNum;
	}

		return this.clickNum;
	}

		this.agreeNum = agreeNum;
	}

		return this.agreeNum;
	}

		this.disagreeNum = disagreeNum;
	}

		return this.disagreeNum;
	}

		this.agreeNumTime = agreeNumTime;
	}

		return this.agreeNumTime;
	}

		this.isDelete = isDelete;
	}

		return this.isDelete;
	}

		this.age = age;
	}

		return this.age;
	}

		this.mobileContent = mobileContent;
	}

		return this.mobileContent;
	}

		this.mobilelogo = mobilelogo;
	}

		return this.mobilelogo;
	}
