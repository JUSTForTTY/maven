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
@Table(name = "spree")
@DataTransferObject
public class Spree implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "sid",length=255,nullable=true,updatable=true)
	private String sid;

	@RemoteProperty
	@Column(name = "goods_id",length=255,nullable=true,updatable=true)
	private String goodsId;

	@RemoteProperty
	@Column(name = "quantity",length=255,nullable=true,updatable=true)
	private String quantity;

	@RemoteProperty
	@Column(name = "unit",length=255,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.sid = sid;
	}

		return this.sid;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.quantity = quantity;
	}

		return this.quantity;
	}

		this.unit = unit;
	}

		return this.unit;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}
