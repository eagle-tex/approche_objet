package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar calPast = Calendar.getInstance();
    calPast.set(2016, 4, 19, 23, 59, 30);
    Date datePast = calPast.getTime();
    final SimpleDateFormat FORMAT1 = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println(FORMAT1.format(datePast) + "\n");

    Calendar calToday = Calendar.getInstance();
    final SimpleDateFormat FORMAT2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dateToday = calToday.getTime();
    System.out.println(FORMAT2.format(dateToday) + "\n");

    final SimpleDateFormat FORMAT_FR =
        new SimpleDateFormat("EEEE dd MMMM yyyy dd HH:mm:ss", Locale.FRANCE);
    System.out.println("En français");
    System.out.println(FORMAT_FR.format(dateToday) + "\n");

    final SimpleDateFormat FORMAT_RU =
        new SimpleDateFormat("EEEE dd MMMM yyyy dd HH:mm:ss", Locale.of("ru", "RU"));
    System.out.println("En russe");
    System.out.println(FORMAT_RU.format(dateToday) + "\n");

    final SimpleDateFormat FORMAT_CN =
        new SimpleDateFormat("EEEE dd MMMM yyyy dd HH:mm:ss", Locale.of("zh", "CN"));
    System.out.println("En chinois");
    System.out.println(FORMAT_CN.format(dateToday) + "\n");

    final SimpleDateFormat FORMAT_DE =
        new SimpleDateFormat("EEEE dd MMMM yyyy dd HH:mm:ss", Locale.of("de", "DE"));
    System.out.println("En allemand");
    System.out.println(FORMAT_DE.format(dateToday) + "\n");
  }
}
