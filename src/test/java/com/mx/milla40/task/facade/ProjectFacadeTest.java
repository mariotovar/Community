package com.mx.milla40.task.facade;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.milla40.base.config.TestConfig;
import com.mx.milla40.catalog.models.Group;
import com.mx.milla40.dashboard.models.Dashboard;
import com.mx.milla40.task.models.Meeting;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProjectFacadeTest extends TestConfig{

	@Autowired
	ProjectFacade projectFacade;
	
	@Test
	public void testGetMembers() {			
		List<Group> groups = projectFacade.getGroups(pkProject(0));
		assertNotNull(groups);
		groups.forEach(System.out::println);
	}

	@Test
	public void testGetActivities() {			
		List<Meeting> meetings = projectFacade.getMeetings(pkProject(0));
		assertNotNull(meetings);
		meetings.forEach(System.out::println);
	}
	
	@Test
	public void testGetDashboard() {			
		List<Dashboard> dashboard = projectFacade.getMeetingsDashboard(pkProject(0));
		assertNotNull(dashboard);
		dashboard.forEach(System.out::println);
	}	
	
	private static int pkProject(int pk){
		return pk;
	}
	

}
