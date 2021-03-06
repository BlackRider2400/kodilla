package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Onion");
        Product product2 = new Product("Tomato");
        Product product3 = new Product("Potato");

        List<Item> itemsForProducts = new ArrayList<>();


        Item item1 = new Item(product1, new BigDecimal("2900"), 140, new BigDecimal("29300"));
        Item item2 = new Item(product1, new BigDecimal("2300"), 250, new BigDecimal("83270"));
        Item item3 = new Item(product1, new BigDecimal("4700"), 600, new BigDecimal("382900"));

        itemsForProducts.add(item1);
        itemsForProducts.add(item2);
        itemsForProducts.add(item3);

        product1.setItemList(itemsForProducts);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("1");
        invoice.setItems(items);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);



        //When
        invoiceDao.save(invoice);
        Long invoiceId = invoice.getId();

        //Then
        assertNotNull(invoiceId);
        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
