package com.chinasoft.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.chinasoft.demo.entity.Product;
import com.chinasoft.demo.repository.ProductRepository;
import com.chinasoft.demo.service.ProductService;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @InjectMocks
    @Spy
    private ProductController controller;
    @InjectMocks
    @Spy
    private ProductService service;
    @Mock
    private ProductRepository repository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void get_products_return_empty() {
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());

        List<Product> products = this.controller.getAll();

        Assert.assertNotNull(products);
        Assert.assertEquals(0, products.size());
    }

    @Test
    public void get_products_return_normal_list() {
        Mockito.when(repository.findAll())
            .thenReturn(Arrays.asList(Product.builder().id("1").name("Java").build(),
                Product.builder().id("2").name("Python").build()));

        List<Product> products = this.controller.getAll();

        Assert.assertNotNull(products);
        Assert.assertEquals(2, products.size());
        Assert.assertEquals("2", products.get(1).getId());
        Assert.assertEquals("Python", products.get(1).getName());
    }

}
