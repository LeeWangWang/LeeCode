package test.众安;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/16 17:25
 * @Version: V1
 **/
public class Main {
}

/*
 * @ClassName: PolicyStatus
 * @Description: 保险状态
 **/
enum PolicyStatus {
    ACTIVE,
    CANCELLED,
    EXPIRED
}
/*
 * @ClassName: PaymentFrequency
 * @Description: 支付方式
 **/
enum PaymentFrequency {
    ANNUALLY,
    SEMI_ANNUALLY,
    QUARTERLY,
    MONTHLY
}


/**
 * @ClassName: Party
 * @Description: 当事人
 **/
class Party {
    private long id; // 用户编号
    private String name; // 姓名
    private String gender; // 性别
    private Date brithday; // 出生日期
    private String address; // 地址
    private String phone; // 电话
}

/**
 * @ClassName: Product
 * @Description: 保险产品
 **/
class Product {
    private long code; //保险编号
    private String name; // 保险名称
    private String description; // 保险内容
    private BigDecimal premium; // 保费
    private PaymentFrequency paymentFrequency; // 保险支付方式
    private List<Liability> liability; //保险责任
}

/**
 * @ClassName: Liability
 * @Description: 保险责任
 **/
class Liability {
    private long code; // 责任编号
    private String name; // 责任名称
    private BigDecimal sumInsured; // 保险金额
    // 构造函数，getters和setters略
}

/**
 * @ClassName: Policy
 * @Description: 保单
 **/
class Policy {
    private long policyNumber; // 保单编号
    private PolicyStatus status; // 保单状态
    private Date startDate; // 开始时间
    private Date endDate; // 结束时间
    private Party insure; // 投保人
    private List<Party> parties; // 被保险人
    private List<InsuredObject> insuredObjects; // 保险标的
    private List<Product> products; // 保险条目
    // 构造函数，getters和setters略
}
/*
 * @ClassName: InsuredObject
 * @Description: 保险标的
 **/
class InsuredObject {
    private long id; // 保险标的编号
    private String name; // 保险标的名称
    private String description; // 保险标的描述
    private BigDecimal sumInsured; // 保险标的金额
    // 构造函数，getters和setters略
}



