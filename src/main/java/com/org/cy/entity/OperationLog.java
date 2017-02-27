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
@Table(name = "operation_log")
@DataTransferObject
public class OperationLog implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "modify_user",length=255,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "F1",length=255,nullable=true,updatable=true)
	private String f1;

	@RemoteProperty
	@Column(name = "F2",length=255,nullable=true,updatable=true)
	private String f2;

	@RemoteProperty
	@Column(name = "F3",length=255,nullable=true,updatable=true)
	private String f3;

	@RemoteProperty
	@Column(name = "F4",length=255,nullable=true,updatable=true)
	private String f4;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.f1 = f1;
	}

		return this.f1;
	}

		this.f2 = f2;
	}

		return this.f2;
	}

		this.f3 = f3;
	}

		return this.f3;
	}

		this.f4 = f4;
	}

		return this.f4;
	}
