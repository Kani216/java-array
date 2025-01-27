import java.util.*;

public class Assend {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();


        int arr[] = new int[n];
        for (int i=0;i<=arr.length-1;i++) {
           arr[i]=sc.nextInt();

        }

        Arrays.sort(arr);
        for (int i=0;i<=arr.length-1;i++) {
System.out.print(" "+arr[i]);
        }

    }
}
