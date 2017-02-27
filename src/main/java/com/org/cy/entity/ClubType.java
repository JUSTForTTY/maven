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
@Table(name = "club_type")
@DataTransferObject
public class ClubType implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "club_type",length=20,nullable=true,updatable=true)
	private String clubType;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "description",length=50,nullable=true,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "is_delete",length=10,nullable=true,updatable=true)
	private Integer isDelete;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.clubType = clubType;
	}

		return this.clubType;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.description = description;
	}

		return this.description;
	}

		this.isDelete = isDelete;
	}

		return this.isDelete;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}
