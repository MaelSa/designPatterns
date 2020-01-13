 class Observable {
    constructor() {
        this.obs = [];
        this.state = false;
    }

    addObserver(observer) {
        this.obs.push(observer);
    }
    notifyObserver(){
        if(this.state){
            this.obs.forEach((observer) => {
                observer.update(this)
            })
        }
        this.state = false
    }
    setChanged(){
        this.state = true;
    }
}