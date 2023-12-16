package Memento;

public class Main {

    public static void main(String[] args) {
        //Паттерн предусматривает сохранение во внешний источник
        Data data = new Data("Алексей", 182, 92);
        System.out.println(data);
        System.out.println("Изменили");
        data.setHeight(182);
        data.setWeight(94);
        System.out.println(data);
        System.out.println("Сохранили");
        Data save = data.saveData();
        System.out.println("Еще раз изменили");
        data.setHeight(185);
        data.setWeight(95);
        System.out.println(data);
        System.out.println("Загрузили сохраненное");
        data = data.loadData(save);
        System.out.println(data);
    }
}
