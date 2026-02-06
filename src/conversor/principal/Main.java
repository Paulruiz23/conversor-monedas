package conversor.principal;

import conversor.cliente.ApiClient;
import conversor.modelo.Monedas;
import conversor.servicio.ConversorService;

public class Main {

    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();
        Monedas monedas = apiClient.buscarMoneda("USD");
        ConversorService service = new ConversorService(monedas);

        System.out.println("Moneda base: " + monedas.base_code());
        System.out.println("Existe PEN? " + service.existeMoneda("PEN"));
        System.out.println("Tasa PEN: " + service.obtenerTasa("PEN"));
        System.out.println("Existe EUR? " + service.existeMoneda("EUR"));
        System.out.println("Tasa EUR: " + service.obtenerTasa("EUR"));

    }
}

