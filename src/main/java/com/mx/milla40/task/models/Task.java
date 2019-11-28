package com.mx.milla40.task.models;

public class Task {
	
	private int pk;	
	private String name;	
	
	public int getPk() {
		return pk;
	}
	
	public void setPk(int pk) {
		this.pk = pk;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
    public boolean equals(Object o) { 
        if (o == this) { 
            return true; 
        } 
        if (o instanceof Task) { 
            if (((Task) o).getPk() == this.getPk()) { 
                return true; 
            }
        } 
        return false;
    }
	
}
