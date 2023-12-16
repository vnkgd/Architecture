package HomeWork_04;

/**
 * Класс геометрическая фигура "Круг" наследует интерфейс "Фигура"
 */
class Circle implements Shape {
    /**
     * Конструктор класса - геометрическая фигура Круг.
     * @param radius Радиус круга.
     */

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Значение радиуса должно быть положтельным");
        }
        this.radius = radius;
    }
     /**
      * Метод расчета площади Круга
      * @return площадь круга
      */

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод расчета периметра круга
     * @return длина окружности
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}