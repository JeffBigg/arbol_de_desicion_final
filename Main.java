
package arbol;

class Fruta{
    String nombre;
    String color;
    boolean esPequena;
    
    public Fruta (String nombre, String color, boolean esPequena){
        this.nombre = nombre;
        this.color = color;
        this.esPequena = esPequena;
    }
}

class ArbolDecision{
    public static String clasificarFruta(Fruta fruta) {
        if (fruta.color.equals("rojo")) {
            if (fruta.esPequena) {
                return "Cereza";
            }else {
                return "Manzana ";
            }
        }else if (fruta.color.equals("amarillo")){
            return "Platano";
        }else  {
            return "Desconocido";
        }
    }
}
public class Main{
    public static void main(String[] args){
        Fruta fruta1 = new Fruta("Cereza ", "rojo", true);
        Fruta fruta2 = new Fruta("Platano", "Amarillo", true);
        
        System.out.println("La fruta 1 es: "+ ArbolDecision.clasificarFruta(fruta1));
        System.out.println("La fruta 2 es: "+ ArbolDecision.clasificarFruta(fruta2));
    }
}