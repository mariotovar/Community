package com.mx.milla40.task.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mx.milla40.catalog.models.Group;
import com.mx.milla40.task.models.Meeting;

@Repository
public class ProjectRepository {
	
	public List<Group> getGroups(int pkProject) {
		List<Group> groups = new ArrayList<Group>();
		for(int i=0; i<10; i++){
			Group group = new Group();
			group.setPk(i);
			group.setName("MEMBER " + i);
			groups.add(group);
		}
		return groups;
	}
	
	public List<Meeting> getMeetings(int pkProject) {
		List<Meeting> meetings = new ArrayList<Meeting>();
		for(int i=0; i<10; i++){
			Meeting meeting = new Meeting();
			meeting.setPk(i);
			meeting.setName("MEMBER " + i);
			meetings.add(meeting);
		}
		return meetings;
	}
	
}
