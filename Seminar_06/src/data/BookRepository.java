package HomeWork_06.src.data;

import HomeWork_06.src.domain.Book;
import java.util.List;

/*
 * Интерфейс BookRepository, определяющий методы для управления книгами в интернет-магазине.
 */

public interface BookRepository {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> getAllBooks();
}