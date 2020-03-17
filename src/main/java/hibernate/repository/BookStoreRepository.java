package hibernate.repository;

import hibernate.model.BookInStore;
import hibernate.model.BookStore;
import hibernate.model.HibernateUtil;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookStoreRepository {
    public void saveBookStore(BookStore bookStore) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(bookStore);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<BookInStore> SumOfBookInStore() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            String sql = "select SUM(S.number), S.id.bookId from BookStore as S group by S.id.bookId";
            Query query = session.createQuery(sql);
            List result = query.list();
            return result;
        }
    }

}
