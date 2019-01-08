package models;

import io.ebean.Finder;
import io.ebean.Model;
import util.Util;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "ATTENDANCE")
public class Attendance extends Model {

    @Id
    @Column(name = "ID")
    private String attendanceId;

    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
    private Student studentId;

    @Column(name = "ATTENDANCE_DATE")
    private Date attendanceDate;

    @Column(name = "ATTENDED")
    private Boolean attended;


    public static Finder<String, Attendance> attendanceFinder = new Finder<>(Attendance.class, "uwanja");

    public Attendance(){
        this.studentId = new Student();
        this.attendanceId = Util.getUUID();
        this.attendanceDate = new Date();
        this.attended = false;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public Student getStudentId() {
        return studentId;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public Boolean getAttended() {
        return attended;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public void setAttended(Boolean attended) {
        this.attended = attended;
    }
}
