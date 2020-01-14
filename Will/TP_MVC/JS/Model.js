class ModelInteger extends Observable{
  constructor() {
    super();
    this.x = 0;
  }

  setValue(i) {
    if(i >= ModelInteger.MIN && i <= ModelInteger.MAX) {
      this.x = i;
      this.setChanged();
      this.notifyObserver();
    }

  }

  plus() {
    this.setValue(this.x + 1);
  }

  moins() {
    this.setValue(this.x - 1);
  }
}

ModelInteger.MAX = 10;
ModelInteger.MIN = 0;