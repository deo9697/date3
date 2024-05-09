

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataFull =date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataFull);
    }
}
// esercizio svolto con Andrea Vecchione
