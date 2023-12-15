import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime annaAggiunto = data.plusYears(1);
        OffsetDateTime meseSottratto = data.minusMonths(1);
        OffsetDateTime piuSetteGiorni = data.plusDays(7);

        System.out.println(annaAggiunto.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
        System.out.println(meseSottratto.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
        System.out.println(piuSetteGiorni.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
    }
}
