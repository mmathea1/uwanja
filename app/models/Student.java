package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "STUDENT")
public class Student extends Model {

    @Id
    @Column(name = "ID")
    private String studentId;

    @Column(name = "FNAME")
    private String firstName;

    @Column(name = "LNAME")
    private String lastName;

    @Column(name = "DOB")
    private Date dateOfBirth;

    @JoinColumn(name = "FAMILY_ID")
    private Family studentFamily;

    @JoinColumn(name = "CLASS_ID")
    private Classroom classroom;

    @JoinColumn(name = "SPORTS_ID", referencedColumnName = "ID")
    private SportsTeam sportsTeam;


    public static Finder<String, Student> finder = new Finder<String, Student>(Student.class, "uwanja");


    public Student() {
        this.studentId = UUID.randomUUID().toString();
        this.firstName = "";
        this.lastName = "";
        this.studentFamily = new Family();
        this.classroom = new Classroom();
        this.sportsTeam = new SportsTeam();

    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Family getStudentFamily() {
        return studentFamily;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public SportsTeam getSportsTeam() {
        return sportsTeam;
    }

    public void setStudentId(String id) {
        this.studentId = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStudentFamily(Family family) {
        this.studentFamily = family;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setSportsTeam(SportsTeam sportsTeam) {
        this.sportsTeam = sportsTeam;
    }
}

