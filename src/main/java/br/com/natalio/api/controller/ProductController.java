package br.com.natalio.api.controller;

import br.com.natalio.api.model.Product;
import br.com.natalio.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProductList();
    }

    @GetMapping(value = "/{productId}")
    public Product getProduct(@PathVariable("productId") long productId){
        return productService.getProduct(productId);
    }

    @PutMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") long productId, @RequestBody Product product){
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable("productId") long productId){
        productService.deleteProduct(productId);
    }
}
