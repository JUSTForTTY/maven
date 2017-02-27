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
@Table(name = "activity_member")
@DataTransferObject
public class ActivityMember implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "amid",length=20,updatable=true)
	private String amid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "aid",length=20,nullable=true,updatable=true)
	private String aid;

	@RemoteProperty
	@Column(name = "cmid",length=20,nullable=true,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "name",length=15,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "nickname",length=25,nullable=true,updatable=true)
	private String nickname;

	@RemoteProperty
	@Column(name = "mobile",length=15,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "gender",length=5,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "administrator",length=25,nullable=true,updatable=true)
	private String administrator;

	@RemoteProperty
	@Column(name = "operator",length=35,nullable=true,updatable=true)
	private String operator;

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


	public void setAmid(String amid){
		this.amid = amid;
	}

		return this.amid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.aid = aid;
	}

		return this.aid;
	}

		this.cmid = cmid;
	}

		return this.cmid;
	}

		this.name = name;
	}

		return this.name;
	}

		this.nickname = nickname;
	}

		return this.nickname;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.gender = gender;
	}

		return this.gender;
	}

		this.administrator = administrator;
	}

		return this.administrator;
	}

		this.operator = operator;
	}

		return this.operator;
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
