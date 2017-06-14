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

    /**
     * Returns the items of the receipt
     *
     * @return the items of the receipt
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Sets to the given items
     *
     * @param items The new items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Returns the sales taxes of the receipt
     *
     * @return the sales taxes of the receipt
     */
    public BigDecimal getSalesTaxes() {
        return salesTaxes;
    }

    /**
     * Sets to the given sales taxes
     *
     * @param salesTaxes The new sales taxes
     */
    public void setSalesTaxes(BigDecimal salesTaxes) {
        this.salesTaxes = salesTaxes;
    }

    /**
     * Returns the total amount of the receipt
     *
     * @return the total amount of the receipt
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets to the given total amount
     *
     * @param totalAmount The new total amount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}
