package franxx.code.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("-", ":", ":");

        joiner.add("Hilmi");
        joiner.add("Akbar");
        joiner.add("Muharrom");

        var value = joiner.toString();
        System.out.println(value);

    }
}
