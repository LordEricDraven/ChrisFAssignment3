package com.coderscampus.Assignment3;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		UserService userService = new UserService();
		User[] users = userService.createUser();
		userService.userInput(users);
	}
	
	
	
}
