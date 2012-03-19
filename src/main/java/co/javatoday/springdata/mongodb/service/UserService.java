package co.javatoday.springdata.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import co.javatoday.springdata.mongodb.domain.User;
import co.javatoday.springdata.mongodb.repository.UserRepository;

import com.mysema.query.types.Predicate;

/**
 * 
 * 
 * @author amkrtchyan
 */

@Service("userService")
public class UserService implements co.javatoday.springdata.mongodb.service.Service<User> {

	@Autowired
	UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(User obj) {
		userRepository.delete(obj);
	}

	@Override
	public Page<User> findAll(Predicate predicate, Pageable pagable) {
		return userRepository.findAll(predicate, pagable);
	}

	@Override
	public Page<User> findAll(Pageable pagable) {
		return userRepository.findAll(pagable);
	}

	@Override
	public Iterable<User> findAll(Predicate predicate) {
		return userRepository.findAll(predicate);
	}

	@Override
	public List<User> findAll(Sort sort) {
		return userRepository.findAll(sort);
	}

	@Override
	public User findOne(Predicate predicate) {
		return userRepository.findOne(predicate);
	}

	@Override
	public User findOne(String id) {
		return userRepository.findOne(id);
	}

}