public class Celsius {
    public static double converterParaKelvin (final double tempEntrada) {
        return (double) (tempEntrada + 273.15);
    }

    public static double converterParaFahrenheit (final double tempEntrada) {
        return (double) ((tempEntrada * 1.8) + 32);
    }
}
