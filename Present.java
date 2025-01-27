import java.util.Arrays;
import java.util.Scanner;

public class Present {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the siz of array");
        int n=sc.nextInt();
        System.out.println("give the target variable");
        int target=sc.nextInt();
        boolean found=false;

        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++) {


            if (target == arr[i]) {
                found=true;
                break;
            }
            if(found==true){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }

        }System.out.println();
    }
}
