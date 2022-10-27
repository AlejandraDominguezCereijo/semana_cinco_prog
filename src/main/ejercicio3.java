package main;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("La palabra es: ");
        String palabra = cubrir.nextLine();
        for (int i = 0; i < palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }

    }
}
