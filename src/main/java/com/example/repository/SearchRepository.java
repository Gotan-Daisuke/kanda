package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.SearchEntity;

public interface SearchRepository extends JpaRepository<SearchEntity, Integer>{
}
