package com.mycompany.salestaxes;

import com.mycompany.salestaxes.dto.Item;
import com.mycompany.salestaxes.dto.ItemCategory;
import com.mycompany.salestaxes.dto.Receipt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author a.grimaldi
 */
public class SalesTaxesManagerTest {

    private static SalesTaxesManager salesTaxesManager;

    private static final Map<String, ItemCategory> categories = new HashMap<>();

    static {
        categories.put("1", new ItemCategory("1", "book", true));
        categories.put("2", new ItemCategory("2", "food", true));
        categories.put("3", new ItemCategory("3", "medical product", true));
        categories.put("4", new ItemCategory("4", "other", false));
    }

    public SalesTaxesManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        salesTaxesManager = new SalesTaxesManager();
    }

    @Test
    public void input1() {

        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setQuantity(1);
        item.setDescription("book");
        item.setPrice(BigDecimal.valueOf(12.49));
        item.setCategory(categories.get("1"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setDescription("music CD");
        item.setPrice(BigDecimal.valueOf(14.99));
        item.setCategory(categories.get("4"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setDescription("chocolate bar");
        item.setPrice(BigDecimal.valueOf(0.85));
        item.setCategory(categories.get("2"));
        items.add(item);

        Receipt receipt = salesTaxesManager.calculateReceiptAmount(items);

        System.out.println("Output 1:");
        salesTaxesManager.printReceipt(receipt);
    }

    @Test
    public void input2() {

        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setQuantity(1);
        item.setDescription("imported box of chocolates");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(10.00));
        item.setCategory(categories.get("2"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setDescription("imported bottle of perfume");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(47.50));
        item.setCategory(categories.get("4"));
        items.add(item);

        Receipt receipt = salesTaxesManager.calculateReceiptAmount(items);

        System.out.println("Output 2:");
        salesTaxesManager.printReceipt(receipt);
    }

    @Test
    public void input3() {

        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setQuantity(1);
        item.setDescription("imported bottle of perfume");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(27.99));
        item.setCategory(categories.get("4"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setDescription("bottle of perfume");
        item.setPrice(BigDecimal.valueOf(18.99));
        item.setCategory(categories.get("4"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setDescription("packet of headache pills");
        item.setPrice(BigDecimal.valueOf(9.75));
        item.setCategory(categories.get("3"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setDescription("box of imported chocolates");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(11.25));
        item.setCategory(categories.get("2"));
        items.add(item);

        Receipt receipt = salesTaxesManager.calculateReceiptAmount(items);

        System.out.println("Output 3:");
        salesTaxesManager.printReceipt(receipt);
    }

}
