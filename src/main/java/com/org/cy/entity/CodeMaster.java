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
@Table(name = "codemaster")
@DataTransferObject
public class CodeMaster implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "codeno",length=10,updatable=true)
	private Integer codeno;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "codetype",length=11,updatable=true)
	private String codetype;

	@RemoteProperty
	@Column(name = "codename",length=255,nullable=true,updatable=true)
	private String codename;

	@RemoteProperty
	@Column(name = "codeDescription",length=255,nullable=true,updatable=true)
	private String codedescription;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "building_id",length=25,nullable=true,updatable=true)
	private String buildingId;

	@RemoteProperty
	@Column(name = "is_delete",length=10,nullable=true,updatable=true)
	private Integer isDelete;

	@RemoteProperty
	@Column(name = "id",length=25,nullable=true,updatable=true)
	private String id;


	public void setCodeno(Integer codeno){
		this.codeno = codeno;
	}

		return this.codeno;
	}

		this.codetype = codetype;
	}

		return this.codetype;
	}

		this.codename = codename;
	}

		return this.codename;
	}

		this.codedescription = codedescription;
	}

		return this.codedescription;
	}

		this.content = content;
	}

		return this.content;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}

		this.isDelete = isDelete;
	}

		return this.isDelete;
	}

		this.id = id;
	}

		return this.id;
	}
