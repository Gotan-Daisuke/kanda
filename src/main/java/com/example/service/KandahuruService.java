package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bean.SearchEntity;
import com.example.repository.SearchRepository;

@Service
@Transactional
public class KandahuruService {

	//Repositoryクラスの呼び出し
	 @Autowired
	 private SearchRepository repository;
	 
	    public List<SearchEntity> findAll() {
	        return repository.findAll();
	    }

}
