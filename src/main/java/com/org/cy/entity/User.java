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
@Table(name = "user")
@DataTransferObject
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "username",length=50,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "realname",length=255,updatable=true)
	private String realname;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "usertype",length=3,updatable=true)
	private Integer usertype;

	@RemoteProperty
	@Column(name = "passwd",length=50,updatable=true)
	private String passwd;

	@RemoteProperty
	@Column(name = "userquestion",length=50,nullable=true,updatable=true)
	private String userquestion;

	@RemoteProperty
	@Column(name = "useranswer",length=50,nullable=true,updatable=true)
	private String useranswer;

	@RemoteProperty
	@Column(name = "englishname",length=255,nullable=true,updatable=true)
	private String englishname;

	@RemoteProperty
	@Column(name = "nickname",length=50,nullable=true,updatable=true)
	private String nickname;

	@RemoteProperty
	@Column(name = "gender",length=3,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "tel",length=50,nullable=true,updatable=true)
	private String tel;

	@RemoteProperty
	@Column(name = "fax",length=50,nullable=true,updatable=true)
	private String fax;

	@RemoteProperty
	@Column(name = "email",length=255,nullable=true,updatable=true)
	private String email;

	@RemoteProperty
	@Column(name = "msn",length=255,nullable=true,updatable=true)
	private String msn;

	@RemoteProperty
	@Column(name = "qq",length=50,nullable=true,updatable=true)
	private String qq;

	@RemoteProperty
	@Column(name = "mobile",length=100,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "postcode",length=10,nullable=true,updatable=true)
	private String postcode;

	@RemoteProperty
	@Column(name = "address",length=255,nullable=true,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "credentialtype",length=32,updatable=true)
	private String credentialtype;

	@RemoteProperty
	@Column(name = "credential",length=255,nullable=true,updatable=true)
	private String credential;

	@RemoteProperty
	@Column(name = "contactor",length=255,nullable=true,updatable=true)
	private String contactor;

	@RemoteProperty
	@Column(name = "prepay",length=8,updatable=true)
	private String prepay;

	@RemoteProperty
	@Column(name = "score",length=10,updatable=true)
	private Integer score;

	@RemoteProperty
	@Column(name = "regtime",length=0,updatable=true)
	private Date regtime;

	@RemoteProperty
	@Column(name = "level",length=3,nullable=true,updatable=true)
	private Integer level;

	@RemoteProperty
	@Column(name = "birthday",length=0,nullable=true,updatable=true)
	private Date birthday;

	@RemoteProperty
	@Column(name = "company_id",length=10,nullable=true,updatable=true)
	private Integer companyId;

	@RemoteProperty
	@Column(name = "creator_id",length=10,nullable=true,updatable=true)
	private Integer creatorId;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "group_id",length=10,nullable=true,updatable=true)
	private Integer groupId;

	@RemoteProperty
	@Column(name = "recuser_id",length=10,nullable=true,updatable=true)
	private Integer recuserId;

	@RemoteProperty
	@Column(name = "recusername",length=255,nullable=true,updatable=true)
	private String recusername;

	@RemoteProperty
	@Column(name = "building_id",length=45,nullable=true,updatable=true)
	private String buildingId;

	@RemoteProperty
	@Column(name = "cardId",length=45,nullable=true,updatable=true)
	private String cardid;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=true)
	private String openid;

	@RemoteProperty
	@Column(name = "member_id",length=20,nullable=true,updatable=true)
	private String memberId;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
	public void setRealname(String realname){
		this.realname = realname;
	}
	public String getRealname(){
		return this.realname;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setUsertype(Integer usertype){
		this.usertype = usertype;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setPasswd(String passwd){
		this.passwd = passwd;
	}
	public String getPasswd(){
		return this.passwd;
	}
	public void setUserquestion(String userquestion){
		this.userquestion = userquestion;
	}
	public String getUserquestion(){
		return this.userquestion;
	}
	public void setUseranswer(String useranswer){
		this.useranswer = useranswer;
	}
	public String getUseranswer(){
		return this.useranswer;
	}
	public void setEnglishname(String englishname){
		this.englishname = englishname;
	}
	public String getEnglishname(){
		return this.englishname;
	}
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	public String getNickname(){
		return this.nickname;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return this.gender;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getTel(){
		return this.tel;
	}
	public void setFax(String fax){
		this.fax = fax;
	}
	public String getFax(){
		return this.fax;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setMsn(String msn){
		this.msn = msn;
	}
	public String getMsn(){
		return this.msn;
	}
	public void setQq(String qq){
		this.qq = qq;
	}
	public String getQq(){
		return this.qq;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setPostcode(String postcode){
		this.postcode = postcode;
	}
	public String getPostcode(){
		return this.postcode;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setCredentialtype(String credentialtype){
		this.credentialtype = credentialtype;
	}
	public String getCredentialtype(){
		return this.credentialtype;
	}
	public void setCredential(String credential){
		this.credential = credential;
	}
	public String getCredential(){
		return this.credential;
	}
	public void setContactor(String contactor){
		this.contactor = contactor;
	}
	public String getContactor(){
		return this.contactor;
	}
	public void setPrepay(String prepay){
		this.prepay = prepay;
	}
	public String getPrepay(){
		return this.prepay;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	public Integer getScore(){
		return this.score;
	}
	public void setRegtime(Date regtime){
		this.regtime = regtime;
	}
	public Date getRegtime(){
		return this.regtime;
	}
	public void setLevel(Integer level){
		this.level = level;
	}
	public Integer getLevel(){
		return this.level;
	}
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	public void setCompanyId(Integer companyId){
		this.companyId = companyId;
	}
	public Integer getCompanyId(){
		return this.companyId;
	}
	public void setCreatorId(Integer creatorId){
		this.creatorId = creatorId;
	}
	public Integer getCreatorId(){
		return this.creatorId;
	}
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	public Date getCreatetime(){
		return this.createtime;
	}
	public void setGroupId(Integer groupId){
		this.groupId = groupId;
	}
	public Integer getGroupId(){
		return this.groupId;
	}
	public void setRecuserId(Integer recuserId){
		this.recuserId = recuserId;
	}
	public Integer getRecuserId(){
		return this.recuserId;
	}
	public void setRecusername(String recusername){
		this.recusername = recusername;
	}
	public String getRecusername(){
		return this.recusername;
	}
	public void setBuildingId(String buildingId){
		this.buildingId = buildingId;
	}
	public String getBuildingId(){
		return this.buildingId;
	}
	public void setCardid(String cardid){
		this.cardid = cardid;
	}
	public String getCardid(){
		return this.cardid;
	}
	public void setOpenid(String openid){
		this.openid = openid;
	}
	public String getOpenid(){
		return this.openid;
	}
	public void setMemberId(String memberId){
		this.memberId = memberId;
	}
	public String getMemberId(){
		return this.memberId;
	}
}