import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        long diff = new Date().getTime() - new Date().getTime();

        TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
