package pkg.hyber1;

import jakarta.persistence.Entity;//every orm has their own thing so this is standard annoatation
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int Rollno;
    private String Sname;
    private int Sage;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getSage() {
        return Sage;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Rollno=" + Rollno +
                ", Sname='" + Sname + '\'' +
                ", Sage=" + Sage +
                '}';
    }
}
