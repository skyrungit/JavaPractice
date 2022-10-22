package sky.calender;

import java.util.Scanner;

public class Calender {
    private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int maxDaysofMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {
    
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        
        Scanner sc = new Scanner(System.in);
        Calender cal = new Calender();
        
        System.out.println("Input Month : ");
        int month = sc.nextInt();
        
        int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.printf("%d Month has max date %d. \n", month, cal.maxDaysofMonth(month));
        
        sc.close();
    }
}
