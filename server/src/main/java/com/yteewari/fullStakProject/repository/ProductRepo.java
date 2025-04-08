package com.yteewari.fullStakProject.repository;

import com.yteewari.fullStakProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
// jpa needs two generics, one for the entity and one for the primary key
}
