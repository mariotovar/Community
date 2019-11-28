package com.mx.milla40.catalog.facade;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.milla40.base.config.TestConfig;
import com.mx.milla40.catalog.models.Catalog;
import com.mx.milla40.catalog.models.Project;

@RunWith(SpringJUnit4ClassRunner.class)
public class CatalogFacadeTest extends TestConfig{
	
	@Autowired
	CatalogFacade catalogFacade;
		
	@Test
	public void testListProject() {					
		this.testList(Project.class);
	}

	public void testList(Class<? extends Catalog> clazz) {			
		List<? extends Catalog> list = catalogFacade.list(clazz);
		assertNotNull(list);
		if(list.size()>0){
			assertTrue(((ArrayList<?>)list).get(0).getClass().isAssignableFrom(clazz));	
		}		
	}
	
}
