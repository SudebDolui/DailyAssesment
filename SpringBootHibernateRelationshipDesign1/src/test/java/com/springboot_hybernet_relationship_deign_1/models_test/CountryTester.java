package com.springboot_hybernet_relationship_deign_1.models_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.springboot_hibernate_relationship_design_1.models.Countries;
import com.springboot_hibernate_relationship_design_1.repository.CountriesRepository;
//import com.springboot_hibernate_relationship_design_1.restcontroller.CountriesRestController;

public class CountryTester {
	@Autowired
//	private CountriesRestController cntryTester = new CountriesRestController();
	private CountriesRepository cntryTester;
	
	@Test
	public void test1() {
		assertEquals("Check", "Check");
	}
	
	@Test
	public void cntrySaveTest() {
		Countries country = new Countries();
		country.setName("India");
		System.out.println(country);
		assertEquals("India", country.getName());
	}
	
	
}
