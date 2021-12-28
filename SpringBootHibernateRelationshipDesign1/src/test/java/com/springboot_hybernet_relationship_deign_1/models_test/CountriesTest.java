package com.springboot_hybernet_relationship_deign_1.models_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.springboot_hibernate_relationship_design_1.models.Countries;
import com.springboot_hibernate_relationship_design_1.models.Currencies;
import com.springboot_hibernate_relationship_design_1.models.Customers;
import com.springboot_hibernate_relationship_design_1.models.Products;
import com.springboot_hibernate_relationship_design_1.models.Regions;
import com.springboot_hibernate_relationship_design_1.models.Sales;
import com.springboot_hibernate_relationship_design_1.models.Stores;

public class CountriesTest {
	Countries country = new Countries();
	Currencies currency = new Currencies();
	Customers customer = new Customers();
	Products product = new Products();
	Regions region = new Regions();
	Sales sale = new Sales();
	Stores store = new Stores();
	
	@Test
	public void testCountries() {
		country.setName("India");
		assertEquals("India", "India");
	}
	
	@Test
	public void testCurrency() {
		currency.setName("Rupees");
		assertEquals("Rupees", "Rupees");
	}
	

	@Test
	public void testCustomer() {
		customer.setFirstName("Sudeb");
		customer.setLastName("Dolui");
		customer.setEmail("sudebd.in@mouritech.com");
		customer.setPhone(803443);
		assertEquals("", "");
	}
	
	
}
