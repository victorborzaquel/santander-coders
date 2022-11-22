package List.List03;

import java.util.Scanner;

public class Ex04 {

    static Scanner sc;

    public static void main(String[] args) {
        // Get information
        printGreeting();
        sc = new Scanner(System.in);
        String name = getName();
        int workedHoursPerMonth = getWorkedHoursPerMonth();
        double workedHourValue = getWorkedHourValue();
        sc.close();

        // Month Salary
        double monthSalary = calculeMonthSalarySalary(workedHoursPerMonth, workedHourValue);
        double thirteenthSalary = calculeThirteenthSalary(monthSalary);
        double thirdVacation = calculeThirdVacation(monthSalary);
        double vacationSalary = sum(monthSalary, thirdVacation);

        // Month Discounts
        double inss = calculeINSS(monthSalary);
        double inssInVacation = calculeINSS(vacationSalary);
        double inssInThirteenth = calculeINSS(thirteenthSalary);

        double irrf = calculeIRRF(monthSalary);
        double irrfInVacation = calculeIRRF(vacationSalary);
        double irrfInThirteenth = calculeIRRF(thirteenthSalary);

        // Annual Discounts
        double inssAnnual = calculeAnnualSum(inss, inssInThirteenth, inssInVacation);
        double irrfAnnual = calculeAnnualSum(irrf, irrfInThirteenth, irrfInVacation);
        double annualDiscounts = sum(inssAnnual, irrfAnnual);

        // Annual Salary
        double annualBenefits = sum(thirteenthSalary, thirdVacation);
        double annualSalary = calculeAnnualSum(monthSalary, thirteenthSalary, vacationSalary);
        double annualGrossSalary = calculeAnnualSalary(monthSalary);
        double annualNetSalary = sub(annualSalary, annualDiscounts);

        // Print Information
        System.out.println("--------------------------------");
        System.out.printf("Ótimo %s, seu salário é:\n", name);
        System.out.println("----------Salário---------------");
        System.out.printf("Anual: R$ %.2f\n", annualGrossSalary);
        System.out.printf("Anual (Bruto): R$ %.2f\n", annualSalary);
        System.out.printf("Anual (Liquido): R$ %.2f\n", annualNetSalary);
        System.out.println("----------Benefícios------------");
        System.out.printf("Terço Ferias: R$ %.2f\n", thirdVacation);
        System.out.printf("13º Salário: R$ %.2f\n", thirteenthSalary);
        System.out.printf("Total: R$ %.2f\n", annualBenefits);
        System.out.println("----------Descontos-------------");
        System.out.printf("INSS: R$ %.2f\n", inssAnnual);
        System.out.printf("IRRF: R$ %.2f\n", irrfAnnual);
        System.out.printf("Total: R$ %.2f\n", annualDiscounts);
        System.out.println("--------------------------------");

    }

    static double calculeINSS(double monthSalary) {
        double aliquotInPercent, deduction, inss;

        if(monthSalary <= 0) {
            return 0;
        } if (monthSalary <= 1212) {
            aliquotInPercent = 0.075;
            deduction = 0;
        } else if (monthSalary <= 2427.35) {
            aliquotInPercent = 0.09;
            deduction = 18.18;
        } else if (monthSalary <= 3641.03) {
            aliquotInPercent = 0.12;
            deduction = 91.01;
        } else if (monthSalary <= 7087.22) {
            aliquotInPercent = 0.14;
            deduction = 163;
        } else {
            return 829.21;
        }

        inss = (monthSalary * aliquotInPercent) - deduction;

        return inss;
    }

    static double calculeIRRF(double monthSalary) {
        double aliquotInPercent, deduction, irrf;

        if(monthSalary <= 0) {
            return 0;
        } else if (monthSalary <= 1903.98) {
            aliquotInPercent = 0;
            deduction = 0;
        } else if (monthSalary <= 2826.65) {
            aliquotInPercent = 0.075;
            deduction = 142.80;
        } else if (monthSalary <= 3751.05) {
            aliquotInPercent = 0.15;
            deduction = 354.80;
        } else if (monthSalary <= 4664.68) {
            aliquotInPercent = 0.225;
            deduction = 636.13;
        } else {
            aliquotInPercent = 0.275;
            deduction = 869.36;
        }

        irrf = (monthSalary * aliquotInPercent) - deduction;

        return irrf;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double calculeThirteenthSalary(double salary) {
        return salary;
    }

    static double calculeMonthSalarySalary(int workedHourValue, double workedHoursPerMonth) {
        return workedHourValue * workedHoursPerMonth;
    }

    static double calculeThirdVacation(double monthSalary) {
        return monthSalary / 3;
    }

    static double calculeAnnualSum(double month, double thirteenth, double vacation) {
        return (month * 11) + thirteenth + vacation;
    }

    static double calculeAnnualSalary(double salary) {
        return salary * 12;
    }

    static int getWorkedHoursPerMonth() {
        int workedHoursPerMonth;
        do {
            System.out.print("Quantas horas trabalha por mês? ");
            workedHoursPerMonth = sc.nextInt();
            if(workedHoursPerMonth <= 0) {
                printErrorMessage();
            }
        } while (workedHoursPerMonth <= 0);

        return workedHoursPerMonth;
    }
    static double getWorkedHourValue() {
        int workedHourValue;
        do {
            System.out.print("Quanto você ganha por hora trabalhada? ");
            workedHourValue = sc.nextInt();
            if(workedHourValue <= 0) {
                printErrorMessage();
            }
        } while (workedHourValue <= 0);

        return workedHourValue;
    }

    static String getName() {
        System.out.print("Qual é seu nome? ");

        return sc.nextLine();
    }
    static void printErrorMessage() {
        System.out.println("-----------ERROR-------------");
        System.out.println("Digite um número maior que 0!");
        System.out.println("-----------------------------");
    }

    static void printGreeting() {
        System.out.println("Bem vindo a calculadora de salário anual!");
    }
}
