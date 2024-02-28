package ru.gb.oop.dz_total_7.model;

import ru.gb.oop.dz_total_7.logger.Logable;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    private Logable logable;

    public LogCalculator(Calculable calculable, Logable logable) {
        this.calculable = calculable;
        this.logable = logable;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        logable.log("Выполнено сложение комплексных чисел: " +
                arg.getReal() + " + " + arg.getImaginary() + "i");
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        logable.log("Выполнено умножение комплексных чисел: " +
                arg.getReal() + " + " + arg.getImaginary() + "i");
        return calculable.multi(arg);
    }

    @Override
    public Calculable div(ComplexNumber arg) {
        logable.log("Выполнено разность комплексных чисел: " +
                arg.getReal() + " + " + arg.getImaginary() + "i");
        return calculable.div(arg);
    }

    @Override
    public ComplexNumber getResult() {
        logable.log("Результат = ");
        return calculable.getResult();
    }
}
