/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lqv20
 */
import java.util.List;

public interface BookDAO {
    void addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int id);
    void updateBook(Book book);
    void deleteBook(int id);
}

