/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lqv20
 */
public class Main {
   public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();

        // Thêm sách mới
        Book book1 = new Book(1, "Java Programming", "James Gosling", 499.99);
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch", 599.99);

        bookDAO.addBook(book1);
        bookDAO.addBook(book2);

        // In danh sách sách
        System.out.println("List of books:");
        for (Book book : bookDAO.getAllBooks()) {
            System.out.println(book);
        }
    } 
}
