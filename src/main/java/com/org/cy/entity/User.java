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
@Table(name = "user")
@DataTransferObject
public class User implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "username",length=50,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "realname",length=255,updatable=true)
	private String realname;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "usertype",length=3,updatable=true)
	private Integer usertype;

	@RemoteProperty
	@Column(name = "passwd",length=50,updatable=true)
	private String passwd;

	@RemoteProperty
	@Column(name = "userquestion",length=50,nullable=true,updatable=true)
	private String userquestion;

	@RemoteProperty
	@Column(name = "useranswer",length=50,nullable=true,updatable=true)
	private String useranswer;

	@RemoteProperty
	@Column(name = "englishname",length=255,nullable=true,updatable=true)
	private String englishname;

	@RemoteProperty
	@Column(name = "nickname",length=50,nullable=true,updatable=true)
	private String nickname;

	@RemoteProperty
	@Column(name = "gender",length=3,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "tel",length=50,nullable=true,updatable=true)
	private String tel;

	@RemoteProperty
	@Column(name = "fax",length=50,nullable=true,updatable=true)
	private String fax;

	@RemoteProperty
	@Column(name = "email",length=255,nullable=true,updatable=true)
	private String email;

	@RemoteProperty
	@Column(name = "msn",length=255,nullable=true,updatable=true)
	private String msn;

	@RemoteProperty
	@Column(name = "qq",length=50,nullable=true,updatable=true)
	private String qq;

	@RemoteProperty
	@Column(name = "mobile",length=100,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "postcode",length=10,nullable=true,updatable=true)
	private String postcode;

	@RemoteProperty
	@Column(name = "address",length=255,nullable=true,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "credentialtype",length=32,updatable=true)
	private String credentialtype;

	@RemoteProperty
	@Column(name = "credential",length=255,nullable=true,updatable=true)
	private String credential;

	@RemoteProperty
	@Column(name = "contactor",length=255,nullable=true,updatable=true)
	private String contactor;

	@RemoteProperty
	@Column(name = "prepay",length=8,updatable=true)
	private String prepay;

	@RemoteProperty
	@Column(name = "score",length=10,updatable=true)
	private Integer score;

	@RemoteProperty
	@Column(name = "regtime",length=0,updatable=true)
	private Date regtime;

	@RemoteProperty
	@Column(name = "level",length=3,nullable=true,updatable=true)
	private Integer level;

	@RemoteProperty
	@Column(name = "birthday",length=0,nullable=true,updatable=true)
	private Date birthday;

	@RemoteProperty
	@Column(name = "company_id",length=10,nullable=true,updatable=true)
	private Integer companyId;

	@RemoteProperty
	@Column(name = "creator_id",length=10,nullable=true,updatable=true)
	private Integer creatorId;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "group_id",length=10,nullable=true,updatable=true)
	private Integer groupId;

	@RemoteProperty
	@Column(name = "recuser_id",length=10,nullable=true,updatable=true)
	private Integer recuserId;

	@RemoteProperty
	@Column(name = "recusername",length=255,nullable=true,updatable=true)
	private String recusername;

	@RemoteProperty
	@Column(name = "building_id",length=45,nullable=true,updatable=true)
	private String buildingId;

	@RemoteProperty
	@Column(name = "cardId",length=45,nullable=true,updatable=true)
	private String cardid;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=true)
	private String openid;

	@RemoteProperty
	@Column(name = "member_id",length=20,nullable=true,updatable=true)
	private String memberId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.username = username;
	}

		return this.username;
	}

		this.realname = realname;
	}

		return this.realname;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.status = status;
	}

		return this.status;
	}

		this.usertype = usertype;
	}

		return this.usertype;
	}

		this.passwd = passwd;
	}

		return this.passwd;
	}

		this.userquestion = userquestion;
	}

		return this.userquestion;
	}

		this.useranswer = useranswer;
	}

		return this.useranswer;
	}

		this.englishname = englishname;
	}

		return this.englishname;
	}

		this.nickname = nickname;
	}

		return this.nickname;
	}

		this.gender = gender;
	}

		return this.gender;
	}

		this.tel = tel;
	}

		return this.tel;
	}

		this.fax = fax;
	}

		return this.fax;
	}

		this.email = email;
	}

		return this.email;
	}

		this.msn = msn;
	}

		return this.msn;
	}

		this.qq = qq;
	}

		return this.qq;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.postcode = postcode;
	}

		return this.postcode;
	}

		this.address = address;
	}

		return this.address;
	}

		this.credentialtype = credentialtype;
	}

		return this.credentialtype;
	}

		this.credential = credential;
	}

		return this.credential;
	}

		this.contactor = contactor;
	}

		return this.contactor;
	}

		this.prepay = prepay;
	}

		return this.prepay;
	}

		this.score = score;
	}

		return this.score;
	}

		this.regtime = regtime;
	}

		return this.regtime;
	}

		this.level = level;
	}

		return this.level;
	}

		this.birthday = birthday;
	}

		return this.birthday;
	}

		this.companyId = companyId;
	}

		return this.companyId;
	}

		this.creatorId = creatorId;
	}

		return this.creatorId;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.groupId = groupId;
	}

		return this.groupId;
	}

		this.recuserId = recuserId;
	}

		return this.recuserId;
	}

		this.recusername = recusername;
	}

		return this.recusername;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}

		this.cardid = cardid;
	}

		return this.cardid;
	}

		this.openid = openid;
	}

		return this.openid;
	}

		this.memberId = memberId;
	}

		return this.memberId;
	}
