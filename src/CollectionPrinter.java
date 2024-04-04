import java.util.*;

public class CollectionPrinter {
    
    public static <E> void printCollection(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }
}