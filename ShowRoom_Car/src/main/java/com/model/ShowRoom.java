package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ShowRoom")
public class ShowRoom implements Serializable{

	@Id
	@GenericGenerator(name = "ref" , strategy="increment")
	@GeneratedValue(generator = "ref")
	@Column
	private int Showroom_ID;
	private String Location;
	private String Manager;
	
	
	public ShowRoom() {
		System.out.println();
	}
	public int getShowroom_ID() {
		return Showroom_ID;
	}
	public void setShowroom_ID(int showroom_ID) {
		Showroom_ID = showroom_ID;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	
	@ManyToMany( cascade = CascadeType.ALL)
	@JoinTable(name="Showroom_car",
	joinColumns = {@JoinColumn(name = "Showroom_ID")},
	inverseJoinColumns = {@JoinColumn(name = "Car_ID")})
	private List<Car> car = new ArrayList<Car>();

	
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	
}
