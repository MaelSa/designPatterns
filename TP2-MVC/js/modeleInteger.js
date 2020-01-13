class ModeleInteger extends Observable {
    constructor(){
        super()
        this.x = 0;
    }

    setValue(x) {
        this.x = x;
        this.setChanged();
        this.notifyObserver();
    }

    plus() {
        this.setValue(this.x + 1)
    }

    moins() {
        this.setValue(this.x - 1)
    }
}
