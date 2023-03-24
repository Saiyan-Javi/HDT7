import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dictionary dict = new Dictionary("diccionario.txt");
        Dictionary dictfr = new Dictionary("Dictionnaire.txt");
        int op = 0;
        while (op == 0) {
            System.out.println("----------Bienveniso a mi propio diccionario----------\n 1. Traducir de ingles a español\n 2. Traducir de Ingles a Frances\n 3. Traducir una frase \n 4. salir");
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
                    int o = 0;
                    while (o==0){
                        System.out.println("\n ¿Desea de ingles a español o de ingles a frances?\n 1. Español\n 2. Francés\n 3. Regresar al menu anterior");
                        int op2 = Integer.parseInt(in.nextLine());
                        switch (op2){
                            case 1:
                                Scanner Ie = new Scanner(System.in);
                                ArrayList<String> listaIe = new ArrayList<String>();
                                System.out.println("Ingresa las frase, ingrese enter cada palabra (ingresa \"fin\" para terminar): ");
                                String entrada = Ie.nextLine();
                                while (!entrada.equals("fin")) {
                                    String wordIe = entrada;
                                    String translationIe = dict.translate(wordIe);
                                    listaIe.add(translationIe);
                                    entrada = Ie.nextLine();
                                }
                                for (String elemento : listaIe) {
                                    System.out.print(elemento + " ");
                                }
                                break;
                            case 2:
                                Scanner If = new Scanner(System.in);
                                ArrayList<String> listaIf = new ArrayList<String>();
                                System.out.println("Ingresa las frase, ingrese enter cada palabra (ingresa \"fin\" para terminar): ");
                                String entradaIf = If.nextLine();
                                while (!entradaIf.equals("fin")) {
                                    String wordIf = entradaIf;
                                    String translationIf = dictfr.translate(wordIf);
                                    listaIf.add(translationIf);
                                    entradaIf = If.nextLine();
                                }
                                for (String elemento : listaIf) {
                                    System.out.print(elemento + " ");
                                }
                                break;
                            case 3:
                                o = 1;
                                break;
                        }
                    }
                    break;
                case 4:
                    op = 1;
                    System.out.println("Gracias por usar este diccionario :)");
                    break;
            }
         }
    }
}