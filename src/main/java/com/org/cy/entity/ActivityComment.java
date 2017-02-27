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
@Table(name = "activity_comment")
@DataTransferObject
public class ActivityComment implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "acid",length=20,updatable=true)
	private String acid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "aid",length=20,nullable=true,updatable=true)
	private String aid;

	@RemoteProperty
	@Column(name = "amid",length=20,nullable=true,updatable=true)
	private String amid;

	@RemoteProperty
	@Column(name = "cmid",length=20,nullable=true,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "parent_id",length=20,nullable=true,updatable=true)
	private String parentId;

	@RemoteProperty
	@Column(name = "content",length=255,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "reply",length=25,nullable=true,updatable=true)
	private String reply;

	@RemoteProperty
	@Column(name = "stick",length=10,nullable=true,updatable=true)
	private Integer stick;

	@RemoteProperty
	@Column(name = "status",length=10,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "Thumb",length=10,nullable=true,updatable=true)
	private Integer thumb;

	@RemoteProperty
	@Column(name = "miniature",length=55,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "image1",length=255,nullable=true,updatable=true)
	private String image1;

	@RemoteProperty
	@Column(name = "image2",length=255,nullable=true,updatable=true)
	private String image2;

	@RemoteProperty
	@Column(name = "image3",length=255,nullable=true,updatable=true)
	private String image3;

	@RemoteProperty
	@Column(name = "image4",length=255,nullable=true,updatable=true)
	private String image4;

	@RemoteProperty
	@Column(name = "image5",length=255,nullable=true,updatable=true)
	private String image5;

	@RemoteProperty
	@Column(name = "image_id",length=255,nullable=true,updatable=true)
	private String imageId;

	@RemoteProperty
	@Column(name = "nickname",length=55,nullable=true,updatable=true)
	private String nickname;

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
	@Column(name = "click_num",length=10,nullable=true,updatable=true)
	private Integer clickNum;

	@RemoteProperty
	@Column(name = "agree_num",length=10,nullable=true,updatable=true)
	private Integer agreeNum;

	@RemoteProperty
	@Column(name = "disagree_num",length=10,nullable=true,updatable=true)
	private Integer disagreeNum;

	@RemoteProperty
	@Column(name = "agree_num_time",length=0,nullable=true,updatable=true)
	private Date agreeNumTime;


	public void setAcid(String acid){
		this.acid = acid;
	}

		return this.acid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.aid = aid;
	}

		return this.aid;
	}

		this.amid = amid;
	}

		return this.amid;
	}

		this.cmid = cmid;
	}

		return this.cmid;
	}

		this.parentId = parentId;
	}

		return this.parentId;
	}

		this.content = content;
	}

		return this.content;
	}

		this.reply = reply;
	}

		return this.reply;
	}

		this.stick = stick;
	}

		return this.stick;
	}

		this.status = status;
	}

		return this.status;
	}

		this.thumb = thumb;
	}

		return this.thumb;
	}

		this.miniature = miniature;
	}

		return this.miniature;
	}

		this.image1 = image1;
	}

		return this.image1;
	}

		this.image2 = image2;
	}

		return this.image2;
	}

		this.image3 = image3;
	}

		return this.image3;
	}

		this.image4 = image4;
	}

		return this.image4;
	}

		this.image5 = image5;
	}

		return this.image5;
	}

		this.imageId = imageId;
	}

		return this.imageId;
	}

		this.nickname = nickname;
	}

		return this.nickname;
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

		this.clickNum = clickNum;
	}

		return this.clickNum;
	}

		this.agreeNum = agreeNum;
	}

		return this.agreeNum;
	}

		this.disagreeNum = disagreeNum;
	}

		return this.disagreeNum;
	}

		this.agreeNumTime = agreeNumTime;
	}

		return this.agreeNumTime;
	}
