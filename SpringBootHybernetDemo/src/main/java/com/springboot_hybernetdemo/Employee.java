package com.springboot_hybernetdemo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee extends AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8725583113720932959L;
	// @Id // this filed will be primary key
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	@Column(name = "EMP_NAME")
	private String name;
	@Column(name = "EMP_ADDRESS", nullable = true, length = 50)
	private String address;
	private String phone;

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(address, eid, name, phone, pid);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(eid, other.eid)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
				&& Objects.equals(pid, other.pid);
	}

}
