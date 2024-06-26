package com.example.ommpproject.projectommp.services;

import java.util.List;

import com.example.ommpproject.projectommp.models.User;

public interface UserService {

//	public User addUser(User p);
	
//	public List<User> getListByport(Long id);

	public User editUser(User p);

	public User getUserById(Long id);

	public void deleteUserById(Long id);

	public List<User> getAllUsers();
}

