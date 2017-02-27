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
@Table(name = "category")
@DataTransferObject
public class Category implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=32,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "parent_id",length=10,nullable=true,updatable=true)
	private Integer parentId;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "goodsnum",length=10,nullable=true,updatable=true)
	private Integer goodsnum;

	@RemoteProperty
	@Column(name = "isopen",length=3,updatable=true)
	private Integer isopen;

	@RemoteProperty
	@Column(name = "tag1",length=32,nullable=true,updatable=true)
	private String tag1;

	@RemoteProperty
	@Column(name = "tag2",length=32,nullable=true,updatable=true)
	private String tag2;

	@RemoteProperty
	@Column(name = "tag3",length=32,nullable=true,updatable=true)
	private String tag3;

	@RemoteProperty
	@Column(name = "tag4",length=32,nullable=true,updatable=true)
	private String tag4;

	@RemoteProperty
	@Column(name = "tag5",length=32,nullable=true,updatable=true)
	private String tag5;

	@RemoteProperty
	@Column(name = "caid",length=20,nullable=true,updatable=true)
	private String caid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "codeNo",length=32,nullable=true,updatable=true)
	private String codeno;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "description",length=100,nullable=true,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "grade",length=10,nullable=true,updatable=true)
	private Integer grade;

	@RemoteProperty
	@Column(name = "icon",length=45,nullable=true,updatable=true)
	private String icon;

	@RemoteProperty
	@Column(name = "is_delete",length=3,nullable=true,updatable=true)
	private String isDelete;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "onHome",length=10,nullable=true,updatable=true)
	private Integer onhome;

	@RemoteProperty
	@Column(name = "onHomeType",length=10,nullable=true,updatable=true)
	private Integer onhometype;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.remark = remark;
	}

		return this.remark;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.parentId = parentId;
	}

		return this.parentId;
	}

		this.image = image;
	}

		return this.image;
	}

		this.url = url;
	}

		return this.url;
	}

		this.goodsnum = goodsnum;
	}

		return this.goodsnum;
	}

		this.isopen = isopen;
	}

		return this.isopen;
	}

		this.tag1 = tag1;
	}

		return this.tag1;
	}

		this.tag2 = tag2;
	}

		return this.tag2;
	}

		this.tag3 = tag3;
	}

		return this.tag3;
	}

		this.tag4 = tag4;
	}

		return this.tag4;
	}

		this.tag5 = tag5;
	}

		return this.tag5;
	}

		this.caid = caid;
	}

		return this.caid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.codeno = codeno;
	}

		return this.codeno;
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

		this.grade = grade;
	}

		return this.grade;
	}

		this.icon = icon;
	}

		return this.icon;
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

		this.onhome = onhome;
	}

		return this.onhome;
	}

		this.onhometype = onhometype;
	}

		return this.onhometype;
	}
