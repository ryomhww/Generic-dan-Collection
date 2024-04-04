import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pair<Integer, String> pair = new Pair<Integer,String>(10, "A");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        Set<String> stringSet = new HashSet<>(Arrays.asList("A","B","C"));

        System.out.println("Printing elements of integerList: ");
        CollectionPrinter.printCollection(integerList);

        System.out.println("Printing elements of stringSet: ");
        CollectionPrinter.printCollection(stringSet);
    }
}