package models;

import io.ebean.Finder;
import io.ebean.Model;
import util.Util;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HOMEWORK_ASSIGNMENT")
public class Homework extends Model {

    @Id
    @Column(name = "ID")
    private String homeworkId;

    @JoinColumn(name = "CLASSROOM_ID", referencedColumnName = "ID")
    private Classroom assignedClass;

    @JoinColumn(name = "SUBJECT_REF_ID", referencedColumnName = "ID")
    private SubjectRef subjectRef;

    @Column(name = "EXTRA_NOTES")
    private String additionalInfo;

    @JoinColumn(name = "ASSIGNED_STUDENT_ID", referencedColumnName = "ID")
    private Student assignedStudent;

    @JoinColumn(name = "ASSIGNING_TEACHER", referencedColumnName = "ID")
    private Teacher assigningTeacher;

    @Column(name = "SUBMISSION_DATE")
    private Date submissionDate;


    public static Finder<String, Homework> homeworkAssignmentFinder = new Finder<>(Homework.class, "uwanja");

    public Homework(){
        this.homeworkId = Util.getUUID();
        this.assignedClass = new Classroom();
        this.subjectRef = new SubjectRef();
        this.additionalInfo = "";
        this.assignedStudent = new Student();
        this.assigningTeacher = new Teacher();
        this.submissionDate = new Date();
    }

    public String getHomeworkId() {
        return homeworkId;
    }

    public SubjectRef getSubjectRef() {
        return subjectRef;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public Classroom getAssignedClass() {
        return assignedClass;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public Student getAssignedStudent() {
        return assignedStudent;
    }

    public Teacher getAssigningTeacher() {
        return assigningTeacher;
    }

    public void setHomeworkId(String homeworkId) {
        this.homeworkId = homeworkId;
    }

    public void setAssignedClass(Classroom assignedClass) {
        this.assignedClass = assignedClass;
    }

    public void setAssignedStudent(Student assignedStudent) {
        this.assignedStudent = assignedStudent;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setAssigningTeacher(Teacher assigningTeacher) {
        this.assigningTeacher = assigningTeacher;
    }


    public void setSubjectRef(SubjectRef subjectRef) {
        this.subjectRef = subjectRef;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

}
