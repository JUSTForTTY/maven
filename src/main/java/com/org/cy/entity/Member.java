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

		return this.id;
	}

		this.address = address;
	}

		return this.address;
	}

		this.brandId = brandId;
	}

		return this.brandId;
	}

		this.classification = classification;
	}

		return this.classification;
	}

		this.color = color;
	}

		return this.color;
	}

		this.costprice = costprice;
	}

		return this.costprice;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.detailintro = detailintro;
	}

		return this.detailintro;
	}

		this.discount = discount;
	}

		return this.discount;
	}

		this.image1 = image1;
	}

		return this.image1;
	}

		this.image4 = image4;
	}

		return this.image4;
	}

		this.image5 = image5;
	}

		return this.image5;
	}

		this.indexid = indexid;
	}

		return this.indexid;
	}

		this.isfreshgoods = isfreshgoods;
	}

		return this.isfreshgoods;
	}

		this.ishotgoods = ishotgoods;
	}

		return this.ishotgoods;
	}

		this.isoutofstock = isoutofstock;
	}

		return this.isoutofstock;
	}

		this.lastModified = lastModified;
	}

		return this.lastModified;
	}

		this.latitude = latitude;
	}

		return this.latitude;
	}

		this.longitude = longitude;
	}

		return this.longitude;
	}

		this.material = material;
	}

		return this.material;
	}

		this.memberurl = memberurl;
	}

		return this.memberurl;
	}

		this.miniature = miniature;
	}

		return this.miniature;
	}

		this.model = model;
	}

		return this.model;
	}

		this.name = name;
	}

		return this.name;
	}

		this.ordernum = ordernum;
	}

		return this.ordernum;
	}

		this.price = price;
	}

		return this.price;
	}

		this.producearea = producearea;
	}

		return this.producearea;
	}

		this.productdate = productdate;
	}

		return this.productdate;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.recommendlevel = recommendlevel;
	}

		return this.recommendlevel;
	}

		this.recommendremark = recommendremark;
	}

		return this.recommendremark;
	}

		this.refprice = refprice;
	}

		return this.refprice;
	}

		this.salenum = salenum;
	}

		return this.salenum;
	}

		this.scoreAdd = scoreAdd;
	}

		return this.scoreAdd;
	}

		this.serialno = serialno;
	}

		return this.serialno;
	}

		this.size = size;
	}

		return this.size;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.spec = spec;
	}

		return this.spec;
	}

		this.status = status;
	}

		return this.status;
	}

		this.stocknum = stocknum;
	}

		return this.stocknum;
	}

		this.supplydate = supplydate;
	}

		return this.supplydate;
	}

		this.title = title;
	}

		return this.title;
	}

		this.type = type;
	}

		return this.type;
	}

		this.unit = unit;
	}

		return this.unit;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}

		this.url = url;
	}

		return this.url;
	}

		this.viewnum = viewnum;
	}

		return this.viewnum;
	}

		this.vipprice = vipprice;
	}

		return this.vipprice;
	}

		this.weight = weight;
	}

		return this.weight;
	}
