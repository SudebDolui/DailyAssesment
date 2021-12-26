package com.springboot_hybernet_one_to_one.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6471796256922339875L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	private String name, address, phone;
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, eid, laptop, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(eid, other.eid)
				&& Objects.equals(laptop, other.laptop) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}

}
