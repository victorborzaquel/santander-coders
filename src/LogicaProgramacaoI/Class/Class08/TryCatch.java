package LogicaProgramacaoI.Class.Class08;

public class TryCatch {
    public static void main(String[] args) {
        // erro sintaxe, lógica e exceptions
        // Throwable = class de errors (não tem como controlar)
        // Exceptions = erros durante execução (pode controlar)

        int[] nums = new int[5];

        System.out.println("Antes");
        try {
            System.out.println("Antes dentro");
            nums[5] = 10; // ArrayIndexOutOfBoundsException
            System.out.println("Depois dentro");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição do Array inválida!");
        } catch (Exception e) {
            System.out.println("Erro de exceção genérico!");
        } catch (Throwable e) {
            System.out.println("Erro genérico, não é recomendável!");
        } finally {
            System.out.println("Terminou");
        }
        System.out.println("Depois");
    }

    public static int test() {
        if (true) {
            return 1;
        } else {
            throw new RuntimeException("Erro ao rodar o programa");
        }
    }
}
