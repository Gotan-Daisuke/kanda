package com.example.repository;

import java.util.Objects;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;


public class SearchSpecification<SearchEntity> {
	
	public Specification<SearchEntity>notNullID(){
		return (root, query, cb) -> cb.isNotNull(root.get("id"));
	
	}
	
	/**
	 * 検索対象
	 * 	merchandise 商品名
	 * 	maker メーカー名
	 * @param search
	 * @return
	 */
	public Specification<SearchEntity>searchSpec(String search){
		  return Objects.isNull(search) ? null : (root, query,builder) -> {
		        Predicate[] predicates = {
		        		builder.like(root.get("merchandise"), "%" + search + "%"),
		        		builder.like(root.get("maker"), "%" + search + "%")
		        };
		        return builder.or(predicates);
		  
		  	};
	   }
	
	    /**
	     * 検索対象
	     * 	price 値段
	     * @param price
	     * @return
	     */
	    public Specification<SearchEntity> priceSpec(Integer price) {
	    	return price == null ? null : (root, query, builder) -> {
	            return builder.lessThanOrEqualTo(root.get("price"), price);
	        };
	   }
	    
	    public Specification<SearchEntity> tagSpec(String tag) {
	    	return Objects.isNull(tag) ? null : (root, query, builder) -> {
	    		Predicate[] predicates = {
		            builder.equal(root.get("merchandisetag1"), tag),
		            builder.equal(root.get("merchandisetag2"), tag)
		        };
	        return builder.or(predicates);
	    	};
	    }
}
