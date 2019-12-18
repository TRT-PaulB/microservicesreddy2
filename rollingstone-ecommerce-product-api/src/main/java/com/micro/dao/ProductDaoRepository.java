package com.micro.dao;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.micro.dm.Product;

@Repository
public interface ProductDaoRepository extends PagingAndSortingRepository<Product, Long> {

//	Page<Product> findAll(Pageable pageable);
}







/*
@Repository
public interface ProductDaoRepository extends JpaRepository<Product, Long> {


// old monolith:
	// List<Product> findAll();
	
}



//	@Query("SELECT b FROM Basket b join b.contactDetails cd join cd.user u WHERE u.userName = :userName and b.open is true")
//	Optional<Basket> findOpenBasketForUser(@Param("userName") String userName);



*/