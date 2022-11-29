package LogicaProgramacaoI.List.List03;

import java.util.Scanner;

public class Ex05 {
    static Scanner sc;
    static final int KM_PER_LITER = 12;

    public static void main(String[] args) {

        printGreetingMessage();
        sc = new Scanner(System.in);
        int travelHours = getHors();
        int travelMinutes = getMinutes();
        int averageSpeed = getSpeed();
        sc.close();

        double travelTotalHors = calculeTotalHours(travelHours, travelMinutes);
        double travelDistanceInKm = calculeTravelledDistance(travelTotalHors, averageSpeed);
        double litersNeeded = calculeLitersNeeded(travelDistanceInKm);

        System.out.println("------------------------------------------------");
        System.out.printf("Para uma viajem com um automóvel que faz %d KM/L\n", KM_PER_LITER);
        System.out.printf("A uma velocidade média de %d Km/h\n", averageSpeed);
        System.out.printf("E com uma duração estimada de %dh e %dm\n", travelHours, travelMinutes);
        System.out.printf("você vai usar: %.3f Litros de combustível\n", litersNeeded);
        System.out.println("------------------------------------------------");
    }

    static double calculeTotalHours(double hours, double minutes) {
        double minutesIntoHours = minutes / 60;

        return hours + minutesIntoHours;
    }

    static double calculeTravelledDistance(double hors, double averageSpeed) {
        return averageSpeed * hors;
    }

    static double calculeLitersNeeded(double distanceInKm) {
        return distanceInKm / KM_PER_LITER;
    }

    static int getSpeed() {
        int speed;
        boolean isInvalidSpeed;
        do {
            System.out.print("Qual será a sua velocidade média? (em Km/h) ");
            speed = sc.nextInt();

            isInvalidSpeed = speed < 1;
            if (isInvalidSpeed) {
                errorMessage("Velocidade, digite números maiores que 1!");
            }
        } while (isInvalidSpeed);

        return speed;
    }

    static int getHors() {
        int hours;
        boolean isInvalidHours;
        do {
            System.out.print("Quantas horas vai demorar a viajem? ");
            hours = sc.nextInt();

            isInvalidHours = hours < 0;
            if (isInvalidHours) {
                errorMessage("Hora inválida, digite números positivos!");
            }
        } while (isInvalidHours);

        return hours;
    }

    static int getMinutes() {
        int minutes;
        boolean isInvalidMinutes;
        do {
            System.out.print("Quantos minutos? ");
            minutes = sc.nextInt();

            isInvalidMinutes = (minutes < 0) || (minutes > 60);
            if (isInvalidMinutes) {
                errorMessage("Minutos inválidos, digite números entre 0 e 60!");
            }
        } while (isInvalidMinutes);

        return minutes;
    }

    static void printGreetingMessage() {
        System.out.println("Bem vindo a calculadora de consumo de combustível!");
        System.out.println("Para começar, informe:");
    }

    static void errorMessage(String text) {
        System.out.println("-------------------ERROR-----------------------");
        System.out.println(text);
        System.out.println("-----------------------------------------------");
    }
}
