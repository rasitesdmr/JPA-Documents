import Model.Address;
import Model.User;

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

        User user1 = new User("rasitesdemir","Raşit",new Date());
        Address address1 = new Address("Ptt evleri " , "yüreğir", "Adana" ,4865);
        user1.getAddresses().add(address1);
        user1.getAddresses().add(new Address("Lala hüseyin pasa" ,"Merkez" , "Kütahya",56));

    entityTransaction.begin();

    entityManager.persist(user1);

    entityTransaction.commit();
    }
}
