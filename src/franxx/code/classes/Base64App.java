package franxx.code.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String ori = "Hilmi Akbar Muharrom";

        String encodeToString = Base64.getEncoder().encodeToString(ori.getBytes());
        System.out.println(encodeToString);

        var decode = Base64.getDecoder().decode(encodeToString);
        String s = new String(decode);
        System.out.println(s);

    }
}
