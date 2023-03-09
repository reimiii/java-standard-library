package franxx.code.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            var host = properties.getProperty("database.port");
            var name = properties.getProperty("database.name");
            var user = properties.getProperty("database.user");
            var password = properties.getProperty("database.password");

            System.out.println("Host: " + host);
            System.out.println("Name: " + name);
            System.out.println("User: " + user);
            System.out.println("Password: " + password);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Hilmi");
            properties.put("name.last", "AM");

            properties.store(new FileOutputStream("rename.properties"), "Mee");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
