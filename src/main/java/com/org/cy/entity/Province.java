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
@Table(name = "province")
@DataTransferObject
public class Province implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provinceID",length=6,nullable=true,updatable=true)
	private String provinceid;

	@RemoteProperty
	@Column(name = "province",length=40,nullable=true,updatable=true)
	private String province;

	@RemoteProperty
	@Column(name = "code",length=32,updatable=true)
	private String code;

	@RemoteProperty
	@Column(name = "description",length=255,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "sort",length=10,updatable=true)
	private Integer sort;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.provinceid = provinceid;
	}

		return this.provinceid;
	}

		this.province = province;
	}

		return this.province;
	}

		this.code = code;
	}

		return this.code;
	}

		this.description = description;
	}

		return this.description;
	}

		this.name = name;
	}

		return this.name;
	}

		this.sort = sort;
	}

		return this.sort;
	}
