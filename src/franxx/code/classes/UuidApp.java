package franxx.code.classes;

import java.util.UUID;

public class UuidApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            String u = uuid.toString();

            System.out.println(u);
        }
    }
}
