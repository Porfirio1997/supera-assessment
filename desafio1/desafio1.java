import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class challenge1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lines = Integer.parseInt(st.nextToken());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        var evens = numbers.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var odds = numbers.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        numbers = new ArrayList<>();
        numbers.addAll(evens);
        numbers.addAll(odds);
        numbers.forEach(System.out::println);
    }
}