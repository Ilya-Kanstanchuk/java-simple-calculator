public class ArithmeticOperations {
    private String currentString;
    public static double basicOperations(double firstNum, double secondNum, String sign) throws IllegalArgumentException
    {
        double result = 0;
        switch (sign)
        {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                if (secondNum == 0)
                {
                    throw new IllegalArgumentException();
                }
                result = firstNum / secondNum;
                break;
        }
        return result;
    }
    public static double singleNumberOperation(double number, String operation) throws IllegalArgumentException
    {
        double result = 0;
        switch (operation)
        {
            case "√":
                if (number < 0)
                {
                    throw new IllegalArgumentException();
                }
                result = Math.sqrt(number);
                break;
            case "%":
                result = number / 100;
                break;
            case "1/x":
                if (number == 0)
                {
                    throw new IllegalArgumentException();
                }
                result = 1 / number;
                break;
            case "+/-":
                result = number * -1;
                break;
        }
        return result;
    }
}
