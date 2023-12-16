package HomeWork_03.ISP;

public interface ToEat {
    void eat();
}
// Создали отдельный интерфейс ToEat и в нем добавили метот eat, 
// чтобы в дальнейшем добавить интерфейс только к класу HumanWorker, т.к. робот есть не может