package conversor.servicio;

import conversor.modelo.Monedas;

import java.util.Map;

public class ConversorService {

    private Monedas monedas;

    public ConversorService(Monedas monedas) {
        this.monedas = monedas;
    }

    public boolean existeMoneda(String codigoMoneda) {
        Map<String, Double> tasas = monedas.conversion_rates();
        return tasas.containsKey(codigoMoneda);
    }

    public double obtenerTasa(String codigoMoneda) {
        Map<String, Double> tasas = monedas.conversion_rates();

        if (!tasas.containsKey(codigoMoneda)) {
            throw new IllegalArgumentException("La moneda no existe: " + codigoMoneda);
        }

        return tasas.get(codigoMoneda);
    }
}
