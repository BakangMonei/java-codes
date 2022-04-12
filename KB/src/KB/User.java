package KB;

import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Objects;
/*
* TO BE DONE
* 1. Re-Do the Accessors in the comments section of each class. eg viewFixture() method
* 2. TeamAdmin Class, Player Class, and Coach Class==========> Black Arrow into Club Class
* */

public class User {
    // Attributes
    private String userName;
    private String password;

    // Constructors
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Mutators
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // Accessors
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    // Verification of credentials that returns the userName and Password
    public String getVerifyCredentials(){
        return userName + password;
    }

    // hashCodes() and equalsCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userName.equals(user.userName) && password.equals(user.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }

    // toString()
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

// Player Class
/*
* 1. Goalkeeper class
* 2. Striker class
* 3. Defender class
* 4. Midfielder class
* */
class Player extends User {
    // Attributes
    protected int registrationNumber;
    protected String firstName;
    protected String lastName;
    protected int Age;
    protected int Position;

    // Constructors
    public Player(String userName, String password, int registrationNumber, String firstName, String lastName, int age, int position) {
        super(userName, password);
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        Position = position;
    }

    // Mutator(aka Setters) Methods
    public void setRegistrationNumber(int RegistrationNumber) {
        this.registrationNumber = RegistrationNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setPosition(int position) {
        Position = position;
    }

    // Accessor(aka Getters) Methods
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return Age;
    }
    public int getPosition() {
        return Position;
    }
    // Viewing profile of player
    public String getViewProfileOfPlayer() {
        return registrationNumber + "/n" + firstName + "/n" + lastName + "/n" + Age + "/n" + Position;
    }
    // View LogTable method left
    // View fixture table method left

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Player player = (Player) o;
        return registrationNumber == player.registrationNumber && Age == player.Age && Position == player.Position && firstName.equals(player.firstName) && lastName.equals(player.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registrationNumber, firstName, lastName, Age, Position);
    }

    // toString()
    @Override
    public String toString() {
        return "Player{" +
                "registrationNumber=" + registrationNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", Position=" + Position +
                '}';
    }
}


    // 1. Goalkeeper Class
    class Goalkeeper extends Player {
        // Attributes
        protected int jerseyNumber;
        protected long profilePhoto;

        // Constructors
        public Goalkeeper(String userName, String password, int registrationNumber, String firstName, String lastName, int age, int position, int jerseyNumber, long profilePhoto) {
            super(userName, password, registrationNumber, firstName, lastName, age, position);
            this.jerseyNumber = jerseyNumber;
            this.profilePhoto = profilePhoto;
        }

        // Mutators
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }
        public void setProfilePhoto(long profilePhoto) {
            this.profilePhoto = profilePhoto;
        }

        // Accessors
        public int getJerseyNumber() {
            return jerseyNumber;
        }
        public long getProfilePhoto() {
            return profilePhoto;
        }
        // Number of saves method left

        // hashCodes() and equals()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Goalkeeper that = (Goalkeeper) o;
            return jerseyNumber == that.jerseyNumber && profilePhoto == that.profilePhoto;
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), jerseyNumber, profilePhoto);
        }

        // toString() methods
        @Override
        public String toString() {
            return "Goalkeeper{" +
                    "registrationNumber=" + registrationNumber +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", Age=" + Age +
                    ", Position=" + Position +
                    ", jerseyNumber=" + jerseyNumber +
                    ", profilePhoto=" + profilePhoto +
                    '}';
        }
    }

    // 2. Defender Class
    class Defender extends Player {
        // Attributes
        protected int jerseyNumber;
        protected long profilePhoto;

        // Constructors
        public Defender(String userName, String password, int registrationNumber, String firstName, String lastName, int age, int position, int jerseyNumber, long profilePhoto) {
            super(userName, password, registrationNumber, firstName, lastName, age, position);
            this.jerseyNumber = jerseyNumber;
            this.profilePhoto = profilePhoto;
        }

        // Mutators
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }

        public void setProfilePhoto(long profilePhoto) {
            this.profilePhoto = profilePhoto;
        }

        // Accessors
        public int getJerseyNumber() {
            return jerseyNumber;
        }
        public long getProfilePhoto() {
            return profilePhoto;
        }
        // Number of tackles method left

        // hashCodes() and equals()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Defender that = (Defender) o;
            return jerseyNumber == that.jerseyNumber && profilePhoto == that.profilePhoto;
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), jerseyNumber, profilePhoto);
        }

        // toString() methods
        @Override
        public String toString() {
            return "Defender{" +
                    "registrationNumber=" + registrationNumber +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", Age=" + Age +
                    ", Position=" + Position +
                    ", jerseyNumber=" + jerseyNumber +
                    ", profilePhoto=" + profilePhoto +
                    '}';
        }
    }

    // 3. Midfielder class
    class Midfielder extends Player {
        // Attributes
        protected int jerseyNumber;
        protected long profilePhoto;

        // Constructors
        public Midfielder(String userName, String password, int registrationNumber, String firstName, String lastName, int age, int position, int jerseyNumber, long profilePhoto) {
            super(userName, password, registrationNumber, firstName, lastName, age, position);
            this.jerseyNumber = jerseyNumber;
            this.profilePhoto = profilePhoto;
        }

        // Mutators
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }
        public void setProfilePhoto(long profilePhoto) {
            this.profilePhoto = profilePhoto;
        }

        // Accessors
        public int getJerseyNumber() {
            return jerseyNumber;
        }
        public long getProfilePhoto() {
            return profilePhoto;
        }
        // Number of passes completed method left

        // hashCodes() and equals()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Midfielder that = (Midfielder) o;
            return jerseyNumber == that.jerseyNumber && profilePhoto == that.profilePhoto;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), jerseyNumber, profilePhoto);
        }

        // toString() methods
        @Override
        public String toString() {
            return "Midfielder{" +
                    "registrationNumber=" + registrationNumber +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", Age=" + Age +
                    ", Position=" + Position +
                    ", jerseyNumber=" + jerseyNumber +
                    ", profilePhoto=" + profilePhoto +
                    '}';
        }
    }

    // 4. Striker Class
    class Striker extends Player {
        // Attributes
        protected int jerseyNumber;
        protected long profilePhoto;

        // Constructors
        public Striker(String userName, String password, int registrationNumber, String firstName, String lastName, int age, int position, int jerseyNumber, long profilePhoto) {
            super(userName, password, registrationNumber, firstName, lastName, age, position);
            this.jerseyNumber = jerseyNumber;
            this.profilePhoto = profilePhoto;
        }

        // Mutators
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }
        public void setProfilePhoto(long profilePhoto) {
            this.profilePhoto = profilePhoto;
        }

        // Accessors
        public int getJerseyNumber() {
            return jerseyNumber;
        }
        public long getProfilePhoto() {
            return profilePhoto;
        }
        // Number of Goals Scored method left

        // hashCodes() and equals()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Striker that = (Striker) o;
            return jerseyNumber == that.jerseyNumber && profilePhoto == that.profilePhoto;
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), jerseyNumber, profilePhoto);
        }

        // toString() methods
        @Override
        public String toString() {
            return "Striker{" +
                    "registrationNumber=" + registrationNumber +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", Age=" + Age +
                    ", Position=" + Position +
                    ", jerseyNumber=" + jerseyNumber +
                    ", profilePhoto=" + profilePhoto +
                    '}';
        }
    }


// Coach class
class Coach extends User{
    // Attributes
    private String firstName;
    private String lastName;
    private int Age;
    private String coachingLicenseDetails;
    private String currentTeam;
    private String previousTeam;

    // Constructors
    public Coach(String userName, String password, String firstName, String lastName, int age, String coachingLicenseDetails, String currentTeam, String previousTeam) {
        super(userName, password);
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.coachingLicenseDetails = coachingLicenseDetails;
        this.currentTeam = currentTeam;
        this.previousTeam = previousTeam;
    }

    // Mutator Methods
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

    // Accessor Methods
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
    // View Coach Profile
    public String getCoachProfile(){
        return firstName + "/n" + lastName + "/n" + Age + "/n" + coachingLicenseDetails + "/n" + currentTeam;
    }
    // View LogTable method left
    // View fixture table method left

    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coach coach = (Coach) o;
        return Age == coach.Age && firstName.equals(coach.firstName) && lastName.equals(coach.lastName) && coachingLicenseDetails.equals(coach.coachingLicenseDetails) && currentTeam.equals(coach.currentTeam) && previousTeam.equals(coach.previousTeam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, Age, coachingLicenseDetails, currentTeam, previousTeam);
    }

    // toString()
    @Override
    public String toString() {
        return "Coach{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", coachingLicenseDetails='" + coachingLicenseDetails + '\'' +
                ", currentTeam='" + currentTeam + '\'' +
                ", previousTeam='" + previousTeam + '\'' +
                '}';
    }
}

// Club Class
class Club extends User{
    // Attributes
    private String clubName;
    private String address;
    private String owner;
    private long logo;

    // Constructors
    public Club(String userName, String password, String clubName, String address, String owner, long logo) {
        super(userName, password);
        this.clubName = clubName;
        this.address = address;
        this.owner = owner;
        this.logo = logo;
    }

    // Mutators
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setLogo(long logo) {
        this.logo = logo;
    }

    // Accessors
    public String getClubName() {
        return clubName;
    }
    public String getAddress() {
        return address;
    }
    public String getOwner() {
        return owner;
    }
    public long getLogo() {
        return logo;
    }
    // View player statistics
    // View LogTable method left
    // View fixture table method left

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Club club = (Club) o;
        return logo == club.logo && clubName.equals(club.clubName) && address.equals(club.address) && owner.equals(club.owner);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clubName, address, owner, logo);
    }

    // toString() methods
    @Override
    public String toString() {
        return "Club{" +
                "clubName='" + clubName + '\'' +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                ", logo=" + logo +
                '}';
    }
}

// League Administrator class
class LeagueAdmin extends User{
    // Attributes
    private String firstName;
    private String lastName;
    private int Age;
    private Date dateHired;
    private String Gender;

    // Constructors
    public LeagueAdmin(String userName, String password, String firstName, String lastName, int age, Date dateHired, String gender) {
        super(userName, password);
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.dateHired = dateHired;
        Gender = gender;
    }

    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    public void setGender(String gender) {
        Gender = gender;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return Age;
    }
    public Date getDateHired() {
        return dateHired;
    }
    public String getGender() {
        return Gender;
    }
    /*
    * 1. CapturePlayerStatistics() method
    * 2. CreateFictures() method
    * 3. updatesLogTable() method
    * 4. captureMatchStatistics() method*/

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LeagueAdmin that = (LeagueAdmin) o;
        return Age == that.Age && firstName.equals(that.firstName) && lastName.equals(that.lastName) && dateHired.equals(that.dateHired) && Gender.equals(that.Gender);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, Age, dateHired, Gender);
    }

    // toString()
    @Override
    public String toString() {
        return "LeagueAdmin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", dateHired=" + dateHired +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}

// TeamAdmin Class
class TeamAdmin extends User{
    // Attributes
    private String firstName;
    private String lastName;
    private int Age;
    private Date dateHired;
    private String Gender;
    private String ClubName;

    // Constructors
    public TeamAdmin(String userName, String password, String firstName, String lastName, int age, Date dateHired, String gender, String clubName) {
        super(userName, password);
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.dateHired = dateHired;
        Gender = gender;
        ClubName = clubName;
    }

    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public void setClubName(String clubName) {
        ClubName = clubName;
    }

    // Accessor
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return Age;
    }
    public Date getDateHired() {
        return dateHired;
    }
    public String getGender() {
        return Gender;
    }
    public String getClubName() {
        return ClubName;
    }
    /*
    * 1. captureStadiumDetails() method
    * 2. captureCoachDetails() method
    * 3. capturePlayerDetails() method
    * 4. captureClubInformation() method*/

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TeamAdmin teamAdmin = (TeamAdmin) o;
        return Age == teamAdmin.Age && firstName.equals(teamAdmin.firstName) && lastName.equals(teamAdmin.lastName) && dateHired.equals(teamAdmin.dateHired) && Gender.equals(teamAdmin.Gender) && ClubName.equals(teamAdmin.ClubName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, Age, dateHired, Gender, ClubName);
    }

    // toString()
    @Override
    public String toString() {
        return "TeamAdmin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", dateHired=" + dateHired +
                ", Gender='" + Gender + '\'' +
                ", ClubName='" + ClubName + '\'' +
                '}';
    }
}

// Stadium class
class Stadium{
    // Attributes
    private String Name;
    private String location;
    private int capacity;
    private int yearOpened;
    private double pitchDimension;

    // Constructors
    public Stadium(String name, String location, int capacity, int yearOpened, double pitchDimension) {
        Name = name;
        this.location = location;
        this.capacity = capacity;
        this.yearOpened = yearOpened;
        this.pitchDimension = pitchDimension;
    }

    // Mutators
    public void setName(String name) {
        Name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setYearOpened(int yearOpened) {
        this.yearOpened = yearOpened;
    }
    public void setPitchDimension(double pitchDimension) {
        this.pitchDimension = pitchDimension;
    }

    // Accessors
    public String getName() {
        return Name;
    }
    public String getLocation() {
        return location;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getYearOpened() {
        return yearOpened;
    }
    public double getPitchDimension() {
        return pitchDimension;
    }
    /*
    * 1. viewFixture() method
    * 2. viewLogTable() method
    * */


    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stadium stadium = (Stadium) o;
        return capacity == stadium.capacity && yearOpened == stadium.yearOpened && Double.compare(stadium.pitchDimension, pitchDimension) == 0 && Name.equals(stadium.Name) && location.equals(stadium.location);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Name, location, capacity, yearOpened, pitchDimension);
    }

    // toString()
    @Override
    public String toString() {
        return "Stadium{" +
                "Name='" + Name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", yearOpened=" + yearOpened +
                ", pitchDimension=" + pitchDimension +
                '}';
    }
}

