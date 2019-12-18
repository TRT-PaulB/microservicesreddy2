package com.micro.dao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.micro.dm.Category;


@Repository
public interface CategoryDaoRepository extends PagingAndSortingRepository<Category, Long> {


}

