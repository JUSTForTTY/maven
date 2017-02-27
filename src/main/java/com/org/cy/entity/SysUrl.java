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
@Table(name = "sysurl")
@DataTransferObject
public class SysUrl implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "permission",length=255,nullable=true,updatable=true)
	private String permission;

	@RemoteProperty
	@Column(name = "type",length=10,nullable=true,updatable=true)
	private Integer type;

	@RemoteProperty
	@Column(name = "sysmodule_id",length=10,nullable=true,updatable=true)
	private Integer sysmoduleId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.url = url;
	}

		return this.url;
	}

		this.permission = permission;
	}

		return this.permission;
	}

		this.type = type;
	}

		return this.type;
	}

		this.sysmoduleId = sysmoduleId;
	}

		return this.sysmoduleId;
	}
