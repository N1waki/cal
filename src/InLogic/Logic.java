package InLogic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Logic extends While {
    public static void main() {
        switch (op) {
            case "+" -> ans = num1.add(num2);
            case "-" -> ans = num1.subtract(num2);
            case "*" -> ans = num1.multiply(num2);
            case "/" -> ans = num1.divide(num2, 10000, RoundingMode.HALF_UP);
            case "^" -> ans = num1.pow(num2.intValue());
            case "mod" -> ans = num1.remainder(num2);
            case "log" -> {
                ans = new BigDecimal(1);
                ans = ans.divide(BigDecimal.valueOf(Math.log(num2.doubleValue()) / Math.log(num1.doubleValue())), 100, RoundingMode.HALF_UP);
            }
            case "n" -> {
                System.out.print("\nEnter first numbers: ");
                num1 = reader.nextBigDecimal();
                System.out.print("\nEnter an operator (+, -, *, /, ^, mod, log, f(finish)): ");
                op = reader.next();
            }
            case "f" -> System.exit(0);
        }
    }
}
