package com.mx.milla40.catalog.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.milla40.catalog.models.Catalog;
import com.mx.milla40.catalog.service.CatalogService;

@Component
public class CatalogFacade {

	@Autowired
	CatalogService catalogService;
	
	public List<? extends Catalog> list(Class<? extends Catalog> clazz){
		return catalogService.list(clazz);
	}
	
}
