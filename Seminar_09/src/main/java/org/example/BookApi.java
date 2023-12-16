package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class BookApi {

    private List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(BookApi.class, args);
    }

    @PostMapping
    //  добавить новую книгу

    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @GetMapping
    // получить список всех книг

    public List<Book> getAllBooks() {
        return books;
    }

    @GetMapping("/{id}")
    // получить информацию о конкретной книге по ID

    public Book getBookById(@PathVariable("id") int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    // обновить информацию о книге

    public Book updateBook(@PathVariable("id") int id, @RequestBody Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == id) {
                books.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    // удалить книгу
    
    public Book deleteBook(@PathVariable("id") int id) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == id) {
                books.remove(i);
                return book;
            }
        }
        return null;
    }
}