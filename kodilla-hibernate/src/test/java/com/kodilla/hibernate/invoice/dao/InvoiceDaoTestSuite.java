package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    private static final String NAME = "SAMSUNG";
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //given
        Product product1 = new Product(NAME);

        Item item1 = new Item(new BigDecimal(1000.0), 4);
        Item item2 = new Item(new BigDecimal(100.4), 3);

        item1.setProduct(product1);
        item2.setProduct(product1);

        product1.getItems().add(item1);
        product1.getItems().add(item2);

        Invoice invoice1 = new Invoice("1/1/2022");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        //when
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        //then
        assertNotEquals(0, id);
        //cleanUp
        invoiceDao.deleteById(id);
    }
}
