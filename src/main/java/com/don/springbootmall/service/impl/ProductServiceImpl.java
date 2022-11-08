package com.don.springbootmall.service.impl;

import com.don.springbootmall.dao.ProductDao;
import com.don.springbootmall.dao.impl.ProductDaoImpl;
import com.don.springbootmall.dto.ProductRequest;
import com.don.springbootmall.model.Product;
import com.don.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
