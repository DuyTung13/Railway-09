package com.vti.entity;

public class Position {
	public int ID;
	public PositionName name;
	
	@Override
	public String toString() {
		return "Position " +ID+ "[ID=" + ID + ", name=" + name + "]";
	}
}


