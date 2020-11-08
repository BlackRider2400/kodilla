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

        Item item1 = new Item(product1, new BigDecimal("2900"), 140, new BigDecimal("29300"));
        Item item2 = new Item(product2, new BigDecimal("2300"), 250, new BigDecimal("83270"));
        Item item3 = new Item(product3, new BigDecimal("4700"), 600, new BigDecimal("382900"));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("1", items);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        invoiceDao.save(invoice);

        //Then
        assertTrue(true);
        //CleanUp
    }
}
