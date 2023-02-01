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

import com.example.entity.Laptop;

@RestController
public class LaptopController {
	private List<Laptop> laptops = new ArrayList<>();

	public LaptopController() {

		laptops.addAll(List.of(new Laptop(1, "HP"), new Laptop(2, "Dell"), new Laptop(3, "Samsung")));

		System.out.println("----All laptops are available-----");
	}

	@RequestMapping(value = "/laptops", method = RequestMethod.GET)
	Iterable<Laptop> getLaptop() {
		return laptops;
	}

	@GetMapping("/laptops/{comName}")
	Optional<Laptop> getCoffeeByName(@PathVariable String comName) {
		for (Laptop l : laptops) {
			if (l.getComName().equals(comName)) {
				return Optional.of(l);
			}
		}
		return Optional.empty();
	}

	@PostMapping("/laptops")
	Laptop postLaptop(@RequestBody Laptop l) {
		laptops.add(l);
		return l;
	}
}
