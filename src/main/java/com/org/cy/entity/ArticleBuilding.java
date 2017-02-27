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
@Table(name = "article_building")
@DataTransferObject
public class ArticleBuilding implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "article_id",length=10,updatable=true)
	private Integer articleId;

	@RemoteProperty
	@Column(name = "building_id",length=10,updatable=true)
	private Integer buildingId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.articleId = articleId;
	}

		return this.articleId;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}
