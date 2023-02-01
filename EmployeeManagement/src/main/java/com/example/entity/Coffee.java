package com.example.entity;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coffee {

	private String id;

	private String name;

	public Coffee() {

	}

	public Coffee(String name) {

		this(UUID.randomUUID().toString(), name);
	}

	public Coffee(String id, String name) {

		this.id = id;
		this.name = name;
	}

}
