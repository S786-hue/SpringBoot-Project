package com.blogapp.entity;


import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String trainName;
	
	@ManyToMany
	@JoinTable(
			name="Train_Station",
			joinColumns=@JoinColumn(name="train_id"),
			inverseJoinColumns=@JoinColumn(name ="station_id")
			)
	private List<Station>stations=new ArrayList<>();
	
	
	
	public List<Station> getStations() {
		return stations;
	}
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	

}
