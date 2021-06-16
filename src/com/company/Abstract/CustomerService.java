package com.company.Abstract;


import com.company.Entities.Customer;

public interface CustomerService {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
