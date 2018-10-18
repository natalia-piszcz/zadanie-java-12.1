import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\natal\\IdeaProjects\\DOM- zadanie-java-12.1\\src\\Liczby.txt"));

        Map<Integer, Integer> map = new TreeMap<>();

        for (String line : lines) {
            int i = Integer.parseInt(line);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " liczba wystąpień:- " + entry.getValue());
        }


    }
}
