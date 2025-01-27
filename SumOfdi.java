import java.util.Scanner;

public class SumOfdi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the num");
        int n = sc.nextInt();
        int s=0;
        while(n!=0){
            int r=n%10;
             s=s+r;
             n=n/10;

        }
        System.out.print(s);


    }
}