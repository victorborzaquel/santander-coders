package List.List03;

import java.util.Scanner;

public class Ex02 {
    static Scanner sc;

    public static void main(String[] args) {
        printGreetingMessage();
        sc = new Scanner(System.in);
        double currentTemperature = getTemperature();
        int currentScale = getTemperatureScale("De qual escala quer converter?");
        int finalScale = getTemperatureScale("Para qual escala você quer converter?");
        sc.close();

        double finalTemperature = converterTemperatura(currentTemperature, currentScale, finalScale);

        System.out.println("----------------------");
        printTemperature(currentTemperature, currentScale);
        System.out.println("é equivalente a");
        printTemperature(finalTemperature, finalScale);
        System.out.println("----------------------");
    }

    static double converterTemperatura(double currentTemperature, int currentScale, int finalScale) {
        double result = 0;

        switch (currentScale) {
            case 1: // C
                result = currentTemperature / 5;
                break;
            case 2: // K
                result = (currentTemperature - 273.15) / 5;
                break;
            case 3: // F
                result = (currentTemperature - 32) / 9;
                break;
        }

        switch (finalScale) {
            case 1: // C
                result = result * 5;
                break;
            case 2: // K
                result = (result * 5) + 273.15;
                break;
            case 3: // F
                result = (result * 9) + 32;
                break;
        }

        return result;
    }

    static int getTemperatureScale(String question) {
        System.out.println(question);

        int selectedTemperatureScale;
        boolean invalidSelectedTemperatureScale;
        do {
            System.out.print("Selecione a escala (digite 0 para ver o menu): ");
            selectedTemperatureScale = sc.nextInt();

            if (selectedTemperatureScale == 0) {
                System.out.println("-------------------");
                System.out.println("1: Celsius (°C)");
                System.out.println("2: Kelvin (K)");
                System.out.println("3: Fahrenheit (°F)");
                System.out.println("-------------------");
                System.out.print("Selecione a temperatura: ");
                selectedTemperatureScale = sc.nextInt();
            }

            invalidSelectedTemperatureScale = (selectedTemperatureScale < 1) || (selectedTemperatureScale > 3);
            if (invalidSelectedTemperatureScale) {
                System.out.println("Temperatura inválida, digite uma das 3 opções!");
            }
        } while (invalidSelectedTemperatureScale);

        return selectedTemperatureScale;
    }

    static String getTemperatureDisplay(int scale) {
        switch (scale) {
            case 1:
                return "Celsius (°C)";
            case 2:
                return "Kelvin (K)";
            case 3:
                return "Fahrenheit (°F)";
            default:
                return null;
        }
    }

    static double getTemperature() {
        System.out.print("Qual é a temperatura atual? ");
        return sc.nextDouble();
    }

    static void printTemperature(double temperature, int scale) {
        String scaleDisplay = getTemperatureDisplay(scale);
        System.out.printf("%.2f %s\n", temperature, scaleDisplay);
    }
    static void printGreetingMessage() {
        System.out.println("Bem vindo ao conversor de temperatura!");
    }
}
