package recursividad;

//Autor: Lluvia Estefania Villanueva Lazo
public class Combinaciones {

    // Método recursivo para calcular el factorial de un número
    public static long factorial(int x) {
        // Caso base: el factorial de 0 es 1
        if (x == 0) {
            return 1;
        }

        // Caso recursivo: x! = x * (x - 1)!
        return x * factorial(x - 1);
    }

    // Método para calcular las combinaciones
    public static long combinacion(int m, int n) {
        // Aplicamos la fórmula de combinaciones
        return factorial(n) /
               (factorial(m) * factorial(n - m));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar los valores al usuario
        System.out.print("Ingresa el valor de n: ");
        int n = entrada.nextInt();

        System.out.print("Ingresa el valor de m: ");
        int m = entrada.nextInt();

        // Validar que los valores sean correctos
        if (n < 0 || m < 0 || m > n) {
            System.out.println("Error: verifica que n y m sean validos.");
        } else {
            // Calcular e imprimir el resultado
            long resultado = combinacion(m, n);
            System.out.println("C(" + m + ", " + n + ") = " + resultado);
        }

        entrada.close();
    }
}



      

