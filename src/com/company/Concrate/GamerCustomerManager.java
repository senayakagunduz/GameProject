package com.company.Concrate;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.CustomerCheckService;
import com.company.Entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public GamerCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if(this.customerCheckService.checkIfRealPerson(customer)){
            super.add(customer);
        }
        else{
            System.out.println("Not a valid person");
        }

    }

    @Override
    public void update(Customer customer) {
        super.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        super.delete(customer);
    }
}
