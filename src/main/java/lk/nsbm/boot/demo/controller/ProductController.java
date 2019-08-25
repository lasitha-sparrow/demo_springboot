package lk.nsbm.boot.demo.controller;

import lk.nsbm.boot.demo.domain.Product;
import lk.nsbm.boot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/products")

public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    @ResponseBody
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
