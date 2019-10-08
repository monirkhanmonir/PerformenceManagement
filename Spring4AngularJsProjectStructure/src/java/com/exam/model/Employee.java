package com.exam.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Employee {
        @Id
        @GeneratedValue
        int id;
	String name;
	String email;
	String phone;
	String gender;
	String jobTitle;
	String psd;
	String repsd;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getRepsd() {
		return repsd;
	}
	public void setRepsd(String repsd) {
		this.repsd = repsd;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", jobTitle="
				+ jobTitle + ", psd=" + psd + ", repsd=" + repsd + ", address=" + address + "]";
	}

	
	
	
}
