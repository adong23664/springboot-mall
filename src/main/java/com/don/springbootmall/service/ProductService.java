package com.don.springbootmall.service;

import com.don.springbootmall.dto.ProductQueryParams;
import com.don.springbootmall.dto.ProductRequest;
import com.don.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);



}
