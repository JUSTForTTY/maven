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
@Table(name = "message")
@DataTransferObject
public class Message implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "title",length=255,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "messagetype_id",length=10,updatable=true)
	private Integer messagetypeId;

	@RemoteProperty
	@Column(name = "recipient_userid",length=10,nullable=true,updatable=true)
	private Integer recipientUserid;

	@RemoteProperty
	@Column(name = "notice_mail",length=3,nullable=true,updatable=true)
	private Integer noticeMail;

	@RemoteProperty
	@Column(name = "notice_msn",length=3,nullable=true,updatable=true)
	private Integer noticeMsn;

	@RemoteProperty
	@Column(name = "notice_mobile",length=3,nullable=true,updatable=true)
	private Integer noticeMobile;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "creator",length=10,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "isopen",length=3,updatable=true)
	private Integer isopen;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.title = title;
	}

		return this.title;
	}

		this.content = content;
	}

		return this.content;
	}

		this.messagetypeId = messagetypeId;
	}

		return this.messagetypeId;
	}

		this.recipientUserid = recipientUserid;
	}

		return this.recipientUserid;
	}

		this.noticeMail = noticeMail;
	}

		return this.noticeMail;
	}

		this.noticeMsn = noticeMsn;
	}

		return this.noticeMsn;
	}

		this.noticeMobile = noticeMobile;
	}

		return this.noticeMobile;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.isopen = isopen;
	}

		return this.isopen;
	}
