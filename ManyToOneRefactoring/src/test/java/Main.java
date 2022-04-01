import Model.Department;
import Model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Department department = new Department("*****",10000,200000);
        Department department2 = new Department("*********",1235,45484);

        entityTransaction.begin();
        entityManager.persist(department);
        entityManager.persist(department2);
        entityTransaction.commit();
    }
}
