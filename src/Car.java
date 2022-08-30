import java.io.Closeable;

public class Car implements Closeable {
    public void close() {
        System.out.println("Машина жабылып жатат");
    }

    void drive() {
        System.out.println("Машина жүрүп жатат");
    }
}
