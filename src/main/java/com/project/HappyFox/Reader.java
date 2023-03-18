package com.project.HappyFox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reader {

	public Properties p;

	public Reader() throws IOException {

		File f = new File(
				"C:\\Users\\Cynthia\\eclipse-workspace\\Happy Fox\\HappyFox\\src\\main\\java\\com\\project\\HappyFox\\Happy.properties");

		FileInputStream fi = new FileInputStream(f);

		p = new Properties();

		p.load(fi);
	}

	public String getUsername() {

		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {

		String password = p.getProperty("password");
		return password;
	}

	public String getStatusname() {

		String statusname = p.getProperty("statusname");
		return statusname;
	}

	public String getDescription() {

		String description = p.getProperty("description");
		return description;
	}

	public String getSubject() {

		String subject = p.getProperty("subject");
		return subject;
	}

	public String getText() {

		String text = p.getProperty("text");
		return text;
	}

	public String getCustomer() {

		String customer = p.getProperty("customer");
		return customer;
	}

	public String getMail() {

		String mail = p.getProperty("mail");
		return mail;
	}

	public String getPhone() {

		String phone = p.getProperty("phone");
		return phone;
	}

	public String getPriorityname() {

		String priorityname = p.getProperty("priorityname");
		return priorityname;
	}

	public String getPrioritydes() {

		String prioritydes = p.getProperty("prioritydes");
		return prioritydes;
	}

}
