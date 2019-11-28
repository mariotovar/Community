package com.mx.milla40.task.facade;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.milla40.base.config.TestConfig;
import com.mx.milla40.catalog.models.Member;
import com.mx.milla40.dashboard.models.Dashboard;
import com.mx.milla40.task.models.Activity;

@RunWith(SpringJUnit4ClassRunner.class)
public class GroupFacadeTest extends TestConfig{
	
	@Autowired
	GroupFacade groupFacade;
	
	@Test
	public void testGetMembers() {			
		List<Member> members = groupFacade.getMembers(pkProject(0), pkGroup(0));
		assertNotNull(members);
		members.forEach(System.out::println);
	}

	@Test
	public void testGetActivities() {			
		List<Activity> activities = groupFacade.getActivities(pkProject(0), pkGroup(0));
		assertNotNull(activities);
		activities.forEach(System.out::println);
	}
	
	@Test
	public void testGetActivitiesDashboard() {			
		List<Dashboard> dashboard = groupFacade.getActivitiesDashboard(pkProject(0), pkGroup(0));
		assertNotNull(dashboard);
		dashboard.forEach(System.out::println);
	}
	
	private static int pkProject(int pk){
		return pk;
	}

	private static int pkGroup(int pk){
		return pk;
	}
	
}
