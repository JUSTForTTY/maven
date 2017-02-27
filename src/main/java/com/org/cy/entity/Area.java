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
@Table(name = "area")
@DataTransferObject
public class Area implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "area",length=60,nullable=true,updatable=true)
	private String area;

	@RemoteProperty
	@Column(name = "areaID",length=50,nullable=true,updatable=true)
	private String areaid;

	@RemoteProperty
	@Column(name = "father",length=6,nullable=true,updatable=true)
	private String father;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.area = area;
	}

		return this.area;
	}

		this.areaid = areaid;
	}

		return this.areaid;
	}

		this.father = father;
	}

		return this.father;
	}
