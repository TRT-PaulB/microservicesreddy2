package com.micro.spring.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.micro.spring.dm.Product;

public interface ProductDaoRepository<Product> extends PagingAndSortingRepository {

	List<Product> findAll();
	
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