package sky.calender;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("Input 2 Numbers : ");
        s1 = scanner.next();
        s2 = scanner.next();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        
        int c = a + b;
        System.out.println("Sum of two numbers is :" + c);
        System.out.printf("Sum of %d and %d is %d", a, b, a+b);
        
        scanner.close();
    }
}
