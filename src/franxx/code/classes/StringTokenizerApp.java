package franxx.code.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Hilmi-Akbar-#Muharrom";
        StringTokenizer tokenizer = new StringTokenizer(name, "-");

        while (tokenizer.hasMoreTokens()){
            String tk = tokenizer.nextToken();
            System.out.println(tk);
        }
    }
}
