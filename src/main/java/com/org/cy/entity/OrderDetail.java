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
@Table(name = "order_detail")
@DataTransferObject
public class OrderDetail implements Serializable {


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
	@Column(name = "order_id",length=19,nullable=true,updatable=true)
	private Integer orderId;

	@RemoteProperty
	@Column(name = "sub_order_id",length=19,nullable=true,updatable=true)
	private Integer subOrderId;

	@RemoteProperty
	@Column(name = "goods_id",length=19,nullable=true,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=255,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "miniature",length=255,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "member_name",length=255,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "unit_price",length=19,nullable=true,updatable=true)
	private Integer unitPrice;

	@RemoteProperty
	@Column(name = "unit_score",length=19,nullable=true,updatable=true)
	private Integer unitScore;

	@RemoteProperty
	@Column(name = "goods_count",length=10,nullable=true,updatable=true)
	private Integer goodsCount;

	@RemoteProperty
	@Column(name = "single_price",length=19,nullable=true,updatable=true)
	private Integer singlePrice;

	@RemoteProperty
	@Column(name = "single_score",length=19,nullable=true,updatable=true)
	private Integer singleScore;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;

	@RemoteProperty
	@Column(name = "goods_state",length=20,nullable=true,updatable=true)
	private String goodsState;

	@RemoteProperty
	@Column(name = "member_id",length=10,nullable=true,updatable=true)
	private Integer memberId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.orderId = orderId;
	}

		return this.orderId;
	}

		this.subOrderId = subOrderId;
	}

		return this.subOrderId;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.goodsName = goodsName;
	}

		return this.goodsName;
	}

		this.miniature = miniature;
	}

		return this.miniature;
	}

		this.memberName = memberName;
	}

		return this.memberName;
	}

		this.unitPrice = unitPrice;
	}

		return this.unitPrice;
	}

		this.unitScore = unitScore;
	}

		return this.unitScore;
	}

		this.goodsCount = goodsCount;
	}

		return this.goodsCount;
	}

		this.singlePrice = singlePrice;
	}

		return this.singlePrice;
	}

		this.singleScore = singleScore;
	}

		return this.singleScore;
	}

		this.gmtCreate = gmtCreate;
	}

		return this.gmtCreate;
	}

		this.gmtModify = gmtModify;
	}

		return this.gmtModify;
	}

		this.goodsState = goodsState;
	}

		return this.goodsState;
	}

		this.memberId = memberId;
	}

		return this.memberId;
	}
