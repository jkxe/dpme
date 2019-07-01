/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2017 All Rights Reserved.
 */
package com.hsjry.user.facade.pojo.request;

import java.io.Serializable;

import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 * 获取客户角色请求类
 * @author hongsj
 * @version $Id: QueryCustomerRoleRequest.java, v 1.0 2017年3月27日 下午2:05:31 hongsj Exp $
 */
public class QueryCustomerRoleByRoleIdRequest implements Serializable {
    /**  */
    private static final long serialVersionUID = 3600474605463794984L;
    /** 角色Id */
    @NotNull(errorCode = "000001", message = "角色Id")
    @NotBlank(errorCode = "000001", message = "角色Id")
    private String            roleId;

    /**
     * Getter method for property <tt>roleId</tt>.
     * 
     * @return property value of roleId
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Setter method for property <tt>roleId</tt>.
     * 
     * @param roleId value to be assigned to property roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}
