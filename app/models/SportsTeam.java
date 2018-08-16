package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "SPORTS_TEAM")
public class SportsTeam extends Model {

    @Id
    @Column(name = "ID")
    private String sportsTeamId;

    @Column(name = "TEAM_NAME")
    private String teamName;

    @JoinColumn(name = "SPORT_ID", referencedColumnName = "ID")
    private Sport sport;

    public static Finder<String, SportsTeam> sportsTeamFinder = new Finder<>(SportsTeam.class, "uwanja");

    public SportsTeam() {
        this.sportsTeamId = UUID.randomUUID().toString();
        this.teamName = "";
        this.sport = new Sport();
    }

    public String getSportsTeamId() {
        return sportsTeamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSportsTeamId(String sportsTeamId) {
        this.sportsTeamId = sportsTeamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
