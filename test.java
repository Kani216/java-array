
import java.util.*;


public class test {


    void m1(){
        System.out.println("m1-method");
    }
    test (int a){
        System.out.println("1 arg constructor");
    }
    public static void main(String[] args) {

        test t1=new test(10);
       // test T = new test();
             // T.m1();
              t1.m1();
    }

}