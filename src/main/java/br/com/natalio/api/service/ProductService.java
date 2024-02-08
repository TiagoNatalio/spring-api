package br.com.natalio.api.service;

import br.com.natalio.api.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductService {
    private long productIdCount = 1;

    @Getter
    private List<Product> productList = new ArrayList<>();

    public Product addProduct(Product product){
        product.setId(productIdCount);
        productList.add(product);
        productIdCount++;
        return product;
    }

    public Product getProduct(long productId) {
        Optional<Product> optionalProduct = productList.stream()
                .filter(product -> product.getId() == productId)
                .findFirst();

        return optionalProduct.orElse(null);
    }

    public Product updateProduct(long productId, Product product){
        productList.forEach( p -> {
            if(p.getId() == productId){
                p.setName(product.getName());
                p.setCategory(product.getCategory());
                p.setPrice(product.getPrice());
            }
        });

       Optional<Product> optionalProduct = productList.stream()
               .filter(p -> p.getId() == productId)
               .findFirst();

       return optionalProduct.orElse(null);
    }

    public void deleteProduct(long productId){
        productList.removeIf(product -> product.getId() == productId);
    }

}
