package com.teks.example.service;

import com.teks.example.entities.product;

import java.util.List;

public interface productService {

    public boolean saveProduct(product products);

    public List<product> getProducts();

    public product getProductById(int Id);

    public boolean updateDetails(int Id, String name, int price, int stock , String category);

    public boolean DeleteById(int id);
}
