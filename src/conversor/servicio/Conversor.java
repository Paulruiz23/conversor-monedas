package conversor.servicio;

import conversor.modelo.Monedas;
import java.util.Map;

public class Conversor {

    public double convertir(Monedas monedas, String monedaDestino, double monto) {
        Map<String, Double> tasas = monedas.conversion_rates();
        if (!tasas.containsKey(monedaDestino)) {
            throw new IllegalArgumentException("Moneda destino no encontrada en la API.");
        }
        return monto * tasas.get(monedaDestino);
    }
}

