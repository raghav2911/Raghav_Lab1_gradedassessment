package com.greatlearning.labassignment.service;

import java.util.Random;

import com.greatlearning.labassignment.model.Employee;

public class CredentialService {
	
public char[] generatePassword() {
	String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower = "abcdefghijklmnopqrstuvwxyz";
	String number = "1234567890";
	String special = "!@#$%^&*()_+";
	String bigString = cap+lower+number+special;
	Random random = new Random();
	char [] password = new char [8];
	for ( int i= 0; i <8; i++) {
		password [i]= bigString.charAt(random.nextInt(bigString.length()));
	}
	return password;
	
	
	
			
		
}
public String generateEmailAddress (String firstName, String lastName, String Department) {
	return firstName+ lastName + "@"+ Department+".gl.com" ;
	

}
	
public void showCredentials(Employee Emp, String email, char[] password) {
	System.out.println("Dear"+ Emp.getFirstName()+ "your generated credentials are as follow");
	System.out.println("Email:"+email);
	System.out.println("Password:"+password);
	
}

}
