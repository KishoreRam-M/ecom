package com.Spring.Security.DB.Repo;

import com.Spring.Security.DB.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductModel,Long> {
}
