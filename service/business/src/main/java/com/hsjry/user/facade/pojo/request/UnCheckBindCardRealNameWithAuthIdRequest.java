/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2017 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo.request;

import java.io.Serializable;

import com.hsjry.lang.common.base.enums.user.EnumCertificateKind;
import com.hsjry.user.facade.pojo.UserBankCardInfoPojo;

import net.sf.oval.constraint.AssertValid;
import net.sf.oval.constraint.MatchPattern;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 * 
 * @author huangbb
 * @version $Id: UnCheckBindCardRealNameWithAuthIdRequest.java, v 1.0 2017年6月13日 下午5:23:29 huangbb Exp $
 */
public class UnCheckBindCardRealNameWithAuthIdRequest implements Serializable {

    private static final long    serialVersionUID = -5665466133606325111L;
    /**通行证ID*/
    @NotNull(errorCode = "000001", message = "通行证ID")
    @NotBlank(errorCode = "000001", message = "通行证ID")
    private String               authId;
    /**预留手机号*/
    @NotNull(errorCode = "000001", message = "预留手机号")
    @NotBlank(errorCode = "000001", message = "预留手机号")
    @MatchPattern(matchAll = false, pattern = { "^0?(13|15|16|19|18|14|17)[0-9]{9}$" }, errorCode = "000003", message = "预留手机号")
    private String               telephone;
    /**银行卡信息*/
    @AssertValid(errorCode = "000001", message = "银行卡信息")
    private UserBankCardInfoPojo userBankCardInfoPojo;

    /**证件类型*/
    @NotNull(errorCode = "000001", message = "证件类型")
    private EnumCertificateKind  certificateKind;

    /**证件号码*/
    @NotNull(errorCode = "000001", message = "证件号码")
    @NotBlank(errorCode = "000001", message = "证件号码")
    private String               certificateNo;

    /**真实姓名*/
    @NotNull(errorCode = "000001", message = "真实姓名")
    @NotBlank(errorCode = "000001", message = "真实姓名")
    private String               realName;

    /**
     * Getter method for property <tt>telephone</tt>.
     * 
     * @return property value of telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Setter method for property <tt>telephone</tt>.
     * 
     * @param telephone value to be assigned to property telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Getter method for property <tt>userBankCardInfoPojo</tt>.
     * 
     * @return property value of userBankCardInfoPojo
     */
    public UserBankCardInfoPojo getUserBankCardInfoPojo() {
        return userBankCardInfoPojo;
    }

    /**
     * Setter method for property <tt>userBankCardInfoPojo</tt>.
     * 
     * @param userBankCardInfoPojo value to be assigned to property userBankCardInfoPojo
     */
    public void setUserBankCardInfoPojo(UserBankCardInfoPojo userBankCardInfoPojo) {
        this.userBankCardInfoPojo = userBankCardInfoPojo;
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
     * Getter method for property <tt>realName</tt>.
     * 
     * @return property value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter method for property <tt>realName</tt>.
     * 
     * @param realName value to be assigned to property realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter method for property <tt>authId</tt>.
     * 
     * @return property value of authId
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * Setter method for property <tt>authId</tt>.
     * 
     * @param authId value to be assigned to property authId
     */
    public void setAuthId(String authId) {
        this.authId = authId;
    }

}