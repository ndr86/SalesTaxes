package com.mycompany.salestaxes.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class contains all information to print of a receipt
 *
 * @author a.grimaldi
 */
public class Receipt {

    private List<Item> items;
    private BigDecimal salesTaxes;
    private BigDecimal totalAmount;

    public Receipt(List<Item> items) {
        this.salesTaxes = BigDecimal.ZERO;
        this.totalAmount = BigDecimal.ZERO;
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getSalesTaxes() {
        return salesTaxes;
    }

    public void setSalesTaxes(BigDecimal salesTaxes) {
        this.salesTaxes = salesTaxes;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}
