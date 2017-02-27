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
@Table(name = "assoc_building_category")
@DataTransferObject
public class AssocBuilingCategory implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "category_id",length=10,nullable=true,updatable=true)
	private Integer categoryId;

	@RemoteProperty
	@Column(name = "building_id",length=10,nullable=true,updatable=true)
	private Integer buildingId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.categoryId = categoryId;
	}

		return this.categoryId;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}
