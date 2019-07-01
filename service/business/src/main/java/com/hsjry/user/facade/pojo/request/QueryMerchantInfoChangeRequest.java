/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo.request;

import java.io.Serializable;

import net.sf.oval.constraint.NotNull;

import com.hsjry.lang.common.base.enums.EnumBool;
import com.hsjry.lang.common.base.enums.user.EnumCertificateKind;
import com.hsjry.user.facade.pojo.enums.EnumMerchantRegisterKind;
import com.hsjry.user.facade.pojo.enums.EnumMerchantUserType;

/**
 * 商户信息变更查询请求
 * @author huangbb
 * @version $Id: QueryMerchantInfoChangeRequest.java, v 1.0 2018年5月16日 下午2:23:02 huangbb Exp $
 */
public class QueryMerchantInfoChangeRequest implements Serializable {

    private static final long        serialVersionUID = -4775238068287942251L;

    /** 经销商名称 */
    private String                   organName;

    /**经销商分类 */
    private EnumMerchantUserType     merchantUserType;

    /**证件类型 */
    private EnumCertificateKind      certificateKind;

    /**证件号码 */
    private String                   certificateNo;
    
    @NotNull(errorCode = "000001", message = "变更信息类型")
    private EnumMerchantRegisterKind registerKind;
    
    @NotNull(errorCode = "000001", message = "是否查询变更记录")
    private EnumBool             bool;

    /**
     * Getter method for property <tt>organName</tt>.
     * 
     * @return property value of organName
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * Setter method for property <tt>organName</tt>.
     * 
     * @param organName value to be assigned to property organName
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * Getter method for property <tt>merchantUserType</tt>.
     * 
     * @return property value of merchantUserType
     */
    public EnumMerchantUserType getMerchantUserType() {
        return merchantUserType;
    }

    /**
     * Setter method for property <tt>merchantUserType</tt>.
     * 
     * @param merchantUserType value to be assigned to property merchantUserType
     */
    public void setMerchantUserType(EnumMerchantUserType merchantUserType) {
        this.merchantUserType = merchantUserType;
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
     * Getter method for property <tt>certificateNo</tt>.
     * 
     * @return property value of certificateNo
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * Setter method for property <tt>certificateNo</tt>.
     * 
     * @param certificateNo value to be assigned to property certificateNo
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    /**
     * Getter method for property <tt>registerKind</tt>.
     * 
     * @return property value of registerKind
     */
    public EnumMerchantRegisterKind getRegisterKind() {
        return registerKind;
    }

    /**
     * Setter method for property <tt>registerKind</tt>.
     * 
     * @param registerKind value to be assigned to property registerKind
     */
    public void setRegisterKind(EnumMerchantRegisterKind registerKind) {
        this.registerKind = registerKind;
    }

    /**
     * Getter method for property <tt>bool</tt>.
     * 
     * @return property value of bool
     */
    public EnumBool getBool() {
        return bool;
    }

    /**
     * Setter method for property <tt>bool</tt>.
     * 
     * @param bool value to be assigned to property bool
     */
    public void setBool(EnumBool bool) {
        this.bool = bool;
    }

}
