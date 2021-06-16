package com.company.Entities;

import java.time.LocalDate;

public class Seller extends Customer {
    private String Number;//vergi numarası gibi bişey

    public Seller(String id, String email, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String number) {
        super(id, email, firstName, lastName, dateOfBirth, nationalityId);
        Number = number;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

}
