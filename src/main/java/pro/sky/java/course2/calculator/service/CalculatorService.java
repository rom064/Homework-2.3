package pro.sky.java.course2.calculator.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService{
    public static String showHelloWorld() {
        return "Добро пожаловать в калькулятор";
    }

    public static String plusСalculator(int getNum1, int getNum2) {
        int result = getNum1 + getNum2;
        return getNum1 + " + "+ getNum2 + " = "+ result;
    }
    public static String minusСalculator(int getNum1, int getNum2) {
        int result = getNum1 - getNum2;
        return getNum1 + " - "+ getNum2 + " = "+ result;
    }
    public static String multiplyСalculator(int getNum1, int getNum2) {
        int result = getNum1 * getNum2;
        return getNum1 + " * "+ getNum2 + " = "+ result;
    }
    public static String divideСalculator(int getNum1, int getNum2) {
        int result = getNum1 / getNum2;
        return getNum1 + " / "+ getNum2 + " = "+ result;
    }
}
