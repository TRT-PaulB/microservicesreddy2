package com.micro.ctrl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.dm.Product;
import com.micro.event.ProductEvent;
import com.micro.service.ProductService;


@RestController
public class ProductController extends AbstractController {

   @Autowired
   private ProductService  productService;

   /*---Add new Product---*/
   @PostMapping("/product")
   public ResponseEntity<?> createProduct(@RequestBody Product product) {
      Product savedProduct = productService.save(product);
      
      ProductEvent prdCreatedEvent = new ProductEvent("Product is created", savedProduct);
      eventPublisher.publishEvent(prdCreatedEvent);
      
      return ResponseEntity.ok().body("New Product has been saved with ID:" + savedProduct.getId());
   }

   /*---Get a Product by id---*/
   @GetMapping("/product/{id}")
   public ResponseEntity<Product> getProduct(@PathVariable("id") long id) {
	   Optional<Product> returnedProduct = productService.get(id);
	   
	   // modify
	   /*
	    * return group.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    * */    /// ASSUMEOR NOW THAT IT ALWAYS WILL BE RETRIEVED!
	   ProductEvent prdReceivedEvent = new ProductEvent("One product is retrieved", returnedProduct.get());
	   eventPublisher.publishEvent(prdReceivedEvent);
	   
       return ResponseEntity.ok().body(returnedProduct.get());
   }

   /*---get all Products---*/
   @GetMapping("/product")
   public @ResponseBody Page<Product> getProductsByPage(
		   @RequestParam(value="pagenumber", required=true, defaultValue="0") Integer pageNumber,
		   @RequestParam(value="pagesize", required=true, defaultValue="20") Integer pageSize) {
	   Page<Product> pagedProducts = productService.getProductsByPage(pageNumber, pageSize);
       return pagedProducts;
   }

   /*---Update a Product by id---*/
   @PutMapping("/product/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Product product) {
	  checkResourceFound(this.productService.get(id));
      productService.update(id, product);
      return ResponseEntity.ok().body("Product has been updated successfully.");
   }

   /*---Delete a Product by id---*/
   @DeleteMapping("/product/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	  checkResourceFound(this.productService.get(id));
      productService.delete(id);
      return ResponseEntity.ok().body("Product has been deleted successfully.");
   }
}