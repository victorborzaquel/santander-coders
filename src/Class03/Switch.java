package Class03;

public class Switch {
    public static void main(String[] args) {
        int mes = 21;
        String resposta = "";

        switch (mes % 5) {
            case 1:
                resposta = "jan";
                break;
            case 2:
                resposta = "fev";
                break;
            case 3:
                resposta = "mar";
                break;
            case 4:
                resposta = "abr";
                break;
            case 5:
                resposta = "mai";
                break;
            default:
                resposta = "Padrao";
        }
    }
}
