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
@Table(name = "orderinfo")
@DataTransferObject
public class OrderInfo implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "orderno",length=20,updatable=true)
	private String orderno;

	@RemoteProperty
	@Column(name = "ordertime",length=0,updatable=true)
	private Date ordertime;

	@RemoteProperty
	@Column(name = "itemcount",length=10,updatable=true)
	private Integer itemcount;

	@RemoteProperty
	@Column(name = "goodssum",length=10,updatable=true)
	private String goodssum;

	@RemoteProperty
	@Column(name = "servicesum",length=10,updatable=true)
	private String servicesum;

	@RemoteProperty
	@Column(name = "othersum",length=10,updatable=true)
	private String othersum;

	@RemoteProperty
	@Column(name = "totalsum",length=10,updatable=true)
	private String totalsum;

	@RemoteProperty
	@Column(name = "score",length=10,updatable=true)
	private Integer score;

	@RemoteProperty
	@Column(name = "receivername",length=255,updatable=true)
	private String receivername;

	@RemoteProperty
	@Column(name = "receivertel",length=32,nullable=true,updatable=true)
	private String receivertel;

	@RemoteProperty
	@Column(name = "receivermobile",length=20,nullable=true,updatable=true)
	private String receivermobile;

	@RemoteProperty
	@Column(name = "receiveremail",length=255,nullable=true,updatable=true)
	private String receiveremail;

	@RemoteProperty
	@Column(name = "receiveraddr",length=255,updatable=true)
	private String receiveraddr;

	@RemoteProperty
	@Column(name = "receiverzip",length=10,nullable=true,updatable=true)
	private String receiverzip;

	@RemoteProperty
	@Column(name = "user_id",length=10,nullable=true,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "username",length=255,nullable=true,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "userremark",length=255,nullable=true,updatable=true)
	private String userremark;

	@RemoteProperty
	@Column(name = "delivertype_id",length=10,nullable=true,updatable=true)
	private Integer delivertypeId;

	@RemoteProperty
	@Column(name = "deliverremark",length=255,nullable=true,updatable=true)
	private String deliverremark;

	@RemoteProperty
	@Column(name = "paymenttype_id",length=10,nullable=true,updatable=true)
	private Integer paymenttypeId;

	@RemoteProperty
	@Column(name = "paymenttime",length=0,nullable=true,updatable=true)
	private Date paymenttime;

	@RemoteProperty
	@Column(name = "paymentremark",length=255,nullable=true,updatable=true)
	private String paymentremark;

	@RemoteProperty
	@Column(name = "requireinvoice",length=3,updatable=true)
	private Integer requireinvoice;

	@RemoteProperty
	@Column(name = "invoicetitle",length=255,nullable=true,updatable=true)
	private String invoicetitle;

	@RemoteProperty
	@Column(name = "status",length=10,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=true)
	private String openid;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.orderno = orderno;
	}

		return this.orderno;
	}

		this.ordertime = ordertime;
	}

		return this.ordertime;
	}

		this.itemcount = itemcount;
	}

		return this.itemcount;
	}

		this.goodssum = goodssum;
	}

		return this.goodssum;
	}

		this.servicesum = servicesum;
	}

		return this.servicesum;
	}

		this.othersum = othersum;
	}

		return this.othersum;
	}

		this.totalsum = totalsum;
	}

		return this.totalsum;
	}

		this.score = score;
	}

		return this.score;
	}

		this.receivername = receivername;
	}

		return this.receivername;
	}

		this.receivertel = receivertel;
	}

		return this.receivertel;
	}

		this.receivermobile = receivermobile;
	}

		return this.receivermobile;
	}

		this.receiveremail = receiveremail;
	}

		return this.receiveremail;
	}

		this.receiveraddr = receiveraddr;
	}

		return this.receiveraddr;
	}

		this.receiverzip = receiverzip;
	}

		return this.receiverzip;
	}

		this.userId = userId;
	}

		return this.userId;
	}

		this.username = username;
	}

		return this.username;
	}

		this.userremark = userremark;
	}

		return this.userremark;
	}

		this.delivertypeId = delivertypeId;
	}

		return this.delivertypeId;
	}

		this.deliverremark = deliverremark;
	}

		return this.deliverremark;
	}

		this.paymenttypeId = paymenttypeId;
	}

		return this.paymenttypeId;
	}

		this.paymenttime = paymenttime;
	}

		return this.paymenttime;
	}

		this.paymentremark = paymentremark;
	}

		return this.paymentremark;
	}

		this.requireinvoice = requireinvoice;
	}

		return this.requireinvoice;
	}

		this.invoicetitle = invoicetitle;
	}

		return this.invoicetitle;
	}

		this.status = status;
	}

		return this.status;
	}

		this.openid = openid;
	}

		return this.openid;
	}
