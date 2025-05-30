public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Araba çalışıyor...");
    }

//    String brand;
//    String model;
//    int year;

    /*
    Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
     */
    private String brand;
    private String model;
    private int year;


    // Getter ve Setter methods

    // brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
