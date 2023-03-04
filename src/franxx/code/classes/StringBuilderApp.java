package franxx.code.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        // Tidak di sarankan
        String name = "Hilmi";
        name = name + " " + "Akbar";
        name = name + " " + "Muharrom";
        System.out.println(name + ": boros memory");
        // walaupun outputnya Hilmi Akbar Muharrom, tidak di sarankan
        // Hilmi
        // Akbar
        // Muharrom

        // disaran kan
        StringBuilder builder = new StringBuilder();
        builder.append("Hilmi");
        builder.append(" ");
        builder.append("Akbar");
        builder.append(" ");
        builder.append("Muharrom");

        String names = builder.toString();
        System.out.println(names + ": irit memory");

    }
}
