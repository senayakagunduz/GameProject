package com.company.Adaptors;

import com.company.Abstract.CustomerCheckService;
import com.company.Entities.Customer;

public class EDevletServiceAdaptor implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationalityId().length()==11;
    }
}
