package main;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("El lado es: ");
        int lado= cubrir.nextInt();
        Scanner cubre= new Scanner(System.in);
        System.out.println("La altura es: ");
        int altura= cubre.nextInt();
        int calculoarea = lado * altura;
        System.out.println("El area es: "+calculoarea);

    }
}
