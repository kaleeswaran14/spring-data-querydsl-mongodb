package co.javatoday.springdata.mongodb.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

import co.javatoday.springdata.mongodb.domain.User;

/**
 * 
 * 
 * @author amkrtchyan
 */

@Transactional
public interface UserRepository extends MongoRepository<User , Serializable>, QueryDslPredicateExecutor<User> {

}
