package com.june.simplesns.interfaces.dao;

/**
 * Created by wayne on 2016. 5. 21..
 */
public interface Dao<K, E> {
	void persist(E entity);

	void remove(E entity);

	E findById(K id);
}
