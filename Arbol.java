
package arbol;

import java.util.HashMap;
import java.util.Map;

class ArbolDecision{
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

    
    
    
    
}
