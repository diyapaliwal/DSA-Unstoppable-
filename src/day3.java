//Print numbers from 1 to N
import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }
}
