package models;

import io.ebean.Finder;
import io.ebean.Model;
import util.Util;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "SPORT")
public class Sport extends Model {

    @Id
    @Column(name = "ID")
    private String sportsId;

    @Column(name = "SPORT_TYPE")
    private String sportType;

    @JoinColumn(name = "COACH_ID", referencedColumnName = "ID")
    private Teacher coachId;

    public static Finder<String, Sport> sportFinder = new Finder<>(Sport.class, "uwanja");

    public Sport() {
        this.sportsId = Util.getUUID();
        this.sportType = "";
        this.coachId = new Teacher();

    }

    public String getSportsId() {
        return sportsId;
    }

    public String getSportType() {
        return sportType;
    }

    public Teacher getCoachId() {
        return coachId;
    }

    public void setSportsId(String sportsId) {
        this.sportsId = sportsId;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public void setCoachId(Teacher coachId) {
        this.coachId = coachId;
    }
}
