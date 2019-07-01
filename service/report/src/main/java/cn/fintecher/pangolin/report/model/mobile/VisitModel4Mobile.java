package cn.fintecher.pangolin.report.model.mobile;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @Description: 外访案件model
 * @Package cn.fintecher.pangolin.report.model.mobile
 * @ClassName: cn.fintecher.pangolin.report.model.mobile.VisitModel4Mobile
 * @date 2018年10月26日 10:53
 */
@Data
public class VisitModel4Mobile {

    @ApiModelProperty(notes = "案件id")
    private String  id;

    @ApiModelProperty(notes = "案件id")
    private String  caseId;

    @ApiModelProperty(notes = "案件编号")
    private String  caseNumber;

    @ApiModelProperty(notes = "客户id")
    private String  personalId;

    @ApiModelProperty(notes = "客户名称")
    private String personalName;

    @ApiModelProperty(notes = "操作时间")
    private Date operatorTime;

    @ApiModelProperty(notes = "逾期金额")
    private double overdueAmount;

    @ApiModelProperty(notes = "账户余额")
    private double accountBalance;

    @ApiModelProperty(notes = "逾期期数")
    private int overduePeriods;

    @ApiModelProperty(notes = "逾期日期")
    private int overdueDays;

    @ApiModelProperty("留案标识 0-未留案，1-留案")
    private Integer leaveCaseFlag;

    @ApiModelProperty("留案标识名称")
    private String leaveCaseFlagName;

    @ApiModelProperty(notes = "产品id")
    private String  productId;

    @ApiModelProperty(notes = "系列id")
    private String  seriesId;

    @ApiModelProperty(notes = "系列名称")
    private String  seriesName;

    @ApiModelProperty(notes = "催收类型")
    private int collectionType;

    @ApiModelProperty(notes = "催收类型名称")
    private String collectionTypeName;

    @ApiModelProperty(notes = "催收状态")
    private int collectionStatus;

    @ApiModelProperty(notes = "催收状态名称")
    private String collectionStatusName;


    @ApiModelProperty(notes = "年龄")
    private int age;

    @ApiModelProperty(notes = "性别")
    private int sex;

    @ApiModelProperty(notes = "性别名称")
    private String sexName;

    @ApiModelProperty(notes = "婚姻状态")
    private int marital;

    @ApiModelProperty(notes = "婚姻状态名称")
    private String maritalName;

    @ApiModelProperty(notes = "地址")
    private String address;

    @ApiModelProperty(notes = "电话")
    private String mobileNo;

    @ApiModelProperty(notes = "经度")
    private double longitude;

    @ApiModelProperty(notes = "纬度")
    private double latitude;

    @ApiModelProperty(notes = "当前催员id")
    private String  currentCollector;

    @ApiModelProperty(notes = "当前催员名称")
    private String  currentCollectorName;

    @ApiModelProperty(notes = "上一个催员id")
    private String  latelyCollector;

    @ApiModelProperty(notes = "上一个催员名称")
    private String  latelyCollectorName;

    @ApiModelProperty(notes = "部门code")
    private String  departCode;

    @ApiModelProperty(notes = "操作人员")
    private String operator;

    @ApiModelProperty(notes = "personal_address 表主键,用来更新经纬度")
    private String pId;

}
