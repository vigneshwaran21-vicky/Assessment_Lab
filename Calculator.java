public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }
        double n1 = Double.parseDouble(args[0]);
        String op = args[1];
        double n2 = Double.parseDouble(args[2]);
        switch (op) {
            case "+": System.out.println("Result: " + (n1 + n2)); break;
            case "-": System.out.println("Result: " + (n1 - n2)); break;
            case "*": System.out.println("Result: " + (n1 * n2)); break;
            case "/": System.out.println("Result: " + (n1 / n2)); break;
            default: System.out.println("Invalid Operator");
        }
    }
}
