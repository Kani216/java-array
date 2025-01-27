import java.util.Scanner;

import java.util.Scanner;
public class Dupe {

        public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("give the siz of array");
            int n=sc.nextInt();

            int arr[] = new int[n];
            for (int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
                }
            System.out.println();
            for (int i=0;i<n-1;i++) {
                if(arr[i]==arr[i+1]){
                    int b=arr[i];
                    System.out.print("Duplicate"+b);
                }

                }

            }
}
