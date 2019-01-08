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
@Table(name = "GUARDIAN")
public class Guardian extends Model {

    @Id
    @Column(name = "ID")
    private String guardianId;

    @Column(name = "FNAME")
    private String firstName;

    @Column(name = "LNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    public static Finder<String, Guardian> guardianFinder = new Finder<>(Guardian.class, "uwanja");

    public Guardian() {
//        this.guardianId = UUID.randomUUID().toString();
        this.guardianId = Util.getUUID();
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public String getGuardianId() {
        return guardianId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setGuardianId(String guardianId) {
        this.guardianId = guardianId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
