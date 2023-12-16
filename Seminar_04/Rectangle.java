package HomeWork_04;
/**
 * Класс геометрическая фигура "Прямоугольник" наследует интерфейс "Фигура"
 */
class Rectangle implements Shape {
    private double length;
    private double width;

    /**
     * Конструктор класса - геметрическая фигура Прямоугольник
     * @param length Длина фигуры
     * @param width Ширина фигуры
     */

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Значения длины и ширины должны быть положтельными");
        }
        this.length = length;
        this.width = width;
    }

     /**
      * Метод расчета площади Прямоугольника
      * @return площадь Прямоугольника
      */

    @Override
    public double getArea() {
        return length * width;
    }

     /**
      * Метод расчета перметра Прямоугольника
      * @return периметр Прямоугольника
      */

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
