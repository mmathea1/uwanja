package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.time.Year;
import java.util.UUID;

@Entity
@Table(name = "TEACHER")
public class Teacher extends Model {


    @Id
    @Column(name = "ID")
    private String teacherId;

    @Column(name = "FNAME")
    private String firstName;

    @Column(name = "LNAME")
    private String lastName;

    @JoinColumn(referencedColumnName = "SUBJECT_CODE")
    private Subject teachingSubject;

    @JoinColumn(name = "CLASS_ID")
    private Classroom teachingClass;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "YEAR_JOINED")
    private Year yearJoined;


    public static Finder<String, Teacher> teacherFinder = new Finder<String, Teacher>(Teacher.class, "uwanja");

    public Teacher() {
        this.teacherId = UUID.randomUUID().toString();
        this.firstName = "";
        this.lastName = "";
        this.teachingSubject = new Subject();
        this.teachingClass = new Classroom();
        this.email = "";
        this.phoneNumber = "";

    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Subject getTeachingSubject() {
        return teachingSubject;
    }

    public Classroom getTeachingClass() {
        return teachingClass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Year getYearJoined() {
        return yearJoined;
    }


    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTeachingSubject(Subject teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void setTeachingClass(Classroom teachingClass) {
        this.teachingClass = teachingClass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearJoined(Year yearJoined) {
        this.yearJoined = yearJoined;
    }
}
