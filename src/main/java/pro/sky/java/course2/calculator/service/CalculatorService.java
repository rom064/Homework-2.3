package pro.sky.java.course2.calculator.service;


import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.CalculatorServiceInterface;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    public String showHelloWorld() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusСalculator(int getNum1, int getNum2) {
        return null;
    }

    public String minusСalculator(int getNum1, int getNum2) {
        return null;
    }

    public String multiplyСalculator(int getNum1, int getNum2) {
        return null;
    }

    public String divideСalculator(int getNum1, int getNum2) {
        return null;
    }

}
