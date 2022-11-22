import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Módulo 01 - Controle de tempo x funcionários:");
        System.out.print("Digite o ano atual: ");
        short anoAtual = sc.nextShort(); // 2 bytes
        System.out.print("Digite o numero de funcionários: ");
        byte numeroFuncionarios = sc.nextByte(); // 1 byte

        System.out.println("Móludo 02 - Controle de distância x velocidade:");
        System.out.print("Digite a distância do satélite: ");
        int distanciaSatelite = sc.nextInt(); // 4 bytes
        System.out.print("Digite a velocidade máxima: ");
        short velocidadeMaxima = sc.nextShort(); // 2 bytes

        System.out.println("Móludo 03 - Status da missão:");
        System.out.print("Digite o estado da missão (se já iniciou ou não): ");
        boolean statusDaMissao = sc.nextBoolean(); // 1 byte
        System.out.print("Digite a distância que será percorrida durante a missão em km: ");
        long distanciaPercorridaMissaoEmKM = sc.nextLong(); // 8 Bytes
        System.out.print("Digite a calibragem das antenas: ");
        double calibragemDasAntenas = sc.nextDouble(); // 8 Bytes

        sc.close();

        System.out.println("Os parâmetros da missão são:");
        System.out.printf("Ano atual: %d\n", anoAtual);
        System.out.printf("Número de funcionários: %d\n", numeroFuncionarios);
        System.out.printf("Distância do satélite: %d\n", distanciaSatelite);
        System.out.printf("Velocidade máxima: %d\n", velocidadeMaxima);
        System.out.printf("Missão iniciada: %b\n", statusDaMissao);
        System.out.printf("Distancia percorrida: %d KM\n", distanciaPercorridaMissaoEmKM);
        System.out.printf("Calibragem das antenas: %f\n", calibragemDasAntenas);
    }
}
