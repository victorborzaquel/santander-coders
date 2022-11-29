package coding.tank.aulas.aula05;

public class Aula05 {
	public static void main(String[] args) {

		int a = 2;
		int dobroA = passagemPorValor(a);
		
		System.out.println(dobroA);
		System.out.println(a);
		
		Integer b = 42;
		int dobroB = passagemPorReferencia(b);

		System.out.println(dobroB);
		System.out.println(b);
	}
	
	public static int passagemPorReferencia(Integer x) {
		x = x * 2;
		return x;
	}
	
	public static int passagemPorValor(int x) {
		x = x * 2;
		return x;
	}
	
	public static void sobrecarga() {
		int resultado = somar(1, 2);
		imprimir(resultado);
		
		somar(3.2f, 8.3f);
		somar(3, 8, 4);
	}
	
	public static void imprimir(int conteudo) {
		System.out.println(conteudo);
	}
	
	public static int somar(int x, int y) {
		int soma = x + y;
		return soma;
	}
	
	public static int somar(int x, int y, int z) {
		int soma = x + y;
		return soma;
	}
	
	public static float somar(float x, float y) {
		float soma = x + y;
		return soma;
	}

	
}
