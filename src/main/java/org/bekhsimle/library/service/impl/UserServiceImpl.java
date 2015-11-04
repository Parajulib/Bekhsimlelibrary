package org.bekhsimle.library.service.impl;

import java.util.List;

import org.bekhsimle.library.dao.UserDao;
import org.bekhsimle.library.domain.UserLogin;
import org.bekhsimle.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author BHARAT
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	public void saveUser(UserLogin user) {
		userDao.saveUser(user);
	}

	
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	
	public List<UserLogin> listAllUsers() {
		return userDao.listAllUsers();
	}

	
	public UserLogin getUserById(int id) {
		return userDao.getUserById(id);
	}

	
	public UserLogin getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	
	public UserLogin getUserByVerification(String code) {
		return userDao.getUserByVerification(code);
	}

	
	public void changePassword(UserLogin user) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode(user.getPassword());
		user.setPassword(password);
		user.setVerification("");
		userDao.saveUser(user);
	}

	

}
