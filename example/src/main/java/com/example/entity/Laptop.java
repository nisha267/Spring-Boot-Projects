package com.example.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Laptop {
	private int id;
	private String comName;

	public Laptop() {

	}

	public Laptop(int id, String comName) {
		this.id = id;
		this.comName = comName;
	}
}
