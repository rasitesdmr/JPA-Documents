import Model.Personnel;

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

        Personnel personnel = new Personnel("---------","---------",new Date());
        personnel.getPhoneNumbers().put("CEP" ,"-----------");
        personnel.addPhoneNumber("EV","--------------");

        entityTransaction.begin();
        entityManager.persist(personnel);
        entityTransaction.commit();
    }
}
