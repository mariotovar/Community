package com.mx.milla40.catalog.repository;

import java.util.List;
import java.util.Map;

import com.mx.milla40.catalog.models.Catalog;

public interface CatalogRepository {

	public int getNumberOfRows(Class<? extends Catalog> clazz);
	public Catalog findRow(long pk, Class<? extends Catalog> clazz);
	public Catalog findRow(String value, Class<? extends Catalog> clazz);
	public Map<Long, String> listMap(Class<? extends Catalog> clazz);
	public List<Catalog> listRows(Class<? extends Catalog> clazz);
	//public List<Catalog> getListRowsByPage(CtrlPage ctrlPage, Class<? extends Catalog> clazz);
	public void addCatalog(Catalog catalog);
	public void updateCatalog(Catalog catalog);
	public void deleteCatalog(long pk);
	
}
