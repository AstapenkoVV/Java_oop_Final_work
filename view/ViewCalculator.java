package ru.gb.oop.dz_total_7.view;

import ru.gb.oop.dz_total_7.model.ComplexNumber;

import java.util.Scanner;

public class ViewCalculator {
    public String inputMessage(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public ComplexNumber inputComplexNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String[] str = scanner.nextLine().split("\\+");
        double real = Double.parseDouble(str[0]);
        double imaginary = Double.parseDouble(str[1].substring(0, str[1].length() - 1));
        return new ComplexNumber(real, imaginary);
    }
}
