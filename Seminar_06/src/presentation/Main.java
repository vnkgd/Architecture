package HomeWork_06.src.presentation;

import HomeWork_06.src.data.InMemoryBookRepository;
import HomeWork_06.src.domain.Book;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        InMemoryBookRepository bookStore = new InMemoryBookRepository();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        Book book3 = new Book("3", "Война и Мир", "Лев Толстой", 45.55);
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);

        // Удаляем книгу из списка магазина
        bookStore.removeBook(book3);

        // Получаем список всех книг в магазине
        List<Book> allBooks = bookStore.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}