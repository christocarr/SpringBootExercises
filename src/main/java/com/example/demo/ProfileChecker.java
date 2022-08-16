package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ProfileChecker {
	
	List<String> users = new ArrayList<>();
	List<String> passwords = new ArrayList<>();
	
	public ProfileChecker() {
		users.add("chrisc");
		passwords.add("password123");
	}
	
	public boolean getUserExist(Profile profile) {
		return users.contains(profile.getUserName());
	}

	public boolean getUserPassword(Profile profile) {
		return passwords.contains(profile.getPassword());
	}
	
}
