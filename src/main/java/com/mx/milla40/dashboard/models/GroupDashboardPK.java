package com.mx.milla40.dashboard.models;

public class GroupDashboardPK extends DashboardPK {

	private int pkGroup;

	public GroupDashboardPK(int pkProject, int pkGroup){
		this.pkProject = pkProject;
		this.pkGroup = pkGroup;
	}
	
	public int getPkGroup() {
		return pkGroup;
	}

	public void setPkGroup(int pkGroup) {
		this.pkGroup = pkGroup;
	}
	
}
