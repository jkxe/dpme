/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2017 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo;

import java.io.Serializable;

/**
 * 管理台组织pojo
 * @author hongsj
 * @version $Id: ManageOrganPojo.java, v 1.0 2017年5月10日 下午2:12:27 hongsj Exp $
 */
public class OrganizationPojo implements Serializable {

    /**  */
    private static final long serialVersionUID = 6909723968717211468L;

    /**
     * 组织ID
     */
    private String            organId;

    /**
     * 上级组织ID
     */
    private String            parentOrganId;

    /**
     * 组织名称
     */
    private String            organName;

    /**
     * 组织描述
     */
    private String            organDesc;
    

    /**   
     * 省
     */
    private String            provinceCode;

    /**
     * 市                             
     */
    private String            cityCode;

    /**
     * 区
     */
    private String            area;

    /**
     * Getter method for property <tt>organId</tt>.
     * 
     * @return property value of organId
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * Setter method for property <tt>organId</tt>.
     * 
     * @param organId value to be assigned to property organId
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * Getter method for property <tt>parentOrganId</tt>.
     * 
     * @return property value of parentOrganId
     */
    public String getParentOrganId() {
        return parentOrganId;
    }

    /**
     * Setter method for property <tt>parentOrganId</tt>.
     * 
     * @param parentOrganId value to be assigned to property parentOrganId
     */
    public void setParentOrganId(String parentOrganId) {
        this.parentOrganId = parentOrganId;
    }

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
     * Getter method for property <tt>organDesc</tt>.
     * 
     * @return property value of organDesc
     */
    public String getOrganDesc() {
        return organDesc;
    }

    /**
     * Setter method for property <tt>organDesc</tt>.
     * 
     * @param organDesc value to be assigned to property organDesc
     */
    public void setOrganDesc(String organDesc) {
        this.organDesc = organDesc;
    }

    /**
     * Getter method for property <tt>provinceCode</tt>.
     * 
     * @return property value of provinceCode
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Setter method for property <tt>provinceCode</tt>.
     * 
     * @param provinceCode value to be assigned to property provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * Getter method for property <tt>cityCode</tt>.
     * 
     * @return property value of cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Setter method for property <tt>cityCode</tt>.
     * 
     * @param cityCode value to be assigned to property cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * Getter method for property <tt>area</tt>.
     * 
     * @return property value of area
     */
    public String getArea() {
        return area;
    }

    /**
     * Setter method for property <tt>area</tt>.
     * 
     * @param area value to be assigned to property area
     */
    public void setArea(String area) {
        this.area = area;
    }

}
