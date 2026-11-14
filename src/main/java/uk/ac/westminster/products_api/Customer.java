package uk.ac.westminster.products_api;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private Address address;
    private String[] tags;
    private static int customerCount = 0;



    public Customer(){
        this.tags = new String[] {"VIP", "Premium"};
        customerCount++;
    }

    public Customer(Long id, String name, String email, Address address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;

        this.tags = new String[] {"VIP", "Premium"};

        customerCount ++;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Address getAddress(){
        return address;
    }

    public int getCustomerCount(){
        return customerCount;
    }

    public String[] getTags() {
        return tags;
    }
}
