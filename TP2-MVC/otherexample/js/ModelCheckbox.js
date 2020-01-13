class ModelCheckBox extends Observable{
    constructor(){
        super();
        this.bool = false;
    }

    set(){
      this.setChanged();
      if(this.bool == true){
        this.bool = false;
      }else{
        this.bool = true;
      }
      this.notifyObserver()

    }

    get(){
      return this.bool;
    }



}
