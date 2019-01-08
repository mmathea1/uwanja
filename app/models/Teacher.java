package models;

import io.ebean.Finder;
import io.ebean.Model;
import util.Util;

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

    @JoinColumn(name = "SUBJECT_REF_ID", referencedColumnName = "ID")
    private SubjectRef teachingSubject;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "YEAR_JOINED")
    private Year yearJoined;


    public static Finder<String, Teacher> teacherFinder = new Finder<String, Teacher>(Teacher.class, "uwanja");

    public Teacher() {
        this.teacherId  = Util.getUUID();
        this.firstName = "";
        this.lastName = "";
        this.teachingSubject = new SubjectRef();
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

    public SubjectRef getTeachingSubject() {
        return teachingSubject;
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

    public void setTeachingSubject(SubjectRef teachingSubject) {
        this.teachingSubject = teachingSubject;
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
