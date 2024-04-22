package onetomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_uni.dao.CompanyDao;
import onetomany_uni.dto.Company;
import onetomany_uni.dto.Employee;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(7);
		e1.setName("Rajesh");
		e1.setPhone(8459543656l);
		e1.setAddress("Katraj");
		
		Employee e2=new Employee();
		e2.setId(8);
		e2.setName("Vishal");
		e2.setPhone(9922601520l);
		e2.setAddress("Beed");
		
		Employee e3=new Employee();
		e3.setId(9);
		e3.setName("Suresh");
		e3.setPhone(8745698235l);
		e3.setAddress("Kolhapur");
		
		List<Employee>list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Company company=new Company();
		company.setId(103);
		company.setName("Tech-Mahindra");
		company.setLocation("Banglore");
		company.setList(list);
		
		CompanyDao dao=new CompanyDao();
		dao.saveCompany(company);
		//dao.deleteCompany(102);
		

		
	}

}
