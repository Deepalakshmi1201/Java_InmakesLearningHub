package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Car")
public class Car implements Serializable{
	
	@Id
	@GenericGenerator(name = "ref" , strategy="increment")
	@GeneratedValue(generator = "ref")
	@Column
	private int Car_ID ;
	private String Carname;
	private String Color;
	public Car() {
		
	}
	public int getCar_ID() {
		return Car_ID;
	}
	public void setCar_ID(int car_ID) {
		Car_ID = car_ID;
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public String getColor() {
		return Color;
	}
	/**
	 * @param color
	 */
	public void setColor(String color) {
		Color = color;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Showroom_car",
	joinColumns = {@JoinColumn(name = "Car_ID")},
	inverseJoinColumns = {@JoinColumn(name = "Showroom_ID")})
	private List<ShowRoom> showroom = new ArrayList<ShowRoom>();
	
	
	public List<ShowRoom> getShowroom() {
		return showroom;
	}
	public void setShowroom(List<ShowRoom> showroom) {
		this.showroom = showroom;
	}
	
	
}
