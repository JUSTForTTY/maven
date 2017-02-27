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
@Table(name = "order")
@DataTransferObject
public class Order implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "order_time",length=0,nullable=true,updatable=true)
	private Date orderTime;

	@RemoteProperty
	@Column(name = "total_price",length=19,nullable=true,updatable=true)
	private Integer totalPrice;

	@RemoteProperty
	@Column(name = "total_score",length=19,nullable=true,updatable=true)
	private Integer totalScore;

	@RemoteProperty
	@Column(name = "goods_type_count",length=10,nullable=true,updatable=true)
	private Integer goodsTypeCount;

	@RemoteProperty
	@Column(name = "goods_count",length=10,nullable=true,updatable=true)
	private Integer goodsCount;

	@RemoteProperty
	@Column(name = "receiver_name",length=255,nullable=true,updatable=true)
	private String receiverName;

	@RemoteProperty
	@Column(name = "receiver_address",length=255,nullable=true,updatable=true)
	private String receiverAddress;

	@RemoteProperty
	@Column(name = "receiver_mobile",length=255,nullable=true,updatable=true)
	private String receiverMobile;

	@RemoteProperty
	@Column(name = "user_remarks",length=255,nullable=true,updatable=true)
	private String userRemarks;

	@RemoteProperty
	@Column(name = "user_name",length=255,nullable=true,updatable=true)
	private String userName;

	@RemoteProperty
	@Column(name = "referee",length=255,nullable=true,updatable=true)
	private String referee;

	@RemoteProperty
	@Column(name = "pay_type",length=255,nullable=true,updatable=true)
	private String payType;

	@RemoteProperty
	@Column(name = "is_split",length=255,nullable=true,updatable=true)
	private String isSplit;

	@RemoteProperty
	@Column(name = "status",length=255,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.orderTime = orderTime;
	}

		return this.orderTime;
	}

		this.totalPrice = totalPrice;
	}

		return this.totalPrice;
	}

		this.totalScore = totalScore;
	}

		return this.totalScore;
	}

		this.goodsTypeCount = goodsTypeCount;
	}

		return this.goodsTypeCount;
	}

		this.goodsCount = goodsCount;
	}

		return this.goodsCount;
	}

		this.receiverName = receiverName;
	}

		return this.receiverName;
	}

		this.receiverAddress = receiverAddress;
	}

		return this.receiverAddress;
	}

		this.receiverMobile = receiverMobile;
	}

		return this.receiverMobile;
	}

		this.userRemarks = userRemarks;
	}

		return this.userRemarks;
	}

		this.userName = userName;
	}

		return this.userName;
	}

		this.referee = referee;
	}

		return this.referee;
	}

		this.payType = payType;
	}

		return this.payType;
	}

		this.isSplit = isSplit;
	}

		return this.isSplit;
	}

		this.status = status;
	}

		return this.status;
	}

		this.gmtCreate = gmtCreate;
	}

		return this.gmtCreate;
	}

		this.gmtModify = gmtModify;
	}

		return this.gmtModify;
	}
