package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "data", collectionResourceRel = "data")
public interface DataDao extends JpaRepository<Data, Long> {

}