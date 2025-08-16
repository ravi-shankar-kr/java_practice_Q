import java.util.*;
 class Avg3Num {
    public static void main(String[] args) {
        // Calculate the average of three numbers
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3: ");
        int num3 = sc.nextInt();
        
        int sum = num1 + num2 + num3;

        double average = sum / 3.0;
        System.out.println("The average is: " + average);
    }
}