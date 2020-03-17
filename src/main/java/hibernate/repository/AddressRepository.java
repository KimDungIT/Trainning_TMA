package hibernate.repository;

import hibernate.model.Address;
import hibernate.model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddressRepository {
    public void saveAddress(Address address) {
        Transaction transaction = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(address);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
