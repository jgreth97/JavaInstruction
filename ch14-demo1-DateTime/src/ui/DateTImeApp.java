package ui;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTImeApp {

	public static void main(String[] args) {
System.out.println("Hello");

LocalDate now1 = LocalDate.now();//in yyyy/mm/dd
LocalTime now2 = LocalTime.now();
LocalDateTime now3 = LocalDateTime.now();


System.out.println(now1);
System.out.println(now2);
System.out.println(now3);

LocalDate halloween2020 = LocalDate.of(2020, 10, 31);
LocalDate newYears2020 = LocalDate.of(2020, 1, 1);

System.out.println(halloween2020);
System.out.println(newYears2020);

LocalDate thanksGiving2020 = LocalDate.parse("2020-11-26");
System.out.println(thanksGiving2020);

System.out.println("Halloween is on a " +halloween2020.getDayOfWeek());

System.out.println("Is hallowween before today: "+halloween2020.isBefore(now1));
//comparison methods
System.out.println("compare today vs new years "+now1.compareTo(newYears2020));
System.out.println("compare today vs new years "+now1.compareTo(halloween2020));
LocalDate samedaynextmonth= now1.withMonth(11);
System.out.println(samedaynextmonth);
//quietly changes the day
LocalDate ly = LocalDate.of(2020, 2, 29);
System.out.println(ly);
LocalDate lyny =ly.withYear(2021);
System.out.println(lyny);
//throws exception due to day of month issue
//LocalDate feb28 = LocalDate.of(2017, 2, 28);
//LocalDate newDate = feb28.withDayOfMonth(29);//exception

//add 2months to the current date
LocalDate twomonthsaway =now1.plus(2,ChronoUnit.MONTHS);
System.out.println(twomonthsaway);

System.out.println(twomonthsaway.plusDays(17));

System.out.println(ChronoUnit.DAYS.between(newYears2020, halloween2020));

System.out.println("Bye");
	}

}
