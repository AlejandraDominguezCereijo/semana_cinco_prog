package main;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("Que operacion quieres realizar: suma, resta, multiplicación o division ");
        String operacion = cubrir.nextLine();

        if (operacion.contains("suma")){
            Scanner rellenar = new Scanner(System.in);
            System.out.println("El primer dato es: ");
            int dato1= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("El segundo dato es: ");
            int dato2 = cubre.nextInt();
            int suma = dato1+dato2;
            System.out.println("El resultado de tu suma es "+suma);
        }else if (operacion.contains("resta")){
            Scanner rellenar = new Scanner(System.in);
            System.out.println("El primer dato es: ");
            int dato1= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("El segundo dato es: ");
            int dato2 = cubre.nextInt();
            int resta = dato1-dato2;
            System.out.println("El resultado de tu resta es "+resta);
        }else if (operacion.contains("multiplicacion")){
            Scanner rellenar = new Scanner(System.in);
            System.out.println("El primer dato es: ");
            int dato1= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("El segundo dato es: ");
            int dato2 = cubre.nextInt();
            int multiplicacion = dato1*dato2;
            System.out.println("El resultado de tu multiplicacion es "+multiplicacion);
        }
        else if (operacion.contains("division")){
            Scanner rellenar = new Scanner(System.in);
            System.out.println("El primer dato es: ");
            double dato1= rellenar.nextDouble();
            Scanner cubre = new Scanner(System.in);
            System.out.println("El segundo dato es: ");
            int dato2 = cubre.nextInt();
            double division = dato1/dato2;
            System.out.println("El resultado de tu division es "+division);
        }
        else {

            System.out.println("La operacion esta mal escrita");
        }
    }

}
