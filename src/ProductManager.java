import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Laptop", 10);
        products.put("Phone", 5);
        products.put("Tablet", 7);
        products.put("Mouse",15);

        System.out.println("Tüm ürünlerin listesi");
        products.forEach((product,price)-> System.out.println(product +":" +price + " TL"));

        //Belirli bir ürünün fiyatını öğernmek
        System.out.println("Telefon Fiyatı: " +products.get("Phone") +"Tl");

        products.remove("Tablet");
        System.out.println("Tanlet silindi.");

        //HAsMap üzerinde gezinme (keySet)
        System.out.println("Ürünler:");
        for (String product : products.keySet()){
            System.out.println(product);
        }
        //HAsMap üzerinde gezinme (values)
        System.out.println("\nFiyatlar:");
        for (Integer price : products.values()){
            System.out.println(price +"TL");
        }

        //HasMap üzerinde gezinme (entrySet)
        System.out.println("\nÜrünlerin ve fiyatların listesi");
        for (Map.Entry<String, Integer> entry : products.entrySet()){
            System.out.println(entry.getKey() +" : " +entry.getValue() + " TL");
        }
    }
}
