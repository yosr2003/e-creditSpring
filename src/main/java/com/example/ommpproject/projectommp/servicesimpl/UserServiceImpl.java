package com.example.ommpproject.projectommp.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ommpproject.projectommp.models.User;
import com.example.ommpproject.projectommp.repositories.UserRepositiry;
import com.example.ommpproject.projectommp.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepositiry UserRepository;

//	@Override
//	public User addUser(User p) {
//		// TODO Auto-generated method stub
//		return UserRepository.save(p);
//	}

	@Override
	public User editUser(User p) {
		// TODO Auto-generated method stub
		return UserRepository.save(p);
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		 Optional<User> user=UserRepository.findById(id);
		 return user.isPresent() ? user.get(): null;
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		UserRepository.deleteById(id);
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}
	
//	@Override
//	public List<User> getListByport(Long id) {
//		// TODO Auto-generated method stub
//		return UserRepository.findList(id);
//	}



}
