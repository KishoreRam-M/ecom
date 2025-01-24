package com.Spring.Security.DB.Controller;

import com.Spring.Security.DB.Model.ProductModel;
import com.Spring.Security.DB.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("Product")
    public List<ProductModel> toGetProduct()
    {
        return service.toGetProduct();
    }


}
