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
@Table(name = "recharge_rules")
@DataTransferObject
public class RechargeRules implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "reid",length=20,updatable=true)
	private String reid;

	@RemoteProperty
	@Column(name = "act_pro_id",length=10,nullable=true,updatable=true)
	private Integer actProId;

	@RemoteProperty
	@Column(name = "activity_project_name",length=25,nullable=true,updatable=true)
	private String activityProjectName;

	@RemoteProperty
	@Column(name = "amount",length=10,nullable=true,updatable=true)
	private Integer amount;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "flag",length=255,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "reward",length=25,nullable=true,updatable=true)
	private String reward;


	public void setReid(String reid){
		this.reid = reid;
	}

		return this.reid;
	}

		this.actProId = actProId;
	}

		return this.actProId;
	}

		this.activityProjectName = activityProjectName;
	}

		return this.activityProjectName;
	}

		this.amount = amount;
	}

		return this.amount;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.flag = flag;
	}

		return this.flag;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}

		this.reward = reward;
	}

		return this.reward;
	}
