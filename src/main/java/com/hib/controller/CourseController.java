package com.hib.controller;

import com.hib.entity.CourseEntity;
import com.hib.model.CourseModel;
import com.hib.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class CourseController {

    private final CourseRepository courseRepository;
    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;

    }
    @GetMapping("/courses")
    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }
    @GetMapping("/courses/id/{courseId}")
    public ResponseEntity<CourseEntity> getCoursesByCourseId(@PathVariable(value = "courseId") long courseId) {
        Optional<CourseEntity> courseOptional = courseRepository.findById(courseId);

        return courseOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/courses/author/{authorName}")
    public List<CourseEntity> getCoursesByAuthorName(@PathVariable(value = "authorName") String authorName) {
        return courseRepository.findCoursesByAuthorName(authorName);

    }


//    public List<CourseModel> getCoursesByName(String courseName) {
//        return courseService.getCoursesByName(courseName);
//    }
//
//    public void addCourse(CourseModel course) {
//        courseService.addCourse(course);
//    }
//
//    public void deleteCourse(int courseId) {
//        courseService.deleteCourse(courseId);
//    }
}
