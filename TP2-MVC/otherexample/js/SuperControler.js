class SuperControler{
  constructor(m1,m2){
    this.model1 = m1;
    this.model2 = m2;
    this.controler1 = new Controler(this.model1);
    this.controler2 = new Controler(this.model2);
    let synchro = new Synchro(this.model1, this.model2);
    this.model1.addObserver(synchro);
    this.model2.addObserver(synchro);
  }
}
