//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Constructor ile nesne oluşturma
        //Car myCar = new Car("Volskwagen","Passat", 2025);


//        myCar.brand="Honda";
//        myCar.model="Civic";
//        myCar.year=2025;

       /* System.out.println("Marka: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
       */



        Car myCar = new Car();  //Car nesnesi oluşturma
        myCar.start(); // Vehicle sınıfından gelen start metodunu kullanma


        myCar.speed = 120; // Vehicle sınıfından gelen speed özelliğini kullanma

        System.out.println("Arabanın hızı: " + myCar.speed + " km/s");


       //Nesne oluşturduktan sonra setter metotları ile verileri ata

        myCar.setBrand("Ford");
        myCar.setModel("Focus");
        myCar.setYear(2019);

        // get metotları ile verileri ekrana yazdır
        System.out.println("Araba Bilgileri:");
        System.out.println("Marka: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Yıl: " + myCar.getYear());


        // Animal türünde değişkenler, farklı nesneler
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        // Metot çağrıları - Polymorphism burada
        myCat.makeSound();
        myDog.makeSound();

    }
}