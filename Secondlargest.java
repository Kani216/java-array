import java.util.Scanner;

public class Secondlargest   {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the siz of array");
        int n=sc.nextInt();

        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println();
        for( int i=0;i<n;i++){
            for(int j=0;j<n;j++){



               if (arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }



            }
        }


            System.out.print("Second largest num is" +arr[n-2]);
        }






    }




