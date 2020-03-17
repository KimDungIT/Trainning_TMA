package hibernate.repository;


import hibernate.model.Address;
import hibernate.model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.model.Author;
import org.hibernate.query.Query;

import java.util.List;

public class AuthorRepository {
    public void saveAuthor(Author author) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //start transaction
            transaction = session.beginTransaction();
            //save Author object
            session.save(author);
            //commit transaction
            transaction.commit();
        } catch (Exception e) {
            if(transaction !=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Author>getAuthors() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Author", Author.class).list();
        }
    }

    public void editAuthor(int id, String name, Address address) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            String sql = "update Author set author_name = :name where author_id = :id";
//            Query query = session.createQuery(sql);
//            query.setParameter("name", name);
//            query.setParameter("id", id);
//
//            transaction = session.beginTransaction();
//            session.update(author);
//            transaction.commit();
//        }
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Author author = new Author();
            author.setId(id);
            author.setName(name);
            author.setAddress(address);
            session.beginTransaction();
            session.update(author);
            session.getTransaction().commit();
            session.close();
        }

    }

    public void deleteAuthor(int id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(new Author(id, null));
            transaction.commit();
        } catch (Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Author getAuthorById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query query = session.createQuery("from Author where author_id = :id");
//            query.setParameter("id", id);
//            return query.list();
            Author author = session.get(Author.class, id);
            return author;
        }
    }

    public List<Author> searchAuthor(String text) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            final Query query = session.createQuery("from Author where name like :text");
            query.setParameter("text", '%' + text + '%');
            return query.list();
        }
    }
}
