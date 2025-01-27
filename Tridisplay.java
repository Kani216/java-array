import java.util.Scanner;

class area {
    private int x, y;

    public double setX(double a, double b)
        {
            double x = a;
            double y = b;
            double c = 0.5;

            return c * x * y;
        }
    }

    public class Tridisplay {
        public static void main(String args[]) {
            area obj = new area();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1St value:");
            double x = sc.nextDouble();
            System.out.println("Enter the 2Nd value:");
            double y = sc.nextDouble();
            obj.setX(x, y);
            System.out.println(obj.setX(x, y));


        }


    }




















