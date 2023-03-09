package franxx.code.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            var anInt = random.nextInt(100);
            System.out.println(anInt);
        }
    }
}
