import Model.Personnel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Personnel personnel = new Personnel("Raşit", "Eşdemir", new Date());
        Personnel personnel2 = new Personnel("Ömer ", "Eşdemir", new Date());
        personnel2.addPhoneNumber("055328794");
        personnel2.addPhoneNumber("516489496");
        personnel.addPhoneNumber("0489865855");
        personnel.addPhoneNumber("5151686999");


        entityTransaction.begin();
        entityManager.persist(personnel);
        entityManager.persist(personnel2);
        entityTransaction.commit();
    }
}
