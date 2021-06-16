package com.company.Concrate;

import com.company.Abstract.CustomerCheckService;
import com.company.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
