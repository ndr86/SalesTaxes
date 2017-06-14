package com.mycompany.salestaxes.dto;

/**
 * This class represents a possible category of a good
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

    /**
     * Returns the code of the item category
     *
     * @return the code of the item category
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets to the given code
     *
     * @param code The new code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Returns the description of the item category
     *
     * @return the description of the item category
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets to the given description
     *
     * @param description The new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns true if the item category is exempt; false otherwise.
     *
     * @return true if the item category is exempt; false otherwise.
     */
    public boolean isExempt() {
        return exempt;
    }

    /**
     * Sets to the given exempt
     *
     * @param exempt The new exempt value
     */
    public void setExempt(boolean exempt) {
        this.exempt = exempt;
    }

}
