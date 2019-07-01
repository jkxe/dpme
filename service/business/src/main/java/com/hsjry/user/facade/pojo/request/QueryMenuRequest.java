/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2017 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo.request;

import java.io.Serializable;

import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 * 查询菜单请求类
 * @author hongsj
 * @version $Id: QueryMenuRequest.java, v 1.0 2017年3月28日 下午3:02:30 hongsj Exp $
 */
public class QueryMenuRequest implements Serializable {
    /**  */
    private static final long serialVersionUID = 8019617983788593441L;
    /**菜单id*/
    @NotNull(errorCode = "000001", message = "菜单id")
    @NotBlank(errorCode = "000001", message = "菜单id")
    private String            menuId;

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

}
