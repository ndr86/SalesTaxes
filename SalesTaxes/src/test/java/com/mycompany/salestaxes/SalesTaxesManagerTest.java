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

    /**
     * TEST CASE:
     *
     * <br><br>Input 1:<br>1 book at 12.49<br>1 music CD at 14.99<br>1 chocolate bar at 0.85
     *
     * <br><br>Output 1:<br>1 book : 12.49<br>1 music CD: 16.49<br>1 chocolate bar: 0.85<br>Sales Taxes: 1.50<br>Total:
     * 29.83
     *
     */
    @Test
    public void input1() {

        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setQuantity(1);
        item.setCode("xxx");
        item.setDescription("book");
        item.setPrice(BigDecimal.valueOf(12.49));
        item.setCategory(categories.get("1"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setCode("yyy");
        item.setDescription("music CD");
        item.setPrice(BigDecimal.valueOf(14.99));
        item.setCategory(categories.get("4"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setCode("zzz");
        item.setDescription("chocolate bar");
        item.setPrice(BigDecimal.valueOf(0.85));
        item.setCategory(categories.get("2"));
        items.add(item);

        Receipt receipt = salesTaxesManager.calculateReceiptAmount(items);

        System.out.println("Output 1:");
        salesTaxesManager.printReceipt(receipt);
    }

    /**
     * TEST CASE:
     *
     * <br><br>Input 2:<br>1 imported box of chocolates at 10.00<br>1 imported bottle of perfume at 47.50
     *
     * <br><br>Output 2:<br>1 imported box of chocolates: 10.50<br>1 imported bottle of perfume: 54.65<br>Sales Taxes:
     * 7.65<br>Total: 65.15
     */
    @Test
    public void input2() {

        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setQuantity(1);
        item.setCode("xxx");
        item.setDescription("imported box of chocolates");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(10.00));
        item.setCategory(categories.get("2"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setCode("yyy");
        item.setDescription("imported bottle of perfume");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(47.50));
        item.setCategory(categories.get("4"));
        items.add(item);

        Receipt receipt = salesTaxesManager.calculateReceiptAmount(items);

        System.out.println("Output 2:");
        salesTaxesManager.printReceipt(receipt);
    }

    /**
     * TEST CASE:
     *
     * <br><br>Input 3:<br>1 imported bottle of perfume at 27.99<br>1 bottle of perfume at 18.99<br>1 packet of headache
     * pills at 9.75<br>1 box of imported chocolates at 11.25
     *
     * <br><br>Output 3:<br>1 imported bottle of perfume: 32.19<br>1 bottle of perfume: 20.89<br>1 packet of headache
     * pills: 9.75<br>1 imported box of chocolates: 11.85<br>Sales Taxes: 6.70<br>Total: 74.68
     */
    @Test
    public void input3() {

        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setQuantity(1);
        item.setCode("xxx");
        item.setDescription("imported bottle of perfume");
        item.setImported(true);
        item.setPrice(BigDecimal.valueOf(27.99));
        item.setCategory(categories.get("4"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setCode("yyy");
        item.setDescription("bottle of perfume");
        item.setPrice(BigDecimal.valueOf(18.99));
        item.setCategory(categories.get("4"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setCode("zzz");
        item.setDescription("packet of headache pills");
        item.setPrice(BigDecimal.valueOf(9.75));
        item.setCategory(categories.get("3"));
        items.add(item);

        item = new Item();
        item.setQuantity(1);
        item.setCode("vvv");
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
