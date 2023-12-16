package State;

public abstract class ManStatement {

    Man man;

    public ManStatement(Man man) {
        this.man = man;
    }

    public void manState(){
        System.out.println("Сосотяние покоя, средний пульс 60-80" );
    }

}
