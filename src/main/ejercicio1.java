package main;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("El primer numero es: ");
        int valor= cubrir.nextInt();
        System.out.println("El segundo numero es: ");
        int valor2= cubrir.nextInt();
        boolean m= multiplos(valor, valor2);
        System.out.println(m);
    }

    public static boolean multiplos (int valor, int valor2) {
        boolean Sonmultiplos;
        int multi = valor % valor2;
        if (multi == 0) {
            Sonmultiplos = true;
        } else {
            Sonmultiplos = false;
        }
        return Sonmultiplos;

    }
}
