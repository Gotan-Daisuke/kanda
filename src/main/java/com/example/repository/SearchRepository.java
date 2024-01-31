package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.bean.SearchEntity;

@Repository
public interface SearchRepository extends JpaRepository<SearchEntity, Integer>, JpaSpecificationExecutor<SearchEntity>{

}
