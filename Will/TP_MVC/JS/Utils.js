class Observable {
  constructor() {
    //Classe abstraite
    if (this.constructor === Observable) {
      throw new TypeError('Abstract class "Observable" cannot be instantiated directly');
    }

    this.listeObserver = [];
    this.state = false;
    }

  setChanged() {
    this.state = true;
  }

  addObserver(observer) {
    this.listeObserver.push(observer);
  }

  notifyObserver() {
    if (this.state) {
      this.listeObserver.forEach(element => {
        element.update(this, null);
      });
    }

    this.state = false;
  }
}

class Observer {
  constructor() {
    if (this.constructor === Observer) {
      throw new TypeError('Abstract class "Observer" cannot be instantiated directly');
    }
  }

  update(observable, object) {
    
  }
}
