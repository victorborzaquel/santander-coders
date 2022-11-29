package LogicaProgramacaoI.Class.Class08;

public class TryCatch2 {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,2,0,1};

        try {
            realizarCalculo();
        } catch (Exception e) {

        }

        for (int i = 0; i < n1.length; i++) {
            try {
                System.out.println(dividir(n1[i],n2[i]));
            } catch (ArithmeticException e) {
                System.out.println("Não é possivel dividir por 0");
                e.printStackTrace();
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("falta numeros");
            } catch (Exception e) {
//                System.out.println(e);
//                log(e.getMessage()); // enviar o erro para o log
            }
        }
    }
    public static int dividir(int a, int b) throws Exception {
        if (true) {
            return a / b;
        }
        throw new RuntimeException("teste");
    }

    public static void realizarCalculo() throws ArithmeticException, ArrayIndexOutOfBoundsException {
//        dividir(1,2);
    }
}
