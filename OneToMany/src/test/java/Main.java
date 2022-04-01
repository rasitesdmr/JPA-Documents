import Model.Product;
import Model.User;

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

        User user = new User("*******","********",new Date());
        Product product = new Product("*****",1000,5,new Date());
        Product product2 = new Product("*******",4466,8,new Date());
        List<Product>products = Arrays.asList(product,product2);
        user.setProducts(products);

        entityTransaction.begin();
        entityManager.persist(user);
        entityTransaction.commit();
    }
}
