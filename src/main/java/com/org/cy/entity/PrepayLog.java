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
@Table(name = "prepaylog")
@DataTransferObject
public class PrepayLog implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "user_id",length=10,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "orderinfo_id",length=19,nullable=true,updatable=true)
	private Integer orderinfoId;

	@RemoteProperty
	@Column(name = "paysum",length=10,updatable=true)
	private String paysum;

	@RemoteProperty
	@Column(name = "paytype",length=32,updatable=true)
	private String paytype;

	@RemoteProperty
	@Column(name = "paytime",length=0,updatable=true)
	private Date paytime;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "creator",length=10,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.userId = userId;
	}

		return this.userId;
	}

		this.orderinfoId = orderinfoId;
	}

		return this.orderinfoId;
	}

		this.paysum = paysum;
	}

		return this.paysum;
	}

		this.paytype = paytype;
	}

		return this.paytype;
	}

		this.paytime = paytime;
	}

		return this.paytime;
	}

		this.remark = remark;
	}

		return this.remark;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}
