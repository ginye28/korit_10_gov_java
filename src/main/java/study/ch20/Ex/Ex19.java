package study.ch20.Ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;

//    Book(String isbn, String title, String author, int price) {
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }

//    int isbn, price; String title, author;
//    Book(int isbn, String title, String author, int price) {
//        this.isbn = isbn; this.title = title; this.author = author; this.price = price;
//    }
}

interface Library {
    void addBook(Book b);
    Book findByIsbn(String isbn);
    List<Book> findByAuthor(String author);
    List<Book> findByPriceRange(int min, int max);
    void printAll();
}

class LibraryImpl implements Library {          //추상메서드 ctrl + i
    private Map<String, Book> bookMap;

    public LibraryImpl() {          //초기화는 여기서
        bookMap = new HashMap<>();
    }

    @Override
    public void addBook(Book b) {
        bookMap.put(b.getIsbn(), b);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getAuthor().equals(author)) foundBooks.add(book);      //책 저자가 찾고 있는 저자랑 같으면 foundbooks에 add
        }

        return foundBooks;
    }

    @Override
    public List<Book> findByPriceRange(int min, int max) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getPrice() >= min && book.getPrice() <= max) foundBooks.add(book);
        }
        return foundBooks;
    }

    @Override
    public void printAll() {
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }
    }
}

public class Ex19 {
    public static void main(String[] args) {

        // 등록: 978-1("자바의 정석", "남궁성", 35000),
        //       978-2("스프링 입문", "김영한", 32000),
        //       978-3("이펙티브 자바", "조슈아", 36000)
        // 저자 "남궁성" 검색: [자바의 정석]
        // 가격 33000~36000: [자바의 정석, 이펙티브 자바]

        String searchAuthor = "남궁성";
        Library library = new LibraryImpl();
        library.addBook(new Book("978-1","자바의 정석", "남궁성", 35000));
        library.addBook(new Book("978-2","스프링 입문", "김영한", 32000));
        library.addBook(new Book("978-3","이펙티브 자바1", "조슈아", 36000));
        library.addBook(new Book("978-4","이펙티브 자바2", "남궁성", 35000));
        library.addBook(new Book("978-5","이펙티브 자바3", "김영한", 32000));
        library.addBook(new Book("978-6","이펙티브 자바4", "조슈아", 36000));
        library.addBook(new Book("978-6","이펙티브 자바5", "김영한", 36000));

        Book foundBook = library.findByIsbn("978-2");
        System.out.println(foundBook);
        library.findByAuthor(searchAuthor).forEach(System.out::println);
        System.out.println(library.findByPriceRange(35000, 36000));
        library.printAll();
//        List<Book> books = List.of(
//                new Book(978-1, "자바의 정석", "남궁성", 35000),
//                new Book(978-2, "스프링 입문", "김영한", 32000),
//                new Book(978-3, "이펙티브 자바", "조슈아", 36000)
//        );
//
//        Map<String, Book> book = Map.of(
//                978-1, new ArrayList<>(),
//                978-2, new ArrayList<>(),
//                978-3, new ArrayList<>()
//        );



    }
}
