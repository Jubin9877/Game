package com.example.game.resource;

public class Game {

	private Integer id;
	private String state;
	private Door door1;
	private Door door2;
	private Door door3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Door getDoor1() {
		return door1;
	}

	public void setDoor1(Door door1) {
		this.door1 = door1;
	}

	public Door getDoor2() {
		return door2;
	}

	public void setDoor2(Door door2) {
		this.door2 = door2;
	}

	public Door getDoor3() {
		return door3;
	}

	public void setDoor3(Door door3) {
		this.door3 = door3;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", state=" + state + ", door1=" + door1 + ", door2=" + door2 + ", door3=" + door3
				+ "]";
	}
	
	

}
