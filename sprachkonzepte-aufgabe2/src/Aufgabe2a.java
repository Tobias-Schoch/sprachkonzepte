import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe2a {
    public static final String EXAMPLE_TEST = "xxx %d yyy%n";
    public static void main(String[] args) {

        String start_element = "%";
        String argument_index = "[\\d+$]*";
        String flags = "[-#+ 0,(]*";
        String width = "\\d*";
        String precision = "[[.]\\d]*";
        String conversion = "[b|B|h|H|s|S|c|C|d|o|x|X|e|E|f|g|G|a|A|t|T|%|n]+";

        Pattern pattern = Pattern.compile(start_element + argument_index + flags + width + precision + conversion);
        Pattern pattern2 = Pattern.compile("(\\w)\\1+");

        Matcher format = pattern.matcher(EXAMPLE_TEST);
        Matcher text = pattern2.matcher(EXAMPLE_TEST);

        for (int i = 0; i < EXAMPLE_TEST.length(); i++) {
            int format_index = 999;
            int text_index = 999;
            boolean format_available = false;
            boolean text_available = false;

            if (format.find()) {
                format_index = format.start();
                format_available = true;
            }

            if (text.find()) {
                text_index = text.start();
                text_available = true;
            }

            if (format_available && text_available) {
                if (format_index < text_index) {
                    System.out.print("FORMAT('" + format.group() + "')");
                    System.out.print("TEXT('" + text.group() + "')");
                } else {
                    System.out.print("TEXT('" + text.group() + "')");
                    System.out.print("FORMAT('" + format.group() + "')");
                }
            } else if (format_available) {
                System.out.print("FORMAT('" + format.group() + "')");
            } else if (text_available) {
                System.out.print("TEXT('" + text.group() + "')");
            }
        }
    }
}
