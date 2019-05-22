package session8;

import session6.PhoneBook;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PhoneBook p = new PhoneBook();

        LocalDate lD = LocalDate.now();
        System.out.println("Today is "+lD);
        System.out.println("Next Day is "+lD.plusDays(1));
        System.out.println("Next Month is "+lD.plusMonths(1));
        System.out.println("Next Week is "+lD.plusWeeks(1));
        System.out.println("Next Year is "+lD.plusYears(1));

        LocalDate lD2 = LocalDate.of(1997,2,28);

        String birthday = "1991-08-02";//phai nhap dung dinh dang yyyy-mm-dd
        LocalDate lD3 = LocalDate.parse(birthday);
        System.out.println("Today is " +lD3);

        System.out.println(lD3.getDayOfYear());
        System.out.println(lD3.getDayOfWeek());
        System.out.println(lD3.getMonth());
        System.out.println(lD3.getMonthValue());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Now: " +ldt);
        System.out.println("Next: " +ldt.plusHours(1));

        LocalDateTime x = ldt.plusMinutes(30);
        //LocalDateTime ke thua tu LocalDate nen co day du cac phuong thuc cua LocalDate

        //Thao tac voi timezone
        LocalDateTime timenow = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(timenow, ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);

        //Ghi ra cac nam nhuan cua the ky 20
        LocalDate ldnn = LocalDate.of(1900,2,28);
        for (int i=0; i<100;i++){
            LocalDate year_i = ldnn.plusYears(i);
            LocalDate next_year_i = year_i.plusDays(1);
            if(next_year_i.getDayOfMonth() == 29){
                System.out.println(next_year_i.getYear()+ " la nam nhuan.");
            }
        }

        //Ghi ra cac nam nhuan trong khoang thoi gian co dinh
        Scanner scanner = new Scanner(System.in);
        System.out.println("FROM: ");
        int from = scanner.nextInt();
        System.out.println("TO: ");
        int to = scanner.nextInt();

        LocalDate ldnn1 = LocalDate.of(from,2,28);
        for (int i=0; i<=(to-from);i++){
            LocalDate year_i = ldnn.plusYears(i);
            LocalDate next_year_i = year_i.plusDays(1);
            if(next_year_i.getDayOfMonth() == 29){
                System.out.println(next_year_i.getYear()+ " la nam nhuan.");
            }
        }



    }
}

