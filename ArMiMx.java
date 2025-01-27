public class ArMiMx {
    public static void main (String args[]) {
        int arr[]={ 11,23,3,14,52};
        int max=arr[0];
        int min=arr[0];
        for( int i=1;i<arr.length;i++){

            System.out.print(arr[i]);
        }
        System.out.println();
        for( int i=1;i<arr.length;i++){
            if (max < arr[i]) {
                max=arr[i];


            }
            if(min >arr[i]){
                min=arr[i];
            }


        } System.out.println(max);
        System.out.println(min);



    }
}


