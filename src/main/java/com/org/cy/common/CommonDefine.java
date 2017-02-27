package com.org.cy.common;

 

public class CommonDefine {

	// 首页显示的各类数据数量
	// 动态新闻
	public static final int DYNAMIC_NEWS_SIZE = 4;
	// 海报
	public static final int POST_NEWS_SIZE = 3;
	// 相关视频
	public static final int POST_VIDEO_SIZE = 3;
	// ？？？
	public static final int STARMEMBER_NEWS_SIZE = 3;
	// 家长必读
	public static final int PARENT_READ_SIZE = 6;
	// 九大课程
	public static final int  SUBJECT_SIZE = 9;
	
	
	public static final int REGISTER_CODE = 1;
	
	public static final int REST_PWD = 2;
	
	public static final int REST_PAYPWD  = 3;
	

	// 分页大小
	public static final int PAGE_SIZE = 10;
	// 即客企业展示网站

	public static final String TCJ_PREFIX = "tcj"; // 用于取sequence时，拼接进id中。

	public static final Integer TCJ_BUILDING = 10;
	// 订单状态
	public static final String ORDERTYPE_PAY_NEW = "0"; // 新订单，未付款
	public static final String ORDERTYPE_PAY_FINISH = "1"; // 付款成功
	public static final String ORDERTYPE_PAY_SENDING = "3"; // 已发货
	public static final String ORDERTYPE_PAY_CLOSE = "4"; // 无效
	public static final String ORDERTYPE_PAY_WAIT_FINISH = "10"; // 待激活
																	// （活动专用，活动时，充值达到指定金额，赠送的赠品订单为待激活状态，在指定日期消费，才会变成已付款，发货给用户

	public static final String PAYTYPE_PAY_PREPAYRECHARGE = "1"; // 预付款充值
	public static final String PAYTYPE_PAY_PREPAY = "2"; // 预付款付款
	public static final String PAYTYPE_PAY_WEIXIN = "3"; // 微信支付
	public static final String PAYTYPE_PAY_CANCEL_ORDER = "4"; // 微信支付

	// 充值规则

	public static final Float RECHARGE_500 = 500.0f;// 500
	public static final Float RECHARGE_1000 = 1000.0f;

	// 订单状态: 个位表示订单的配送等状态,十位表示支付状态;
	// 订单数位含义: 1代表未执行, 2代表执行中, 3代表执行结束, 4代表执行失败, 5代表缺货, 0代表取消
	public static final int ORDERINFO_STATUS_NEW = 11; // 待付款新订单,未付款未配送
	public static final int ORDERINFO_STATUS_NOPAY_SENDING = 12; // 未付款配送中,适用于货到付款的订单
	public static final int ORDERINFO_STATUS_NOPAY_SENDED = 13; // 未付款已交货,实际交易中应当不会出现
	public static final int ORDERINFO_STATUS_PAYING_NOSEND = 21; // 付款中未配送（网上支付时，用户页面转到支付网关前，应先将订单状态置为21，代表用户支付已开始）
	public static final int ORDERINFO_STATUS_PAYING_SENDING = 22; // 付款中配送中，实际交易中应当不会出现
	public static final int ORDERINFO_STATUS_PAYING_SENDED = 23; // 付款中已交货，实际交易中应当不会出现
	public static final int ORDERINFO_STATUS_PAYED_NOSEND = 31; // 已付款未配送，实际交易中应当不会出现（付款成功会立即进入配送中状态，不会停留在此状态）
	public static final int ORDERINFO_STATUS_PAYED_SENDING = 32; // 已付款配送中，网银支付成功后为此状态
	public static final int ORDERINFO_STATUS_CLOSED = 33; // 订单已完成，即已付款已配送(包括月结未支付订单)
	public static final int ORDERINFO_STATUS_CANCLE = 0; // 已取消状态，过期订单或后台取消订单
	public static final int ORDERINFO_STATUS_ALLOUT = 50; // 完全缺货订单，订单中所有商品缺货，通常为拆分后的缺货订单
	public static final int ORDERINFO_STATUS_PARTOUT = 51; // 部分缺货订单，订单中部分商品缺货，通常为用户选择不做拆分的缺货订单

	// 订单支付方式

	public static final int ORDERPAYTYPE_PREPAY = 1; // 预存款支付
	public static final int ORDERPAYTYPE_MONTHPAY = 5;
	public static final int ORDERPAYTYPE_ALIPAY = 6;// 扫码支付
	public static final int ORDERPAYTYPE_SCORE = 7;
	public static final int ORDERPAYTYPE_ALIPAYWAP = 16;
	// 月结
	// 预存款交易类别
	public static final String PREPAYLOG_TYPE_PREPAY = "prepay"; // 充值
	public static final String PREPAYLOG_TYPE_ANTIPAY = "antipay"; // 扣款
	public static final String PREPAYLOG_TYPE_PAYMENT = "payment"; // 订单支付

	// 全局变量，用作BILL支付时的同步进程控制
	public static String orderId = "";

	// 订单拆分标识
	public static final int ORDERINFO_SPLITORDER_YES = 1; // 缺货订单，用户选择拆分
	public static final int ORDERINFO_SPLITORDER_NO = 0; // 缺货订单，用户选择不拆分
	public static final int ORDERINFO_SPLITORDER_NONE = -1; // 无缺货订单

	// 订单明细项是否缺货的标识定义
	public static final int ORDERITEM_ITEMNO_HAVE = 1; // 此项商品有现货
	public static final int ORDERITEM_ITEMNO_NONE = 0; // 此项商品缺货

	// 消息发送日志类型定义
	public final static int MSGSENDLOG_TYPE_EMAIL = 0; // 消息发送类别:邮件消息
	public final static int MSGSENDLOG_TYPE_MSN = 1; // 消息发送类别:MSN消息
	public final static int MSGSENDLOG_TYPE_MOBILE = 2; // 消息发送类别:手机短信

	// 消息发送日志状态定义
	public final static int MSGSENDLOG_STATUS_UNSEND = 0; // 消息发送状态:未发送
	public final static int MSGSENDLOG_STATUS_SENDED = 1; // 消息发送状态:已发送
	public final static int MSGSENDLOG_STATUS_FAILED = -1; // 消息发送状态:发送失败

	public static final int OUTPAY_STATUS_INIT = 1;
	public static final int OUTPAY_STATUS_SUCCESS = 0;
	public static final int OUTPAY_STATUS_FAILED = 2;

	public static final Integer RECHARGE_OFFER = 20;// 赠品商品类型
	//public static final String ALIPAY_NOTIFY_URL = AlipayConfig.notify_url;
	//public static final String ALIPAY_RETURN_URL = AlipayConfig.return_url;

	// 项目订单标记user_cost_item
	public static final int ACT_PRO_ID = 0;// act_pro_id
	public static final int ACT_PRO_ADD_ID = 1;// act_pro_add_id

	// 奖励规则类型标记recharge_rules
	public static final int RECHARGE_MONEY = 0;// 充值送天才币
	public static final int RECHARGE_ITEM = 1;// 充值送物品

	// 支付类型标记
	public static final int LOG_PAY_RECHARGE = 0;// 充值
	public static final int LOG_PAY_ITEM = 1;// 活动费

	// 是否付款标记
	public static final int LOG_PAY_STATUS_TRUE = 0;// 已付款
	public static final int LOG_PAY_STATUS_FALSE = 1;// 未付款

	// 是否删除标记
	public static final int ID_DELETE_FALSE = 0;// 未被删除
	public static final int ID_DELETE_TRUE = 1;// 已被删除
	// 是否首页显示
	public static final int ON_HOME_FALSE = 0;//不显示
	public static final int ON_HOME_TRUE = 1;//显示

	public static final int ADD_SCORE = 500;// 邀请码增加的分数

	public static final int COMMON_USER = 2;// 普通用户
	public static final int ADMIN_USER = 1;
	
	//活动表状态
	public static final String ACTIVITY_TYPE_NORMAL = "0"; // 普通类型
	public static final String ACTIVITY_TYPE_RECOMMEND = "1"; // 推荐类型
	
	public static final String ACTIVITY_STATUS_ENROLLMENT = "0"; //报名中
	public static final String ACTIVITY_STATUS_ONGOING = "1";    //进行中
	public static final String ACTIVITY_STATUS_OVER = "2";       //已结束 
	public static final String ACTIVITY_STATUS_CANCEL = "3";     //已取消
	
	
}
