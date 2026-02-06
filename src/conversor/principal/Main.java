package conversor.principal;

import conversor.cliente.ApiClient;
import conversor.modelo.Monedas;
import conversor.servicio.Conversor;
import conversor.servicio.Historial;
import conversor.servicio.MenuConversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ApiClient apiClient = new ApiClient();
        Conversor conversor = new Conversor();
        Historial historial = new Historial();
        MenuConversion menuConversion = new MenuConversion();

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\n=== CONVERSOR DE MONEDAS  ===");
            System.out.println("1) Convertir moneda");
            System.out.println("2) Ver historial de conversiones");
            System.out.println("3) Salir");
            System.out.print("Elija una opción: ");

            if (!lectura.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número.");
                lectura.nextLine();
                continue;
            }

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {

                case 1:
                    menuConversion.mostrarMenu();

                    if (!lectura.hasNextInt()) {
                        System.out.println("Opción inválida.");
                        lectura.nextLine();
                        continue;
                    }

                    int opcionConv = lectura.nextInt();
                    lectura.nextLine();

                    if (!menuConversion.esOpcionValida(opcionConv)) {
                        System.out.println("Opción de conversión inválida.");
                        continue;
                    }

                    String[] monedas = menuConversion.obtenerMonedas(opcionConv);
                    String monedaBase = monedas[0];
                    String monedaDestino = monedas[1];

                    System.out.print("Ingrese el monto: ");
                    if (!lectura.hasNextDouble()) {
                        System.out.println("Monto inválido.");
                        lectura.nextLine();
                        continue;
                    }

                    double monto = lectura.nextDouble();
                    lectura.nextLine();

                    try {
                        Monedas tasas = apiClient.buscarMoneda(monedaBase);
                        double resultado = conversor.convertir(tasas, monedaDestino, monto);
                        System.out.printf("Resultado: %.2f %s = %.2f %s%n",
                                monto, monedaBase, resultado, monedaDestino);

                        historial.agregar(monedaBase, monedaDestino, monto, resultado);

                    } catch (Exception e) {
                        System.out.println("Error al realizar la conversión. Verifique la moneda base.");
                    }
                    break;

                case 2:
                    historial.mostrar();
                    break;

                case 3:
                    System.out.println("Gracias por usar el conversor.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        lectura.close();
    }
}

