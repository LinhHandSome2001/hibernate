package com.linh.k17.hibernate.service;

import java.util.List;
import com.linh.k17.hibernate.entity.Customer;


public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
