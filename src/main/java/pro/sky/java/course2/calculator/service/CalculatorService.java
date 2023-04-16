package pro.sky.java.course2.calculator.service;


import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.CalculatorServiceInterface;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    @Override
    public String plusСalculator(int num1, int num2) {
        return String.valueOf((num1 + num2));
    }

    @Override
    public String minusСalculator(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    @Override
    public String multiplyСalculator(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    @Override
    public String divideСalculator(int num1, int num2) {
        return String.valueOf((double) num1 / num2);
    }
}
