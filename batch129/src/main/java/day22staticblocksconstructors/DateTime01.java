package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        // Date Class
        Date myDate  = new Date();
        System.out.println(myDate);  // Sat Jan 07 23:28:41 EET 2023
        System.out.println(myDate.getTime()); //1673123321277 ==> 1 ocak 1970 den su ana kadar ki mili saniye miktari

        // icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now()); //2023-01-07

        System.out.println(LocalTime.now()); //23:34:37.098991300

        System.out.println(LocalDateTime.now());  //2023-01-07T23:36:08.208673300

        // Dunyanin herhangi bir saat dilinmindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));  //2023-01-08T05:44:56.819051200
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:01.396434400
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Rome")));  //2023-01-07T21:48:04.023161700

        //Ileriki bir tarihi nasil gidilir?

        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));  //2030-07-12

        //Geriki bir tarihi nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); //2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3)); //02:56:21.724350300

        //Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusHours(7));  //16:58:44.730277500

        //Zaman da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour()+":"+LocalTime.now().getMinute()); //0:0

        //Tarih de belli bir nasil aliriz?
        System.out.println(LocalDate.now().getMonthValue()+":"+LocalDate.now().getDayOfMonth());  //1:8

        //Iki tarih nasil karsilastirilir?
        System.out.println(LocalDate.of(2005,2,13).isBefore(LocalDate.of(2007,3,1))); //true

        //Tarih lerin formatlari nasi degistirilir?
        DateTimeFormatter dtf=  DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        System.out.println(dtf.format(LocalDate.now())); //08/01/2023

    }


}
