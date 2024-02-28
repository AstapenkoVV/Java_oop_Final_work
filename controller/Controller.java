package ru.gb.oop.dz_total_7.controller;

import ru.gb.oop.dz_total_7.factory.CalculableFactory;
import ru.gb.oop.dz_total_7.model.Calculable;
import ru.gb.oop.dz_total_7.model.ComplexNumber;
import ru.gb.oop.dz_total_7.view.ViewCalculator;

public class Controller {
    private CalculableFactory calculableFactory;
    private ViewCalculator viewCalculator;

    public Controller() {
        calculableFactory = new CalculableFactory();
        viewCalculator = new ViewCalculator();
    }


    public void start() {
        while (true) {
            ComplexNumber inputFirstArg = viewCalculator.inputComplexNumber(
                    "Введите первый аргумент (в формате a+bi): ");
            Calculable calculator = calculableFactory.create(inputFirstArg);
            while (true) {
                String inputMessage = viewCalculator.inputMessage(
                        "Введите команду (*, +, /, =) : ");
                if (inputMessage.equals("*")) {
                    ComplexNumber inputSecondArg = viewCalculator.inputComplexNumber(
                            "Введите второй аргумент (в формате a+bi): ");
                    calculator.multi(inputSecondArg);
                    continue;
                }
                if (inputMessage.equals("+")) {
                    ComplexNumber inputSecondArg = viewCalculator.inputComplexNumber(
                            "Введите второй аргумент (в формате a+bi): ");
                    calculator.sum(inputSecondArg);
                    continue;
                }
                if (inputMessage.equals("/")) {
                    ComplexNumber inputSecondArg = viewCalculator.inputComplexNumber(
                            "Введите второй аргумент (в формате a+bi): ");
                    calculator.div(inputSecondArg);
                    continue;
                }
                if (inputMessage.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("%.2f+%.2fi\n", result.getReal(), result.getImaginary());
                    break;
                }
            }
            String cmd = viewCalculator.inputMessage("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
}
