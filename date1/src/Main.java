import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Stringa di input
        String inputString = "2002-03-01T13:00:00Z";

        // Crea un oggetto ZonedDateTime dalla stringa
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(inputString);

        // Formattazione della data
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' HH:mm:ss zzzz", Locale.ENGLISH);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' HH:mm:ss a z", Locale.ENGLISH);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("M/d/yy, h:mm a", Locale.ENGLISH);

        // Stampa le varie versioni
        System.out.println("FULL Format: " + zonedDateTime.format(fullFormatter));
        System.out.println("MEDIUM Format: " + zonedDateTime.format(mediumFormatter));
        System.out.println("SHORT Format: " + zonedDateTime.format(shortFormatter));
    }
}
