package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        Address address = new Address("Hampdenlane", "colombo", "00600");
        return new Customer(id, "mathu", "abcgamil.com" ,address);
    }



}
