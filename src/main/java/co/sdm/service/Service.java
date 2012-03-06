package co.sdm.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mysema.query.types.Predicate;

/**
 * 
 * 
 * @author amkrtchyan
 */

public interface Service<T> {

	public T save(T obj);

	public void delete(T obj);

	public Page<T> findAll(Predicate predicate, Pageable pagable);

	public Page<T> findAll(Pageable pagable);

	public Iterable<T> findAll(Predicate predicate);

	public List<T> findAll(Sort sort);

    public T findOne(Predicate predicate);
    
    public T findOne(String id);

}