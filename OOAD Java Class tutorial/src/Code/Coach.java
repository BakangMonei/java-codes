package Code;

import java.util.Objects;

public class Coach extends User {
    // Attributes
    protected String firstName;
    protected String lastName;
    protected int Age;
    protected String coachingLicenseDetails;
    protected String currentTeam;
    protected String previousTeam;

    // Constructors and SuperConstructors

    public Coach(String userName, String password, String firstName, String lastName, int age, String coachingLicenseDetails, String currentTeam, String previousTeam) {
        super(userName, password);
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.coachingLicenseDetails = coachingLicenseDetails;
        this.currentTeam = currentTeam;
        this.previousTeam = previousTeam;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return Age;
    }
    public String getCoachingLicenseDetails() {
        return coachingLicenseDetails;
    }
    public String getCurrentTeam() {
        return currentTeam;
    }
    public String getPreviousTeam() {
        return previousTeam;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setCoachingLicenseDetails(String coachingLicenseDetails) {
        this.coachingLicenseDetails = coachingLicenseDetails;
    }
    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }
    public void setPreviousTeam(String previousTeam) {
        this.previousTeam = previousTeam;
    }
    // toString()


    @Override
    public String toString() {
        return "Coach==> " +
                "firstName: *" + firstName + "*" +
                ", lastName: *" + lastName + "*" +
                ", Age: *" + Age + "*" +
                ", coachingLicenseDetails: *" + coachingLicenseDetails + "*" +
                ", currentTeam: *" + currentTeam + "*" +
                ", previousTeam: *" + previousTeam + "*" ;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coach)) return false;
        if (!super.equals(o)) return false;
        Coach coach = (Coach) o;
        return getAge() == coach.getAge() && getFirstName().equals(coach.getFirstName()) && getLastName().equals(coach.getLastName()) && getCoachingLicenseDetails().equals(coach.getCoachingLicenseDetails()) && getCurrentTeam().equals(coach.getCurrentTeam()) && getPreviousTeam().equals(coach.getPreviousTeam());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFirstName(), getLastName(), getAge(), getCoachingLicenseDetails(), getCurrentTeam(), getPreviousTeam());
    }
}