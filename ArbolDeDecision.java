package arbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArbolDeDecision {

    public static void main(String[] args) {
        List<Map<String, String>> datos = new ArrayList<>();
        Map<String, String> punto1 = new HashMap<>();
        punto1.put("Atributo1", "Valor1");
        punto1.put("Atributo2", "Valor1");
        punto1.put("Clase", "ClaseA");
        datos.add(punto1);

        Map<String, String> punto2 = new HashMap<>();
        punto2.put("Atributo1", "Valor2");
        punto2.put("Atributo2", "Valor1");
        punto2.put("Clase", "ClaseA");
        datos.add(punto2);

        Map<String, String> punto3 = new HashMap<>();
        punto3.put("Atributo1", "Valor1");
        punto3.put("Atributo2", "Valor2");
        punto3.put("Clase", "ClaseB");
        datos.add(punto3);
        Map<String, String> punto4 = new HashMap<>();
        punto4.put("Atributo1", "Valor2");
        punto4.put("Atributo2", "Valor2");
        punto4.put("Clase", "ClaseB");
        datos.add(punto4);

        double entropiaInicial = calcularEntropia(datos);

        System.out.println("Entropía inicial: " + entropiaInicial);
    }

}
