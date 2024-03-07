package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bean.MerchandiseEntity;
import com.example.bean.SearchEntity;
import com.example.bean.SearchForm;
import com.example.repository.MerchandiseRepository;
import com.example.repository.SearchRepository;
import com.example.repository.SearchSpecification;
import com.example.search.SearchComponent;

@Service
@Transactional
public class KandahuruService {

	//Repositoryクラスの呼び出し
	 @Autowired
	 private SearchRepository searchRepository;
	 @Autowired
	 private MerchandiseRepository merchandiseRepository;

	 //Componentクラスの呼び出し
	 @Autowired
	 private SearchComponent component;

	/**
	 * 検索条件分岐
	 * 
	 * @param form
	 * @return 全件表示 : 条件検索
	 */
	public List<SearchEntity> findlist(SearchForm form) {
		 return component.formIsNull(form) ? findAll() : findSearch(form);
	 }

	/**
	 * 全件表示
	 * SearchEntity
	 * @return findAll
	 */
	public List<SearchEntity> findAll() {
	    return searchRepository.findAll();
	}
	
	/**
	 * ID検索
	 * SearchEntity
	 * @return findById
	 */
	public Optional<SearchEntity> findById(Integer id) {
	    return searchRepository.findById(id);
	}

	/**
	 * ID検索
	 * MerchandiseEntity
	 * @return mFindById
	 */
	public Optional<MerchandiseEntity> mFindById(Integer id) {
	    return merchandiseRepository.findById(id);
	}
	
	/**
	 * 条件検索
	 * @param form
	 * @return findAll
	 */
	public List<SearchEntity> findSearch(SearchForm form) {

		SearchSpecification<SearchEntity> spec = new SearchSpecification<>();
	    return searchRepository.findAll(
	    		Specification.where(spec.priceSpec(component.priceIsNull(form.getPrice())))
	    				.and(spec.tagSpec(form.getTag()))
	    				.and(spec.searchSpec(form.getSerchbox())));
	}

	/**
	 * formクラスの初期化
	 * @param form
	 * @return form
	 */
	public SearchForm form(SearchForm form) {
		return component.formIsNull(form) ? new SearchForm() : form;
	}
}
