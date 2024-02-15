package com.concordia.springcrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {

    // define fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="book_name")
    private String bookName;

    @Column(name="author_name")
    private String authorName;

    @Column(name="isbn")
    private String isbn;

    @Column(name="availability")
    private String availability;


    // define constructors

    public Book() {

    }

    public Book(int id, String bookName, String authorName, String isbn, String availability) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
        this.availability = availability;
    }

    public Book(String bookName, String authorName, String isbn, String availability) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
        this.availability = availability;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // define to string

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }

}
