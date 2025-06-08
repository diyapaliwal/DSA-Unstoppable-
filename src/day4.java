
//import java.util.Scanner;
//public class day4{
//    public static void main(String[] args){
//        Scanner sc =  new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//    }
//}

//import java.util.Scanner;
//public class day4 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        whichWeekDay(day);
//}
//    static void whichWeekDay(int day) {
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                if (day<1 || day>7){
//                    System.out.println("Invalid");
//                }
//                break;
//        }
//    }
//}

//import java.util.Scanner;
//public class day4{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String num = sc.next();
//        int lnum = num.length();
//        System.out.println(lnum);
//    }
//}
// ALTERNATIVE APPROCH
/*You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.*/
//import java.util.Scanner;
//public class day4{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count= 0;
//        if(num==0){
//            System.out.println(1);
//        }
//        while(num!=0){ //n!=0 instead of n>0 because n!=0 can run for negative numbers too.
//            count++;
//            num=num/10;
//        }
//        System.out.println(count);
//    }
//}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class day4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        GCD(num1,num2);
//        armstrong(n);
//        System.out.println(reverse(num));
//        System.out.println(isPalindrome(num));
//        System.out.println(divisor(n));
        prime(n);
    }
    // reversing signed number
//    static int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int digit = x % 10;
//            x = x / 10;
//            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE/10 && digit > 7)) return 0;
//
//            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE/10 && digit < -8)) return 0;
//
//            rev = rev * 10 + digit;
//        }
//        return rev;
//    }

    // palindrome

//    static boolean isPalindrome(int x) {
//        int rev=0;
//        int original=x;
//        if(x<0) return false;
//        while(x!=0){
//            int digit = x%10;
//            x=x/10;
//            rev = rev*10 +digit;
//        }
//        return rev==original;
//    }

//    HCF/GCD
//    static void GCD(int n1, int n2) {
//        int x=Math.min(n1,n2);
//        int gcd=0;
//        for(int i= 1; i<=x;i++){
//            if(n1%i==0 && n2%i==0){
//               gcd=i;
//            }
//        }
//        System.out.println(gcd);
//    }

//    ARMSTRONG NUMBER

//        static void armstrong(int num){
//        int len = String.valueOf(num).length();
//        double sum=0;
//        int temp=num;
//            while(num!=0){
//                int digit=num%10;
//                sum += Math.pow(digit,len);
//                num /= 10;
//            }
//            if(sum==temp){
//                System.out.println("Armstrong");
//            }
//            else{
//                System.out.println("not an Armstrong");
//            }
//    }

//    Divisors of a Number

//    static ArrayList<Integer> divisor(int n){
//        ArrayList<Integer> dl = new ArrayList<>();
//        for(int i=1; i*i<=n; i++){
//            if(n%i==0){
//                dl.add(i);
//
//                if(i!=n/i){
//                    dl.add(n/i);
//                }
//            }
//        }
//        Collections.sort(dl);
//        return dl;
//    }

//    prime number
    static void prime(int n){
        if(n<=1){
            System.out.println("Neither prime nor coprime");
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("non prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}