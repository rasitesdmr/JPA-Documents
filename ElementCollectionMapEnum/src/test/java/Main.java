import Model.Personnel;
import Model.phoneTypes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Personnel personnel = new Personnel("**********","**************",new Date());
        Personnel personnel2 = new Personnel("**********---","**************-----",new Date());
        personnel.getPhoneNumbers().put(phoneTypes.Cep,"----------------");
        personnel.addPhoneNumber(phoneTypes.Is,"------------");
        personnel2.getPhoneNumbers().put(phoneTypes.Ev,"----------------");

        entityTransaction.begin();
        entityManager.persist(personnel);
        entityManager.persist(personnel2);
        entityTransaction.commit();
    }
}
