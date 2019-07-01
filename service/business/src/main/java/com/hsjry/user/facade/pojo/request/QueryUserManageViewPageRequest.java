/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2017 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo.request;

import java.io.Serializable;
import java.util.Date;

import com.hsjry.lang.common.base.enums.user.EnumCertificateKind;
import com.hsjry.lang.common.base.enums.user.EnumUserType;
import com.hsjry.user.facade.pojo.enums.EnumTelephoneClassCode;

import net.sf.oval.constraint.MatchPattern;
import net.sf.oval.constraint.NotNull;

/**
 * 
 * @author jiangjd12837
 * @version $Id: QueryUserManageViewPageRequest.java, v 1.0 2017年9月18日 上午9:54:53 jiangjd12837 Exp $
 */
public class QueryUserManageViewPageRequest implements Serializable {

    /**  */
    private static final long      serialVersionUID = -1010833574465438624L;
    //客户类型
    @NotNull(errorCode = "000001", message = "客户类型")
    private EnumUserType           clientCategory;
    //客户名称
    private String                 clientName;
    //证件号码
    private String                 idNo;
    //证件项类型
    private EnumCertificateKind    certificateKind;
    private EnumTelephoneClassCode telephoneClassCode;
    //手机号
    @MatchPattern(matchAll = false, pattern = { "^0?(13|15|16|19|18|14|17)[0-9]{9}$" }, errorCode = "000003", message = "手机号")
    private String                 mobileTel;
    //开始日期
    private Date                   startDate;
    //结束日期
    private Date                   endDate;

    /**
     * Getter method for property <tt>telephoneClassCode</tt>.
     * 
     * @return property value of telephoneClassCode
     */
    public EnumTelephoneClassCode getTelephoneClassCode() {
        return telephoneClassCode;
    }

    /**
     * Setter method for property <tt>telephoneClassCode</tt>.
     * 
     * @param telephoneClassCode value to be assigned to property telephoneClassCode
     */
    public void setTelephoneClassCode(EnumTelephoneClassCode telephoneClassCode) {
        this.telephoneClassCode = telephoneClassCode;
    }

    /**
     * Getter method for property <tt>clientCategory</tt>.
     * 
     * @return property value of clientCategory
     */
    public EnumUserType getClientCategory() {
        return clientCategory;
    }

    /**
     * Setter method for property <tt>clientCategory</tt>.
     * 
     * @param clientCategory value to be assigned to property clientCategory
     */
    public void setClientCategory(EnumUserType clientCategory) {
        this.clientCategory = clientCategory;
    }

    /**
     * Getter method for property <tt>clientName</tt>.
     * 
     * @return property value of clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Setter method for property <tt>clientName</tt>.
     * 
     * @param clientName value to be assigned to property clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Getter method for property <tt>idNo</tt>.
     * 
     * @return property value of idNo
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Setter method for property <tt>idNo</tt>.
     * 
     * @param idNo value to be assigned to property idNo
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * Getter method for property <tt>certificateKind</tt>.
     * 
     * @return property value of certificateKind
     */
    public EnumCertificateKind getCertificateKind() {
        return certificateKind;
    }

    /**
     * Setter method for property <tt>certificateKind</tt>.
     * 
     * @param certificateKind value to be assigned to property certificateKind
     */
    public void setCertificateKind(EnumCertificateKind certificateKind) {
        this.certificateKind = certificateKind;
    }

    /**
     * Getter method for property <tt>mobileTel</tt>.
     * 
     * @return property value of mobileTel
     */
    public String getMobileTel() {
        return mobileTel;
    }

    /**
     * Setter method for property <tt>mobileTel</tt>.
     * 
     * @param mobileTel value to be assigned to property mobileTel
     */
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }

    /**
     * Getter method for property <tt>startDate</tt>.
     * 
     * @return property value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter method for property <tt>startDate</tt>.
     * 
     * @param startDate value to be assigned to property startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter method for property <tt>endDate</tt>.
     * 
     * @return property value of endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Setter method for property <tt>endDate</tt>.
     * 
     * @param endDate value to be assigned to property endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}