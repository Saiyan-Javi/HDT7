import java.util.Scanner;
import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dictionary dict = new Dictionary("diccionario.txt");
        Dictionary dictfr = new Dictionary("Dictionnaire.txt");
        int op = 0;
        while (op == 0) {
            System.out.println("----------Bienveniso a mi propio diccionario----------\n 1. Traducir de ingles a español\n 2. traducir de Ingles a Frances\n 3. salir");
            int option = Integer.parseInt(in.nextLine());
            Scanner palabras = new Scanner(System.in);
            switch (option){
                case 1: 
                    System.out.println("Ingrese la palabra que quiera traducir, vara ver las palabras que tiene el diccionario revise el archivo txt");
                    String english = palabras.next();
                    String word = english;
                    String translation = dict.translate(word);
                    System.out.println(word + " -> " + translation);
                    break;
                case 2:
                    System.out.println("Ingrese la palabra que quiera traducir, vara ver las palabras que tiene el diccionario revise el archivo txt");
                    String french = palabras.next();
                    String wordfr = french;
                    String translationfr = dictfr.translate(wordfr);
                    System.out.println(wordfr + " -> " + translationfr);
                    break;
                case 3:
                    op = 1;
                    System.out.println("Gracias por usar este diccionario :)");
                    break;
            }
         }
    }
}