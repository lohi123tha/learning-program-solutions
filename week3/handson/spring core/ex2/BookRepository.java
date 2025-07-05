package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public String getBookData() {
        return "Book data retrieved from the repository.";
    }
}
