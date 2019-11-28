package com.mx.milla40.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.milla40.catalog.models.Catalog;
import com.mx.milla40.catalog.repository.CatalogRepositoryImpl;

@Service
public class CatalogService {

	@Autowired
	CatalogRepositoryImpl catalogRepository;
	
	public List<? extends Catalog> list(Class<? extends Catalog> clazz){
		return catalogRepository.listRows(clazz);
	}
	
}
