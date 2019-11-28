package com.mx.milla40.task.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.milla40.catalog.models.Group;
import com.mx.milla40.dashboard.models.Dashboard;
import com.mx.milla40.dashboard.models.DashboardPK;
import com.mx.milla40.dashboard.models.MeetingDashboardPK;
import com.mx.milla40.dashboard.service.DashboardService;
import com.mx.milla40.task.models.Meeting;
import com.mx.milla40.task.service.ProjectService;

@Component
public class ProjectFacade {
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	DashboardService dashboardService;
	
	public List<Group> getGroups(int pkProject){
		return projectService.getGroups(pkProject);
	}
	
	public List<Meeting> getMeetings(int pkProject){
		return projectService.getMeetings(pkProject);
	}		
	
	public List<Dashboard> getMeetingsDashboard(int pkProject){
		DashboardPK pk = new MeetingDashboardPK(pkProject);
		List<Meeting> meetings = this.getMeetings(pkProject);
		return dashboardService.getTasksDashboard(meetings, pk);
	}	

}
