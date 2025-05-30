import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList oluşturma
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Bursa");
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("Eskişehir");
        cities.add("İzmir");

        System.out.println("Şehir Listesi: " +cities);

        if (cities.contains("Ankara")){
            System.out.println("Ankara listede var.");
        }else {
            System.out.println("Ankara listede yok.");
        }
        System.out.println("Şehir sayısı: " +cities.size());

        for (int i=0; i<cities.size(); i++){
            System.out.println("Şehir" +(i+1) +":" +cities.get(i));  //cities.get(i) → o sıradaki elemanı getirir.
            //get() metodu:ArrayList’te belirli bir index’teki elemanı döner.

        }

        // for-each döngüsü ile ArrayList'teki tüm elemanları yazdırma
        for (String city : cities ){
            System.out.println(city);
        }
        cities.forEach(System.out::println);

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");

        for (String color : colors) {
            System.out.println(color);

        }
        colors.clear();

        System.out.println("Renkler listesi şu anda boş..");

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Fish");
        animals.add("Lion");

        System.out.println("Hayvanlar Listesi: " +animals);

        animals.set(2,"Parrot"); // set() metodu: Belirli bir index'teki elemanı günceller.

        System.out.println("Hayvanlar listesi güncellendi: " +animals);

        boolean hasFish = animals.contains("Fish");
        System.out.println("Balık listede var mı? " +hasFish);

        animals.forEach(System.out::println);

        ArrayList<String> newCities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Bir şehir ismi giriniz.. (çıkmak için exit yazın):");
            String cityInput = scanner.nextLine();
            if(cityInput.equalsIgnoreCase("exit")){
                break;
            }
            newCities.add(cityInput);
            System.out.println("Girilen şehirler: ");
            newCities.forEach(System.out::println);
        }
    }
}
        /* ArrayList dinamik bir yapıdır.
        Yani istediğin kadar eleman ekleyip, çıkartılabilir.
        Collection Framework'ün parçasıdır.
        contains() metodu:
        → Listenin içinde belirli bir değer var mı diye kontrol eder.
        → true ya da false döner.
         */