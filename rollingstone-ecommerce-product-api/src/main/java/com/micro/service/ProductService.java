package com.micro.service;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.micro.dm.Product;

public interface ProductService {

   Product save(Product product);
   
   Optional<Product> get(long id);   
   
   Page<Product> getProductsByPage(Integer pageNum, Integer pageSize);
   
   void update(long id, Product category);
   
   void delete(long id);
}

