package Etat;

public class Demo {
    public static void main(String[] args) {
        contexte context = new contexte();

        etat1 startState = new etat1();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
