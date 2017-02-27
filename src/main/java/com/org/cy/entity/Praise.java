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
@Table(name = "praise")
@DataTransferObject
public class Praise implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=11,updatable=true)
	private String id;

	@RemoteProperty
	@Column(name = "uid",length=11,nullable=true,updatable=true)
	private String uid;

	@RemoteProperty
	@Column(name = "sid",length=255,nullable=true,updatable=true)
	private String sid;

	@RemoteProperty
	@Column(name = "flag",length=11,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "status",length=20,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;


	public void setId(String id){
		this.id = id;
	}

		return this.id;
	}

		this.uid = uid;
	}

		return this.uid;
	}

		this.sid = sid;
	}

		return this.sid;
	}

		this.flag = flag;
	}

		return this.flag;
	}

		this.status = status;
	}

		return this.status;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}
