package com.blogapp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Station {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String stationName;
	
	@ManyToMany(mappedBy="stations")
	private List<Train>trains=new ArrayList<>();
	
	
	public List<Train> getTrains() {
		return trains;
	}
	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	

}
