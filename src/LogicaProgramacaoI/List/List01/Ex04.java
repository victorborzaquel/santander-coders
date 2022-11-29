package LogicaProgramacaoI.List.List01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular área do Retângulo:");
        System.out.print("Digite a Base: ");
        double baseRetangulo = sc.nextDouble();
        System.out.print("Digite a Altura: ");
        double alturaRetangulo = sc.nextDouble();
        double areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("Calcular área do Triangulo:");
        System.out.print("Digite a Base: ");
        double baseTriangulo = sc.nextDouble();
        System.out.print("Digite a Altura: ");
        double alturaTriangulo = sc.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        System.out.println("Calcular área do Circulo:");
        System.out.print("Digite o Diâmetro: ");
        double diametroCirculo = sc.nextDouble();
        double raioCirculo = diametroCirculo / 2;
        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

        System.out.println("Calcular área do Trapézio:");
        System.out.print("Digite a área menor: ");
        double baseMenorTrapezio = sc.nextDouble();
        System.out.print("Digite a área maior: ");
        double baseMaiorTrapezio = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double alturaTrapezio = sc.nextDouble();
        double areaTrapezio = (baseMenorTrapezio + baseMaiorTrapezio) * alturaTrapezio / 2;

        System.out.printf("A área do Retângulo é: %f\n", areaRetangulo);
        System.out.printf("A área do Triangulo é: %f\n", areaTriangulo);
        System.out.printf("A área do Circulo é: %f\n", areaCirculo);
        System.out.printf("A área do Trapézio é: %f\n", areaTrapezio);
    }
}
