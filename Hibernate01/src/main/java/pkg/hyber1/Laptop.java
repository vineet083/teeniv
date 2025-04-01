package pkg.hyber1;

//so we want to embedde this custom class we created into the alien so we use embedded annotation

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
    private String Brand;
    private String model;
    private int ram;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
