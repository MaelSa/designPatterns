class Model extends Observable{
    static MINVALUE = 0;
    static MAXVALUE = 10;
    constructor(){
        super();
        this.i = 5;
    }

    increment(){
        this.setI(this.i + 1);
    }

    decrement(){
        this.setI(this.i - 1);
    }

    setI(x){
        if(this.i != x)
        {
          this.i = x;
          this.setChanged();
          this.notifyObserver();
        }

    }

    getI(){
        return this.i;
    }
}
