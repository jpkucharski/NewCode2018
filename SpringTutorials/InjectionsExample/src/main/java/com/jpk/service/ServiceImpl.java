package com.jpk.service;

import com.jpk.model.C;
import com.jpk.repository.RepositoryConnector;

import java.util.List;

public class ServiceImpl implements Service {

    private RepositoryConnector repositoryConnector;

    public ServiceImpl() {
        System.out.println("Autowired Constructor injection");
    }

    public ServiceImpl(RepositoryConnector repositoryConnector) {
        System.out.println("Constructor injection");
        this.repositoryConnector = repositoryConnector;
    }

    public List<C> getListOfAllObjectsInDatabase() {
        return repositoryConnector.getAllElementsFromDatabase();
    }

    public void setRepositoryConnector(RepositoryConnector repositoryConnector) {
        System.out.println("Setter injection");
        this.repositoryConnector = repositoryConnector;
    }
}
