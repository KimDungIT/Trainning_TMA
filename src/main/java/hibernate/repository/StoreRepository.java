package hibernate.repository;

import hibernate.model.HibernateUtil;
import hibernate.model.Store;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class StoreRepository {
    public void saveStore(Store store) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(store);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
