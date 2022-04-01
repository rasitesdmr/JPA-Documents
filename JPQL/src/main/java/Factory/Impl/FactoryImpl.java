package Factory.Impl;

import Factory.Factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FactoryImpl implements Factory {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public EntityManager getEntityManager() {
         Persistence.createEntityManagerFactory("persistence-unit");
         this.entityManager  = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    @Override
    public EntityTransaction getTransaction() {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        return entityTransaction;
    }
}
