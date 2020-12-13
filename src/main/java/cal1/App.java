package cal1;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Enter an operation type");
            Scanner sc = new Scanner(System.in);
            String operationType = sc.next();
            System.out.println("Enter a num1");
            int num1 = sc.nextInt();
            System.out.println("Enter a num2");
            int num2 = sc.nextInt();
            int result = 0;
            switch (operationType) {
                case "-":
                    result = subtraction(num1, num2);
                    //System.out.println(num1-num2);
                    break;

                case "+":
                    result = addition(num1, num2);
                    //System.out.println(num1+num2);
                    break;

                case "*":
                    result = multiplication(num1, num2);
                    //System.out.println(num1*num2);
                    break;

                case "/":
                    result = division(num1, num2);
                    break;
                default:
                    System.out.println("Operation is not valid");
            }
            System.out.println("result: " + result);

            System.out.println("continue? y / n");
            String secondParam = sc.next();
            if (secondParam.equalsIgnoreCase("n")) {
                break;
            }


        }
    }
        public static int multiplication ( int num1, int num2){
            return num1 * num2;

        }
        public static int division ( int num1, int num2){
            return num1 / num2;
        }
        public static int addition ( int num1, int num2){
            return num1 + num2;
        }
        public static int subtraction ( int num1, int num2){
            return num1 - num2;
        }


}


