import java.util.*;
import java.util.Arrays;

public class Mainpro {
    public static void main(String args[]) {
        int arr[] = {1, 11, 22, 3, 2, 5, 6, 10, 8};
        int max = arr[0];
        int min = arr[0];
        Arrays.sort(arr);
      //  System.out.print(arr);
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
          k=arr.length-k;

        for (int i :arr) {

           // arr[c]=arr[c];
            System.out.println(""+arr[k]);
            arr[k]=arr[k+i];

        }System.out.println();

    }
}