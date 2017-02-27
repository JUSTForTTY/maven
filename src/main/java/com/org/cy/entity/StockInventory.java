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
@Table(name = "stock_inventory")
@DataTransferObject
public class StockInventory implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "goods_id",length=10,nullable=true,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=100,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "user_name",length=50,nullable=true,updatable=true)
	private String userName;

	@RemoteProperty
	@Column(name = "miniature",length=200,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "member_id",length=10,nullable=true,updatable=true)
	private Integer memberId;

	@RemoteProperty
	@Column(name = "member_name",length=50,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "quantity",length=10,nullable=true,updatable=true)
	private Integer quantity;

	@RemoteProperty
	@Column(name = "unit",length=20,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "building_id",length=10,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.goodsName = goodsName;
	}

		return this.goodsName;
	}

		this.userName = userName;
	}

		return this.userName;
	}

		this.miniature = miniature;
	}

		return this.miniature;
	}

		this.memberId = memberId;
	}

		return this.memberId;
	}

		this.memberName = memberName;
	}

		return this.memberName;
	}

		this.quantity = quantity;
	}

		return this.quantity;
	}

		this.unit = unit;
	}

		return this.unit;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}
