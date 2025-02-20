import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, num1, num2;

        while (true) {
            System.out.println("\nMenú de la Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 5) break;

            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextInt();

            try {
                int resultado = Calculadora.calculadora(num1, num2, opcion);
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

