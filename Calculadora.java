public class Calculadora {

    public static int sumar(int a, int b) {
        System.out.println("Realizando suma...");
        return a + b;
    }

    public static int restar(int a, int b) {
        System.out.println("Realizando resta...");
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        System.out.println("Realizando multiplicación...");
        return a * b;
    }

    public static int dividir(int a, int b) {
        System.out.println("Realizando división...");
        if (b == 0) {
            System.out.println("Error: Se va a lanzar una excepción por división entre cero.");
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }

    public static int calculadora(int a, int b, int opcion) {
        switch (opcion) {
            case 1: return sumar(a, b);
            case 2: return restar(a, b);
            case 3: return multiplicar(a, b);
            case 4: return dividir(a, b);
            default:
                throw new IllegalArgumentException("Opción inválida");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Seleccione una operación: 1. Sumar 2. Restar 3. Multiplicar 4. Dividir");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        try {
            int resultado = calculadora(num1, num2, opcion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
