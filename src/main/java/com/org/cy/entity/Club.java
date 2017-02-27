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
@Table(name = "club")
@DataTransferObject
public class Club implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "cid",length=20,updatable=true)
	private String cid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "name",length=55,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "logo",length=255,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "brief",length=255,nullable=true,updatable=true)
	private String brief;

	@RemoteProperty
	@Column(name = "type",length=15,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "club_member_sum",length=10,nullable=true,updatable=true)
	private Integer clubMemberSum;

	@RemoteProperty
	@Column(name = "fee_circle",length=255,nullable=true,updatable=true)
	private String feeCircle;

	@RemoteProperty
	@Column(name = "fee_start_date",length=0,nullable=true,updatable=true)
	private Date feeStartDate;

	@RemoteProperty
	@Column(name = "city",length=25,nullable=true,updatable=true)
	private String city;

	@RemoteProperty
	@Column(name = "administrator",length=255,nullable=true,updatable=true)
	private String administrator;

	@RemoteProperty
	@Column(name = "slogan",length=55,nullable=true,updatable=true)
	private String slogan;

	@RemoteProperty
	@Column(name = "operator",length=15,nullable=true,updatable=true)
	private String operator;

	@RemoteProperty
	@Column(name = "mobile",length=15,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "create_id",length=10,nullable=true,updatable=true)
	private Integer createId;

	@RemoteProperty
	@Column(name = "status",length=5,nullable=true,updatable=true)
	private String status;

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
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private Integer isDelete;


	public void setCid(String cid){
		this.cid = cid;
	}

		return this.cid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.name = name;
	}

		return this.name;
	}

		this.logo = logo;
	}

		return this.logo;
	}

		this.brief = brief;
	}

		return this.brief;
	}

		this.type = type;
	}

		return this.type;
	}

		this.clubMemberSum = clubMemberSum;
	}

		return this.clubMemberSum;
	}

		this.feeCircle = feeCircle;
	}

		return this.feeCircle;
	}

		this.feeStartDate = feeStartDate;
	}

		return this.feeStartDate;
	}

		this.city = city;
	}

		return this.city;
	}

		this.administrator = administrator;
	}

		return this.administrator;
	}

		this.slogan = slogan;
	}

		return this.slogan;
	}

		this.operator = operator;
	}

		return this.operator;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.createId = createId;
	}

		return this.createId;
	}

		this.status = status;
	}

		return this.status;
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

		this.isDelete = isDelete;
	}

		return this.isDelete;
	}
