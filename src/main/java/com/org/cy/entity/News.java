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
@Table(name = "news")
@DataTransferObject
public class News implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "channel_id",length=19,nullable=true,updatable=true)
	private Integer channelId;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "briefintro",length=255,nullable=true,updatable=true)
	private String briefintro;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "is_scroll",length=255,nullable=true,updatable=true)
	private String isScroll;

	@RemoteProperty
	@Column(name = "content",length=2147483647,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "status",length=255,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "onHome",length=10,nullable=true,updatable=true)
	private Integer onhome;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "gmt_publish",length=0,nullable=true,updatable=true)
	private Date gmtPublish;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;

	@RemoteProperty
	@Column(name = "nid",length=32,nullable=true,updatable=true)
	private String nid;

	@RemoteProperty
	@Column(name = "agree_num",length=10,nullable=true,updatable=true)
	private Integer agreeNum;

	@RemoteProperty
	@Column(name = "mobilecontent",length=2147483647,nullable=true,updatable=true)
	private String mobilecontent;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.channelId = channelId;
	}

		return this.channelId;
	}

		this.title = title;
	}

		return this.title;
	}

		this.briefintro = briefintro;
	}

		return this.briefintro;
	}

		this.image = image;
	}

		return this.image;
	}

		this.isScroll = isScroll;
	}

		return this.isScroll;
	}

		this.content = content;
	}

		return this.content;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.status = status;
	}

		return this.status;
	}

		this.url = url;
	}

		return this.url;
	}

		this.onhome = onhome;
	}

		return this.onhome;
	}

		this.type = type;
	}

		return this.type;
	}

		this.gmtPublish = gmtPublish;
	}

		return this.gmtPublish;
	}

		this.gmtCreate = gmtCreate;
	}

		return this.gmtCreate;
	}

		this.gmtModify = gmtModify;
	}

		return this.gmtModify;
	}

		this.nid = nid;
	}

		return this.nid;
	}

		this.agreeNum = agreeNum;
	}

		return this.agreeNum;
	}

		this.mobilecontent = mobilecontent;
	}

		return this.mobilecontent;
	}
