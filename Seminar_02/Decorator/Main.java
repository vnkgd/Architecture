package Decorator;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("BMW M5");
        TuningAuto AutoWrap = new TuningAuto(auto);

        System.out.println("Выводим характеристики стокового авто");
        printAutoSpecifications(auto);

        System.out.println();

        System.out.println("Выводим характеристики авто с тюнигом");
        printAutoSpecifications(AutoWrap);
    }

    public static void printAutoSpecifications(Auto Auto) {
        System.out.println(Auto.getName());
        System.out.println("Мощность " + Auto.getPower());
        System.out.println("Скорость " + Auto.getSpeed());
    }
}
