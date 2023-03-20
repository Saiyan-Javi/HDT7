import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
public class main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> file = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                file.add(line);
                line = reader.readLine();
            }
            reader.close();
            return file;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}   

