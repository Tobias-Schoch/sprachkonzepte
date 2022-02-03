import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Aufgabe5bFunctional {
    private Aufgabe5bFunctional() {
    }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();
        var n =
                Files
                        .lines(Paths.get(args[0]))
                        .filter(item -> !item.isEmpty())
                        .map(String::length)
                        .filter(length -> length > MIN_LENGTH)
                        .reduce(0, Integer::sum);
        long stop = System.nanoTime();
        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }
}