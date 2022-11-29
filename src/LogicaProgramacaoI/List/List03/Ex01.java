package LogicaProgramacaoI.List.List03;

import java.util.Scanner;

public class Ex01 {
    static Scanner sc;

    public static void main(String[] args) {
        String operatorDisplay;
        Double n1, n2, result;
        int operator;

        System.out.println("Bem vindo a calculadora!");
        System.out.print("Digite um número: ");
        sc = new Scanner(System.in);
        n1 = sc.nextDouble();

        while (true) {
            operator = getOperator();

            if (operator == 8) {
                boolean isClosed = closeCalculator();

                if (isClosed) {
                    return;
                }
            }

            operatorDisplay = getOperatorDisplay(operator);

            System.out.printf("%.2f %s ", n1, operatorDisplay);
            n2 = sc.nextDouble();

            result = calculeOperation(n1, n2, operator);

            if (result == null) {
                printErrorMessage();
                return;
            }

            System.out.printf("%.2f %s %.2f = %f\n", n1, operatorDisplay, n2, result);
            n1 = result;
        }
    }

    static boolean closeCalculator() {
        int choice;
        System.out.println("Tem certeza que deseja fechar a calculadora?");

        while (true) {
            System.out.println("1: Fechar");
            System.out.println("2: Não fechar");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.close();
                    System.out.println("Calculadora Fechada!");
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println("Escolha uma das duas opções:");
                    break;
            }
        }
    }

    static int getOperator() {
        int operatorOption;
        do {
            System.out.print("Qual operação? (digite 0 para ver o menu) ");
            operatorOption = sc.nextInt();

            if (operatorOption == 0) {
                operationMenu();
                System.out.print("Qual operação? ");
                operatorOption = sc.nextInt();
            } else if ((operatorOption < 0) || (operatorOption > 8)) {
                System.out.println("Opção inválida!");
            }
        } while ((operatorOption < 0) || (operatorOption > 8));

        return operatorOption;
    }

    static Double addition(Double n1, Double n2) {
        return n1 + n2;
    }

    static Double subtraction(Double n1, Double n2) {
        return n1 - n2;
    }

    static Double multiplication(Double n1, Double n2) {
        return n1 * n2;
    }

    static Double division(Double n1, Double n2) {
        if (n2 == 0) {
            return null;
        }
        return n1 / n2;
    }

    static Double divisionReminder(Double n1, Double n2) {
        if (n2 == 0) {
            return null;
        }
        return n1 % n2;
    }

    static Double square(Double n1, Double n2) {
        if (n1 <= 0) {
            return null;
        }
        return Math.pow(n1, 1 / n2);
    }

    static Double power(Double n1, Double n2) {
        return Math.pow(n1, n2);
    }

    static Double calculeOperation(Double n1, Double n2, int operation) {
        switch (operation) {
            case 1:
                return addition(n1, n2);
            case 2:
                return subtraction(n1, n2);
            case 3:
                return multiplication(n1, n2);
            case 4:
                return division(n1, n2);
            case 5:
                return divisionReminder(n1, n2);
            case 6:
                return square(n1, n2);
            case 7:
                return power(n1, n2);
            default:
                return null;
        }
    }

    static String getOperatorDisplay(int operation) {
        switch (operation) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "x";
            case 4:
                return "÷";
            case 5:
                return "%";
            case 6:
                return "√";
            case 7:
                return "^";
            default:
                return null;
        }
    }

    static void operationMenu() {
        System.out.println("1: Somar");
        System.out.println("2: Subtrair");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Resto");
        System.out.println("6: Raiz");
        System.out.println("7: Potência");
        System.out.println("8: Para Fechar a Calculadora");
    }

    static void printErrorMessage() {
        System.out.println("-----ERROR--------");
        System.out.println("Operação inválida!");
        System.out.println("------------------");
    }
}
