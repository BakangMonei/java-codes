package Code;

import java.util.Objects;

public class FootballGround {
    // Attributes
    protected String footballGroundName;
    protected String Address;
    protected String Location;
    protected String Owners;
    protected int Capacity;
    protected int yearOpened;
    protected int pitchDimension;

    // Constructors
    public FootballGround(String footballGroundName, String address, String location, String owners, int capacity, int yearOpened, int pitchDimension) {
        this.footballGroundName = footballGroundName;
        Address = address;
        Location = location;
        Owners = owners;
        Capacity = capacity;
        this.yearOpened = yearOpened;
        this.pitchDimension = pitchDimension;
    }

    // Getters
    public String getFootballGroundName() {
        return footballGroundName;
    }
    public String getAddress() {
        return Address;
    }
    public String getLocation() {
        return Location;
    }
    public String getOwners() {
        return Owners;
    }
    public int getCapacity() {
        return Capacity;
    }
    public int getYearOpened() {
        return yearOpened;
    }
    public int getPitchDimension() {
        return pitchDimension;
    }

    // Setters
    public void setFootballGroundName(String footballGroundName) {
        this.footballGroundName = footballGroundName;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public void setOwners(String owners) {
        Owners = owners;
    }
    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
    public void setYearOpened(int yearOpened) {
        this.yearOpened = yearOpened;
    }
    public void setPitchDimension(int pitchDimension) {
        this.pitchDimension = pitchDimension;
    }

    // toString() Methods
    @Override
    public String toString() {
        return "FootballGround==> " +
                "footballGroundName: *" + footballGroundName + "*" +
                ", Address: *" + Address + "*" +
                ", Location: *" + Location + "*" +
                ", Owners: *" + Owners + "*" +
                ", Capacity: *" + Capacity + "*" +
                ", yearOpened: *" + yearOpened + "*" +
                ", pitchDimension: *" + pitchDimension + "m2*";
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballGround)) return false;
        FootballGround that = (FootballGround) o;
        return getCapacity() == that.getCapacity() && getYearOpened() == that.getYearOpened() && getPitchDimension() == that.getPitchDimension() && getFootballGroundName().equals(that.getFootballGroundName()) && getAddress().equals(that.getAddress()) && getLocation().equals(that.getLocation()) && getOwners().equals(that.getOwners());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFootballGroundName(), getAddress(), getLocation(), getOwners(), getCapacity(), getYearOpened(), getPitchDimension());
    }
}
