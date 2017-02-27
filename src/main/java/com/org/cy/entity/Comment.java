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
@Table(name = "comment")
@DataTransferObject
public class Comment implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "goods_id",length=10,nullable=true,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "username",length=50,nullable=true,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "status",length=45,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "modifytime",length=0,nullable=true,updatable=true)
	private Date modifytime;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.username = username;
	}

		return this.username;
	}

		this.title = title;
	}

		return this.title;
	}

		this.content = content;
	}

		return this.content;
	}

		this.status = status;
	}

		return this.status;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.modifytime = modifytime;
	}

		return this.modifytime;
	}
