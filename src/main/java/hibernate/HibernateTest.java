package hibernate;

import hibernate.model.*;
import hibernate.repository.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class HibernateTest {
    public static void main(String[] args) throws ParseException {
        AuthorRepository authorRepository =new AuthorRepository();
        AddressRepository addressRepository = new AddressRepository();
        BookRepository bookRepository = new BookRepository();
        StoreRepository storeRepository = new StoreRepository();
        BookStoreRepository bookStoreRepository = new BookStoreRepository();

//        create author
//        Author author1 = new Author("Nguyen Nam Anh", new Address("Le Lai", "Quan 1", "HCM"));
//        authorRepository.saveAuthor(author1);
//
//        create book
//        String sDate="23/11/2019";
//        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
//        Book book1 = new Book("Ball", date, author1);
//        bookRepository.saveBook(book1);
//
//        create store
//        Store store = new Store("Kim Dong");
//        storeRepository.saveStore(store);
//        System.out.println(store.toString());
//
//        create book_store
//        BookStoreId bookStoreId = new BookStoreId(2, 9);
//        BookStore bookStore = new BookStore(bookStoreId, 20);
//        bookStoreRepository.saveBookStore(bookStore);
//        System.out.println(bookStore.toString());
//
//        edit author
//        Address address = new Address("Xa lo Ha Noi", "Quan 4", "HCM");
//        authorRepository.editAuthor(15, "Dung", address);
//        Author author = authorRepository.getAuthorById(15);
//        System.out.println(author.toString());
//
//        delete author
//        authorRepository.deleteAuthor(4);

        //get author by id
        Author authorById = authorRepository.getAuthorById(16);
        System.out.println("Get author by id");
        System.out.println(authorById.toString());

        //search author
        List<Author> authorListSearch = authorRepository.searchAuthor("Nam");
        System.out.println("Search author");
        authorListSearch.forEach(s -> System.out.println(s.toString()));

        //sum of book in stores
        List result = bookStoreRepository.SumOfBookInStore();
        result.forEach(s -> System.out.println(s));

    }
}
