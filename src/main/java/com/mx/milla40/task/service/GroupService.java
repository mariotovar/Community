package com.mx.milla40.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.milla40.catalog.models.Member;
import com.mx.milla40.task.models.Activity;
import com.mx.milla40.task.repository.GroupRepository;

@Service
public class GroupService {

	@Autowired
	GroupRepository groupRepository;
	
	public List<Member> getMembers(int pkProject, int pkGroup) {
		return groupRepository.getMembers(pkProject, pkGroup);
	}
	
	public List<Activity> getActivities(int pkProject, int pkGroup) {
		return groupRepository.getActivities(pkProject, pkGroup);
	}

}
