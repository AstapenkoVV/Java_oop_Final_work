package ru.gb.oop.dz_total_7.factory;

import ru.gb.oop.dz_total_7.model.Calculable;
import ru.gb.oop.dz_total_7.model.ComplexCalculator;
import ru.gb.oop.dz_total_7.model.ComplexNumber;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(ComplexNumber complexNumber) {
        return new ComplexCalculator(complexNumber);
    }
}
