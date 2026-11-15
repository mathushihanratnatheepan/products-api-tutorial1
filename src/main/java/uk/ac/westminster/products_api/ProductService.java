package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    Long nextId = 1L;

    public ProductService(){
        products.add(new DigitalProduct(nextId++, "Clean Code (E-book)", 29.99,
                "/downloads/clean-code.pdf", 4.2));

        products.add(new PhysicalProduct(nextId++, "27-inch Monitor", 249.99,
                5.4, "61cm x 41cm x 18cm"));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        nextId += 1L;
        products.add(product);
        product.setId(nextId);
        return product;

    }

    public Optional<Product> getProductById(Long id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void deleteProduct(Long id){
        products.removeIf(p -> p.getId().equals(id));

    }

    public List<Product> findByName(String name){
        return products.stream().filter(p -> p.getName().equalsIgnoreCase(name)).toList();

    }


}
