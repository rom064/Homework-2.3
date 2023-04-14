package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.CalculatorServiceInterface;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class СalculatorController {
    private final CalculatorServiceInterface calculatorService;
    public СalculatorController (CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showHelloWorld() {
        return calculatorService.showHelloWorld();
    }

    @GetMapping("/plus")
    public String plusСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return calculatorService.plusСalculator(getNum1,getNum2);
    }
    @GetMapping("/minus")
    public String minusСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return calculatorService.minusСalculator(getNum1,getNum2);
    }
    @GetMapping("/multiply")
    public String multiplyСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return calculatorService.multiplyСalculator(getNum1,getNum2);
    }
    @GetMapping("/divide")
    public String divideСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return calculatorService.divideСalculator(getNum1,getNum2);
    }


}
