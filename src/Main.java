import java.util.Scanner;

public class Main {

    private static double COP = 4.17;
    private static double BRL = 5.45;
    private static double ARS = 64.51;
    private static int USD = 1;

    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("Bienvenido(a) al Conversor de Monedas");

        String descripcion = """
                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Salir
                Seleccione una opción válida
                ********************************************
                """;
        System.out.println(descripcion);

//      Dólar Estados Unidos= USD
//      Peso Argentino= Ars
//      Real Brasileño= BRL
//      Peso Colombiano= COP

        int conversion_dolar;{
            USD = 1;
        }

        double conversion;{
            ARS= 64.51;
            BRL= 5.45;
            COP= 4.17;
        }
    }
}



