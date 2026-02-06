package conversor.Cliente;

import com.google.gson.Gson;
import conversor.modelo.Monedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    public Monedas buscarMoneda(String tipoDeMoneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/53e04cc8b16fed248b6cd2b7/latest/"+tipoDeMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa Moneda.");
        }

    }

}
