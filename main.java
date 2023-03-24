import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dictionary dict = new Dictionary("diccionario.txt");
        int op = 0;
        while (op == 0);
            System.out.println("----------Bienveniso a mi propio diccionario----------\n 1. Traducir de ingles a español\n 2. traducir de Ingles a Frances\n 3. salir");
            int option = Integer.parseInt(in.nextLine());
            switch (option){
                case 1: 
                    String word = "videogame";
                    String translation = dict.translate(word);
                    System.out.println(word + " -> " + translation);
                    break;
                case 2:
                    break;
                case 3:
                    op = 1;
                    break;
            }
    }
}