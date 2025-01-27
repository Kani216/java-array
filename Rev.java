import java.util.Arrays;
import java.util.Scanner;

public class Rev {

    public static void main(String args[]) {
        int arr[] = {1, 11, 22, 3, 2, 5, 6, 10, 8};
        int max = arr[0];
        int min = arr[0];
        Arrays.sort(arr);
        //  System.out.print(arr);
        Scanner sc=new Scanner(System.in);

        for (int i=arr.length-1;i>=0;i--) {

            // arr[c]=arr[c];
           // System.out.println(""+arr[k]);
            //arr[k]=arr[k+i];
            System.out.print(" "+arr[i]);
        }

    }
}