package hibernate.repository;


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

    public void editAuthor(Author author) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(author);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteAuthor(int id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(new Author(4, null));
            transaction.commit();
        } catch (Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Author> getAuthorById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Author where author_id = :id");
            query.setParameter("id", id);
            return query.list();
        }
    }

//    public List<Author> searchAuthor(String text) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query query = session.createSQLQuery("from Author where author_name like :text");
//            query.setParameter("text", "%" + text + "%");
//            return query.list();
//        }
//    }
}
