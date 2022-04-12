import java.util.Objects;

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

    public String getPerson(){
        return name + " " + address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && address.equals(person.address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    // toString()
    @Override
    public String toString() {
        return "Person[" +
                "[name= ?" + name + '\'' + ']' +
                ", [address= ?" + address + '\'' + ']' +
                ']';
    }
}

// Student Class
class Student extends Person{
    // Attributes
    private String Program;
    private int Year;
    private double Fee;
    private String address;
    private String name;

    // Constructors
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        Program = program;
        Year = year;
        Fee = fee;
    }

    // Getters
    public String getProgram() {
        return Program;
    }
    public int getYear() {
        return Year;
    }
    public double getFee() {
        return Fee;
    }
    public String getStudent(){
        return name + " " + address + " " + Program + " " + Year + " " + Fee;
    }

    // Setters
    public void setProgram(String program) {
        Program = program;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void setFee(double fee) {
        Fee = fee;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Year == student.Year && Double.compare(student.Fee, Fee) == 0 && Program.equals(student.Program);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Program, Year, Fee);
    }

    // toString()
    @Override
    public String toString() {
        return "Student[ " +
                "[Program= ?'" + Program + '\'' + ']' +
                ", [Year= ?" + Year + ']' +
                ", [Fee= ?" + Fee + ']' +
                ']';
    }
}

// Staff Class
class Stuff extends Person{
    // Attributes
    private String School;
    private double pay;
    private String name;
    private String address;

    // Constructors
    public Stuff(String name, String address, String school, double pay) {
        super(name, address);
        School = school;
        this.pay = pay;
    }

    // Getters
    public String getSchool() {
        return School;
    }
    public double getPay() {
        return pay;
    }
    public String getStaff(){
        return name + " " + address + " " + School + " " + pay;
    }

    // Setters
    public void setSchool(String school) {
        School = school;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Stuff stuff = (Stuff) o;
        return Double.compare(stuff.pay, pay) == 0 && School.equals(stuff.School);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), School, pay);
    }

    // toString()
    @Override
    public String toString() {
        return "Stuff[ " +
                "[School= ?'" + School + '\'' + ']' +
                ", pay= ?" + pay + ']' +
                ']';
    }
}
