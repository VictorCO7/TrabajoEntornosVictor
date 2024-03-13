import java.util.Scanner;

public class Calculadora {

    Scanner sc = new Scanner(System.in);

    public double sumar() {

        System.out.print("Introduce dos numeros para sumar: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return num1 + num2;

    }

    public double restar() {

        System.out.print("Introduce dos numeros para restar: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return num1 - num2;

    }

    public double multiplicar() {

        System.out.print("Introduce dos numeros para multiplicar: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return num1 * num2;

    }

    public double dividir() {

        System.out.print("Introduce dos numeros para dividir: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;


        }
    }
}
