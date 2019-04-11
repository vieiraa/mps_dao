package mps_dao;

public class Book {
    private int isbn;
    private String name;
    
    public Book() {
        
    }
    
    public Book(int i, String n) {
        setIsbn(i);
        setName(n);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return isbn + " " + name;
    }
}
