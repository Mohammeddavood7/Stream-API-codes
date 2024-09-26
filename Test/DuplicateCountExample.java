package Test;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCountExample {
    public static void main(String[] args) {
        List<Integer> duplicateCount = List.of(2, 4, 5, 6, 7, 2, 3, 4);

        long count = duplicateCount.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Group by element and count occurrences
            .values()  // Get the counts
            .stream()  // Stream of counts
            .filter(countValue -> countValue > 1)  // Filter counts greater than 1 (i.e., duplicates)
            .count();  // Count the number of duplicates

        System.out.println("Number of duplicate elements: " + count);
    }
}
