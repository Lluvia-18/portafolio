package datos.unidad1.genericos;

public class Libro extends Producto<Integer>{
       public Libro (String nombre, Double precio, Integer paginas){
             super (nombre,precio,paginas);
       }

       public void mostrarDetalles(){
           String datos ="Nombre: " + super.nombre +
                     "\nPrecio: " + super.precio +
                     "\nPaginas: " + super.getExtra();

           System.out.println(datos);

      }
}
