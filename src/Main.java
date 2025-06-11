import java.util.*;

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
//        Animal myCat = new Cat();
//        Animal myDog = new Dog();

        // Metot çağrıları , Polymorphism burada
//        myCat.makeSound();
//        myDog.makeSound();

        //Method Overloading örneği
        Calculator calc = new Calculator();
        int result1 = calc.add(3,5);

        int result2 = calc.add(4,5,6);

        System.out.println("İki sayının toplamı: " + result1);
        System.out.println("Üç sayının toplamı: " + result2);

        //Nesne oluturmadan sınıf adıyla static metot cagrısı
        int result = Multiply.multiply(10,10);

        System.out.println("Çarpım Sonucu: " +result);

        //super ve this örneği
        Student student = new Student("Büşra", 25, "University");
        student.showInfo();

        //Abstract sınıf ve metot örneği
        //Shape sınıfından Circle ve Rectangle sınıflarını türettik
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        //Interface örneği

        AnimalInterface cat = new Cat();
        AnimalInterface dog = new Dog();

        cat.sound();
        dog.sound();

        Gun bugun = Gun.CUMA;
        System.out.println("Bugün günlerden "+bugun);

        Set <String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Apple"); // Duplicate, will not be added
        fruits.add("Banana");
        fruits.add("Grapes");

        System.out.println(fruits);

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin:");

        int firtNumber = input.nextInt();

        System.out.println("İkinci sayıyı girin: ");
        int secondNumber = input.nextInt();

        try {
            int sonuc = firtNumber /secondNumber;
            System.out.println("Sonuç:" +sonuc);
        }catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez!!");
        }

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Listede bulunan sayılar :");
        numbers.forEach(number -> System.out.println(number));

    }
}