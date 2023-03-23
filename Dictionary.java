import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    private BinarySearchTree bst;
    
    public Dictionary(String filename) {
        bst = new BinarySearchTree();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                if (words.length == 2) {
                    bst.put(words[0], words[1]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String translate(String word) {
        return bst.get(word);
    }
}
