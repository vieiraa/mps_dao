package mps_dao;

import java.util.List;

public interface BookDao<T> {
    List<T> getAll();
    T get(int i);
    void save(T item);
    void update(T item, String[] params);
    void delete(T item);
}
