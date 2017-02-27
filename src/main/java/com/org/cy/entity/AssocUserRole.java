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
@Table(name = "assoc_user_role")
@DataTransferObject
public class AssocUserRole implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "user_id",length=19,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "role_id",length=10,updatable=true)
	private Integer roleId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.userId = userId;
	}

		return this.userId;
	}

		this.roleId = roleId;
	}

		return this.roleId;
	}
