//public class Dog extends Animal{
//    @Override
//    public void makeSound(){
//        System.out.println("havhav");
//    }
//
//}
public class Dog implements AnimalInterface {
    @Override
    public void sound(){
        System.out.println("Hav hav");
    }
}
