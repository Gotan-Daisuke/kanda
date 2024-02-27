package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.bean.MerchandiseEntity;
import com.example.bean.SearchEntity;

@Repository
public interface MerchandiseRepository extends JpaRepository<MerchandiseEntity, Integer>, JpaSpecificationExecutor<SearchEntity>{
	Optional<MerchandiseEntity> findById(Integer id);
}
