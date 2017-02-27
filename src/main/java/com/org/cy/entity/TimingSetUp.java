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
@Table(name = "timingsetup")
@DataTransferObject
public class TimingSetUp implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=100,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "run_week",length=10,nullable=true,updatable=true)
	private Integer runWeek;

	@RemoteProperty
	@Column(name = "run_time",length=0,nullable=true,updatable=true)
	private Date runTime;

	@RemoteProperty
	@Column(name = "run_sql",length=500,nullable=true,updatable=true)
	private String runSql;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.runWeek = runWeek;
	}

		return this.runWeek;
	}

		this.runTime = runTime;
	}

		return this.runTime;
	}

		this.runSql = runSql;
	}

		return this.runSql;
	}
