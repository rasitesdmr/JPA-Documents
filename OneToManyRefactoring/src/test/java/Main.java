
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

        User user = new User("*******","********",new Date());

        Product product = new Product("*****",1000,5,new Date());
        product.setUser(user);
        Product product2 = new Product("*******",4466,8,new Date());
        product2.setUser(user);


        /*
          2 tane ürün için 5 tane SQL sorgusu çalıştırılmış .
          Artık 3 Tane SQL sorgusu çalışıyor
         */


        entityTransaction.begin();
        entityManager.persist(user);
        entityManager.persist(product);
        entityManager.persist(product2);
        entityTransaction.commit();
    }
}
