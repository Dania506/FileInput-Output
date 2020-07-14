package File;

public class Car {
    private int id;
    private String brand;
    private int model;
    private int year;
    private String color;
    private int regnumber;

    public Car(int id, String brand, int model, int year, String color, int regnumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.regnumber = regnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(int regnumber) {
        this.regnumber = regnumber;
    }

    public String toCSV() {
        return "Car" +
                ";" + id +
                ";" + brand +
                ";" + model +
                ";" + year +
                ";" + color +
                ";" + regnumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", regnumber=" + regnumber +
                '}';
    }
}
