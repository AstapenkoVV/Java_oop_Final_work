package ru.gb.oop.dz_total_7.model;

public interface Calculable {
    Calculable sum(ComplexNumber arg);
    Calculable multi(ComplexNumber arg);
    Calculable div(ComplexNumber arg);
    ComplexNumber getResult();
}
