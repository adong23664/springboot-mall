package com.don.springbootmall.service;

import com.don.springbootmall.dto.ProductRequest;
import com.don.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
