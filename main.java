public class main{
public static void main(String[] args) {
    Dictionary dict = new Dictionary("diccionario.txt");
    String word = "apple";
    String translation = dict.translate(word);
    System.out.println(word + " -> " + translation);
}
}