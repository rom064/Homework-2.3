package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class СalculatorController {


    private CalculatorService calculatorService = new CalculatorService();
    @GetMapping
    public String showHelloWorld() {
        return CalculatorService.showHelloWorld();
    }

    @GetMapping("/plus")
    public String plusСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return CalculatorService.plusСalculator(getNum1,getNum2);
    }
    @GetMapping("/minus")
    public String minusСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return CalculatorService.minusСalculator(getNum1,getNum2);
    }
    @GetMapping("/multiply")
    public String multiplyСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return CalculatorService.multiplyСalculator(getNum1,getNum2);
    }
    @GetMapping("/divide")
    public String divideСalculator(@RequestParam("num1") int getNum1, @RequestParam("num2") int getNum2) {
        return CalculatorService.divideСalculator(getNum1,getNum2);
    }


}
