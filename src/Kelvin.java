public class Kelvin {
    public static double converterParaCelsius (final double tempEntrada) {
        return (double) (tempEntrada - 273.15);
    }

    public static double converterParaFahrenheit (final double tempEntrada) {
        return (double) (((tempEntrada - 273.15) * 1.8) + 32);
    }
}
