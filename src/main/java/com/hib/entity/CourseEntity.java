package com.hib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;



@Entity
@Table(name = "Courses")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;

    @Column(name = "Course_Name", nullable = false)
    private String courseName;

    @Column(name = "Author_Name", nullable = false)
    private String authorName;

    @Column(name = "Duration", nullable = false)
    private int duration;

    @Column(name = "Availability", nullable = false)
    private boolean availability;


    public CourseEntity() {}

    public CourseEntity(long courseId, String courseName, String authorName, int duration, boolean availability) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.duration = duration;
        this.availability = availability;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "CourseModel [courseId=" + courseId + ", courseName=" + courseName + ", authorName="+authorName;
    }
}
