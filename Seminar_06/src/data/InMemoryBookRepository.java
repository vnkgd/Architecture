package HomeWork_06.src.data;

import HomeWork_06.src.domain.Book;
import java.util.ArrayList;
import java.util.List;

/*
 * Класс InMemoryBookRepository реализует интерфейс BookRepository, используя коллекции для хранения данных о книгах.
 */

public class InMemoryBookRepository implements BookRepository {
    private List<Book> books;

    public InMemoryBookRepository() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}