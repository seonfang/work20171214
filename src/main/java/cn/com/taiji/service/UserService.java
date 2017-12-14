package cn.com.taiji.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import cn.com.taiji.entity.UserDoc;
import cn.com.taiji.reposit.UserRepository;

public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MongoTemplate mongoTemplate;

	public void MongoService() {
		// TODO
	}

	public void saveUser(UserDoc user) {
		userRepository.save(user);
	}

	public UserDoc findUserByName(String username) {
		return userRepository.findByUsername(username);
	}
}
