package org.bekhsimle.library.service;

import java.util.List;

import org.bekhsimle.library.domain.UserLogin;

/**
 * @author BHARAT
 *
 */

public interface UserService {
	
	
	
	public void saveUser(UserLogin user);

	public void deleteUser(int id);

	public List<UserLogin> listAllUsers();

	public UserLogin getUserById(int id);

	public UserLogin getUserByUsername(String username);

	public UserLogin getUserByVerification(String code);

	public void changePassword(UserLogin user);

}
