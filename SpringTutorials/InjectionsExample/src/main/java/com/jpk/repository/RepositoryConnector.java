package com.jpk.repository;

import com.jpk.model.C;

import java.util.List;

public interface RepositoryConnector {
    List<C> getAllElementsFromDatabase();
}
