package main;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("El numero es: ");
        int valor = cubrir.nextInt();
        boolean p = primos(valor);
        System.out.println(p);
    }

    public static boolean primos(int valor) {
        int a = 0, i;
        if (valor < 100)
        for (i = 1; i < (valor + 1); i++)
            if (valor % i == 0)
                a++;
        if (a != 2)
            return false;
        else
            return true;

    }
}
