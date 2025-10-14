package com.shampoo.law.service.lamda;

import java.util.List;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -05 -21 -15:49
 */

public class Book {

    private String name;

    private List<String> authors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(String name, List<String> authors) {
        this.name = name;
        this.authors = authors;
    }
}
