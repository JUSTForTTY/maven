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
@Table(name = "city")
@DataTransferObject
public class City implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "cityID",length=6,nullable=true,updatable=true)
	private String cityid;

	@RemoteProperty
	@Column(name = "city",length=50,nullable=true,updatable=true)
	private String city;

	@RemoteProperty
	@Column(name = "father",length=6,nullable=true,updatable=true)
	private String father;

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
	@Column(name = "province_id",length=10,updatable=true)
	private Integer provinceId;

	@RemoteProperty
	@Column(name = "sort",length=10,updatable=true)
	private Integer sort;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.cityid = cityid;
	}

		return this.cityid;
	}

		this.city = city;
	}

		return this.city;
	}

		this.father = father;
	}

		return this.father;
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

		this.provinceId = provinceId;
	}

		return this.provinceId;
	}

		this.sort = sort;
	}

		return this.sort;
	}
