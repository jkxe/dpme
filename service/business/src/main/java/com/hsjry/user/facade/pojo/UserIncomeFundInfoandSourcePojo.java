package com.hsjry.user.facade.pojo;

import java.io.Serializable;
import java.util.Date;

import com.hsjry.user.facade.pojo.enums.EnumResourceSource;


/**
 *收入信息 
 * @author liaosq23298
 * @version $Id: UserIncomeFundInfoandSourcePojo.java, v 0.1 Nov 22, 2017 3:07:37 PM liaosq23298 Exp $
 */
public class UserIncomeFundInfoandSourcePojo implements Serializable{

    /**  */
    private static final long serialVersionUID = 5137422808324046810L;
    //资源项ID
    private String             resourceId;
    //客户ID
    private String             userId;
    //税前收入
    private String             pretaxIncome;
    //税后收入
    private String             aftertaxIncome;
    //收入来源
    private String             incomeSource;
    //修改时间
    private Date               updateTime;
    //资源 来源
    private EnumResourceSource resourceSource;

    /**
     * Getter method for property <tt>updateTime</tt>.
     * 
     * @return property value of updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter method for property <tt>updateTime</tt>.
     * 
     * @param updateTime value to be assigned to property updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * Getter method for property <tt>pretaxIncome</tt>.
     * 
     * @return property value of pretaxIncome
     */
    public String getPretaxIncome() {
        return pretaxIncome;
    }

    /**
     * Setter method for property <tt>pretaxIncome</tt>.
     * 
     * @param pretaxIncome value to be assigned to property pretaxIncome
     */
    public void setPretaxIncome(String pretaxIncome) {
        this.pretaxIncome = pretaxIncome;
    }

    /**
     * Getter method for property <tt>aftertaxIncome</tt>.
     * 
     * @return property value of aftertaxIncome
     */
    public String getAftertaxIncome() {
        return aftertaxIncome;
    }

    /**
     * Setter method for property <tt>aftertaxIncome</tt>.
     * 
     * @param aftertaxIncome value to be assigned to property aftertaxIncome
     */
    public void setAftertaxIncome(String aftertaxIncome) {
        this.aftertaxIncome = aftertaxIncome;
    }

    /**
     * Getter method for property <tt>incomeSource</tt>.
     * 
     * @return property value of incomeSource
     */
    public String getIncomeSource() {
        return incomeSource;
    }

    /**
     * Setter method for property <tt>incomeSource</tt>.
     * 
     * @param incomeSource value to be assigned to property incomeSource
     */
    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
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