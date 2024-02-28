package ru.gb.oop.dz_total_7.factory;

import ru.gb.oop.dz_total_7.model.Calculable;
import ru.gb.oop.dz_total_7.model.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber complexNumber);
}
