package com.hsjry.user.facade.pojo;

import java.io.Serializable;

import com.hsjry.user.facade.pojo.enums.EnumResourceSource;

/**
 * 司法诉讼信息
 * @author liaosq23298
 * @version $Id: UserJudicialLitigationInfoandSourcePojo.java, v 0.1 Nov 22, 2017 3:42:58 PM liaosq23298 Exp $
 */
public class UserJudicialLitigationInfoandSourcePojo implements Serializable{

    /**  */
    private static final long serialVersionUID = 7404274306419467663L;
  //资源项ID
    private String            resourceId;
    //客户ID
    private String            userId;
    //案例编号
    private String            caseNo;
    //案例分类
    private String            caseType;
    //案例执行信息
    private String            caseExecutInfo;
    //案例发生日期
    private String            caseOccurDate;
    //案例详情
    private String            caseDetails;
    //信息来源
    private String            infoSource;
    //资源来源
    private EnumResourceSource resourceSource;
    /**
     * Getter method for property <tt>infoSource</tt>.
     * 
     * @return property value of infoSource
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Setter method for property <tt>infoSource</tt>.
     * 
     * @param infoSource value to be assigned to property infoSource
     */
    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }

    /**
     * Getter method for property <tt>resourceId</tt>.
     * 
     * @return property value of resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Setter method for property <tt>resourceId</tt>.
     * 
     * @param resourceId value to be assigned to property resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>caseNo</tt>.
     * 
     * @return property value of caseNo
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * Setter method for property <tt>caseNo</tt>.
     * 
     * @param caseNo value to be assigned to property caseNo
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    /**
     * Getter method for property <tt>caseType</tt>.
     * 
     * @return property value of caseType
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * Setter method for property <tt>caseType</tt>.
     * 
     * @param caseType value to be assigned to property caseType
     */
    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    /**
     * Getter method for property <tt>caseExecutInfo</tt>.
     * 
     * @return property value of caseExecutInfo
     */
    public String getCaseExecutInfo() {
        return caseExecutInfo;
    }

    /**
     * Setter method for property <tt>caseExecutInfo</tt>.
     * 
     * @param caseExecutInfo value to be assigned to property caseExecutInfo
     */
    public void setCaseExecutInfo(String caseExecutInfo) {
        this.caseExecutInfo = caseExecutInfo;
    }

    /**
     * Getter method for property <tt>caseOccurDate</tt>.
     * 
     * @return property value of caseOccurDate
     */
    public String getCaseOccurDate() {
        return caseOccurDate;
    }

    /**
     * Setter method for property <tt>caseOccurDate</tt>.
     * 
     * @param caseOccurDate value to be assigned to property caseOccurDate
     */
    public void setCaseOccurDate(String caseOccurDate) {
        this.caseOccurDate = caseOccurDate;
    }

    /**
     * Getter method for property <tt>caseDetails</tt>.
     * 
     * @return property value of caseDetails
     */
    public String getCaseDetails() {
        return caseDetails;
    }

    /**
     * Setter method for property <tt>caseDetails</tt>.
     * 
     * @param caseDetails value to be assigned to property caseDetails
     */
    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
    }
    /**
     * Getter method for property <tt>resourceSource</tt>.
     * 
     * @return property value of resourceSource
     */
    public EnumResourceSource getResourceSource() {
        return resourceSource;
    }

    /**
     * Setter method for property <tt>resourceSource</tt>.
     * 
     * @param resourceSource value to be assigned to property resourceSource
     */
    public void setResourceSource(EnumResourceSource resourceSource) {
        this.resourceSource = resourceSource;
    }
}