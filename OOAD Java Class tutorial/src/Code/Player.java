package Code;

import java.util.Objects;

public class Player extends User{
    // Attributes
    protected int registrationNumber;
    protected int jerseyNumber;
    protected String Name;
    protected String Surname;
    protected int Age;
    protected char Gender;
    // Constructors and SuperConstructors
    public Player(String userName, String password, int registrationNumber, int jerseyNumber, String name, String surname, int age, char gender) {
        super(userName, password);
        this.registrationNumber = registrationNumber;
        this.jerseyNumber = jerseyNumber;
        Name = name;
        Surname = surname;
        Age = age;
        Gender = gender;
    }
    // Getters
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
    public int getAge() {
        return Age;
    }
    public char getGender() {
        return Gender;
    }
    // Setters
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setSurname(String surname) {
        Surname = surname;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setGender(char gender) {
        Gender = gender;
    }

    // toString()
    @Override
    public String toString() {
        return "Player==> " +
                "registrationNumber==>" + registrationNumber + "*" +
                ", jerseyNumber: *" + jerseyNumber + "*" +
                ", Name: *" + Name + "*" +
                ", Surname: *" + Surname + "*" +
                ", Age: *" + Age + "*" +
                ", Gender: *" + Gender + "*";
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        if (!super.equals(o)) return false;
        Player player = (Player) o;
        return getRegistrationNumber() == player.getRegistrationNumber() && getJerseyNumber() == player.getJerseyNumber() && getAge() == player.getAge() && getGender() == player.getGender() && getName().equals(player.getName()) && getSurname().equals(player.getSurname());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRegistrationNumber(), getJerseyNumber(), getName(), getSurname(), getAge(), getGender());
    }
}

    // GoalKeeper Class
class GoalKeeper extends Player {
        // Attributes
        private int numberOfSaves;
        // Constructors and SuperConstructors
        public GoalKeeper(String userName, String password, int registrationNumber, int jerseyNumber, String name, String surname, int age, char gender, int numberOfSaves) {
            super(userName, password, registrationNumber, jerseyNumber, name, surname, age, gender);
            this.numberOfSaves = numberOfSaves;
        }
        // Getters
        public int getNumberOfSaves() {
            return numberOfSaves;
        }
        // Setters
        public void setNumberOfSaves(int numberOfSaves) {
            this.numberOfSaves = numberOfSaves;
        }
        // toString()
        @Override
        public String toString() {
            return "GoalKeeper==> " +
                    "registrationNumber: *" + registrationNumber + "*" +
                    ", jerseyNumber: *" + jerseyNumber + "*" +
                    ", Name: *" + Name + "*" +
                    ", Surname: *" + Surname + "*" +
                    ", Age: *" + Age + "*" +
                    ", Gender: *" + Gender + "*" +
                    ", numberOfSaves=" + numberOfSaves + "*";
        }
        // equals() and hashCodes()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof GoalKeeper)) return false;
            if (!super.equals(o)) return false;
            GoalKeeper that = (GoalKeeper) o;
            return getNumberOfSaves() == that.getNumberOfSaves();
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getNumberOfSaves());
        }
    }


    // Midfielder Class
    class Midfielder extends Player {
        // Attributes
        private int numberOfPassesCompleted;
        // Constructors and SuperConstructors
        public Midfielder(String userName, String password, int registrationNumber, int jerseyNumber, String name, String surname, int age, char gender, int numberOfPassesCompleted) {
            super(userName, password, registrationNumber, jerseyNumber, name, surname, age, gender);
            this.numberOfPassesCompleted = numberOfPassesCompleted;
        }
        // Getters
        public int getNumberOfPassesCompleted() {
            return numberOfPassesCompleted;
        }
        // Setters
        public void setNumberOfPassesCompleted(int numberOfPassesCompleted) {
            this.numberOfPassesCompleted = numberOfPassesCompleted;
        }
        // toString()
        @Override
        public String toString() {
            return "Midfielder==> " +
                    "registrationNumber: *" + registrationNumber + "*" +
                    ", jerseyNumber: *" + jerseyNumber + "*" +
                    ", Name: *" + Name + "*" +
                    ", Surname: *" + Surname + "*" +
                    ", Age: *" + Age + "*" +
                    ", Gender: *" + Gender + "*" +
                    ", numberOfPassesCompleted: *" + numberOfPassesCompleted + "*";
        }
        // equals() and hashCodes()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Midfielder)) return false;
            if (!super.equals(o)) return false;
            Midfielder that = (Midfielder) o;
            return getNumberOfPassesCompleted() == that.getNumberOfPassesCompleted();
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getNumberOfPassesCompleted());
        }
    }

    // Strikers Class
    class Strikers extends Player{
    // Attributes
    private int numberOfGoals;
    // Constructors and SuperConstructors
    public Strikers(String userName, String password, int registrationNumber, int jerseyNumber, String name, String surname, int age, char gender, int numberOfGoals) {
        super(userName, password, registrationNumber, jerseyNumber, name, surname, age, gender);
        this.numberOfGoals = numberOfGoals;
    }
    // Getters
    public int getNumberOfGoals() {
        return numberOfGoals;
    }
    // Setters
    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
    // toString()
    @Override
    public String toString() {
        return "Strikers==> " +
                "registrationNumber: *" + registrationNumber + "*" +
                ", jerseyNumber: *" + jerseyNumber + "*" +
                ", Name: *" + Name + "*" +
                ", Surname: *" + Surname + "*" +
                ", Age: *" + Age + "*" +
                ", Gender: *" + Gender + "*" +
                ", numberOfGoals: *" + numberOfGoals + "*";
    }
    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Strikers)) return false;
        if (!super.equals(o)) return false;
        Strikers strikers = (Strikers) o;
        return getNumberOfGoals() == strikers.getNumberOfGoals();
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfGoals());
    }
}

class Defender extends Player{
    // Attributes
    private int numberOfTackles;
    // Constructors and SuperConstructors
    public Defender(String userName, String password, int registrationNumber, int jerseyNumber, String name, String surname, int age, char gender, int numberOfTackles) {
        super(userName, password, registrationNumber, jerseyNumber, name, surname, age, gender);
        this.numberOfTackles = numberOfTackles;
    }
    // Getters
    public int getNumberOfTackles() {
        return numberOfTackles;
    }
    // Setters
    public void setNumberOfTackles(int numberOfTackles) {
        this.numberOfTackles = numberOfTackles;
    }
    // toString()

    @Override
    public String toString() {
        return "Defender==> " +
                "registrationNumber: *" + registrationNumber + "*" +
                ", jerseyNumber: *" + jerseyNumber + "*" +
                ", Name: *" + Name + "*" +
                ", Surname: *" + Surname + "*" +
                ", Age: *" + Age + "*" +
                ", Gender: *" + Gender + "*" +
                ", numberOfTackles: *" + numberOfTackles + "*" ;
    }

    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Defender)) return false;
        if (!super.equals(o)) return false;
        Defender defender = (Defender) o;
        return getNumberOfTackles() == defender.getNumberOfTackles();
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfTackles());
    }
}