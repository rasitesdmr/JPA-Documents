import Model.Department;
import Model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class MainFind {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Employee employee = new Employee("*******", "***********", new Date(), 20000);
        Department department = entityManager.find(Department.class, 1);
        employee.setDepartment(department);

        entityTransaction.begin();
        entityManager.persist(employee);
        entityTransaction.commit();
    }




}
