package essentials.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateClass {
    public static void main(String[] args) {
        /*
         * LocalDate is an immutable class(present in java.time package) that represents
         * a date with default format yyyy-MM-dd
         */
        LocalDate todayDate = LocalDate.now();
        // default format yyyy-MM-dd
        System.out.println("Today Date : " + todayDate);
        System.out.println("Yesterday Date : " + todayDate.minusDays(1));
        System.out.println("Tomorrow : " + todayDate.plusDays(1));
        System.out.println(todayDate.plusYears(3));
        System.out.println(todayDate.minusWeeks(7));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(df.format(todayDate));

        // of() returns the instance of LocalDate with specified arguments
        LocalDate dateObj = LocalDate.of(1997, 8, 29);
        System.out.println(dateObj);

        LocalDate date1 = LocalDate.of(2017, 4, 13);
        System.out.println(date1 + " is leap year : " + date1.isLeapYear());

        LocalDate date2 = LocalDate.of(2016, Month.SEPTEMBER, 23);
        System.out.println(date2 + " is leap year : " + date2.isLeapYear());

        LocalDate date = LocalDate.of(2017, 9, 21);
        int year = date.getYear();

        Month month = date.getMonth();

        int day = date.getDayOfMonth();

        DayOfWeek dow = date.getDayOfWeek();

        int len = date.lengthOfMonth();

        boolean leap = date.isLeapYear();

        System.out.println(year + " " + month + " " + day + " " + dow + " " + len + " " + leap);

        /*
         * getDayOfWeek() & getMonth(): returns an enum instead of int value.
         * To get int value, we can use getValue() methods
         */

        System.out.println(date.getMonth().getValue());
        System.out.println(date.getDayOfWeek().getValue());

        int year1 = date.get(ChronoField.YEAR);
        int month1 = date.get(ChronoField.MONTH_OF_YEAR);
        int day1 = date.get(ChronoField.DAY_OF_MONTH);
        System.out.println(year1 + " " + month1 + " " + day1);

        /*
         * int year = date.getYear();
         * int month = date.getMonthValue();
         * int day = date.getDayOfMonth();
         */

        // Calculating difference between two dates
        LocalDate today = LocalDate.now();
        LocalDate newDate = today.minusWeeks(39);
        // between() calculates the amount of time between specified date objects
        System.out.println(ChronoUnit.DAYS.between(newDate, today)); // 273
        System.out.println(ChronoUnit.MONTHS.between(newDate, today));
        System.out.println(newDate.compareTo(todayDate));// -1

        // can modify the date using ChronoUnit
        System.out.println("Date After 5 days :- " + LocalDate.now().plus(5, ChronoUnit.DAYS));

        // until()
        System.out.println("Difference between todayDate and date :" + date.until(todayDate, ChronoUnit.DAYS));

        // isAfer() and isBefore()
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isAfter(date2));
    }
}