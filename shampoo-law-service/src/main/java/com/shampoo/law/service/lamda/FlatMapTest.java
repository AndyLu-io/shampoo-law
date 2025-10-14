package com.shampoo.law.service.lamda;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -05 -21 -15:40
 */
public class FlatMapTest {

    @Test
    public void test() {
        List<Book> books = Arrays.asList(
                new Book("Book1", Arrays.asList("Author1", "Author2")),
                new Book("Book2", Arrays.asList("Author3", "Author4"))
        );

        List<String> authors = books.stream()
                .flatMap(book -> book.getAuthors().stream()).collect(Collectors.toList());
        System.out.println(authors);
    }

    @Test
    public void test2() {
        Boolean isExecute = null;
        if (Boolean.TRUE.equals(isExecute)) {
            System.out.println(11);
        } else {
            System.out.println(22);
        }
    }

    @Test
    public void test3() {
        List<Book> books = Arrays.asList(
                new Book("Book1222", Arrays.asList("Author1", "Author2")),
                new Book("Book2", Arrays.asList("Author3", "Author4"))
        );
        Book book = Optional.ofNullable(books).flatMap(bookList -> bookList.stream().findFirst()).orElseGet(() -> new Book("Book3", Arrays.asList("Author5", "Author6")));
        System.out.println(book);
    }

    @Test
    public void test4() {
        String[] numbers = {
                "8635412036MD1000524",
                "8635412036MD1000309",
                "8635412036MD1000469",
                "8635412036MD1000470",
                "8635412036MD1000441",
                "8635412041MD1000467",
                "8635412036MD1000847",
                "8635412036MD1000845",
                "8635412036MD1000821",
                "8635412036MD1000823",
                "8635412036MD1000760",
                "8635412036MD1000765",
                "8635412036MD1000837",
                "8635412036MD1000783",
                "8635412036MD1000637",
                "8635412036MD1000707",
                "8635412036MD1000777",
                "8635412036MD1000599",
                "8635412036MD1000835",
                "8635412036MD1000762",
                "8635412036MD1000722",
                "8635412036MD1000838",
                "8635412036MD1000843",
                "8635412041MD1000571",
                "8635412036MD1000280",
                "8635412036MD1000309",
                "8635412036MD1000469",
                "8635412036MD1000470",
                "8635412036MD1000441",
                "8635412041MD1000467",
                "8635412036MD1000847",
                "8635412036MD1000845",
                "8635412036MD1000821",
                "8635412041MD1000642",
                "8635412036MD1000760",
                "8635412036MD1000765",
                "8635412036MD1000837",
                "8635412036MD1000783",
                "8635412036MD1000637",
                "8635412036MD1000707",
                "8635412036MD1000777",
                "8635412036MD1000599",
                "8635412036MD1000835",
                "8635412036MD1000762",
                "8635412036MD1000722",
                "8635412036MD1000838",
                "8635412036MD1000843",
                "8635412041MD1000477"
        };

        Set<String> uniqueNumbers = new HashSet<>();
        Set<String> duplicateNumbers = new HashSet<>();

        for (String number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        System.out.println("重复单号: " + duplicateNumbers);

    }


}
