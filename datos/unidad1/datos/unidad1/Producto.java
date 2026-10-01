package datos.unidad1.genericos

public abstract class Producto <T>{

   protec String nombre;
   protec double precio;
   protec T extra;
  
   protected Producto(String nombre, Double precio, T extra){
       this.nombre = nombre;
       this.precio = precio;
       tnis.extra = extra;
}

public String getNombre(){
    return nombre;
}

public Double getPrecio(){
    return precio;
}

public T getExtra(){
    return extra;
}
  
public abstract void mostrarDetalles();
}

