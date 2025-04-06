package pkg.hyber1;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int aid;
    private String name;
    private String tech;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop1> laptops;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop1> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop1> laptops) {
        this.laptops = laptops;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


//    public Laptop1 getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop1 laptop) {
//        this.laptop = laptop;
//    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
