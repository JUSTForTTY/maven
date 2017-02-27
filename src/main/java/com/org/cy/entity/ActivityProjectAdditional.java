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
@Table(name = "activity_project_additional")
@DataTransferObject
public class ActivityProjectAdditional implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "apaid",length=20,updatable=true)
	private String apaid;

	@RemoteProperty
	@Column(name = "aid",length=20,nullable=true,updatable=true)
	private String aid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "name",length=55,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "price",length=10,nullable=true,updatable=true)
	private String price;

	@RemoteProperty
	@Column(name = "content",length=255,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "category",length=20,nullable=true,updatable=true)
	private String category;

	@RemoteProperty
	@Column(name = "start_time",length=0,nullable=true,updatable=true)
	private Date startTime;

	@RemoteProperty
	@Column(name = "end_time",length=0,nullable=true,updatable=true)
	private Date endTime;

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
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private Integer isDelete;


	public void setApaid(String apaid){
		this.apaid = apaid;
	}

		return this.apaid;
	}

		this.aid = aid;
	}

		return this.aid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.name = name;
	}

		return this.name;
	}

		this.price = price;
	}

		return this.price;
	}

		this.content = content;
	}

		return this.content;
	}

		this.category = category;
	}

		return this.category;
	}

		this.startTime = startTime;
	}

		return this.startTime;
	}

		this.endTime = endTime;
	}

		return this.endTime;
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

		this.isDelete = isDelete;
	}

		return this.isDelete;
	}
