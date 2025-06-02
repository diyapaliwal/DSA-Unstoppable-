//1. Hello, World!
//public class day1{
//    public static void main(String[] arg){
//        System.out.println("hello world");
//    }
//}

// 2. Print numbers from 1 to 10
//public class day1{
//    public static void main(String[] args) {
//        int n= 1;
//        while (n <= 10){
//            System.out.println(n);
//            n++;
//        }
//    }
//}

//3. Check if a number is Even or Odd
//import java.util.Scanner;
//public class day1{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:-");
//        int num = sc.nextInt();
//        Even_Odd(num);
//    }
//    static void Even_Odd(int n){
//        if(n%2==0){
//            System.out.println("EVEN");
//        }
//        else {
//            System.out.println("ODD");
//        }
//    }
//}

//4. Sum of first N numbers
//import java.util.Scanner;
//public class day1{
//    public static void main(String[] args){
//        System.out.println("enter the range:");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(Sum(num));
//    }
//    static int Sum(int n){
//        int j=0;
//        for(int i=0; i<=n; i++){
//            j=j+i;
//        }
//        return j;
//    }
//}

////5. Print a Half Pyramid (Pattern Basics)
public class day1{
    public static void main(String[] args){
        for(int i=1;i<5;i++){
          for(int j=1;j<=i;j++){
              System.out.print("* ");
          }
            System.out.println(" ");
        }
    }
}
