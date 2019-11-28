package com.mx.milla40.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.milla40.catalog.models.Group;
import com.mx.milla40.task.models.Meeting;
import com.mx.milla40.task.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	public List<Group> getGroups(int pkProject) {
		return projectRepository.getGroups(pkProject);
	}
	
	public List<Meeting> getMeetings(int pkProject) {
		return projectRepository.getMeetings(pkProject);
	}
	
}
