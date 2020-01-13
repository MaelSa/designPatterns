class Synchro extends Observer{
  constructor(m1,m2){
    super();
    this.model1 = m1;
    this.model2 = m2;
  }

  action(observ){
    if(observ == this.model1){
      this.model2.setI(Model.MAXVALUE -this.model1.getI());
    }else if(observ == this.model2){
      this.model1.setI(Model.MAXVALUE -this.model2.getI());
    }
  }
}
