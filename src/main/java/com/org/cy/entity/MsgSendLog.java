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
@Table(name = "msgsendlog")
@DataTransferObject
public class MsgSendLog implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "title",length=765,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "content",length=765,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "recipient",length=765,updatable=true)
	private String recipient;

	@RemoteProperty
	@Column(name = "type",length=3,updatable=true)
	private Integer type;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;


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

		this.recipient = recipient;
	}

		return this.recipient;
	}

		this.type = type;
	}

		return this.type;
	}

		this.status = status;
	}

		return this.status;
	}
