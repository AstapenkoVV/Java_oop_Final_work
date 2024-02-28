package ru.gb.oop.dz_total_7.factory;

import ru.gb.oop.dz_total_7.logger.Logable;
import ru.gb.oop.dz_total_7.model.Calculable;
import ru.gb.oop.dz_total_7.model.ComplexCalculator;
import ru.gb.oop.dz_total_7.model.ComplexNumber;
import ru.gb.oop.dz_total_7.model.LogCalculator;

public class LogCalculableFactory implements ICalculableFactory{
    private Logable logable;

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }

    @Override
    public Calculable create(ComplexNumber complexNumber) {
        return new LogCalculator(new ComplexCalculator(complexNumber), logable);
    }
}
