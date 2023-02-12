package com.example.jpabasic;

import com.example.jpabasic.Order.Order;

import javax.persistence.*;

public class JpaBasicMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-basic");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        try {
            Order order = new Order();


        } catch (Exception e) {
            transaction.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
