package pro.sky.java.course2.calculator.service;


import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.CalculatorServiceInterface;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    public String showHelloWorld() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusСalculator(int getNum1, int getNum2) {
        int result = getNum1 + getNum2;
        return getNum1 + " + "+ getNum2 + " = "+ result;
    }
    public String minusСalculator(int getNum1, int getNum2) {
        int result = getNum1 - getNum2;
        return getNum1 + " - "+ getNum2 + " = "+ result;
    }
    public String multiplyСalculator(int getNum1, int getNum2) {
        int result = getNum1 * getNum2;
        return getNum1 + " * "+ getNum2 + " = "+ result;
    }
    public String divideСalculator(int getNum1, int getNum2) {
        int result = getNum1 / getNum2;
        return getNum1 + " / "+ getNum2 + " = "+ result;
    }
}
