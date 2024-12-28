/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lqv20
 */
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookById(int id) {
        return books.stream()
                    .filter(book -> book.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    @Override
    public void updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                books.set(i, book);
                System.out.println("Book updated: " + book);
                return;
            }
        }
        System.out.println("Book not found with ID: " + book.getId());
    }

    @Override
    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book removed with ID: " + id);
    }
}
