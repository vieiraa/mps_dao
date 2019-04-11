package mps_dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BookDaoImpl implements BookDao<Book> {
    List<Book> books;
    
    public BookDaoImpl() {
        books = new ArrayList<Book>();
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book get(int i) throws NoSuchElementException {
        return books.stream().filter(b -> b.getIsbn() == i).findFirst().get();
    }

    @Override
    public void save(Book item) {
        books.add(item);
    }

    @Override
    public void delete(Book item) {
        books.remove(item);
    }

    @Override
    public void update(Book item, String[] params) {
        
    }
    
}
