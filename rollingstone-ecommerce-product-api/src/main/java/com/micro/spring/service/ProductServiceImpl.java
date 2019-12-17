package com.micro.spring.service;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.micro.spring.dao.ProductDaoRepository;
import com.micro.spring.dm.Product;


@Service
public class ProductServiceImpl implements ProductService {

   final static Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

   @Autowired
   private ProductDaoRepository productDao;
   
   @Override
   public Product save(Product product) {
	   
	   if (product.getCategory() == null) {
		   logger.info("Product Category is null :");
	   }else {
		   logger.info("Product Category is not null :"+product.getCategory());
		   logger.info("Product Category is not null ID :"+product.getCategory().getId());

	   }
	   
	   if (product.getParentCategory() == null) {
		   logger.info("Product Parent Category is null :");
	   }else {
		   logger.info("Product Parent Category is not null :"+product.getParentCategory());
		   logger.info("Product Parent Category is not null Id :"+product.getParentCategory().getId());

	   }
	   
	   // TODO: check this
	   return (Product)productDao.save(product);
   }

   // TODO 
   @Override
   public Optional<Product> get(long id) {
       return productDao.findById(id);       // TODO
   }

   @Override
   public Page<Product> getProductsByPage(Integer pageNumber, Integer pageSize) {
	   Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("productCode").descending());
       return productDao.findAll(pageable);       // TODO
   }

   
   @Override
   public void update(long id, Product product) {
      productDao.save(product);      // TODO
   }

   @Override
   public void delete(long id) {
      productDao.deleteById(id);      // TODO
   }

}
