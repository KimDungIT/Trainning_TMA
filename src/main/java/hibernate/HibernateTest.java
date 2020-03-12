package hibernate;

import hibernate.model.Author;
import hibernate.repository.AuthorRepository;

import java.util.List;

public class HibernateTest {
    public static void main(String[] args) {
        AuthorRepository authorRepository =new AuthorRepository();

        //create author
//        Author author1 = new Author("Nguyen Nam Anh");
//        authorRepository.saveAuthor(author1);
//        Author author2 = new Author("Nam Cao");
//        authorRepository.saveAuthor(author2);
//        Author author3 = new Author("Ngo Tat To");
//        authorRepository.saveAuthor(author3);
//        Author author4 = new Author("Nguyen Nhat Anh");
//        authorRepository.saveAuthor(author4);
//        Author author5 = new Author("Ho Xuan Huong");
//        authorRepository.saveAuthor(author5);

        //get list author
//        List<Author> authorList = authorRepository.getAuthors();
//        authorList.forEach(s -> System.out.println("Author: " + s.getId() + " " + s.getName()));

        //edit author
       // authorRepository.editAuthor(new Author(2, "Nam Hoang"));

        //delete author
       // authorRepository.deleteAuthor(4);

        //get author by id
        List<Author> authorListById = authorRepository.getAuthorById(3);
        authorListById.forEach(s -> System.out.println("Author: " + s.getId() + " " + s.getName()));

        //get list author after edit
        List<Author> authorListEdit = authorRepository.getAuthors();
        authorListEdit.forEach(s -> System.out.println("Author: " + s.getId() + " " + s.getName()));

        //search author
//        List<Author> authorListSearch = authorRepository.searchAuthor("Nguyen");
//        authorListSearch.forEach(s -> System.out.println("Author: " + s.getId() + " " + s.getName()));

    }
}
