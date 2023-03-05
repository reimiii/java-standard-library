package franxx.code.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("100000000000000000000000000");
        BigInteger bigInteger = new BigInteger("100000000000000000000000000000");

        BigInteger res = integer.add(bigInteger);
        System.out.println("Hasil: " + res);
    }
}
