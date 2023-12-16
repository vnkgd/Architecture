package HomeWork_03.DIP;

public class ConsoleTextPrinter implements TextPrinter {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}