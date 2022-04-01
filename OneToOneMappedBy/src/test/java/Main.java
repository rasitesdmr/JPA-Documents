import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Customer customer = new Customer("*********", "**********", new Date());
        Address address = new Address("*******", "*******", 10);
        customer.setAddress(address);

        Customer customer2 = new Customer("******","************",new Date());
        Address address2 = new Address("*******","**********",12);
        customer2.setAddress(address2);

        entityTransaction.begin();
        entityManager.persist(customer);
        entityManager.persist(address);
        entityManager.persist(customer2);
        entityManager.persist(address2);
        entityTransaction.commit();
    }
}
