package models;

import io.ebean.Finder;
import io.ebean.Model;
import util.Util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "SUBJECT_REF")
public class SubjectRef extends Model {

    @Id
    @Column(name = "ID")
    private String subjectId;

    @Column(name = "SUBJECT_CODE")
    private String subjectCode;

    @Column(name = "SUBJECT_NAME")
    private String subjectName;


    public static Finder<String, SubjectRef> subjectFinder = new Finder<String, SubjectRef>(SubjectRef.class, "uwanja");

    public SubjectRef(){
        this.subjectId = Util.getUUID();
        this.subjectCode = "";
        this.subjectName = "";
    }
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

