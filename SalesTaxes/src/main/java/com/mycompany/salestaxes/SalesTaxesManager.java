package com.mycompany.salestaxes;

import com.mycompany.salestaxes.dto.Item;
import com.mycompany.salestaxes.dto.Receipt;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author a.grimaldi
 */
public class SalesTaxesManager {

    public Receipt calculateReceiptAmount(List<Item> items) {

        Receipt receiptDTO = new Receipt(items);

        // Calculate taxes on items
        for (Item item : items) {

            // Basic sales tax is applicable at a rate of 10% on all goods, 
            // except books, food, and medical products that are exempt. 
            // Import duty is an additional sales tax applicable on all imported goods
            // at a rate of 5%, with no exemptions.
            Integer taxPercentage = 0;
            if (item.isImported()) {
                taxPercentage = taxPercentage + 5;
            }
            if (!item.getCategory().isExempt()) {
                taxPercentage = taxPercentage + 10;
            }

            BigDecimal tax = item.getPrice()
                    .multiply(BigDecimal.valueOf(item.getQuantity()))
                    .multiply(BigDecimal.valueOf(taxPercentage))
                    .divide(BigDecimal.valueOf(100));

            // The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains
            // (np/100 rounded up to the nearest 0.05) amount of sales tax.
            double roundedTax = Math.ceil(tax.doubleValue() * 20.0) / 20.0;

            item.setTax(BigDecimal.valueOf(roundedTax));

            receiptDTO.setSalesTaxes(receiptDTO.getSalesTaxes().add(item.getTax()));

            item.setDuePrice(item.getPrice().add(item.getTax()));

            receiptDTO.setTotalAmount(receiptDTO.getTotalAmount().add(item.getDuePrice()));
        }

        return receiptDTO;
    }

    public void printReceipt(Receipt receiptDTO) {

        if (receiptDTO != null
                && receiptDTO.getItems() != null
                && !receiptDTO.getItems().isEmpty()) {

            for (Item item : receiptDTO.getItems()) {
                System.out.println(item.getQuantity() + " " + item.getDescription() + ": " + String.format("%.2f", item.getDuePrice()));
            }

            System.out.println("Sales Taxes: " + String.format("%.2f", receiptDTO.getSalesTaxes()));
            System.out.println("Total: " + String.format("%.2f", receiptDTO.getTotalAmount()));
        }
    }

}
