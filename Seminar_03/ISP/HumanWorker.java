package HomeWork_03.ISP;

public class HumanWorker implements Working, ToEat {
public void work() {
System.out.println("Человек работает");
}

public void eat() {
    System.out.println("Человек ест");
}
}