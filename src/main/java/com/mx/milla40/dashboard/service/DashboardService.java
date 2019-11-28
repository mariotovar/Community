package com.mx.milla40.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.milla40.dashboard.models.Dashboard;
import com.mx.milla40.dashboard.models.DashboardPK;
import com.mx.milla40.dashboard.repository.DashboardRepository;
import com.mx.milla40.task.models.Task;

@Service
public class DashboardService {
	
	@Autowired
	DashboardRepository dashboardRepository;

	public List<Dashboard> getTasksDashboard(List<? extends Task> tasks, DashboardPK pk){
		return dashboardRepository.getTasksDashboard(tasks, pk);
	}	
	
}
