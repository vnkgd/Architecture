package HomeWork_03.DIP;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        TextPrinter myTextPrinter = new ConsoleTextPrinter();
        Printer myPrinter = new Printer(myTextPrinter);

        myPrinter.print(myText); // Hello, world!
    }
}
