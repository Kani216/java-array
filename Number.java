import java.util.*;
public class Number {
   static int sum(int a, int b) {
        int c= a+b;
        return c;
    }
    static int diff(int a, int b) {
        int c= a-b;
        return c;
    }
    static int mul(int a, int b) {
        int c= a*b;
        return c;
    }
   static int div(int a, int b) {
        int c= a/b;
        return c;
    }


 static void display(){
     Scanner Sc = new Scanner(System.in);

     int x = Sc.nextInt();
     int y = Sc.nextInt();

    System.out.println(sum(x,y));
        System.out.println(mul(x,y));
    System.out.println(diff(x,y));
    System.out.println(div(x,y));
}

        public static void main(String args[]){


            display();


        }
        }

