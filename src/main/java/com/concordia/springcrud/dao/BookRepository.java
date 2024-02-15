package com.concordia.springcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.concordia.springcrud.entity.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // add a method to sort by author name
    public List<Book> findAllByOrderByAuthorNameAsc();

}
