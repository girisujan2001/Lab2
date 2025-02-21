import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        String greeting = now.getHour() < 12 ? "Good morning" : "Good afternoon";
        System.out.println(greeting + ", Sujan, Welcome to COMP367");
    }
}
