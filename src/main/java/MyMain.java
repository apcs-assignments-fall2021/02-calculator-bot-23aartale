import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a>b && a<c){
            return a;
        }
        else if (a<b && a>c){
            return a;
        }
        else if (b>a && b<c){
            return b;
        }
        else if (b<a && b>c){
            return b;
        }
        else
            return c;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        } else {
            return b;
        }
    }

        // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
        // where "a" and "b" are the inputs to the method
        public static double pythagoras ( int a, int b){
            a = (int) Math.pow(a, 2);
            b = (int) Math.pow(b, 2);
            double c = (int) Math.sqrt((a + b));
            return (int) c;
        }

        public static void main (String[]args){
            System.out.println("Which math function do you want to use?");
            System.out.println("1: Median");
            System.out.println("2: Magnitude");
            System.out.println("3: Pyhtagorean Theorum");
            System.out.println("Choose the number that corresponds to your choice");
            //string choice1 = scan.next();
            //if choice1 = "1";{
             //   return median();
            //}


        // You may want to keep these lines of code to test that your methods work
            System.out.println(median(1, 2, 3)); // should be 2
            System.out.println(magnitude(-7, -1)); // should be -7
            System.out.println(pythagoras(3, 4)); // should be 5.0

            Scanner scan = new Scanner(System.in);
        }
    }