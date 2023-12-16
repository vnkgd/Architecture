package HomeWork_03.ISP;

public class Main {
    public static void main(String[] args) {
        Working human = new HumanWorker();
        ToEat humanEating = new HumanWorker();
        Working robot = new RobotWorker();

        human.work(); // Человек работает
        humanEating.eat(); // Человек ест
        robot.work(); // Робот работает
    }
}
