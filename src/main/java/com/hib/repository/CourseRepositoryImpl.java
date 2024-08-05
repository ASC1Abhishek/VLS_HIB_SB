package com.hib.repository;

import com.hib.entity.CourseEntity;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


public abstract class CourseRepositoryImpl implements CourseRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CourseEntity> findCoursesByAuthorName(String authorName) {
        String jpql = "SELECT c FROM CourseEntity c WHERE c.authorName = :authorName";
        TypedQuery<CourseEntity> query = entityManager.createQuery(jpql, CourseEntity.class);
        query.setParameter("authorName", authorName);
        return query.getResultList();
    }
}
