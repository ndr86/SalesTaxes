package com.mycompany.salestaxes.dto;

/**
 *
 * @author a.grimaldi
 */
public class ItemCategory {

    private String code;
    private String description;
    private boolean exempt;

    public ItemCategory(String code, String description, boolean exempt) {
        this.code = code;
        this.description = description;
        this.exempt = exempt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isExempt() {
        return exempt;
    }

    public void setExempt(boolean exempt) {
        this.exempt = exempt;
    }

}
