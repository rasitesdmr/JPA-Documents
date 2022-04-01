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
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Personnel personnel = new Personnel("*******","******",new Date());
        personnel.addEmail("*****@gmail.com");
        personnel.addPhoneNumber(phoneTypes.Cep,"*************");

        Personnel personnel2 = new Personnel("********","*********",new Date());
        personnel2.addEmail("*********@gmail.com");
        personnel2.addEmail("*******@gmail.com");
        personnel2.addPhoneNumber(phoneTypes.Is,"**********");

        entityTransaction.begin();
        entityManager.persist(personnel);
        entityManager.persist(personnel2);
        entityTransaction.commit();
    }
}
