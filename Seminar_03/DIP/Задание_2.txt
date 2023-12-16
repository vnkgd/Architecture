И аналогично 5-ый принцип

Принцип инверсии зависимостей (Dependency Inversion Principle, DIP) гласит: 
"Зависимости на абстракциях. Нет зависимостей на что-то конкретное". 
Это означает, что высокоуровневые модули, которые обеспечивают сложную логику, 
должны быть независимы от низкоуровневых модулей, которые обеспечивают утилитарные функции. 
Оба типа модулей должны зависеть от абстракций.

Пример кода, который нарушает DIP:


public class Text {
    String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class Printer {
    public void print(Text text) {
        System.out.println(text.getText());
    }
}

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        Printer myPrinter = new Printer();
        myPrinter.print(myText);
    }
}
В этом примере класс Printer зависит от конкретного класса Text.