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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getDuePrice() {
        return duePrice;
    }

    public void setDuePrice(BigDecimal duePrice) {
        this.duePrice = duePrice;
    }

}
