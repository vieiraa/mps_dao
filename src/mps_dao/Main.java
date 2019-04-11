package mps_dao;

public class Main {
    public static void main(String[] args) {
        BookDao<Book> dao = new BookDaoImpl();
        dao.save(new Book(0, "Ola"));
        dao.save(new Book(1, "Mundo"));
        
        System.out.println(dao.get(1));
    }
}
