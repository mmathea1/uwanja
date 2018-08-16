package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "FAMILY")
public class Family extends Model {


    @Id
    @Column(name = "ID")
    private String familyId;

    @Column(name = "FAMILY_NAME")
    private String familyName;

    @Column(name = "FAMILY_TYPE")
    private String familyType;

    @JoinColumn(name = "GUARDIAN_ID", referencedColumnName = "ID")
    private Guardian guardian;

    @JoinColumn(name = "MOTHER", referencedColumnName = "ID")
    private Guardian mother;

    @JoinColumn(name = "FATHER", referencedColumnName = "ID")
    private Guardian father;

    @JoinColumn(name = "WARD", referencedColumnName = "ID")
    private Guardian ward;


    public static Finder<String, Family> familyFinder = new Finder<>(Family.class, "uwanja");

    public Family() {
        this.familyId = UUID.randomUUID().toString();
        this.familyName = "";
        this.familyType = "";
        this.guardian = new Guardian();
        this.mother = new Guardian();
        this.father = new Guardian();
        this.ward = new Guardian();
    }


    public String getFamilyId() {
        return familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFamilyType() {
        return familyType;
    }

    public Guardian getMother() {
        return mother;
    }

    public Guardian getFather() {
        return father;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public Guardian getWard() {
        return ward;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }

    public void setMother(Guardian mother) {
        this.mother = mother;
    }

    public void setFather(Guardian father) {
        this.father = father;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public void setWard(Guardian ward) {
        this.ward = ward;
    }
}
