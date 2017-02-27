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
@Table(name = "goods_snapshot")
@DataTransferObject
public class GoodsSnapshot implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "snapshot_id",length=19,updatable=true)
	private Integer snapshotId;

	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "aliasname",length=255,nullable=true,updatable=true)
	private String aliasname;

	@RemoteProperty
	@Column(name = "detail_intro",length=2147483647,nullable=true,updatable=true)
	private String detailIntro;

	@RemoteProperty
	@Column(name = "miniature",length=255,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "image1",length=255,nullable=true,updatable=true)
	private String image1;

	@RemoteProperty
	@Column(name = "image2",length=255,nullable=true,updatable=true)
	private String image2;

	@RemoteProperty
	@Column(name = "image3",length=255,nullable=true,updatable=true)
	private String image3;

	@RemoteProperty
	@Column(name = "image4",length=255,nullable=true,updatable=true)
	private String image4;

	@RemoteProperty
	@Column(name = "image5",length=255,nullable=true,updatable=true)
	private String image5;

	@RemoteProperty
	@Column(name = "unit",length=10,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "member_id",length=19,nullable=true,updatable=true)
	private Integer memberId;

	@RemoteProperty
	@Column(name = "member_name",length=255,nullable=true,updatable=true)
	private String memberName;

	@RemoteProperty
	@Column(name = "reference_price",length=19,nullable=true,updatable=true)
	private Integer referencePrice;

	@RemoteProperty
	@Column(name = "price",length=19,nullable=true,updatable=true)
	private Integer price;

	@RemoteProperty
	@Column(name = "score",length=255,nullable=true,updatable=true)
	private String score;

	@RemoteProperty
	@Column(name = "view_num",length=10,nullable=true,updatable=true)
	private Integer viewNum;

	@RemoteProperty
	@Column(name = "order_num",length=10,nullable=true,updatable=true)
	private Integer orderNum;

	@RemoteProperty
	@Column(name = "sale_num",length=10,nullable=true,updatable=true)
	private Integer saleNum;

	@RemoteProperty
	@Column(name = "stock_num",length=10,nullable=true,updatable=true)
	private Integer stockNum;

	@RemoteProperty
	@Column(name = "comment_num",length=10,nullable=true,updatable=true)
	private Integer commentNum;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "status",length=2,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "type",length=32,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "score_add",length=10,nullable=true,updatable=true)
	private Integer scoreAdd;

	@RemoteProperty
	@Column(name = "supply_date",length=0,nullable=true,updatable=true)
	private Date supplyDate;

	@RemoteProperty
	@Column(name = "creator",length=10,nullable=true,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;


	public void setSnapshotId(Integer snapshotId){
		this.snapshotId = snapshotId;
	}

		return this.snapshotId;
	}

		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.aliasname = aliasname;
	}

		return this.aliasname;
	}

		this.detailIntro = detailIntro;
	}

		return this.detailIntro;
	}

		this.miniature = miniature;
	}

		return this.miniature;
	}

		this.image1 = image1;
	}

		return this.image1;
	}

		this.image2 = image2;
	}

		return this.image2;
	}

		this.image3 = image3;
	}

		return this.image3;
	}

		this.image4 = image4;
	}

		return this.image4;
	}

		this.image5 = image5;
	}

		return this.image5;
	}

		this.unit = unit;
	}

		return this.unit;
	}

		this.memberId = memberId;
	}

		return this.memberId;
	}

		this.memberName = memberName;
	}

		return this.memberName;
	}

		this.referencePrice = referencePrice;
	}

		return this.referencePrice;
	}

		this.price = price;
	}

		return this.price;
	}

		this.score = score;
	}

		return this.score;
	}

		this.viewNum = viewNum;
	}

		return this.viewNum;
	}

		this.orderNum = orderNum;
	}

		return this.orderNum;
	}

		this.saleNum = saleNum;
	}

		return this.saleNum;
	}

		this.stockNum = stockNum;
	}

		return this.stockNum;
	}

		this.commentNum = commentNum;
	}

		return this.commentNum;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.status = status;
	}

		return this.status;
	}

		this.type = type;
	}

		return this.type;
	}

		this.scoreAdd = scoreAdd;
	}

		return this.scoreAdd;
	}

		this.supplyDate = supplyDate;
	}

		return this.supplyDate;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.gmtCreate = gmtCreate;
	}

		return this.gmtCreate;
	}

		this.gmtModify = gmtModify;
	}

		return this.gmtModify;
	}
