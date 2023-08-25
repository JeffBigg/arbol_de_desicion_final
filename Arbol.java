
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
    public static string clasificarFruta(Fruta fruta){
        if(fruta.color.equals("rojo")){
            if(fruta.esPequena){
                return "Cereza";
            }else{
                return "Manzana ";
            }
        }else if(fruta.color.equals("amarillo")){
            return "Platano";
        }else {
            return "Desconocido";
        }
    }
}