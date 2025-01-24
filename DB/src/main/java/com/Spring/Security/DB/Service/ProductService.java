package com.Spring.Security.DB.Service;

import com.Spring.Security.DB.Model.ProductModel;
import com.Spring.Security.DB.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    public List<ProductModel> toGetProduct()
    {
        return repo.findAll();

    }

}
