package com.don.springbootmall.dao;

import com.don.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
