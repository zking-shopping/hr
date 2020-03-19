package com.hr.pojo;

import java.io.Serializable;

public class SalaryStandardDetails implements Serializable{
    private Short sdtId;

    private String standardId;

    private String standardName;

    private Short itemId;

    private String itemName;

    private String salary;

    public Short getSdtId() {
        return sdtId;
    }

    public void setSdtId(Short sdtId) {
        this.sdtId = sdtId;
    }

    public String getStandardId() {
        return standardId;
    }

    public void setStandardId(String standardId) {
        this.standardId = standardId == null ? null : standardId.trim();
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName == null ? null : standardName.trim();
    }

    public Short getItemId() {
        return itemId;
    }

    public void setItemId(Short itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}