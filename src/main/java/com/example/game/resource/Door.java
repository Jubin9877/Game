package com.example.game.resource;

public class Door {

	@Override
	public String toString() {
		return "Door [id=" + id + ", status=" + status + "]";
	}

	private Integer id;
	private String status="CLOSED";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
