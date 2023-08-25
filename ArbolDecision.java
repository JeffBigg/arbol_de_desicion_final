package arbol;

import java.util.HashMap;
import java.util.Map;

class ArbolDecision {

    private static double calcularEntropia(int totalSí, int totalNo) {
        int total = totalSí + totalNo;
        double pSí = (double) totalSí / total;
        double pNo = (double) totalNo / total;

        double entropia = 0;
        if (pSí > 0) {
            entropia -= pSí * Math.log(pSí) / Math.log(2);
        }
        if (pNo > 0) {
            entropia -= pNo * Math.log(pNo) / Math.log(2);
        }
        return entropia;
    }

    private static double calcularGananciaInformacion(double entropiaInicial, int totalInicial, int totalSí, int totalNo) {
        double pInicial = (double) totalInicial / (totalSí + totalNo);
        double entropiaFinal = (calcularEntropia(totalSí, totalNo));
        return entropiaInicial - (pInicial * entropiaFinal);
    }

    public static void main(String[] args) {
        int totalSí = 9;
        int totalNo = 5;
        int totalInicial = totalSí + totalNo;

        double entropiaInicial = calcularEntropia(totalSí, totalNo);
        double gananciaClima = calcularGananciaInformacion(entropiaInicial, totalInicial, 2, 7);
        double gananciaTemperatura = calcularGananciaInformacion(entropiaInicial, totalInicial, 4, 5);
        double gananciaHumedad = calcularGananciaInformacion(entropiaInicial, totalInicial, 3, 6);

        System.out.println("Entropía inicial: " + entropiaInicial);
        System.out.println("Ganancia de información para Clima: " + gananciaClima);
        System.out.println("Ganancia de información para Temperatura: " + gananciaTemperatura);
        System.out.println("Ganancia de información para Humedad: " + gananciaHumedad);
    }

}
