package com.mx.milla40.dashboard.models;

import java.util.Map;

import com.mx.milla40.catalog.models.Member;
import com.mx.milla40.task.models.State;
import com.mx.milla40.task.models.Task;

public class Dashboard {
	
	private Member member;
	private Map<? extends Task, State> tasksState;

	public Member getMember() {
		return member;
	}
	
	public void setMember(Member member) {
		this.member = member;
	}

	public Map<? extends Task, State> getTasksState() {
		return tasksState;
	}

	public void setTasksState(Map<? extends Task, State> tasksState) {
		this.tasksState = tasksState;
	}

	@Override
	public String toString() {
		return "MemberTasksState [member=" + member + ", tasksState=" + tasksState + "]";
	}
	
}
