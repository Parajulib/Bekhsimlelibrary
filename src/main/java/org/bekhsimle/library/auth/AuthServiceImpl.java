package org.bekhsimle.library.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.bekhsimle.library.dao.UserDao;
import org.bekhsimle.library.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

	@Service
	@Transactional
	public class AuthServiceImpl implements UserDetailsService {

		@Autowired
		UserDao userDao;

		@Override
		public UserDetails loadUserByUsername(String username)
				throws UsernameNotFoundException {

			UserLogin user = userDao.getUserByUsername(username);

			Collection<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
			authorities.add(new SimpleGrantedAuthority("ROLE_ANY"));

			user.setAuthorities(authorities);
			return user;

		}

}
