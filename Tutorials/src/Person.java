public class Person {
    // Attributes
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPerson() {
        return name + " " + address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString methods()
    @Override
    public String toString() {
        return "Person[" + "name= ?" + name + ',' +
                "address= ?" + address + ']';
    }

}
class Staff extends Person {
    // Attributes
    private String school;
    private double pay;
    private String name;
    private String address;

    //Constructors
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    // Setters
    public void setSchool(String school) {
        this.school = school;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    // Getters
    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }
    public String getStaff(String name, String address){
        return name + " " + address + " " + school + " " + pay;
    }

    // toString()
    @Override
    public String toString() {
        return "Staff[Person["
                + "name= ?" + name + ','
                + "address= ?]" + address + ','
                + "school= ?" + school + ','
                + "pay= ?" + pay;
    }
}
