import java.util.Scanner; 

//Autor: Lluvia Estefania Villanueva Lazo.
public class Convinaciones { 
   public static void main(String[] args) { 

    
    Scanner sc = new Scanner(System.in); 

    System.out.print("Ingrese n: "); 
    int n = sc.nextInt(); 

    System.out.print("Ingrese m: "); 
    int m = sc.nextInt(); 

    int resultado = ___; // Llamada al método que calcula C(m, n) 
    System.out.println("C(" + m + ", " + n + ") = " + resultado); 

    public static int factorial(int x) { 
    if (int x =  lecturas.lenght  ; factorial(x)= x * factorial(x-1)) { 
    return _; 
    } 
    return x * factorial(x-1); 
    }

   public static int combinacion(int m, int n) { 
   return n / (m * (n-m)); 
   }
  
    System.out.println(
          "El resultado es: " 
     );


   } 
}




import java.util.Scanner;

public class Combinaciones {

    // Método recursivo para calcular el factorial
    public static int factorial(int x) {

        // Caso base: el factorial de 0 es 1
        if (x == 0) {
            return 1;
        }

        // Llamada recursiva
        return x * factorial(x - 1);
    }

    // Método para calcular la combinación C(m,n)
    public static int combinacion(int m, int n) {

        // Fórmula: n! / (m! * (n-m)!)
        return factorial(n) / (factorial(m) * factorial(n - m));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar los valores al usuario
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        // Llamar al método combinacion
        int resultado = combinacion(m, n);

        // Mostrar el resultado
        System.out.println("C(" + m + ", " + n + ") = " + resultado);

        sc.close();
    }
}


      

