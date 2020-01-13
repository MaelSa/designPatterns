package Etat;

public class contexte {
    private etat state;

    public contexte(){
        state = null;
    }

    public void setState(etat state){
        this.state = state;
    }

    public etat getState(){
        return state;
    }
}
