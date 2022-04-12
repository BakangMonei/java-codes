import java.util.Objects;

public class Student {
    private int sid;
    private String first;
    private String last;
    private String email;

    public Student(int sid, String first, String last, String email) {
        this.sid = sid;
        this.first = first;
        this.last = last;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid &&
                Objects.equals(first, student.first) &&
                Objects.equals(last, student.last) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sid, first, last, email);
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
