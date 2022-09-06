public class Fahrenheit {
    public static double converterParaCelsius(final double tempEntrada) {
        return (double) ((tempEntrada - 32) / 1.8);
    }

    public static double converterParaKelvin(final double tempEntrada) {
        return (double) (((tempEntrada - 32) * 5/9) + 273.15);
    }
}
