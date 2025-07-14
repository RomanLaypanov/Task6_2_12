import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        FindMinMax fMM = new FindMinMax();
        BiConsumer<Integer, Integer> consumer = (min, max) -> System.out.println(min + " - " + max);

        fMM.findMinMax(list.stream(), Integer::compareTo, consumer);
    }
}