package at.fhj.msd;


public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }
    public double minus(double number1, double number2) {
        return number1 - number2;
    }
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public int factorial(int number) {

        if(number > 1){

            int result = 1;
            for (; number >= 1; number--){

                result *= number;
            }
            return result;

        } else{
            return 0;
        }

    }
}