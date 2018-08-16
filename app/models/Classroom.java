package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.time.Year;
import java.util.UUID;

@Entity
@Table(name = "CLASSROOM")
public class Classroom extends Model {

    @Id
    @Column(name = "ID")
    private String classId;

    @Column(name = "CLASS_NAME")
    private String classRoomName;

    @Column(name = "FIRST_YEAR")
    private Year firstYear;

    @JoinColumn(name = "TEACHER_ID")
    private Teacher classTeacher;


    public static Finder<String, Classroom> finder = new Finder<String, Classroom>(Classroom.class, "uwanja");

    public Classroom() {
        this.classId = UUID.randomUUID().toString();
//      this.id = new UUID(10,5).toString();
        this.classRoomName = "";
//      this.firstYear = null;
        this.classTeacher = new Teacher();

    }

    public String getClassId() {
        return classId;
    }

    public Year getFirstYear() {
        return firstYear;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassId(String id) {
        this.classId = id;
    }

    public void setFirstYear(Year firstYear) {
        this.firstYear = firstYear;
    }

    public void setClassRoomName(String className) {
        this.classRoomName = className;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }
}

