class Observable{
    constructor(){
        this.obs = [];
        this.changed = false;
    }

	addObserver(o) {
		this.obs.push(o);
	}

	notifyObserver() {
        if(this.changed == true){
            for (var i = 0; i < this.obs.length; i++) {
                this.obs[i].action(this);
            }
            this.changed = false;
        }
	}

    setChanged(){
        this.changed = true;
    }
}

class Observer{
}
