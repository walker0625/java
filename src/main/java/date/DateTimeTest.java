package date;

import java.sql.SQLOutput;
import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTimeTest {

    public static void main(String[] args) throws InterruptedException {
        // system 시간용
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());

        Instant now1 = Instant.now();
        Thread.sleep(100);
        Instant now2 = Instant.now();

        Duration duration = Duration.between(now1, now2);

        // 사용자용
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime birthday = LocalDateTime.of(1990, Month.JUNE, 25, 0, 0, 0);

        LocalDate nowDate = LocalDate.now();

        int age = Period.between(LocalDate.of(1990, Month.JUNE, 25), nowDate).getYears();

        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate parseDate = LocalDate.parse("06/25/1990", MMddyyyy);
        System.out.println(parseDate); // 1990-06-25
    }

}
