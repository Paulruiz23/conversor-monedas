package conversor.servicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Historial {

    private final List<String> registros = new ArrayList<>();
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void agregar(String base, String destino, double monto, double resultado) {
        String registro = String.format("[%s] %.2f %s → %.2f %s",
                LocalDateTime.now().format(formato),
                monto,
                base,
                resultado,
                destino);
        registros.add(registro);
    }

    public void mostrar() {
        System.out.println("\n=== Historial de Conversiones ===");
        if (registros.isEmpty()) {
            System.out.println("No hay conversiones realizadas aún.");
            return;
        }
        for (String r : registros) {
            System.out.println(r);
        }
    }
}


