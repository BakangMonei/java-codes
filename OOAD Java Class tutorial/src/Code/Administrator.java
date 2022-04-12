package Code;

import java.util.Objects;

public class Administrator extends User{
    // Attributes
    private String recordsInTheSystem;

    // Constructors and SuperConstructors
    public Administrator(String userName, String password, String recordsInTheSystem) {
        super(userName, password);
        this.recordsInTheSystem = recordsInTheSystem;
    }
    //Getter
    public String getRecordsInTheSystem() {
        return recordsInTheSystem;
    }
    //Setter
    public void setRecordsInTheSystem(String recordsInTheSystem) {
        this.recordsInTheSystem = recordsInTheSystem;
    }
    // toString()
    @Override
    public String toString() {
        return "Administrator==> " +
                "recordsInTheSystem: *" + recordsInTheSystem + "*";
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;
        Administrator that = (Administrator) o;
        return Objects.equals(getRecordsInTheSystem(), that.getRecordsInTheSystem());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getRecordsInTheSystem());
    }
}

class LeagueAdmin extends Administrator {
    // Attributes
    private int playerStatistics;
    private int matchStatistics;
    private String clubLeagueMembership;

    // Constructors and SuperConstructors
    public LeagueAdmin(String userName, String password, String recordsInTheSystem, int playerStatistics, int matchStatistics, String clubLeagueMembership) {
        super(userName, password, recordsInTheSystem);
        this.playerStatistics = playerStatistics;
        this.matchStatistics = matchStatistics;
        this.clubLeagueMembership = clubLeagueMembership;
    }
    // Getters
    public int getPlayerStatistics() {
        return playerStatistics;
    }
    public int getMatchStatistics() {
        return matchStatistics;
    }
    public String getClubLeagueMembership() {
        return clubLeagueMembership;
    }
    // Setters
    public void setPlayerStatistics(int playerStatistics) {
        this.playerStatistics = playerStatistics;
    }
    public void setMatchStatistics(int matchStatistics) {
        this.matchStatistics = matchStatistics;
    }
    public void setClubLeagueMembership(String clubLeagueMembership) {
        this.clubLeagueMembership = clubLeagueMembership;
    }
    // toString()
    @Override
    public String toString() {
        return "LeagueAdmin==> " +
                "playerStatistics: *" + playerStatistics + "*" +
                ", matchStatistics: *" + matchStatistics + "*" +
                ", clubLeagueMembership: *" + clubLeagueMembership + "*" ;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LeagueAdmin)) return false;
        if (!super.equals(o)) return false;
        LeagueAdmin that = (LeagueAdmin) o;
        return getPlayerStatistics() == that.getPlayerStatistics() && getMatchStatistics() == that.getMatchStatistics() && getClubLeagueMembership().equals(that.getClubLeagueMembership());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPlayerStatistics(), getMatchStatistics(), getClubLeagueMembership());
    }
}
class TeamAdmin extends Administrator{
    // Attributes
    private String ClubInformation;
    private String PlayerInformation;
    private String FootballGroundInformation;
    private String CoachInformaton;

    // Constructors and SuperConstructors
    public TeamAdmin(String userName, String password, String recordsInTheSystem, String clubInformation, String playerInformation, String footballGroundInformation, String coachInformaton) {
        super(userName, password, recordsInTheSystem);
        ClubInformation = clubInformation;
        PlayerInformation = playerInformation;
        FootballGroundInformation = footballGroundInformation;
        CoachInformaton = coachInformaton;
    }

    // Setters
    public void setClubInformation(String clubInformation) {
        ClubInformation = clubInformation;
    }
    public void setPlayerInformation(String playerInformation) {
        PlayerInformation = playerInformation;
    }
    public void setFootballGroundInformation(String footballGroundInformation) {
        FootballGroundInformation = footballGroundInformation;
    }
    public void setCoachInformaton(String coachInformaton) {
        CoachInformaton = coachInformaton;
    }

    // Getters
    public String getClubInformation() {
        return ClubInformation;
    }
    public String getPlayerInformation() {
        return PlayerInformation;
    }
    public String getFootballGroundInformation() {
        return FootballGroundInformation;
    }
    public String getCoachInformaton() {
        return CoachInformaton;
    }

    // toString()
    @Override
    public String toString() {
        return "TeamAdmin==> " +
                "ClubInformation: *" + ClubInformation + "*" +
                ", PlayerInformation: *" + PlayerInformation + "*" +
                ", FootballGroundInformation: *" + FootballGroundInformation + "*" +
                ", CoachInformaton: *" + CoachInformaton + "*";
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamAdmin)) return false;
        TeamAdmin teamAdmin = (TeamAdmin) o;
        return getClubInformation().equals(teamAdmin.getClubInformation()) && getPlayerInformation().equals(teamAdmin.getPlayerInformation()) && getFootballGroundInformation().equals(teamAdmin.getFootballGroundInformation()) && getCoachInformaton().equals(teamAdmin.getCoachInformaton());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getClubInformation(), getPlayerInformation(), getFootballGroundInformation(), getCoachInformaton());
    }
}