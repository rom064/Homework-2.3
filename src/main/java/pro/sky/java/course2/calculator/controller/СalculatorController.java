package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.CalculatorServiceInterface;

@RestController
@RequestMapping("/calculator")
public class СalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public СalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showHelloWorld() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plusСalculator(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не все входящие данные";
        }
        return num1 + " + " + num2 + " = " + calculatorService.plusСalculator(num1, num2);
    }

    @GetMapping("/minus")
    public String minusСalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не все входящие данные";
        }
        return num1 + " - " + num2 + " = " + calculatorService.minusСalculator(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyСalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не все входящие данные";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiplyСalculator(num1, num2);
    }

    @GetMapping("/divide")
    public String divideСalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не все входящие данные";
        }
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divideСalculator(num1, num2);
    }
}



