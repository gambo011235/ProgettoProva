import lombok.Cleanup;
import lombok.Data;

/**
 * Created by Loris on 06/12/2015.
 */


@Data
public class Prova implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("booom!");
    }

    public static void main(String args[]) {
        Thread t = new Thread(new Prova());
        t.start();
    }
    //MASTERrr
}