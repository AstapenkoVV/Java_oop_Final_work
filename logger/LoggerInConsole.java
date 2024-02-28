package ru.gb.oop.dz_total_7.logger;

public class LoggerInConsole implements Logable{

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
