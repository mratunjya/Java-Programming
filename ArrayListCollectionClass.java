import java.util.*;

public class ArrayListCollectionClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("Printing all cars ...");
        for(String car : cars) {
            System.out.println(car);
        }

        System.out.println("Printing all cars in Sorted Order ...");
        Collections.sort(cars);
        System.out.println(cars);

        System.out.println("Removing all elements");
        cars.clear();
        System.out.println(cars);
    }
}
