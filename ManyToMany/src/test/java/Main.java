import Model.Student;
import Model.University;

import javax.persistence.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        University university = new University("***");
        University university2 = new University("****");
        University university3 = new University("*");

        Student student = new Student("******","*****",new Date());
        student.addUniversity(university);
        student.addUniversity(university2);

        Student student2 = new Student("****","******",new Date());
        student2.addUniversity(university);
        student2.addUniversity(university3);

        entityTransaction.begin();
        entityManager.persist(university);
        entityManager.persist(university2);
        entityManager.persist(university3);
        entityManager.persist(student);
        entityManager.persist(student2);
        entityTransaction.commit();

    }
}
