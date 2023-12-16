package Command;

public class ConstructionCommand extends Command {

    private String objectsEquipment;
    private String actionsEquipment;

    public ConstructionCommand(String objectsEquipment, String actionsEquipment) {
        this.objectsEquipment = objectsEquipment;
        this.actionsEquipment = actionsEquipment;
    }

    @Override
    public void executeCommand() {
        System.out.println("Для оборудования - " + objectsEquipment + " выполнить команду - " + actionsEquipment );
    }

}
