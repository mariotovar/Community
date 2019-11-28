package com.mx.milla40.task.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mx.milla40.catalog.models.Member;
import com.mx.milla40.task.models.Activity;

@Repository
public class GroupRepository {
	
	public List<Member> getMembers(int pkProject, int pkGroup) {
		List<Member> members = new ArrayList<Member>();
		for(int i=0; i<10; i++){
			Member member = new Member();
			member.setPk(i);
			member.setName("MEMBER " + i);
			members.add(member);
		}
		return members;
	}
	
	public List<Activity> getActivities(int pkProject, int pkGroup) {
		List<Activity> activities = new ArrayList<Activity>();
		for(int i=0; i<10; i++){
			Activity activity = new Activity();
			activity.setPk(i);
			activity.setName("ACTIVITY " + i);
			activities.add(activity);
		}
		return activities;
	}

}
