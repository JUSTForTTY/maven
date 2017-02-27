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
@Table(name = "log")
@DataTransferObject
public class Log implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "lid",length=20,updatable=true)
	private String lid;

	@RemoteProperty
	@Column(name = "cmid",length=20,nullable=true,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "payment",length=10,nullable=true,updatable=true)
	private String payment;

	@RemoteProperty
	@Column(name = "status",length=10,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "pay_type",length=255,nullable=true,updatable=true)
	private String payType;

	@RemoteProperty
	@Column(name = "pay_flag",length=255,nullable=true,updatable=true)
	private String payFlag;

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
	@Column(name = "amount",length=10,nullable=true,updatable=true)
	private String amount;


	public void setLid(String lid){
		this.lid = lid;
	}

		return this.lid;
	}

		this.cmid = cmid;
	}

		return this.cmid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.payment = payment;
	}

		return this.payment;
	}

		this.status = status;
	}

		return this.status;
	}

		this.payType = payType;
	}

		return this.payType;
	}

		this.payFlag = payFlag;
	}

		return this.payFlag;
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

		this.amount = amount;
	}

		return this.amount;
	}
