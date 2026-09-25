package datos.unidad1.recursividad;

public class Recursividad {

	public static void saludo(String nombre, int total) {
	
		if(total <= 0)
			return;
		else{
			System.out.println("Hola"+ nombre);
			saludo(nombre,total-1);
		}
	}
/**
*Funcion que realiza cuenta regresiva de acuerdo a un 
*valor entero
*Fecha:25 de Septiembre
* Autor:Lluvia Villanueva
*/


    public static void cuentaRegresiva(int n){
         if (n < 1){
                 return;
         } else {
                 System.out.print(n + " ");
                 cuentaRegresiva(n-1);
         }
    }


	public static void main(String[] args) {
                      //saludo("Lluvia", 100);
                        cuentaRegresiva(100);

	
	}
}

