package conversor.servicio;

import java.util.LinkedHashMap;
import java.util.Map;

public class MenuConversion {

    private final Map<Integer, String> opciones;

    public MenuConversion() {
        opciones = new LinkedHashMap<>();
        opciones.put(1, "USD-PEN");
        opciones.put(2, "PEN-USD");
        opciones.put(3, "USD-ARS");
        opciones.put(4, "ARS-USD");
        opciones.put(5, "USD-BRL");
        opciones.put(6, "BRL-USD");
        opciones.put(7, "USD-COP");
        opciones.put(8, "COP-USD");
    }

    public void mostrarMenu() {
        System.out.println("\nSeleccione el tipo de conversión:");
        for (Map.Entry<Integer, String> entry : opciones.entrySet()) {
            String[] monedas = entry.getValue().split("-");
            System.out.println(entry.getKey() + ") " + monedas[0] + " → " + monedas[1]);
        }
        System.out.print("Ingrese la opción: ");
    }

    public String[] obtenerMonedas(int opcion) {
        if (!opciones.containsKey(opcion)) return null;
        return opciones.get(opcion).split("-");
    }

    public boolean esOpcionValida(int opcion) {
        return opciones.containsKey(opcion);
    }
}
