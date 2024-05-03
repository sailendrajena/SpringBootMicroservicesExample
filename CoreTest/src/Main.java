import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> revOrdList = intList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList();
        System.out.println(revOrdList);
    }
}