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
@Table(name = "article")
@DataTransferObject
public class Article implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "title",length=255,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "subtitle",length=255,nullable=true,updatable=true)
	private String subtitle;

	@RemoteProperty
	@Column(name = "code",length=32,nullable=true,updatable=true)
	private String code;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "summary",length=255,nullable=true,updatable=true)
	private String summary;

	@RemoteProperty
	@Column(name = "link",length=255,nullable=true,updatable=true)
	private String link;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "isopen",length=3,updatable=true)
	private Integer isopen;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.title = title;
	}

		return this.title;
	}

		this.subtitle = subtitle;
	}

		return this.subtitle;
	}

		this.code = code;
	}

		return this.code;
	}

		this.image = image;
	}

		return this.image;
	}

		this.summary = summary;
	}

		return this.summary;
	}

		this.link = link;
	}

		return this.link;
	}

		this.content = content;
	}

		return this.content;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.isopen = isopen;
	}

		return this.isopen;
	}
