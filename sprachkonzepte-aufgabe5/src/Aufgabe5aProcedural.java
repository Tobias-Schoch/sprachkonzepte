import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;

public final class Aufgabe5aProcedural {
    private Aufgabe5aProcedural() {
    }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        readLines(input, lines);
        removeEmptyLines(lines);
        removeShortLines(lines);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static void readLines(BufferedReader input, LinkedList<String> lines) throws IOException {
        String line;
        while ((line = input.readLine()) != null) {
            lines.add(line);
        }
    }

    public static void removeEmptyLines(LinkedList<String> lines) {
        lines.removeIf(s -> s.equals(""));
    }

    public static void removeShortLines(LinkedList<String> lines) {
        lines.removeIf(s -> s.length() < MIN_LENGTH);
    }

    public static int totalLineLengths(LinkedList<String> lines) {
        Iterator<String> line = lines.iterator();
        int totalLineLengths = 0;
        while (line.hasNext()) {
            String s = line.next();
            totalLineLengths += s.length();
        }
        return totalLineLengths;
    }
}