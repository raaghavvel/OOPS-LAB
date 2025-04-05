import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOperations {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        
        System.out.println("Today: " + today.format(formatter));
        System.out.println("Birthday: " + birthday.format(formatter));
        
        long daysAlive = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Days alive: " + daysAlive);
    }
}