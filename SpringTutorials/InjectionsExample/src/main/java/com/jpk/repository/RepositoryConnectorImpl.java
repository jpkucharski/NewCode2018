package com.jpk.repository;

import com.jpk.model.C;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class RepositoryConnectorImpl implements RepositoryConnector {

    @Value("${name}")
    private String name;

    public List<C> getAllElementsFromDatabase() {
        System.out.println("Generating fake data.");
        List<C> customers = new ArrayList<C>();

        for (int i = 0; i < 50; i++) {
            if (i != 0) {
                customers.add(new C("name_" + i));
            } else {
                customers.add(new C(name + "_" + i));
            }
        }
        System.out.println("Returning List From Database");
        return customers;
    }
}
