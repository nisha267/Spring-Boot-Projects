package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Coffee;

@RestController
public class CoffeeController {

	private List<Coffee> coffees = new ArrayList<>();

	public CoffeeController() {

		coffees.addAll(List.of(new Coffee("NesCoffee"), new Coffee("Bru"), new Coffee("Dimhorton"),
				new Coffee("Nestle"), new Coffee("Starbuck")

		));
		System.out.println("--------------------all coffee are ready-----------------");

	}

	@RequestMapping(value = "/coffees", method = RequestMethod.GET)
	// @GetMapping("/coffees")
	Iterable<Coffee> getCoffees() {
		System.out.println("----------get all coffee running--------------");
		return coffees;
	}

	@GetMapping("/coffees/{id}")
	Optional<Coffee> getCoffeeById(@PathVariable String id) {
		System.out.println("----------get one coffee running--------------");
		for (Coffee c : coffees) {
			if (c.getId().equals(id)) {
				return Optional.of(c);
			}
		}
		return Optional.empty();
	}

	@PostMapping("/coffees")
	Coffee postCoffee(@RequestBody Coffee coffee) {
		coffees.add(coffee);
		System.out.println("----------new  coffee added--------------");
		return coffee;

	}

}
