package rw.gov.minecofin.repository;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rw.gov.minecofin.model.Student;

import java.util.List;

@Repository
public class StudentRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
    }

    @Transactional
    public Student findById(Long id) {
        return sessionFactory.getCurrentSession().get(Student.class, id);
    }

    @Transactional
    public List<Student> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Student", Student.class).list();
    }

    @Transactional
    public void delete(Student student) {
        sessionFactory.getCurrentSession().delete(student);
    }
}
