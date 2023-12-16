package Command;

public class Main {

    public static void main(String[] args) {
        Сontroller controller = new Сontroller("С2000+");
        Operator operator = new Operator("Сервис-инженер Петров В.А.");

        //Оператор является хранителем объектов команд, организуя очередь
        operator.writeCommand(controller.giveTheCommand());
        operator.writeCommand(controller.giveTheCommand());
    
    }

}
