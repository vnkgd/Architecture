package HomeWork_04;
/**
 * Класс геометрическая фигура "Треугольник" наследует интерфейс "Фигура"
 */
class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Конструктор класса - геометрическая фигура Треугольник
     * @param side1 Длиня первой стороны
     * @param side2 Длина второй стороны
     * @param side3 Длина третьей стороны
     */

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Значения длины сторон треугольника должны быть положительными");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
     /**
      * Метод расчета площади Треугольника
      * @return площадь Треугольника
      */
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
     /**
      * Метод расчета периметра Треугольника
      * @return периметр Треугольника
      */

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}