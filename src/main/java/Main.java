import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();
        User u = new User();
        u.setFirstName("f1");
        u.setLastName("l1");
        u.setAge(20);

        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();



        Weapon w = new Weapon();
        w.setName("Sword of power");
        w.setDamage(7);
        w.setType("Sword");

        em.getTransaction().begin();
        em.persist(w);
        em.getTransaction().commit();

    }
}
