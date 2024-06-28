package org.jsp.customeraddress.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.customeraddress.CustomerAddressConfig;
import org.jsp.customeraddress.dao.AddressDao;
import org.jsp.customeraddress.dto.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AddressController {
	private static AddressDao addresssDao;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerAddressConfig.class);
		AddressDao addressDao = context.getBean("addressDao", AddressDao.class);
		System.out.println("1.Add address");
		System.out.println("2.Update an Address");
		System.out.println("3.Find Address By Id");
		System.out.println("4.Find Address By Customer Id");
		System.out.println("5.Find Address by Customer Phone and Password");
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Enter Customer Id, Housenumber, buildingname,city,state,country,landmark,pincode  to add an Address");
			int customer_id = sc.nextInt();
			Address add = new Address();
			add.setHousenumber(sc.nextInt());
			add.setBuilding_name(sc.next());
			add.setCity(sc.next());
			add.setCountry(sc.next());
			add.setLandmark(sc.next());
			add.setPincode(sc.nextInt());
			add.setState(sc.next());
			add = addressDao.saveAddress(add, customer_id);
			if (add != null)
				System.out.println("Your Address Id is:" + add.getId());
			else
				System.err.println("Address as Customer Id is Invalid");
			break;
		}
		case 2: {
			System.out.println("Enter  Id, Housenumber, buildingname,landmark,city,state,country,pincode  to add an Address");
			Address add = new Address();
			add.setBuilding_name(sc.next());
			add.setCity(sc.next());
			add.setCountry(sc.next());
			add.setHousenumber(sc.nextInt());
			add.setLandmark(sc.next());
			add.setPincode(sc.nextInt());
			add.setState(sc.next());
			add = addressDao.updateAddress(add);
			if (add != null)
				System.out.println(" Your Address Id " +add.getId() + " Updated");
			else
				System.err.println("cannot Update the address as Id is Invalid");
			break;
		}
		case 3: {
			System.out.println("Enter the Address Id to display details");
			Address add = addresssDao.findById(sc.nextInt());
			if (add != null) {
				System.out.println("Address Found");
				System.out.println(add);
			} else
				System.err.println("Cannot find Address as Id is Invalid");
			break;
		}
		case 4: {
			System.out.println("Enter the Customer Id to display Address");
			List<Address> add = addresssDao.findByCustomerId(sc.nextInt());
			if (add.isEmpty())
				System.err.println("No Address found for entered Customer Id");
			else
				for (Address addre : add) {
					System.out.println(addre);
					System.out.println("--------------------");
				}
			break;
		}
		case 5: {
			System.out.println("Enter the Customer Phone and password to display address");
			List<Address> add = addressDao.findByCustomer(sc.nextLong(), sc.next());
			if (add.isEmpty())
				System.err.println("No Address found for entered Customer");
			else
				for (Address addre : add) {
					System.out.println(addre);
					System.out.println("--------------------");
				}
			break;
		}
		default: {
			System.err.println("Invalid Choice");
		}
		}
		sc.close();
		((AnnotationConfigApplicationContext) context).close();
	}
}