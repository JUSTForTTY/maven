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
@Table(name = "club_member")
@DataTransferObject
public class ClubMember implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "cmid",length=20,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "cid",length=20,nullable=true,updatable=true)
	private String cid;

	@RemoteProperty
	@Column(name = "uid",length=20,nullable=true,updatable=true)
	private String uid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "name",length=20,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "status",length=5,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "nickname",length=55,nullable=true,updatable=true)
	private String nickname;

	@RemoteProperty
	@Column(name = "mobile",length=15,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "gender",length=5,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "grade",length=55,nullable=true,updatable=true)
	private String grade;

	@RemoteProperty
	@Column(name = "flag",length=15,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "administrator",length=15,nullable=true,updatable=true)
	private String administrator;

	@RemoteProperty
	@Column(name = "cue_time",length=0,nullable=true,updatable=true)
	private Date cueTime;

	@RemoteProperty
	@Column(name = "accomplish",length=55,nullable=true,updatable=true)
	private String accomplish;

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


	public void setCmid(String cmid){
		this.cmid = cmid;
	}

		return this.cmid;
	}

		this.cid = cid;
	}

		return this.cid;
	}

		this.uid = uid;
	}

		return this.uid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.name = name;
	}

		return this.name;
	}

		this.status = status;
	}

		return this.status;
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

		this.grade = grade;
	}

		return this.grade;
	}

		this.flag = flag;
	}

		return this.flag;
	}

		this.administrator = administrator;
	}

		return this.administrator;
	}

		this.cueTime = cueTime;
	}

		return this.cueTime;
	}

		this.accomplish = accomplish;
	}

		return this.accomplish;
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
