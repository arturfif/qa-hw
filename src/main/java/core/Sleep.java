package core;

public class Sleep {

    public static void aSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
    }
}
