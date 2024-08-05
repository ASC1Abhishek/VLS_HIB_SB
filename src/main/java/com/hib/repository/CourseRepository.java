package com.hib.repository;

import com.hib.entity.CourseEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    List<CourseEntity> findCoursesByAuthorName(String authorName);
    CourseEntity getCoursesByAuthorName(String authorName);
}

