package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
  public static void main(String[] args) {
    Date today = new Date();
    final SimpleDateFormat FORMAT_DATE1 = new SimpleDateFormat("dd/MM/yyyy");
    String date = FORMAT_DATE1.format(today);
    System.out.println(date);

    Date datePast = new Date(116, 4, 19, 23, 59, 30);
    final SimpleDateFormat FORMAT_DATE_PAST = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    System.out.println("\n" + FORMAT_DATE_PAST.format(datePast));

    today = new Date();
    System.out.println("\n" + FORMAT_DATE_PAST.format(today));
  }
}
