package conversor.modelo;

import java.util.Map;

public record Monedas(Map<String,Double> conversion_rates, String base_code) {

}
