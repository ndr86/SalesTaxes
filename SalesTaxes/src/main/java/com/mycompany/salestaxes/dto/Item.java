package com.mycompany.salestaxes.dto;

import java.math.BigDecimal;

/**
 * This class contains all attribute of a possible taxable "good"
 *
 * @author a.grimaldi
 */
public class Item {

    private Integer quantity;
    private String code;
    private String description;
    private BigDecimal price;
    private ItemCategory category;
    private boolean imported;

    private BigDecimal tax;
    private BigDecimal duePrice;

    /**
     * Returns the quantity of the item
     *
     * @return the quantity of the item
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets to the given quantity
     *
     * @param quantity The new quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Returns the code of the item
     *
     * @return the code of the item
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
     * Returns the description of the item
     *
     * @return the description of the item
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
     * Returns the price of the item
     *
     * @return the price of the item
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets to the given price
     *
     * @param price The new price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Returns the category of the item
     *
     * @return the category of the item
     */
    public ItemCategory getCategory() {
        return category;
    }

    /**
     * Sets to the given category
     *
     * @param category The new category
     */
    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    /**
     * Returns true if the item is imported; false otherwise.
     *
     * @return true if the item is imported; false otherwise.
     */
    public boolean isImported() {
        return imported;
    }

    /**
     * Sets to the given imported
     *
     * @param imported The new imported value
     */
    public void setImported(boolean imported) {
        this.imported = imported;
    }

    /**
     * Returns the tax of the item
     *
     * @return the tax of the item
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets to the given tax
     *
     * @param tax The new tax
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * Returns the duePrice of the item
     *
     * @return the duePrice of the item
     */
    public BigDecimal getDuePrice() {
        return duePrice;
    }

    /**
     * Sets to the given duePrice
     *
     * @param duePrice The new duePrice
     */
    public void setDuePrice(BigDecimal duePrice) {
        this.duePrice = duePrice;
    }

}
