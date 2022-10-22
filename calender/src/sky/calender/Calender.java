package sky.calender;

import java.util.Scanner;

public class Calender {
    private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int getMaxDaysofMonth(int month) {
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
        
        System.out.println("Input Repeat Times : ");
        int repeat = sc.nextInt();
        
        for (int i = 0; i < repeat; i++) {
            System.out.println("Input Month : ");
            int month = sc.nextInt();
            System.out.printf("%d Month has max date %d. \n", month, cal.getMaxDaysofMonth(month));            
        }
        System.out.println("BYE.");
        
        sc.close();
    }
}
