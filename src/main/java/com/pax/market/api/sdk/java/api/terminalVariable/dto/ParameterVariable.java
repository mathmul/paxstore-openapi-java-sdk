/*
 * ********************************************************************************
 * COPYRIGHT
 *               PAX TECHNOLOGY, Inc. PROPRIETARY INFORMATION
 *   This software is supplied under the terms of a license agreement or
 *   nondisclosure agreement with PAX  Technology, Inc. and may not be copied
 *   or disclosed except in accordance with the terms in that agreement.
 *
 *      Copyright (C) 2017 PAX Technology, Inc. All rights reserved.
 * ********************************************************************************
 */
package com.pax.market.api.sdk.java.api.terminalVariable.dto;

import java.io.Serializable;

/**
 * @Description
 * @Author: Shawn
 * @Date: 2019/11/11 18:08
 * @Version 1.0
 */
public class ParameterVariable implements Serializable {

    private static final long serialVersionUID = -6256857050860933294L;


    private String packageName;

    private String version;
    private String key;
    private String value;
    private String remarks;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ParameterVariable{" +
                "packageName='" + packageName + '\'' +
                ", version='" + version + '\'' +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}