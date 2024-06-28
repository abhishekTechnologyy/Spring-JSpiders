package org.jsp.hibernatetemplatedemo.controller;

import java.util.Scanner;

import org.jsp.hibernatetemplatedemo.dao.AdminDao;
import org.jsp.hibernatetemplatedemo.dto.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminController {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminDao adminDao = context.getBean(AdminDao.class);
		System.out.println("1.Save Merchant");
		System.out.println("2.Update merchant");
		System.out.println("3.Find By id");
		System.out.println("4.delete Admin");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {

		case 1: {
			System.out.println("Enter the name,phone,email and password to register");
			Admin admin = new Admin();
			admin.setName(sc.next());
			admin.setPhone(sc.nextLong());
			admin.setEmail(sc.next());
			admin.setPassword(sc.next());
			admin = adminDao.saveAdmin(admin);
			System.out.println("admin saved with Id:" + admin.getId());
			break;
		}
		case 2: {
			System.out.println("Enter  the id, name,phone,email and password to register");
			Admin admin = new Admin();
			admin.setId(sc.nextInt());
			admin.setName(sc.next());
			admin.setPhone(sc.nextLong());
			admin.setEmail(sc.next());
			admin.setPassword(sc.next());
			admin = adminDao.updateAdmin(admin);
			if (admin != null)
				System.out.println("admin with Id:" + admin.getId() + " Updated");
			else
				System.err.println("cannot Update Admin as Id is Invalid");
			break;
		}
		case 3: {
			System.out.println("Enter the Admin Id to display details");
			Admin admin = adminDao.findById(sc.nextInt());
			if (admin != null)
				System.out.println(admin);
			else
				System.err.println("Invalid Admin Id");
			break;
		}
		case 4: {
			System.out.println("Enter the Admin Id to delete the record");
			boolean deleted = adminDao.delete(sc.nextInt());
			if (deleted)
				System.out.println("Admin with entered Id deleted");
			else
				System.err.println("Cannot delete admin as id is Invalid");
			break;
		}

		default: {
			System.err.println("Invalid Choice");
		}
		}
		sc.close();
		((ClassPathXmlApplicationContext) context).close();
	}
}
