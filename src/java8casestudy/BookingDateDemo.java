package java8casestudy;

import java.time.*;

public class BookingDateDemo {
    public static void main(String[] args) {
        LocalDate checkIn = LocalDate.of(2023, 7, 1);
        LocalDate checkOut = LocalDate.of(2023, 7, 5);
        Period period = Period.between(checkIn, checkOut);
        System.out.println("Stay Duration: " + period.getDays() + " days");
    }
}
