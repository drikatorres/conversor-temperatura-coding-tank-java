import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int quantidadeDeTemperaturas = 0;

        System.out.println("|------------------------------------------------------------------------------------------------|");
        System.out.println("|--------------------------------------------MENU------------------------------------------------|");
        System.out.println("|------------------------------------------------------------------------------------------------|");
        System.out.println("|-----------------------Bem-vindo ao nosso conversor de temperaturas-----------------------------|");
        System.out.println("|------------------------------------------------------------------------------------------------|");

        Scanner entradaDeDados = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("|Digite a quantidade de temperaturas a serem transformadas:                                      |");
            try {
                quantidadeDeTemperaturas = entradaDeDados.nextInt();
                numero = 1;
            } catch (InputMismatchException e) {
                System.out.println("Você digitou incorretamente a quantidade. O valor digitado deve ser um número inteiro.");
                throw new DadoInvalidoException();
            }
        } while (numero == 0);

        System.out.println("|------------------------------------------------------------------------------------------------|");

        System.out.println("|Digite a unidade de temperatura de origem: Kelvin, Celsius ou Fahrenheit                        |");
        String temperaturaDeEntrada = entradaDeDados.next();
        temperaturaDeEntrada = temperaturaDeEntrada.toUpperCase();
        if (!temperaturaDeEntrada.equals("CELSIUS") && !temperaturaDeEntrada.equals("KELVIN") && !temperaturaDeEntrada.equals("FAHRENHEIT")) {
            System.out.println("Temperatura de entrada informada inválida.");
            throw new TemperaturaInvalidaException();
        }

        System.out.println("|------------------------------------------------------------------------------------------------|");

        System.out.println("|Digite a unidade de temperaturas final: Kelvin, Celsius ou Fahrenheit                           |");
        String temperaturaDeSaida = entradaDeDados.next();
        temperaturaDeSaida = temperaturaDeSaida.toUpperCase();
        if (!temperaturaDeSaida.equals("CELSIUS") && !temperaturaDeSaida.equals("KELVIN") && !temperaturaDeSaida.equals("FAHRENHEIT")) {
            System.out.println("Temperatura de saída informada inválida.");
            throw new TemperaturaInvalidaException();
        }

        if (temperaturaDeEntrada.equals(temperaturaDeSaida)) {
            System.out.println("Temperatura de entrada e temperatura de saída não podem ser iguais.");
            throw new TemperaturaInvalidaException();
        }

        System.out.println("|------------------------------------------------------------------------------------------------|");

        List<Double> temperaturasDeEntrada = new ArrayList<Double>();
        List<Double> temperaturasDeSaida = new ArrayList<Double>();
        double tempSaida = 0;
        double somaTempEntrada = 0;
        double somaTempSaida = 0;

        try {
            if (temperaturaDeEntrada.equals("CELSIUS") && temperaturaDeSaida.equals("KELVIN")) {
                for (int i = 1; i<= quantidadeDeTemperaturas; i++ ) {
                    System.out.println("|Digite a temperatura " + i + " de " + quantidadeDeTemperaturas + " :");
                    double tempEntrada = entradaDeDados.nextDouble();
                    System.out.println("A temperatura de entrada é de " + tempEntrada + " graus Celsius.");
                    tempSaida = Celsius.converterParaKelvin(tempEntrada);
                    System.out.println("A temperatura convertida é de " + tempSaida + " graus Kelvin.");
                    temperaturasDeEntrada.add(tempEntrada);
                    temperaturasDeSaida.add(tempSaida);
                    somaTempEntrada =+tempEntrada;
                    somaTempSaida =+tempSaida;
                }
            } else if (temperaturaDeEntrada.equals("CELSIUS") && temperaturaDeSaida.equals("FAHRENHEIT")) {
                for (int i = 1; i<= quantidadeDeTemperaturas; i++ ) {
                    System.out.println("|Digite a temperatura " + i + " de " + quantidadeDeTemperaturas + " :");
                    double tempEntrada = entradaDeDados.nextDouble();
                    System.out.println("A temperatura de entrada é de " + tempEntrada + " graus Celsius.");
                    tempSaida = Celsius.converterParaFahrenheit(tempEntrada);
                    System.out.println("A temperatura convertida é de " + tempSaida + " graus Fahrenheit.");
                    temperaturasDeEntrada.add(tempEntrada);
                    temperaturasDeSaida.add(tempSaida);
                    somaTempEntrada =+tempEntrada;
                    somaTempSaida =+tempSaida;
                }
            } else if (temperaturaDeEntrada.equals("KELVIN") && temperaturaDeSaida.equals("CELSIUS")) {
                for (int i = 1; i<= quantidadeDeTemperaturas; i++ ) {
                    System.out.println("|Digite a temperatura " + i + " de " + quantidadeDeTemperaturas + " :");
                    double tempEntrada = entradaDeDados.nextDouble();
                    System.out.println("A temperatura de entrada é de " + tempEntrada + " graus Kelvin.");
                    tempSaida = Kelvin.converterParaCelsius(tempEntrada);
                    System.out.println("A temperatura convertida é de " + tempSaida + " graus Celsius.");
                    temperaturasDeEntrada.add(tempEntrada);
                    temperaturasDeSaida.add(tempSaida);
                    somaTempEntrada =+tempEntrada;
                    somaTempSaida =+tempSaida;
                }
            } else if (temperaturaDeEntrada.equals("KELVIN") && temperaturaDeSaida.equals("FAHRENHEIT")) {
                for (int i = 1; i<= quantidadeDeTemperaturas; i++ ) {
                    System.out.println("|Digite a temperatura " + i + " de " + quantidadeDeTemperaturas + " :");
                    double tempEntrada = entradaDeDados.nextDouble();
                    System.out.println("A temperatura de entrada é de " + tempEntrada + " graus Kelvin.");
                    tempSaida = Kelvin.converterParaFahrenheit(tempEntrada);
                    System.out.println("A temperatura convertida é de " + tempSaida + " graus Fahrenheit.");
                    temperaturasDeEntrada.add(tempEntrada);
                    temperaturasDeSaida.add(tempSaida);
                    somaTempEntrada =+tempEntrada;
                    somaTempSaida =+tempSaida;
                }
            } else if (temperaturaDeEntrada.equals("FAHRENHEIT") && temperaturaDeSaida.equals("KELVIN")) {
                for (int i = 1; i<= quantidadeDeTemperaturas; i++ ) {
                    System.out.println("|Digite a temperatura " + i + " de " + quantidadeDeTemperaturas + " :");
                    double tempEntrada = entradaDeDados.nextDouble();
                    System.out.println("A temperatura de entrada é de " + tempEntrada + " graus Fahrenheit.");
                    tempSaida = Fahrenheit.converterParaKelvin(tempEntrada);
                    System.out.println("A temperatura convertida é de " + tempSaida + " graus Kelvin.");
                    temperaturasDeEntrada.add(tempEntrada);
                    temperaturasDeSaida.add(tempSaida);
                    somaTempEntrada =+tempEntrada;
                    somaTempSaida =+tempSaida;
                }
            } else if (temperaturaDeEntrada.equals("FAHRENHEIT") && temperaturaDeSaida.equals("CELSIUS")) {
                for (int i = 1; i<= quantidadeDeTemperaturas; i++ ) {
                    System.out.println("Digite a temperatura " + i + " de " + quantidadeDeTemperaturas + " :");
                    double tempEntrada = entradaDeDados.nextDouble();
                    System.out.println("A temperatura de entrada é de " + tempEntrada + " graus Fahrenheit.");
                    tempSaida = Fahrenheit.converterParaCelsius(tempEntrada);
                    System.out.println("A temperatura convertida é de " + tempSaida + " graus Celsius.");
                    temperaturasDeEntrada.add(tempEntrada);
                    temperaturasDeSaida.add(tempSaida);
                    somaTempEntrada =+tempEntrada;
                    somaTempSaida =+tempSaida;
                }
            }
        } catch (Exception e) {
            System.out.println("Dados inválidos.");
            throw new TemperaturaInvalidaException();
        }

        System.out.println("As temperaturas passadas foram " + temperaturasDeEntrada + " graus " + temperaturaDeEntrada + ".");
        System.out.println("As temperaturas transformadas foram " + temperaturasDeSaida + " graus " + temperaturaDeSaida + ".");
        System.out.println("A média das temperaturas passadas é " + somaTempEntrada/quantidadeDeTemperaturas + " graus " + temperaturaDeEntrada + ".");
        System.out.println("A média das temperaturas transformadas é " + somaTempSaida/quantidadeDeTemperaturas + " graus " + temperaturaDeSaida + ".");
    }
}
