
package db;

import java.util.List;

import business.Actor;

public interface DAO<T> {
	T get(int id);
	List<T> getAll();
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
	List<T> findbylname(String lname);
}
