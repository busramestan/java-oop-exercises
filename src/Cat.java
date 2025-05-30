//public class Cat extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Miyuvv");
//    }
//
//}

public class Cat implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("Meooww");
    }
}