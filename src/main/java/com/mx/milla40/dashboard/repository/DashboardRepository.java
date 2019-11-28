package com.mx.milla40.dashboard.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mx.milla40.catalog.models.Member;
import com.mx.milla40.dashboard.models.Dashboard;
import com.mx.milla40.dashboard.models.DashboardPK;
import com.mx.milla40.task.models.State;
import com.mx.milla40.task.models.Task;

@Repository
public class DashboardRepository {

	public List<Dashboard> getTasksDashboard(List<? extends Task> tasks, DashboardPK pk){
		
		List<Member> members = new ArrayList<Member>();
		for(int i=0; i<10; i++){
			Member member = new Member();
			member.setPk(i);
			member.setName("MEMBER " + i);
			members.add(member);
		}
		
		List<Dashboard> dashboard = new ArrayList<Dashboard>();
		for(Member member : members){
			Dashboard memberTasksState = new Dashboard();
			memberTasksState.setMember(member);
			Map<Task, State> tasksState = new HashMap<Task, State>();
			for(Task task : tasks){
				tasksState.put(task, task.getPk()%3==0?State.TODO:State.DONE);
			}
			memberTasksState.setTasksState(tasksState);
			dashboard.add(memberTasksState);
		}		
		return dashboard;		
	
	}	

}
