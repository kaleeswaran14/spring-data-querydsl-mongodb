package co.sdm.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

import co.sdm.domain.User;

/**
 * 
 * 
 * @author amkrtchyan
 */

@Transactional
public interface UserRepository extends MongoRepository<User , Serializable>, QueryDslPredicateExecutor<User> {

}
