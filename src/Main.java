//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Constructor ile nesne oluşturma
        Car myCar = new Car("Volskwagen","Passat", 2025);


//        myCar.marka="Honda";
//        myCar.model="Civic";
//        myCar.year=2025;

        System.out.println("Marka: " + myCar.marka);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

    }
}