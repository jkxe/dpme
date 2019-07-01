/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2017 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo.request;

import java.io.Serializable;

import com.hsjry.user.facade.pojo.enums.EnumMenuType;

import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 * 修改菜单请求类
 * @author hongsj
 * @version $Id: ModifyMenuRequest.java, v 1.0 2017年3月16日 下午2:11:32 hongsj Exp $
 */
public class ModifyMenuRequest implements Serializable {
    /**  */
    private static final long serialVersionUID = -2113732834782947795L;
    /**
     * 菜单Id
     */
    @NotNull(errorCode = "000001", message = "菜单Id")
    @NotBlank(errorCode = "000001", message = "菜单Id")
    private String            menuId;
    /**
     * 菜单名称
     */
    @NotNull(errorCode = "000001", message = "菜单名称")
    @NotBlank(errorCode = "000001", message = "菜单名称")
    @Length(errorCode = "000002", max = 32, message = "菜单名称")
    private String            menuName;
    /**
     * 上级菜单
     */
    private String            parentMenu;
    /**
     * 菜单描述
     */
    private String            menuHint;
    /**
     * 菜单识别
     */
    private String            menuDisting;
    /**
     * 交易级别
     */
    private String            tradeLevelNo;
    /**
     * 菜单类型
     */
    private EnumMenuType      menuType;
    /**
     * 菜单排序
     */
    private String            menuSite;

    /**
     * Getter method for property <tt>menuId</tt>.
     * 
     * @return property value of menuId
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * Setter method for property <tt>menuId</tt>.
     * 
     * @param menuId value to be assigned to property menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * Getter method for property <tt>menuName</tt>.
     * 
     * @return property value of menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * Setter method for property <tt>menuName</tt>.
     * 
     * @param menuName value to be assigned to property menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * Getter method for property <tt>menuHint</tt>.
     * 
     * @return property value of menuHint
     */
    public String getMenuHint() {
        return menuHint;
    }

    /**
     * Setter method for property <tt>menuHint</tt>.
     * 
     * @param menuHint value to be assigned to property menuHint
     */
    public void setMenuHint(String menuHint) {
        this.menuHint = menuHint;
    }

    /**
     * Getter method for property <tt>menuDisting</tt>.
     * 
     * @return property value of menuDisting
     */
    public String getMenuDisting() {
        return menuDisting;
    }

    /**
     * Setter method for property <tt>menuDisting</tt>.
     * 
     * @param menuDisting value to be assigned to property menuDisting
     */
    public void setMenuDisting(String menuDisting) {
        this.menuDisting = menuDisting;
    }

    /**
     * Getter method for property <tt>tradeLevelNo</tt>.
     * 
     * @return property value of tradeLevelNo
     */
    public String getTradeLevelNo() {
        return tradeLevelNo;
    }

    /**
     * Setter method for property <tt>tradeLevelNo</tt>.
     * 
     * @param tradeLevelNo value to be assigned to property tradeLevelNo
     */
    public void setTradeLevelNo(String tradeLevelNo) {
        this.tradeLevelNo = tradeLevelNo;
    }

    /**
     * Getter method for property <tt>menuType</tt>.
     * 
     * @return property value of menuType
     */
    public EnumMenuType getMenuType() {
        return menuType;
    }

    /**
     * Setter method for property <tt>menuType</tt>.
     * 
     * @param menuType value to be assigned to property menuType
     */
    public void setMenuType(EnumMenuType menuType) {
        this.menuType = menuType;
    }

    /**
     * Getter method for property <tt>menuSite</tt>.
     * 
     * @return property value of menuSite
     */
    public String getMenuSite() {
        return menuSite;
    }

    /**
     * Setter method for property <tt>menuSite</tt>.
     * 
     * @param menuSite value to be assigned to property menuSite
     */
    public void setMenuSite(String menuSite) {
        this.menuSite = menuSite;
    }

        /**
         * Getter method for property <tt>parentMenu</tt>.
         * 
         * @return property value of parentMenu
         */
    public String getParentMenu() {
        return parentMenu;
    }

        /**
         * Setter method for property <tt>parentMenu</tt>.
         * 
         * @param parentMenu value to be assigned to property parentMenu
         */
    public void setParentMenu(String parentMenu) {
        this.parentMenu = parentMenu;
    }

}
