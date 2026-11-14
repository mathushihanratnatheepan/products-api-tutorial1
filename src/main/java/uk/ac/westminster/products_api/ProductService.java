package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    Long nextId = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        nextId += 1L;
        products.add(product);
        product.setId(nextId);
        return product;

    }

}
