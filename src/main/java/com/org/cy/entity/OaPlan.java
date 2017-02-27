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
@Table(name = "oaplan")
@DataTransferObject
public class OaPlan implements Serializable {


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
	@Column(name = "plancontent",length=65535,nullable=true,updatable=true)
	private String plancontent;

	@RemoteProperty
	@Column(name = "tododate",length=0,updatable=true)
	private Date tododate;

	@RemoteProperty
	@Column(name = "promptstartdate",length=0,nullable=true,updatable=true)
	private Date promptstartdate;

	@RemoteProperty
	@Column(name = "oaplantype_id",length=10,updatable=true)
	private Integer oaplantypeId;

	@RemoteProperty
	@Column(name = "user_id",length=10,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;

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

		this.plancontent = plancontent;
	}

		return this.plancontent;
	}

		this.tododate = tododate;
	}

		return this.tododate;
	}

		this.promptstartdate = promptstartdate;
	}

		return this.promptstartdate;
	}

		this.oaplantypeId = oaplantypeId;
	}

		return this.oaplantypeId;
	}

		this.userId = userId;
	}

		return this.userId;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.status = status;
	}

		return this.status;
	}
