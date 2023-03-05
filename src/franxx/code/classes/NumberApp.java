package franxx.code.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();

        String number = "1000";

        // object
        Integer intObj = Integer.valueOf(number);
        System.out.println("Object: " + intObj);

        // primitif
        int intPri = Integer.parseInt(number);
        System.out.println("Primitif: " + intPri);
    }
}
