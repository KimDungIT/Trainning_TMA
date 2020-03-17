package hibernate.repository;

import hibernate.model.Book;
import hibernate.model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookRepository {
    public void saveBook(Book book) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
