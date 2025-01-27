import java.util.Arrays;

public class Jva {
    public static void main(String args[]) {
        int arr[] = {2, 1, 3, 4, 1,2};
        Arrays.sort(arr);
        int n=arr.length;
        int m=0;

        for (int j = 0; j <=n/3; j++) {


            System.out.print(" "+arr[m]);
               arr[m]=arr[j];
               m++;
            }System.out.println();

        for (int j = n/3+1; j <=n; j++) {


               System.out.print(" " + arr[j]);
           }


        }

        }








