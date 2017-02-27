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
@Table(name = "index_custom")
@DataTransferObject
public class IndexCustom implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "building_id",length=19,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "floor",length=10,nullable=true,updatable=true)
	private Integer floor;

	@RemoteProperty
	@Column(name = "codeno",length=10,nullable=true,updatable=true)
	private Integer codeno;

	@RemoteProperty
	@Column(name = "codetype",length=255,nullable=true,updatable=true)
	private String codetype;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "custom_detail",length=65535,nullable=true,updatable=true)
	private String customDetail;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "description",length=255,nullable=true,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "enable",length=255,nullable=true,updatable=true)
	private String enable;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "modify_user",length=255,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "more",length=255,nullable=true,updatable=true)
	private String more;

	@RemoteProperty
	@Column(name = "bgpic",length=255,nullable=true,updatable=true)
	private String bgpic;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}

		this.floor = floor;
	}

		return this.floor;
	}

		this.codeno = codeno;
	}

		return this.codeno;
	}

		this.codetype = codetype;
	}

		return this.codetype;
	}

		this.type = type;
	}

		return this.type;
	}

		this.customDetail = customDetail;
	}

		return this.customDetail;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.description = description;
	}

		return this.description;
	}

		this.enable = enable;
	}

		return this.enable;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}

		this.more = more;
	}

		return this.more;
	}

		this.bgpic = bgpic;
	}

		return this.bgpic;
	}
