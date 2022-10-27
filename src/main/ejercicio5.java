package main;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        float acum= 0;
        float total = 10;
        float dato;
        for (int i=1;i<=10;i++){
            System.out.println("Introduce el valor: "+acum);
            dato = cubrir.nextFloat();
            acum = acum +dato;



        }
        float media =acum/total;
        System.out.println("La media de esos numeros es: "+media);
    }
}
