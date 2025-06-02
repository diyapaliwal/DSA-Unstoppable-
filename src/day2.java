// 1) Greatest of 3 Numbers.
//import java.util.Scanner;
//public class day2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter no 1: ");
//        int num1 = sc.nextInt();
//        System.out.println("enter no 2: ");
//        int num2 = sc.nextInt();
//        System.out.println("enter no 3: ");
//        int num3 = sc.nextInt();
//
//        if(num1==num2 && num2==num3){
//            System.out.println("All the numbers are equal");
//        }
//        else if(num1>=num2 && num1>=num3){
//            System.out.println("greatest no is: "+ num1);
//        }
//        else if(num2>=num1 && num2>=num3){
//            System.out.println("greatest no is: "+ num2);
//        }
//        else{
//            System.out.println("greatest no is: "+ num3);
//        }
//    }
//}

// 2) Check if a Number is Prime
//import java.util.Scanner;
//public class day2{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to find its prime or not: ");
//        int num = sc.nextInt();
//        if (num<=1){
//            System.out.println("Neither prime nor composite");
//        }
//        boolean isPrime = true;
//        for(int i=2; (i*i)<=num;i++){
//            if(num%i==0){
//                isPrime = false;
//                break;
//            }
//        }
//
//        if(!isPrime){
//            System.out.println("The given number is not prime.");
//        }
//        else{
//            System.out.println("The given number is prime.");
//        }
//    }
//}

// 3) Print Even Numbers up to N
//import java.util.Scanner;
//public class day2{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any positive no. : ");
//        int num = sc.nextInt();
//        for(int i=2;i<=num;i++){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//    }
//}

// 4) Sum of Digits of a Number (e.g., 123 → 1 + 2 + 3 = 6)
//import java.util.Scanner;
//public class day2{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int num = sc.nextInt();
//        int sum=0;
//        while(num>0){
//            sum=sum+(num%10);
//            num=num/10;
//        }
//        System.out.println(sum);
//    }
//}

// 5) Reverse a Number (Input: 123 → Output: 321)
//import java.util.Scanner;
//public class day2{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to reverse it");
//        int num = sc.nextInt();
//        while(num>0){
//            int rev=num%10;
//            num=num/10;
//            System.out.print(rev);
//        }
//    }
//}

// 6) Menu-Based Calculator
//Options: 1. Add, 2. Subtract, 3. Multiply, 4. Divide
//Use switch or if-else

import java.util.Scanner;
public class day2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit 1: ");
        double n1= sc.nextDouble();
        System.out.println("enter digit 2: ");
        double n2= sc.nextDouble();

        System.out.println("Options: 1. Add, 2. Subtract, 3. Multiply, 4. Divide");
        int option= sc.nextInt();
        switch(option){
            case 1:
                System.out.println(n1 + n2);
                break;

            case 2:
                System.out.println(n1 - n2);
                break;

            case 3:
                System.out.println(n1 * n2);
                break;

            case 4:
                System.out.println(n1 / n2);
                break;

            default:
                System.out.println("invalid option");
                break;
        }

    }
}