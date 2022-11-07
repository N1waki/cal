package InLogic;

import java.math.BigDecimal;
import java.util.Scanner;



public class While {
    static BigDecimal ans;
    static BigDecimal num1;
    static BigDecimal num2;
    static Scanner reader = new Scanner(System.in);
    static String op;

    public static void main() {
        System.out.print("\nEnter first numbers: ");
        num1 = reader.nextBigDecimal();
        System.out.print("\nEnter an operator (+, -, *, /, ^, mod, log, f(finish)): ");
        op = reader.next();
        while (true) {
            System.out.print("\nEnter second numbers: ");
            num2 = reader.nextBigDecimal();
            Logic.main();
            System.out.print("\nThe result is given as follows:\n");
            System.out.printf(Clear(num1.toString()) + " " + op + " " + Clear(num2.toString()) + " = " + Clear(ans.toString()));
            num1 = ans;
            System.out.print("\nEnter an operator (+, -, *, /, ^, mod, log, f(finish), n(new)): ");
            op = reader.next();
            Logic.main();
        }
    }
    public static String Clear(String noNulls) {
        while (((noNulls.endsWith("0")) |  (noNulls.endsWith("."))) & noNulls.contains("."))
        {
            noNulls = noNulls.substring(0, noNulls.length()-1);
        }
        return noNulls;
    }

}
