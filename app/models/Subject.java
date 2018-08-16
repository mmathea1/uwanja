package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT_REF")
public class Subject extends Model {

    @Id
    @Column(name = "ID")
    private String subjectId;

    @Column(name = "SUBJECT_CODE")
    private String subjectCode;

    @Column(name = "SUBJECT_NAME")
    private String subjectName;


    public static Finder<String, Subject> subjectFinder = new Finder<String, Subject>(Subject.class, "uwanja");

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


}

