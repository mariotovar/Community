package com.mx.milla40.task.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.milla40.catalog.models.Member;
import com.mx.milla40.dashboard.models.Dashboard;
import com.mx.milla40.dashboard.models.DashboardPK;
import com.mx.milla40.dashboard.models.GroupDashboardPK;
import com.mx.milla40.dashboard.service.DashboardService;
import com.mx.milla40.task.models.Activity;
import com.mx.milla40.task.service.GroupService;

@Component
public class GroupFacade {
	
	@Autowired
	GroupService groupService;
	
	@Autowired
	DashboardService dashboardService;

	public List<Member> getMembers(int pkProject, int pkGroup){
		return groupService.getMembers(pkProject, pkGroup);
	}	
	
	public List<Activity> getActivities(int pkProject, int pkGroup){
		return groupService.getActivities(pkProject, pkGroup);
	}

	public List<Dashboard> getActivitiesDashboard(int pkProject, int pkGroup){
		DashboardPK pk = new GroupDashboardPK(pkProject, pkGroup);
		List<Activity> activities = this.getActivities(pkProject, pkGroup);
		return dashboardService.getTasksDashboard(activities, pk);
	}	
	
}
