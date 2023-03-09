package franxx.code.classes;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        var availableProcessors = runtime.availableProcessors();
        var freeMemory = runtime.freeMemory();
        var totalMemory = runtime.totalMemory();
        var maxMemory = runtime.maxMemory();

        System.out.println(availableProcessors);
        System.out.println(freeMemory);
        System.out.println(totalMemory);
        System.out.println(maxMemory);


    }
}
